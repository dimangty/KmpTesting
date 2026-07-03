package com.example.kursovikkmp.favorites.ui.favoritedetails

import androidx.lifecycle.viewModelScope
import com.example.kursovikkmp.favorites.domain.FavoritesRepository
import com.example.kursovikkmp.favorites.ui.favoriteslist.FavoriteUiState
import com.example.kursovikkmp.mvvm.BaseViewModel
import com.example.kursovikkmp.uikit.component.text.EpsTextState
import com.example.kursovikkmp.uikit.component.text.EpsTextStyle
import com.example.kursovikkmp.uikit.component.topbar.EpsTopBarState
import kursovikkmp.core.uikit.generated.resources.Res
import kursovikkmp.core.uikit.generated.resources.article_details
import kursovikkmp.core.uikit.generated.resources.scr_favorite_removed
import kursovikkmp.core.uikit.generated.resources.scr_favorite_remove
import kotlinx.coroutines.launch

class FavoriteDetailsViewModel(
    private val title: String,
    private val favoritesRepository: FavoritesRepository
) : BaseViewModel<FavoriteDetailsUiEvent, FavoriteDetailsState>(FavoriteDetailsState()) {

    override fun initTopBarState(): suspend EpsTopBarState.() -> EpsTopBarState = {
        copy(title = getString(Res.string.article_details), showBackButton = true)
    }

    override fun initScreenStrings(): suspend FavoriteDetailsState.() -> FavoriteDetailsState = {
        removeTitle = getString(Res.string.scr_favorite_remove)
        copy(
            removeButtonState = removeButtonState.copy(
                text = removeTitle,
                onClick = { onUiEvent(FavoriteDetailsUiEvent.OnToggleFavorite) },
            )
        )
    }

    override fun processUiEvent(event: FavoriteDetailsUiEvent) {
        when (event) {
            is FavoriteDetailsUiEvent.OnToggleFavorite -> {
                viewModelScope.launch {
                    ensureRemoveTitle()
                    val article = favoritesRepository.get(title)
                    if (article != null) {
                        favoritesRepository.remove(title)
                        updateState { withArticleComponentStates(article = this.article, isFavorite = false) }
                        showToast(getString(Res.string.scr_favorite_removed))
                    }
                }
            }
        }
    }

    override fun onScreenCreated() {
        viewModelScope.launch {
            ensureRemoveTitle()
            val article = favoritesRepository.get(title)
            val isFavorite = favoritesRepository.check(title)
            if (article != null) {
                val articleState = FavoriteUiState(
                    id = article.title,
                    title = article.title,
                    text = article.description ?: "",
                    imageUrl = article.urlToImage,
                    date = article.publishedAt
                )
                updateState { withArticleComponentStates(article = articleState, isFavorite = isFavorite) }
            }
        }
    }

    private fun FavoriteDetailsState.withArticleComponentStates(
        article: FavoriteUiState?,
        isFavorite: Boolean,
    ): FavoriteDetailsState {
        return copy(
            article = article,
            isFavorite = isFavorite,
            titleTextState = EpsTextState(
                text = article?.title.orEmpty(),
                style = EpsTextStyle.HeadlineMedium,
            ),
            descriptionTextState = EpsTextState(
                text = article?.text.orEmpty(),
                style = EpsTextStyle.BodyLarge,
            ),
            removeButtonState = removeButtonState.copy(text = removeTitle),
        )
    }

    private suspend fun ensureRemoveTitle() {
        if (removeTitle.isEmpty()) {
            removeTitle = getString(Res.string.scr_favorite_remove)
        }
    }

    private var removeTitle: String = ""
}
