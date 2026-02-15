package com.example.kursovikkmp.ui.screens.news

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import cafe.adriel.voyager.core.screen.Screen
import org.koin.compose.koinInject
import com.example.kursovikkmp.feature.news.list.NewsListEvents
import com.example.kursovikkmp.feature.news.list.NewsListState
import com.example.kursovikkmp.feature.news.list.NewsListViewModel
import com.example.kursovikkmp.platform.toComposeColor
import com.example.kursovikkmp.ui.components.base.BaseScreen
import com.example.kursovikkmp.ui.components.base.Toolbar
import com.example.kursovikkmp.ui.components.base.VSpacer
import com.example.kursovikkmp.ui.components.news.ArticleItemView

object NewsListScreen : Screen {
    @Composable
    override fun Content() {
        val viewModel: NewsListViewModel = koinInject()
        val state by viewModel.flowState.collectAsState()
        val lceState by viewModel.lceState.collectAsState()

        BaseScreen(
            lceState = lceState,
            onDefaultUiEvent = viewModel::onDefaultUiEvent
        ) {
            NewsListScreenView(
                state = state,
                onUiEvent = viewModel::pushEvent
            )
        }
    }
}

@Composable
fun NewsListScreenView(
    state: NewsListState,
    onUiEvent: (NewsListEvents) -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = state.backGroundColor.toComposeColor())
    ) {
        Toolbar(toolbarState = state.titleBarState)
        OutlinedTextField(
            value = state.searchQuery,
            onValueChange = { onUiEvent(NewsListEvents.OnSearchQueryChanged(it)) },
            modifier = Modifier
                .padding(horizontal = 8.dp)
                .padding(bottom = 8.dp),
            singleLine = true,
            placeholder = { Text(state.searchPlaceholder) }
        )
        LazyColumn(modifier = Modifier.padding(horizontal = 8.dp)) {
            item { VSpacer(8.dp) }
            items(state.newsItems) { item ->
                ArticleItemView(
                    article = item,
                    onClicked = {
                        onUiEvent(NewsListEvents.OnItemClicked(item.title))
                    },
                    onFavorite = { title -> onUiEvent(NewsListEvents.OnFavoriteClicked(title)) }
                )
                VSpacer(8.dp)
            }
        }
    }
}
