# ViewModel Test Examples

## Source examples
- `shared/news/src/commonTest/kotlin/com/example/kursovikkmp/feature/gpt/feature/news/list/NewsListViewModelCommonTest.kt`
- `shared/profile/src/commonTest/kotlin/com/example/kursovikkmp/feature/gpt/feature/profile/ProfileViewModelCommonTest.kt`
- `shared/recipe/src/commonTest/kotlin/com/example/kursovikkmp/feature/gpt/feature/recipes/details/RecipesDetailsViewModelCommonTest.kt`

## Typical scenarios
- Search/filter logic updates list state.
- Item click emits navigation action.
- Avatar tap emits one-off effect.
- Retry event re-runs loading logic.
