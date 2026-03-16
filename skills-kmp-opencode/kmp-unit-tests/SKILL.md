---
name: kmp-unit-tests
description: Create and maintain shared/commonTest unit tests for KMP ViewModels and feature logic with coroutine test tools, Turbine, and Koin-backed fakes. Use when adding tests for events, state transitions, navigation/effects, or when fixing unstable asynchronous tests across feature modules.
---

# KMP Unit Tests

## Overview
Write deterministic `commonTest` ViewModel tests for shared feature behavior.

## Workflow
1. Reuse or create `BaseViewModelCommonTest` test kit with fake `NavigationService`, `ResourceService`, and `DeviceService`.
2. Build feature-specific fakes (repository/service/auth).
3. Instantiate shared ViewModel directly.
4. Trigger events using `pushEvent(...)`.
5. Assert state/effects/navigation with Turbine and recorded actions.
6. Advance scheduler with `advanceUntilIdle()` when needed.

## Test Structure Rules
- Use `runTest` for coroutine tests.
- Use `flowState.test { ... }` for state assertions.
- Use effect flow tests when screen emits one-off effects.
- Keep fakes inside test file unless reused heavily.

## Koin in Tests
- Call `stopKoin()` before re-initializing.
- Register required dependencies in local test module.
- Avoid pulling production network/storage modules into unit tests.

## What to Assert
- Initial state correctness.
- Event-to-state transition.
- Event-to-navigation action.
- Event-to-effect emission.
- Data mutation via fake repositories/services.

## References
- Read `references/common-test-kit-pattern.md` before creating test base.
- Read `references/viewmodel-test-examples.md` for concrete tests.
