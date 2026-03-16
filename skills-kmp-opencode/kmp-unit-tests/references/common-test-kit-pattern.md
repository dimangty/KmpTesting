# Common Test Kit Pattern

## Source example
- `shared/home/src/commonTest/kotlin/com/example/kursovikkmp/feature/gpt/feature/testutil/ViewModelCommonTestKit.kt`

## Responsibilities
- Set `Dispatchers.Main` to `StandardTestDispatcher`.
- Stop/start Koin in setup.
- Provide test doubles for:
  - `NavigationService`
  - `ResourceService`
  - `DeviceService`
  - `LceStateManager` factory
- Reset dispatchers and stop Koin in teardown.
