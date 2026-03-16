# BaseViewModel Bridge Notes

## Relevant files
- `iosApp/iosApp/Base/BaseViewModel.swift`
- `iosApp/iosApp/Utils/KoinHelper.swift`
- `iosApp/iosApp/Screens/NewsList/ViewModel/NewsListViewModel.swift`

## Important behavior
- `BaseViewModel` auto-subscribes to shared `stateFlow`, `lceFlow`, and `navigationEffectFlow`.
- `OnScreenCreated` is sent during init.
- `OnScreenDestroyed` is sent in `deinit`.
- `sendViewAppearedEvent()` should be called from SwiftUI `.onAppear`.

## Generic types
- `BaseViewModel<T: AnyObject, S: AnyObject>`
  - `T`: shared Kotlin VM type (e.g., `shared.NewsListViewModel`)
  - `S`: shared Kotlin State type (e.g., `NewsListState`)
