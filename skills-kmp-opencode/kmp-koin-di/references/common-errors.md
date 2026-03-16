# Common Koin Errors

## No definition found
- Missing `single`/`factory` in module.
- Module not included in `sharedModule`.
- Constructor type mismatch.

## Works on Android but fails on iOS
- VM registered with `viewModelOf` only; missing iOS `factoryOf`.
- iOS inject call uses parameters but VM resolver expects none.
- iOS bridge cannot resolve class mapping (`getOriginalKotlinClass`).

## Parameterized VM failures
- Android screen must pass `parametersOf(...)`.
- iOS wrapper must use `init(param:)` or `init(parameters:)` and matching Koin resolver.
