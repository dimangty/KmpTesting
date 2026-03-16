# Compose Screen Template

```kotlin
@Composable
fun FeatureScreen() {
    val viewModel: FeatureViewModel = koinViewModel()
    val state by viewModel.flowState.collectAsState()
    val lceState by viewModel.lceState.collectAsState()

    BaseScreen(
        lceState = lceState,
        onDefaultUiEvent = viewModel::onDefaultUiEvent
    ) {
        FeatureScreenView(
            state = state,
            onUiEvent = viewModel::pushEvent
        )
    }
}

@Composable
fun FeatureScreenView(
    state: FeatureState,
    onUiEvent: (FeatureEvents) -> Unit
) {
    // UI
}
```
