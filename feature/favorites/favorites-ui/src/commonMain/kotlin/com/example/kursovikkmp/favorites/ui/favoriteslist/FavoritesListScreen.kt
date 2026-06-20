package com.example.kursovikkmp.favorites.ui.favoriteslist

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.kursovikkmp.mvvm.BaseScreen
import com.example.kursovikkmp.uikit.component.topbar.EpsTopBarState
import kursovikkmp.core.uikit.generated.resources.Res
import kursovikkmp.core.uikit.generated.resources.scr_favorite_empty
import kursovikkmp.core.uikit.generated.resources.scr_favorite_screen_title
import org.jetbrains.compose.resources.stringResource
import org.koin.compose.viewmodel.koinViewModel

@Composable
fun FavoritesListScreen() {
    val viewModel = koinViewModel<FavoritesListViewModel>()
    val state by viewModel.stateFlow.collectAsState()
    val screenTitle = stringResource(Res.string.scr_favorite_screen_title)

    BaseScreen(
        lceState = state.lceState,
        topBarState = EpsTopBarState(title = screenTitle),
        defaultEffectFlow = viewModel.defaultEffectFlow,
        onDefaultUiEvent = viewModel::onDefaultUiEvent,
    ) {
        FavoritesListView(state = state.state, onUiEvent = viewModel::onUiEvent)
    }
}

@Composable
private fun FavoritesListView(
    state: FavoritesListState,
    onUiEvent: (FavoritesListUiEvent) -> Unit,
) {
    val emptyTitle = stringResource(Res.string.scr_favorite_empty)

    if (state.articles.isEmpty()) {
        Box(modifier = Modifier.fillMaxSize().padding(16.dp)) {
            Text(text = emptyTitle)
        }
        return
    }

    LazyColumn(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        items(state.articles) { article ->
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 4.dp)
                    .clickable {
                        onUiEvent(FavoritesListUiEvent.OnArticleClick(article.title))
                    }
            ) {
                Column(modifier = Modifier.padding(16.dp)) {
                    Text(text = article.title, style = MaterialTheme.typography.titleMedium)
                    article.text?.let {
                        Text(text = it, style = MaterialTheme.typography.bodyMedium)
                    }
                }
            }
        }
    }
}
