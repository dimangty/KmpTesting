# Current Project Compose Patterns

## Examples
- `androidApp/feature_news/src/main/java/com/example/feature_news/NewsScreen.kt`
- `androidApp/feature_favorites/src/main/java/com/example/feature_favorites/FavoriteScreen.kt`
- `androidApp/core/src/main/java/com/example/core/BaseScreen.kt`

## Shared points
- `koinViewModel()` in top-level screen function
- `flowState` + `lceState` collection
- `BaseScreen` wrapper
- event forwarding through `viewModel::pushEvent`
- preview based on `State.getMock()`
