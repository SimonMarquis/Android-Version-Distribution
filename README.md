# Android Version Distribution [![🔃 Refresh](https://github.com/SimonMarquis/Android-Version-Distribution/actions/workflows/refresh.yml/badge.svg)](https://github.com/SimonMarquis/Android-Version-Distribution/actions/workflows/refresh.yml)

| Name | Version | API |  % |
|------|--------:|----:|---:|
| [C](#api-37) | 17 | 37 | 0.9% |
| [B](#api-36) | 16 | 36 | 25.4% |
| [V](#api-35) | 15 | 35 | 14.7% |
| [U](#api-34) | 14 | 34 | 15.3% |
| [T](#api-33) | 13 | 33 | 11.8% |
| [S](#api-31) | 12 | 31 | 9.6% |
| [R](#api-30) | 11 | 30 | 10.5% |
| [Q](#api-29) | 10 | 29 | 5.7% |
| [Pie](#api-28) | 9 | 28 | 3.1% |
| [Oreo](#api-27) | 8.1 | 27 | 1.5% |
| [Oreo](#api-26) | 8 | 26 | 0.5% |
| [Nougat](#api-25) | 7.1 | 25 | 0.2% |
| [Nougat](#api-24) | 7 | 24 | 0.2% |
| [Marshmallow](#api-23) | 6 | 23 | 0.3% |
| [Lollipop](#api-22) | 5.1 | 22 | 0.2% |

---

```mermaid
pie
    "B (16)" : 25.4
    "U (14)" : 15.3
    "V (15)" : 14.7
    "T (13)" : 11.8
    "R (11)" : 10.5
    "S (12)" : 9.6
    "Q (10)" : 5.7
    "Pie (9)" : 3.1
    "Oreo (8.1)" : 1.5
    "C (17)" : 0.9
    "Oreo (8)" : 0.5
    "Marshmallow (6)" : 0.3
    "Nougat (7.1)" : 0.2
    "Nougat (7)" : 0.2
    "Lollipop (5.1)" : 0.2
```

---

<a id="api-37"></a>
##### [C](https://developer.android.com/about/versions/17/summary)

###### User Experience and System UI

> Dedicated Assistant volume stream (MODE_ASSISTANT_CONVERSATION)<br>MetricStyle notification template<br>Live Update semantic color API<br>Handoff for cross-device task continuity<br>New global keyboard navigation shortcuts<br>Restoring default IME visibility after rotation<br>User-agent reduction for WebView (targeting 17+)<br>Memory limit for RemoteViews in widgets (targeting 17+)

###### Security and Privacy

> Android Advanced Protection Mode (AAPM)<br>Post-quantum cryptography (PQC) APK signing<br>Android contacts picker<br>Block cross-profile loopback traffic<br>Per-app keystore key limits<br>Restrict implicit URI grants<br>Restricted access to end-to-end encrypted messages<br>Certificate Transparency (CT) enabled by default (targeting 17+)<br>Encrypted Client Hello (ECH) enabled by default (targeting 17+)<br>Local network permission required (ACCESS_LOCAL_NETWORK) (targeting 17+)<br>OTP protection for standard SMS messages (targeting 17+)<br>Hiding passwords from physical input devices (targeting 17+)<br>Safer Native Dynamic Code Loading (DCL) (targeting 17+)<br>Contacts Provider 2 (CP2) PII field restrictions and strict SQL checks (targeting 17+)

###### Core Functionality

> New ProfilingManager system triggers<br>JobDebugInfo APIs for JobScheduler debugging<br>Listener support for allow-while-idle alarms<br>App memory limits and runtime enforcement<br>Optimized delivery of self-broadcasts<br>usesCleartextTraffic deprecation plan<br>New NPU feature flag (android.hardware.npu) (targeting 17+)<br>Memory restrictions for notification custom views (targeting 17+)<br>Unmodifiable static final fields (targeting 17+)<br>Lock-free implementation of MessageQueue (targeting 17+)

###### Connectivity

> Constrained satellite networks support<br>UWB Downlink-TDoA ranging APIs<br>Autonomous re-pairing for Bluetooth bond losses<br>Consistent BluetoothSocket.read() behavior for RFCOMM (targeting 17+)

###### Media

> New BYPASS_CONCURRENT_RECORD_AUDIO_RESTRICTION permission for concurrent audio capture<br>Background audio hardening

###### Graphics

> WebGPU on Android

###### Accessibility

> Accessibility support for complex IME physical keyboard typing (targeting 17+)

###### Human Input

> Touchpads deliver relative pointer events by default during pointer capture

###### Device Form Factors

> Mandatory platform API changes ignoring orientation, resizability, and aspect ratio constraints on large screens (targeting 17+)

###### Intelligence

> Deprecation of setContentCaptureEnabled (targeting 17+)

> [!NOTE]  
> Last updated: October 1, 2026

<a id="api-36"></a>
##### [B](https://developer.android.com/about/versions/16/summary)

###### User Experience and System UI

> Progress-centric notifications<br>Richer haptics APIs<br>Predictive back updates and default migration/opt-out requirement (targeting 16+)<br>Automatic themed app icons<br>Edge to edge opt-out removed (targeting 16+)<br>Deprecating disruptive accessibility announcements<br>Content handling for live wallpapers

###### Security and Privacy

> Improved security against Intent redirection attacks<br>Key sharing API for Android Keystore<br>Privacy Sandbox on Android updates<br>MediaStore version lockdown (targeting 16+)<br>Safer Intent resolution mechanism (targeting 16+)<br>GPU syscall filtering (targeting 16+)

###### Camera and Media

> UltraHDR image enhancements (HEIC)<br>Precise color temperature and tint adjustments<br>Hybrid auto-exposure modes<br>Motion photo capture Intent actions<br>Camera night mode scene detection (EXTENSION_NIGHT_MODE_INDICATOR)<br>Photo picker improvements (embeddable, cloud search)

###### Core Functionality

> ART internal changes and performance updates<br>JobScheduler quota optimizations and new abandoned job reason (STOP_REASON_TIMEOUT_ABANDONED)<br>16 KB page size compatibility mode<br>Ordered broadcast priority scope limited to same process<br>Fixed rate work scheduling optimization (targeting 16+)

###### Connectivity

> Generic ranging APIs (RangingManager)<br>Ranging with enhanced security (Wi-Fi 6 802.11az)<br>Companion device manager device presence APIs<br>Improved Bluetooth bond loss handling and new intents/APIs for targeting 16+

###### Accessibility

> Improved accessibility APIs<br>Phone as microphone input for voice calls with LEA hearing aids<br>Ambient volume controls for LEA hearing aids

###### Graphics

> Custom graphical effects with AGSL (RuntimeColorFilter, RuntimeXfermode)

###### Internationalization

> Vertical text rendering support<br>Measurement system customization in regional preferences

###### Device Form Factors

> Standardized picture and audio quality framework for TVs (MediaQuality package)<br>Virtual device owner overrides<br>Adaptive layouts (platform ignores screen orientation/aspect ratio restrictions for targeting 16+)

###### Health and Fitness

> Transition to granular health and fitness permissions (`android.permissions.health` for Health Connect) (targeting 16+)

> [!NOTE]  
> Last updated: October 1, 2026

<a id="api-35"></a>
##### [V](https://developer.android.com/about/versions/15)

###### Camera and media

> Low Light Boost<br>In-app Camera Controls<br>HDR headroom control<br>Loudness control<br>Virtual MIDI 2.0 Devices<br>More efficient AV1 software decoding

###### Connectivity

> Satellite support<br>Smoother NFC experiences<br>Wallet role

###### Developer productivity and tools

> OpenJDK 17 updates<br>PDF improvements<br>Automatic language switching refinements<br>Improved OpenType Variable Font API<br>Granular line break controls<br>App archiving

###### Graphics

> Modernizing Android's GPU access<br>Improvements for Canvas

###### Large screens and form factors

> Improved large screen multitasking<br>Cover screen support

###### Performance and battery

> ApplicationStartInfo API<br>Detailed app size information<br>App-managed profiling<br>SQLite database improvements<br>Android Dynamic Performance Framework updates

###### Privacy

> Screen recording detection<br>Expanded IntentFilter capabilities<br>Private space<br>Query most-recent user selection for Selected Photos Access<br>Privacy Sandbox on Android<br>Health Connect<br>Partial screen sharing

###### Security

> Integrate Credential Manager with autofill<br>Integrate single tap sign-up and sign-in with biometric prompts<br>Key management for end-to-end encryption<br>Permission checks on content URIs

###### User experience and system UI

> Richer widget previews with Generated Previews API<br>Picture-in-picture improvements<br>Improved Do Not Disturb rules<br>Set VibrationEffect for notification channels<br>Media projection status bar chip and auto stop

> [!NOTE]  
> Last updated: October 1, 2026

<a id="api-34"></a>
##### [U](https://developer.android.com/about/versions/14)

###### New features

> Ultra HDR for images<br>Zoom, Focus, Postview, and more in camera extensions<br>Lossless USB audio<br>Health Connect<br>Add custom actions<br>Custom meshes with vertex and fragment shaders

###### Behavior changes

> Foreground service types are required<br>Enforcement of BLUETOOTH_CONNECT permission<br>JobScheduler reinforces callback and network behavior<br>Apps can kill only their own background processes<br>Schedule exact alarms are denied by default<br>Data safety information is more visible<br>Minimum installable target API level

###### Security and privacy

> Credential Manager<br>Improvements for app stores<br>Detect when users take device screenshots<br>Secure full-screen Intent notifications<br>Restrictions to implicit and pending intents<br>Safer dynamic code loading<br>restrictions on starting activities from the background<br>User consent required for each MediaProjection

> [!NOTE]  
> Last updated: October 1, 2026

<a id="api-33"></a>
##### [T](https://developer.android.com/about/versions/13)

###### New features

> Tablet and large screen support<br>Programmable shaders<br>Color vector fonts<br>Predictive back gesture<br>Bluetooth LE Audio<br>Splash screen efficiency improvements<br>ART optimizations

###### Behavior changes

> OpenJDK 11 updates<br>Battery Resource Utilization<br>Media controls derived from PlaybackState<br>Permission required for advertising ID<br>Updated non-SDK restrictions

###### Security and privacy

> Safer exporting of context-registered receivers<br>Enhanced photo picker privacy<br>New runtime permission for nearby Wi-Fi devices<br>Exact alarms permission<br>Developer downgradable permissions<br>APK Signature Scheme v3.1<br>Better error reporting in Keystore and KeyMint

> [!NOTE]  
> Last updated: October 1, 2026

<a id="api-31"></a>
##### [S](https://developer.android.com/about/versions/12)

###### New features

> Material You<br>Redesigned widgets<br><br>Game Mode<br>Rich content insertion<br>AppSearch API<br>Compatible media transcoding<br>Improved notifications

###### Behavior changes

> Performance Classes<br>Stretch overscroll<br>App splash screens<br>Restricted App Standby Bucket<br>Improved refresh rate switching<br>Passpoint updates

###### Security and privacy

> App hibernation<br>Nearby device permissions<br>Approximate location<br>Bluetooth permissions<br>Permission group lookup<br>Clipboard access notifications<br>Permission package visibility

###### Large screen support (12L)

> System UI optimizations<br>App taskbar<br>Drag and drop an app into split-screen mode<br>fast app-switching<br>Visual and stability improvements to compatibility mode<br>Activity embedding with Jetpack WindowManager

> [!NOTE]  
> Last updated: October 1, 2026

<a id="api-30"></a>
##### [R](https://developer.android.com/about/versions/11)

###### New features

> Chat Bubbles<br>Conversation improvements<br>Wireless debugging<br>Neural Networks API 1.3<br>Frame rate API

###### Behavior changes

> Exposure Notifications<br>Conscrypt SSL engine by default<br>Non-SDK interface restrictions<br>URI access permissions requirements

###### Security and privacy

> Scoped storage enforcement<br>One-time permissions<br>Permissions auto-reset<br>Background location access<br>Package visibility<br>Foreground services<br>Secure sharing of large datasets

> [!NOTE]  
> Last updated: October 1, 2026

<a id="api-29"></a>
##### [Q](https://developer.android.com/about/versions/10)

###### System

> Foldables support<br>5G support<br>Gesture navigation<br>ART optimizations<br>Neural Networks API 1.2<br>Thermal API

###### User Interface

> Smart Reply in notifications<br>Dark theme<br>Settings panels<br>Sharing shortcuts

###### Camera and media

> Dynamic depth for photos<br>Audio playback capture<br>New codecs<br>Native MIDI API<br>Vulkan everywhere<br>Directional microphones

###### Security and privacy

> New location permissions<br>Storage encryption<br>TLS 1.3 by default<br>Platform hardening<br>Improved biometrics

> [!NOTE]  
> Last updated: October 1, 2026

<a id="api-28"></a>
##### [Pie](https://developer.android.com/about/versions/pie/android-9.0)

###### System

> Indoor positioning with Wi-Fi RTT<br>Multi-camera support<br>Display cutout support

###### User Interface

> Improved notifications<br>Improved text support<br>ImageDecoder and new animation classes

###### Media

> HDR VP9 video<br>HEIF image compression<br>Improved media APIs

###### Security and privacy

> Android Protected Confirmation<br>Biometric authentication dialogs<br>Hardware security module<br>Secure key import<br>Client-side encryption backups

###### Accessibility

> Navigation semantics<br>Convenience actions<br>Magnifier

> [!NOTE]  
> Last updated: October 1, 2026

<a id="api-27"></a>
##### [Oreo](https://developer.android.com/about/versions/oreo/android-8.1)

###### System

> Android Go<br>Neural Networks API<br>Programmatic Safe Browsing actions<br>Shared memory API

###### User Interface

> Improved Notifications<br>EditText update<br>WallpaperColors API

###### Media

> Video thumbnail extractor

###### Security & Privacy

> Fingerprint updates<br>Cryptography updates

> [!NOTE]  
> Last updated: October 1, 2026

<a id="api-26"></a>
##### [Oreo](https://developer.android.com/about/versions/oreo/android-8.0)

###### System

> Custom data store<br>JobScheduler improvements<br>Cached data

###### User Interface

> Picture-in-Picture mode<br>Improved Notifications<br>Autofill framework<br>Downloadable fonts<br>Multi-display support<br>Adaptive icons

###### Media

> VolumeShaper<br>Audio focus enhancements<br>Media metrics<br>MediaPlayer and MediaRecorder improvements<br>Improved media file access

###### Wireless & Connectivity

> Wi-Fi Aware<br>Bluetooth updates<br>Companion device pairing

###### Security & Privacy

> New permissions<br>New account access and discovery APIs

###### Runtime & Tools

> Platform optimizations<br>Updated Java language support<br>Updated ICU4J Android Framework APIs

> [!NOTE]  
> Last updated: October 1, 2026

<a id="api-25"></a>
##### [Nougat](https://developer.android.com/about/versions/nougat/android-7.1.html)

###### System

> Enhanced Live Wallpaper Metadata<br>Storage Manager Intent<br>Demo User Hint

###### VR

> Improved VR Thread Scheduling

###### User Interface

> App Shortcuts<br>Round Icon Resources

###### User Input

> Image Keyboard Support<br>New Professional Emoji

###### Wireless & Connectivity

> APIs for Carriers and Calling Apps

###### Wear

> New Screen Densities for Wear Devices

> [!NOTE]  
> Last updated: October 1, 2026

<a id="api-24"></a>
##### [Nougat](https://developer.android.com/about/versions/nougat/android-7.0.html)

###### User Interface

> Multi-window Support<br>Notifications<br>Quick Settings Tile API<br>Custom Pointer API

###### Performance

> Profile-guided JIT/AOT Compilation<br>Quick Path to App Install<br>Sustained Performance API<br>Frame Metrics API

###### Battery Life

> Doze on the Go<br>Project Svelte: Background Optimizations<br>SurfaceView

###### Wireless & Connectivity

> Data Saver<br>Number Blocking<br>Call Screening

###### Graphics

> Vulkan API

###### System

> Direct Boot<br>Multi-locale Support, More Languages<br>ICU4J APIs in Android<br>APK Signature Scheme v2<br>Scoped Directory Access<br>Keyboard Shortcuts Helper<br>Virtual Files

###### Android for Work

> Work profile security challenge<br>Turn off work<br>Always on VPN<br>Customized provisioning

###### Accessiblity

> Vision Settings on the Welcome screen

###### Security

> Key Attestation<br>Network Security Config<br>Default Trusted Certificate Authority

###### VR

> Platform support and optimizations for VR Mode

###### Printing Framework

> Print service enhancements

> [!NOTE]  
> Last updated: October 1, 2026

<a id="api-23"></a>
##### [Marshmallow](https://developer.android.com/about/versions/marshmallow/android-6.0.html)

###### Security

> Fingerprint Authentication<br>Confirm Credential

###### System

> App Linking<br>Adoptable Storage Devices

###### Multimedia

> 4K Display Mode<br>Support for MIDI<br>Create digital audio capture and playback objects<br>APIs to associate audio and input devices<br>List of all audio devices<br>Updated video processing APIs<br>Flashlight API<br>Reprocessing Camera2 API<br>Updated ImageWriter objects and Image Reader class

###### User Input

> Voice Interactions<br>Assist API<br>Bluetooth Stylus Support

###### User Interface

> Themeable ColorStateLists

###### Wireless & Connectivity

> Hotspot 2.0<br>Improved Bluetooth Low Energy Scanning

###### Android for Work

> Controls for Corporate-Owned, Single-Use devices<br>Silent install and uninstall of apps by Device Owner<br>Silent enterprise certificate access<br>Auto-acceptance of system updates<br>Delegated certificate installation<br>Data usage tracking<br>Runtime permission management<br>Work status notification

> [!NOTE]  
> Last updated: October 1, 2026

<a id="api-22"></a>
##### [Lollipop](https://developer.android.com/about/versions/android-5.1.html)

###### Wireless & Connectivity

> Multiple SIM Card Support<br>Carrier Provisioning

###### API Change

> Deprecated HTTP Classes

> [!NOTE]  
> Last updated: October 1, 2026

