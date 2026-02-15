package com.example.kursovikkmp.ui.screens.favorites

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import cafe.adriel.voyager.core.screen.Screen
import org.koin.compose.koinInject
import com.example.kursovikkmp.feature.favorites.list.FavoritesListEvents
import com.example.kursovikkmp.feature.favorites.list.FavoritesListState
import com.example.kursovikkmp.feature.favorites.list.FavoritesListViewModel
import com.example.kursovikkmp.platform.toComposeColor
import com.example.kursovikkmp.ui.components.base.BaseScreen
import com.example.kursovikkmp.ui.components.base.Toolbar
import com.example.kursovikkmp.ui.components.base.VSpacer
import com.example.kursovikkmp.ui.components.favorites.FavoriteItemView

object FavoritesListScreen : Screen {
    @Composable
    override fun Content() {
        val viewModel: FavoritesListViewModel = koinInject()
        val state by viewModel.flowState.collectAsState()
        val lceState by viewModel.lceState.collectAsState()

        BaseScreen(
            lceState = lceState,
            onDefaultUiEvent = viewModel::onDefaultUiEvent
        ) {
            FavoritesListScreenView(
                state = state,
                onUiEvent = viewModel::pushEvent
            )
        }
    }
}

@Composable
fun FavoritesListScreenView(
    state: FavoritesListState,
    onUiEvent: (FavoritesListEvents) -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(state.backGroundColor.toComposeColor())
    ) {
        Toolbar(toolbarState = state.titleBarState)
        Column(
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            LazyVerticalGrid(
                columns = GridCells.Fixed(2),
                contentPadding = PaddingValues(12.dp),
                verticalArrangement = Arrangement.spacedBy(10.dp),
                horizontalArrangement = Arrangement.spacedBy(10.dp),
                modifier = Modifier
            ) {
                items(state.favoritesItems.size) {
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        FavoriteItemView(
                            article = state.favoritesItems[it],
                            onClicked = { title ->
                                onUiEvent(FavoritesListEvents.OnItemClicked(title))
                            },
                            onFavorite = { title ->
                                onUiEvent(FavoritesListEvents.OnFavoriteClicked(title))
                            }
                        )
                    }
                }
            }

            VSpacer(10.dp)
        }
    }
}
