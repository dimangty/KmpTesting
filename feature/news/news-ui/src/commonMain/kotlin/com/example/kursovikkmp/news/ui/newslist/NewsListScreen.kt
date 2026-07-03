package com.example.kursovikkmp.news.ui.newslist

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.kursovikkmp.mvvm.BaseScreen
import com.example.kursovikkmp.uikit.component.articlecard.EpsArticleCard
import org.koin.compose.viewmodel.koinViewModel

@Composable
fun NewsListScreen() {
    val viewModel = koinViewModel<NewsListViewModel>()
    val screenState by viewModel.stateFlow.collectAsState()

    BaseScreen(
        lceState = screenState.lceState,
        topBarState = screenState.topBarState,
        defaultEffectFlow = viewModel.defaultEffectFlow,
        onDefaultUiEvent = viewModel::onDefaultUiEvent,
    ) {
        NewsListView(state = screenState.state)
    }
}

@Composable
private fun NewsListView(
    state: NewsListState,
) {
    LazyColumn(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        items(state.articleCardStates) { articleCardState ->
            EpsArticleCard(state = articleCardState)
        }
    }
}
