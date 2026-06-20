package com.example.kursovikkmp.main.container

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import com.example.kursovikkmp.favorites.ui.favoriteslist.FavoritesListScreen
import com.example.kursovikkmp.news.ui.newslist.NewsListScreen
import kursovikkmp.core.uikit.generated.resources.Res
import kursovikkmp.core.uikit.generated.resources.favorites
import kursovikkmp.core.uikit.generated.resources.news
import org.jetbrains.compose.resources.stringResource
import org.koin.compose.viewmodel.koinViewModel

@Composable
fun MainContainerScreen() {
    val viewModel = koinViewModel<MainContainerViewModel>()
    val state by viewModel.stateFlow.collectAsState()

    MainContainerView(
        state = state.state,
        onUiEvent = viewModel::onUiEvent,
    )
}

@Composable
private fun MainContainerView(
    state: MainContainerState,
    onUiEvent: (MainContainerUiEvent) -> Unit,
) {
    val newsTitle = stringResource(Res.string.news)
    val favoritesTitle = stringResource(Res.string.favorites)

    Scaffold(
        modifier = Modifier.fillMaxSize(),
        bottomBar = {
            NavigationBar {
                NavigationBarItem(
                    selected = state.selectedTab == MainTab.News,
                    onClick = { onUiEvent(MainContainerUiEvent.OnTabSelected(MainTab.News)) },
                    label = { Text(newsTitle) },
                    icon = {},
                )
                NavigationBarItem(
                    selected = state.selectedTab == MainTab.Favorites,
                    onClick = { onUiEvent(MainContainerUiEvent.OnTabSelected(MainTab.Favorites)) },
                    label = { Text(favoritesTitle) },
                    icon = {},
                )
            }
        }
    ) { innerPadding ->
        androidx.compose.foundation.layout.Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
        ) {
            when (state.selectedTab) {
                MainTab.News -> NewsListScreen()
                MainTab.Favorites -> FavoritesListScreen()
            }
        }
    }
}
