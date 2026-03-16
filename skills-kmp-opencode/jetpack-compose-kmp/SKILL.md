---
name: jetpack-compose-kmp
description: Build and refactor Android Jetpack Compose screens that consume shared KMP ViewModels and shared UI state/events. Use when creating Compose screen entry points, wiring BaseScreen lifecycle/LCE handling, mapping UI interactions to shared events, or standardizing feature UI to existing project patterns.
---

# Jetpack Compose KMP

## Overview
Implement Compose screens that stay thin and delegate behavior to shared ViewModels.

## Workflow
1. Create screen entry function and obtain VM via `koinViewModel()`.
2. Collect `flowState` and `lceState` with `collectAsState()`.
3. Wrap UI in `BaseScreen(...)`.
4. Build stateless `ScreenView(state, onUiEvent)` function.
5. Map callbacks to shared `FeatureEvents` and call `onUiEvent(...)`.
6. Add `@Preview` using `State.getMock()`.

## Screen Entry Rules
- Keep side effects out of composables.
- Pass `viewModel::pushEvent` to stateless content.
- Pass `viewModel::onDefaultUiEvent` into `BaseScreen`.

## Stateless View Rules
- Accept only `state` and callback lambdas.
- Avoid direct Koin access inside stateless content.
- Avoid direct navigation calls in composable; use events to ViewModel.

## LCE and Lifecycle Rules
- Always use `BaseScreen` for loading/error handling and lifecycle events.
- Do not duplicate dialog/loading logic inside each feature screen.

## References
- Read `references/compose-screen-template.md` before creating a new screen.
- Read `references/current-project-compose-patterns.md` for real file examples.
