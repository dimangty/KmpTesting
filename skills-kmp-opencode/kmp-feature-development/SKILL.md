---
name: kmp-feature-development
description: Build and refactor cross-platform KMP features in a modular project with shared business logic, Android Compose UI, SwiftUI UI bridge, and Koin DI. Use when implementing a new feature end-to-end (State/Event/ViewModel + Android screen + iOS bridge), migrating existing feature code to project conventions, or wiring feature dependencies and navigation across shared, Android, and iOS layers.
---

# KMP Feature Development

## Overview
Implement feature code in three layers: shared logic (`State/Event/ViewModel`), Android Compose screen, and iOS SwiftUI bridge. Follow the existing architecture around `BaseViewModel`, `BaseScreen`, and Koin modules.

## Workflow
1. Define feature contract in shared module.
2. Implement `ViewModel` extending shared `BaseViewModel`.
3. Add Android Compose screen and wire events.
4. Add iOS SwiftUI `BaseViewModel` wrapper and view actions.
5. Register dependencies in Koin for Android and iOS.
6. Add `commonTest` coverage for core behavior.

## Shared Layer Rules
- Create `FeatureState` as `data class` implementing `BaseViewState`.
- Create `FeatureEvents` as `sealed class` implementing `BaseEvent`.
- Create `FeatureViewModel` extending `BaseViewModel<FeatureState, FeatureEvents>`.
- Handle lifecycle in `initToolbar`, `initScreenData`, `onEvent`.
- Use `updateState { copy(...) }` for all state updates.
- Use `navigate(...)` and `navigateBack()` only from ViewModel.

## Android Layer Rules
- Use `koinViewModel()` for ViewModel retrieval.
- Collect `flowState` and `lceState` via `collectAsState()`.
- Wrap screen content with `BaseScreen(lceState, onDefaultUiEvent = viewModel::onDefaultUiEvent)`.
- Map UI actions to shared `FeatureEvents` through `viewModel::pushEvent`.
- Keep previews with `State.getMock()`.

## iOS Layer Rules
- Create Swift ViewModel inheriting `BaseViewModel<shared.FeatureViewModel, FeatureState>`.
- Translate SwiftUI actions into shared `pushEvent(...)` calls.
- Call `sendViewAppearedEvent()` in `.onAppear`.
- Keep public configuration in `FeatureModuleInput` protocol.

## Koin Wiring Checklist
- Android registrations: `shared/src/androidMain/.../Di.android.kt` via `viewModelOf(::FeatureViewModel)`.
- iOS registrations: `shared/src/iosMain/.../Di.ios.kt` via `factoryOf(::FeatureViewModel)`.
- Add repositories/services to shared modules if feature needs new dependencies.

## References
- Read `references/project-patterns.md` before creating files.
- Read `references/feature-checklist.md` before finalizing the feature.
