package com.example.kursovikkmp.news.ui.newsdetails

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.kursovikkmp.mvvm.BaseScreen
import com.example.kursovikkmp.uikit.component.topbar.EpsTopBarState
import kursovikkmp.core.uikit.generated.resources.Res
import kursovikkmp.core.uikit.generated.resources.article_details
import kursovikkmp.core.uikit.generated.resources.scr_favorite_add
import kursovikkmp.core.uikit.generated.resources.scr_favorite_remove
import org.jetbrains.compose.resources.stringResource
import org.koin.compose.viewmodel.koinViewModel
import org.koin.core.parameter.parametersOf

@Composable
internal fun NewsDetailsScreen(title: String) {
    val viewModel: NewsDetailsViewModel = koinViewModel { parametersOf(title) }
    val state by viewModel.stateFlow.collectAsState()
    val screenTitle = stringResource(Res.string.article_details)

    BaseScreen(
        lceState = state.lceState,
        topBarState = EpsTopBarState(title = screenTitle, showBackButton = true),
        defaultEffectFlow = viewModel.defaultEffectFlow,
        onDefaultUiEvent = viewModel::onDefaultUiEvent,
    ) {
        NewsDetailsView(state = state.state, onUiEvent = viewModel::onUiEvent)
    }
}

@Composable
private fun NewsDetailsView(
    state: NewsDetailsState,
    onUiEvent: (NewsDetailsUiEvent) -> Unit,
) {
    val removeTitle = stringResource(Res.string.scr_favorite_remove)
    val addTitle = stringResource(Res.string.scr_favorite_add)

    if (state.article != null) {
        Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
            Text(
                text = state.article?.title ?: "",
                style = MaterialTheme.typography.headlineMedium,
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = state.article?.description ?: "",
                style = MaterialTheme.typography.bodyLarge,
            )
            Spacer(modifier = Modifier.height(8.dp))
            Button(onClick = { onUiEvent(NewsDetailsUiEvent.OnToggleFavorite) }) {
                Text(if (state.isFavorite) removeTitle else addTitle)
            }
        }
    }
}
