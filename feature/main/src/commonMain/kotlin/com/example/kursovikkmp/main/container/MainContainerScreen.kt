package com.example.kursovikkmp.main.container

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import com.example.kursovikkmp.favorites.ui.favoriteslist.FavoritesListScreen
import com.example.kursovikkmp.news.ui.newslist.NewsListScreen
import com.example.kursovikkmp.uikit.component.navigationbar.EpsNavigationBar
import org.koin.compose.viewmodel.koinViewModel

@Composable
fun MainContainerScreen() {
    val viewModel = koinViewModel<MainContainerViewModel>()
    val screenState by viewModel.stateFlow.collectAsState()

    MainContainerView(
        state = screenState.state,
    )
}

@Composable
private fun MainContainerView(
    state: MainContainerState,
) {
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        bottomBar = {
            EpsNavigationBar(state = state.navigationBarState)
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
