# DI Topology

## Core entry points
- Shared module graph: `shared/src/commonMain/kotlin/com/example/kursovikkmp/Di.kt`
- Android module: `shared/src/androidMain/kotlin/com/example/kursovikkmp/Di.android.kt`
- iOS module: `shared/src/iosMain/kotlin/com/example/kursovikkmp/Di.ios.kt`
- Android startup: `androidApp/src/main/java/com/example/kursovikkmp/android/MyApplication.kt`
- iOS startup bridge: `iosApp/iosApp/Utils/KoinHelper.swift`

## Shared graph composition
`sharedModule` includes platform, common, network, storage, and VM modules.
