#!/usr/bin/env kotlin

@file:Repository("https://repo1.maven.org/maven2/")
@file:DependsOn("com.squareup.moshi:moshi:1.14.0")
@file:DependsOn("com.squareup.moshi:moshi-kotlin:1.14.0")

import com.squareup.moshi.Json
import com.squareup.moshi.Moshi
import com.squareup.moshi.adapter
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import java.io.File
import java.net.URL
import java.text.NumberFormat

data class Distribution(
    @Json(name = "name") val name: String,
    @Json(name = "version") val version: String,
    @Json(name = "apiLevel") val api: Int,
    @Json(name = "distributionPercentage") val percentage: Double,
    @Json(name = "url") val url: String,
    @Json(name = "descriptionBlocks") val blocks: List<Block>,
)

data class Block(
    @Json(name = "title") val title: String,
    @Json(name = "body") val body: String,
)

val json = URL("https://dl.google.com/android/studio/metadata/distributions.json")
    .readText()
    .also(File("distributions.json")::writeText)

@OptIn(ExperimentalStdlibApi::class)
val distributions = Moshi.Builder().addLast(KotlinJsonAdapterFactory()).build()
    .adapter<List<Distribution>>()
    .fromJson(json)!!
    .sortedByDescending { it.api }
    .ifEmpty { error("The distribution list is empty!") }

buildString {
    appendLine("# Android Version Distribution [![🔃 Refresh](https://github.com/SimonMarquis/Android-Version-Distribution/actions/workflows/refresh.yml/badge.svg)](https://github.com/SimonMarquis/Android-Version-Distribution/actions/workflows/refresh.yml)\n")
    //region Table
    appendLine(
        """
        | Name | Version | API |  % |
        |------|--------:|----:|---:|
        """.trimIndent()
    )
    val percentFormatter = NumberFormat.getPercentInstance()!!.apply { maximumFractionDigits = 1 }
    distributions.forEach {
        appendLine("""| [${it.name}](#api-${it.api}) | ${it.version} | ${it.api} | ${it.percentage.let(percentFormatter::format)} |""")
    }
    //endregion
    appendLine("\n---\n")
    //region Pie chart
    appendLine(
        """
        ```mermaid
        pie
        """.trimIndent()
    )
    val numberFormatter = NumberFormat.getNumberInstance()!!.apply { maximumFractionDigits = 1 }
    distributions.sortedByDescending { it.percentage }.forEach {
        appendLine("""    "${it.name} (${it.version})" : ${it.percentage.times(100).let(numberFormatter::format)}""")
    }
    appendLine("```")
    //endregion
    appendLine("\n---\n")
    //region Descriptions
    distributions.forEach { distribution ->
        appendLine("""<a id="api-${distribution.api}"></a>""")
        appendLine("##### [${distribution.name}](${distribution.url})\n")
        distribution.blocks.forEach { block ->
            when {
                block.title.isBlank() -> appendLine("> **Note**  ")
                else -> appendLine("###### ${block.title}\n")
            }
            appendLine("> ${block.body}\n")
        }
    }
    //endregion
}.also(File("README.md")::writeText)
