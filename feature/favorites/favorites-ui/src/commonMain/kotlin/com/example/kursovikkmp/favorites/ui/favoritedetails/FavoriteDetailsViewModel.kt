package com.example.kursovikkmp.favorites.ui.favoritedetails

import androidx.lifecycle.viewModelScope
import com.example.kursovikkmp.favorites.domain.FavoritesRepository
import com.example.kursovikkmp.favorites.ui.favoriteslist.FavoriteUiState
import com.example.kursovikkmp.mvvm.BaseViewModel
import com.example.kursovikkmp.uikit.component.topbar.EpsTopBarState
import kursovikkmp.core.uikit.generated.resources.Res
import kursovikkmp.core.uikit.generated.resources.scr_favorite_removed
import kotlinx.coroutines.launch

class FavoriteDetailsViewModel(
    private val title: String,
    private val favoritesRepository: FavoritesRepository
) : BaseViewModel<FavoriteDetailsUiEvent, FavoriteDetailsState>(FavoriteDetailsState()) {

    override fun initTopBarState(): suspend EpsTopBarState.() -> EpsTopBarState = {
        copy()
    }

    override fun processUiEvent(event: FavoriteDetailsUiEvent) {
        when (event) {
            is FavoriteDetailsUiEvent.OnToggleFavorite -> {
                viewModelScope.launch {
                    val article = favoritesRepository.get(title)
                    if (article != null) {
                        favoritesRepository.remove(title)
                        updateState { copy(isFavorite = false) }
                        showToast(getString(Res.string.scr_favorite_removed))
                    }
                }
            }
        }
    }

    override fun onScreenCreated() {
        viewModelScope.launch {
            val article = favoritesRepository.get(title)
            val isFavorite = favoritesRepository.check(title)
            if (article != null) {
                updateState {
                    copy(
                        article = FavoriteUiState(
                            id = article.title,
                            title = article.title,
                            text = article.description ?: "",
                            imageUrl = article.urlToImage,
                            date = article.publishedAt
                        ),
                        isFavorite = isFavorite
                    )
                }
            }
        }
    }
}
