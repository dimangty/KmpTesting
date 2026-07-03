package com.example.kursovikkmp.favorites.ui.favoriteslist

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.kursovikkmp.mvvm.BaseScreen
import com.example.kursovikkmp.uikit.component.articlecard.EpsArticleCard
import com.example.kursovikkmp.uikit.component.text.EpsText
import org.koin.compose.viewmodel.koinViewModel

@Composable
fun FavoritesListScreen() {
    val viewModel = koinViewModel<FavoritesListViewModel>()
    val screenState by viewModel.stateFlow.collectAsState()

    BaseScreen(
        lceState = screenState.lceState,
        topBarState = screenState.topBarState,
        defaultEffectFlow = viewModel.defaultEffectFlow,
        onDefaultUiEvent = viewModel::onDefaultUiEvent,
    ) {
        FavoritesListView(state = screenState.state)
    }
}

@Composable
private fun FavoritesListView(
    state: FavoritesListState,
) {
    if (state.articleCardStates.isEmpty()) {
        Box(modifier = Modifier.fillMaxSize().padding(16.dp)) {
            EpsText(state = state.emptyTextState)
        }
        return
    }

    LazyColumn(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        items(state.articleCardStates) { articleCardState ->
            EpsArticleCard(state = articleCardState)
        }
    }
}
