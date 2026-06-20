package com.example.kursovikkmp.news.ui.newslist

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
import kursovikkmp.core.uikit.generated.resources.scr_news_screen_title
import org.jetbrains.compose.resources.stringResource
import org.koin.compose.viewmodel.koinViewModel

@Composable
fun NewsListScreen() {
    val viewModel = koinViewModel<NewsListViewModel>()
    val state by viewModel.stateFlow.collectAsState()
    val screenTitle = stringResource(Res.string.scr_news_screen_title)

    BaseScreen(
        lceState = state.lceState,
        topBarState = EpsTopBarState(title = screenTitle),
        defaultEffectFlow = viewModel.defaultEffectFlow,
        onDefaultUiEvent = viewModel::onDefaultUiEvent,
    ) {
        NewsListView(state = state.state, onUiEvent = viewModel::onUiEvent)
    }
}

@Composable
private fun NewsListView(
    state: NewsListState,
    onUiEvent: (NewsListUiEvent) -> Unit,
) {
    LazyColumn(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        items(state.articles) { article ->
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 4.dp)
                    .clickable {
                        onUiEvent(NewsListUiEvent.OnArticleClick(article.title))
                    }
            ) {
                Column(modifier = Modifier.padding(16.dp)) {
                    Text(text = article.title, style = MaterialTheme.typography.titleMedium)
                    article.description?.let {
                        Text(text = it, style = MaterialTheme.typography.bodyMedium)
                    }
                }
            }
        }
    }
}
