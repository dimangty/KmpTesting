---
name: kmp-koin-di
description: Configure and troubleshoot Koin dependency injection across KMP shared, Android, and iOS targets in a modular project. Use when adding new repositories/services/viewmodels, registering platform-specific dependencies, fixing missing binding/runtime injection errors, or aligning Android and iOS DI registrations.
---

# KMP Koin DI

## Overview
Manage DI in one shared graph with platform-specific modules and target-specific VM registration.

## Workflow
1. Add shared services/repositories in common modules.
2. Add Android platform bindings in `Di.android.kt`.
3. Add iOS platform bindings in `Di.ios.kt`.
4. Register ViewModels for Android (`viewModelOf`) and iOS (`factoryOf`).
5. Verify app startup wiring and constructor arguments.

## Registration Rules
- Shared/common dependencies belong in `shared/src/commonMain/.../Di.kt` modules.
- Android-specific classes belong in `shared/src/androidMain/.../Di.android.kt`.
- iOS-specific classes belong in `shared/src/iosMain/.../Di.ios.kt`.
- Keep constructor dependencies explicit; avoid service locator calls in feature code.

## ViewModel Rules
- Android: `viewModelOf(::FeatureViewModel)`.
- iOS: `factoryOf(::FeatureViewModel)` for KMP-to-Swift bridge.
- For parameterized VMs, use Koin parameters and verify iOS bridge resolver supports parameter list.

## Diagnostics
- Check constructor signature vs registered providers.
- Check module inclusion path from `sharedModule`.
- Check Android app startup (`startKoin { modules(sharedModule) }`).
- Check iOS startup (`Di_iosKt.doInitKoin()` via `KoinHelper.swift`).

## References
- Read `references/di-topology.md` before adding bindings.
- Read `references/common-errors.md` when resolving runtime DI failures.
