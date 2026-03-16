# Project Patterns

## Key paths
- Shared base VM: `shared/core/src/commonMain/kotlin/com/example/kursovikkmp/base/BaseViewModel.kt`
- Android base screen: `androidApp/core/src/main/java/com/example/core/BaseScreen.kt`
- Android DI: `shared/src/androidMain/kotlin/com/example/kursovikkmp/Di.android.kt`
- iOS DI: `shared/src/iosMain/kotlin/com/example/kursovikkmp/Di.ios.kt`
- iOS base VM bridge: `iosApp/iosApp/Base/BaseViewModel.swift`
- iOS Koin bridge: `iosApp/iosApp/Utils/KoinHelper.swift`

## Shared feature shape
- `FeatureState.kt`
- `FeatureEvents.kt`
- `FeatureViewModel.kt`
- Optional: repository/service interfaces and models

## Android screen shape
- `FeatureScreen()` loads VM with `koinViewModel()`
- Collects `flowState` + `lceState`
- Calls `BaseScreen(...)`
- Stateless `FeatureScreenView(state, onUiEvent)`

## iOS screen shape
- `FeatureViewModel.swift` inherits `BaseViewModel<shared.FeatureViewModel, FeatureState>`
- `FeatureViewActions.swift` enum for local UI actions
- `FeatureModuleInput.swift` for parent module configuration
- `FeatureView.swift` with `@StateObject`
