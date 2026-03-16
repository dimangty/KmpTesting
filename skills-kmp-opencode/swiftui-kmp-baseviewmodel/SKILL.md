---
name: swiftui-kmp-baseviewmodel
description: Implement and refactor SwiftUI screens that consume KMP shared ViewModels through the iOS BaseViewModel bridge and Koin injection helpers. Use when creating a new SwiftUI screen for shared feature logic, connecting SwiftUI actions to shared events, handling shared navigation effects, or fixing state/lifecycle synchronization between SwiftUI and Kotlin flows.
---

# SwiftUI KMP BaseViewModel

## Overview
Use this skill to wire SwiftUI screens to shared Kotlin ViewModels using `BaseViewModel.swift` and `KoinHelper.swift`.

## Workflow
1. Create Swift ViewModel wrapper inheriting `BaseViewModel<shared.FeatureViewModel, FeatureState>`.
2. Create Swift action enum (`FeatureViewActions`).
3. Map action enum to shared `pushEvent(...)` calls.
4. Build SwiftUI View with `@StateObject private var viewModel = FeatureViewModel()`.
5. Call `viewModel.sendViewAppearedEvent()` in `.onAppear`.
6. Add optional `FeatureModuleInput` protocol for parent configuration.

## BaseViewModel Rules
- Use `required override init()` + `super.init()` for no params.
- Use `super.init(param:)` or `super.init(parameters:)` when constructor args are required.
- Keep all business logic in shared Kotlin ViewModel.
- Keep Swift ViewModel focused on UI action mapping and local adaptation.

## Action Mapping Rules
- Define Swift `enum FeatureViewActions` with associated values for user input.
- Handle all cases in `onEvent(event:)`.
- For each case, call shared VM event:
  - `mViewModel?.pushEvent(event: .OnXxx(...))`
- Do not duplicate validation/business logic in Swift if it already exists in shared code.

## Navigation and LCE Rules
- Let `BaseViewModel` handle shared `navigationEffectFlow` and `lceFlow`.
- Override `onChangeNavigation` only if screen-specific behavior is required.
- Keep loader/errors centralized through injected `ContentService`.

## References
- Read `references/baseviewmodel-bridge.md` before creating new wrappers.
- Read `references/swiftui-screen-template.md` before writing a new SwiftUI screen.
