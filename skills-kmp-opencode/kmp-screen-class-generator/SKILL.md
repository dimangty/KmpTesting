---
name: kmp-screen-class-generator
description: Scaffold KMP screen class files by screen name for shared feature contracts, Android Compose screen entry, and iOS SwiftUI bridge classes. Use when bootstrapping a new screen in another KMP project quickly, generating consistent file names and package paths, or creating a starting point before wiring repositories/services and DI.
---

# KMP Screen Class Generator

## Overview
Generate a consistent screen skeleton from one screen name. The generator creates shared Kotlin classes, Android Compose entry screen, and iOS Swift bridge files.

## Run Generator
Run:

```bash
python3 scripts/generate_kmp_screen.py \
  --screen Profile \
  --package com.example.kursovikkmp \
  --output /path/to/project
```

Optional flags:
- `--feature-name profile` to override folder slug.
- `--no-ios` to skip Swift files.
- `--no-android` to skip Compose file.
- `--no-tests` to skip shared test skeleton.
- `--overwrite` to replace existing files.

## Generated Files
- Shared:
  - `FeatureState.kt`
  - `FeatureEvents.kt`
  - `FeatureViewModel.kt`
- Android:
  - `FeatureScreen.kt`
- iOS:
  - `FeatureViewModel.swift`
  - `FeatureViewActions.swift`
  - `FeatureModuleInput.swift`
  - `FeatureView.swift`
- Optional shared test skeleton:
  - `FeatureViewModelCommonTest.kt`

## After Generation
1. Register ViewModel in Koin Android and iOS modules.
2. Add repository/service dependencies to constructor.
3. Implement event handling and navigation.
4. Attach screen to Android navigation graph and iOS assembly.
5. Replace placeholder tests with real behavior tests.

## References
- Read `references/generated-layout.md` for exact path rules.
- Read `references/follow-up-checklist.md` after scaffolding.
