package com.example.kursovikkmp.favorites.ui.favoriteslist

import androidx.lifecycle.viewModelScope
import com.example.kursovikkmp.favorites.domain.FavoritesRepository
import com.example.kursovikkmp.mvvm.BaseViewModel
import com.example.kursovikkmp.navigation.NavigationAction
import com.example.kursovikkmp.uikit.component.articlecard.EpsArticleCardState
import com.example.kursovikkmp.uikit.component.topbar.EpsTopBarState
import kursovikkmp.core.uikit.generated.resources.Res
import kursovikkmp.core.uikit.generated.resources.scr_favorite_empty
import kursovikkmp.core.uikit.generated.resources.scr_favorite_screen_title
import kotlinx.coroutines.launch

class FavoritesListViewModel(
    private val favoritesRepository: FavoritesRepository
) : BaseViewModel<FavoritesListUiEvent, FavoritesListState>(FavoritesListState()) {

    override fun initTopBarState(): suspend EpsTopBarState.() -> EpsTopBarState = {
        copy(title = getString(Res.string.scr_favorite_screen_title))
    }

    override fun initScreenStrings(): suspend FavoritesListState.() -> FavoritesListState = {
        copy(emptyTextState = emptyTextState.copy(text = getString(Res.string.scr_favorite_empty)))
    }

    override fun processUiEvent(event: FavoritesListUiEvent) {
        when (event) {
            is FavoritesListUiEvent.OnArticleClick -> {
                navigate(NavigationAction.NavigateToFavoritesDetails(event.title))
            }
        }
    }

    override fun onScreenCreated() {
        loadFavorites()
    }

    override fun onScreenResumed() {
        loadFavorites()
    }

    private fun loadFavorites() {
        viewModelScope.launch {
            val articles = favoritesRepository.getAll().map {
                FavoriteUiState(
                    id = it.title,
                    title = it.title,
                    text = it.description ?: "",
                    imageUrl = it.urlToImage,
                    date = it.publishedAt
                )
            }
            updateState {
                copy(
                    articles = articles,
                    articleCardStates = articles.map { article ->
                        EpsArticleCardState(
                            title = article.title,
                            subtitle = article.text,
                            onClick = {
                                onUiEvent(FavoritesListUiEvent.OnArticleClick(article.title))
                            },
                        )
                    },
                )
            }
        }
    }
}
