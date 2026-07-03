package com.example.kursovikkmp.news.ui.newsdetails

import androidx.lifecycle.viewModelScope
import com.example.kursovikkmp.mvvm.BaseViewModel
import com.example.kursovikkmp.news.domain.Article
import com.example.kursovikkmp.news.domain.NewsRepository
import com.example.kursovikkmp.uikit.component.text.EpsTextState
import com.example.kursovikkmp.uikit.component.text.EpsTextStyle
import com.example.kursovikkmp.uikit.component.topbar.EpsTopBarState
import kursovikkmp.core.uikit.generated.resources.Res
import kursovikkmp.core.uikit.generated.resources.article_details
import kursovikkmp.core.uikit.generated.resources.scr_favorite_added
import kursovikkmp.core.uikit.generated.resources.scr_favorite_add
import kursovikkmp.core.uikit.generated.resources.scr_favorite_removed
import kursovikkmp.core.uikit.generated.resources.scr_favorite_remove
import kotlinx.coroutines.launch

class NewsDetailsViewModel(
    private val title: String,
    private val newsRepository: NewsRepository
) : BaseViewModel<NewsDetailsUiEvent, NewsDetailsState>(NewsDetailsState()) {

    override fun initTopBarState(): suspend EpsTopBarState.() -> EpsTopBarState = {
        copy(title = getString(Res.string.article_details), showBackButton = true)
    }

    override fun initScreenStrings(): suspend NewsDetailsState.() -> NewsDetailsState = {
        favoriteAddTitle = getString(Res.string.scr_favorite_add)
        favoriteRemoveTitle = getString(Res.string.scr_favorite_remove)
        copy(
            favoriteButtonState = favoriteButtonState.copy(
                text = favoriteAddTitle,
                onClick = { onUiEvent(NewsDetailsUiEvent.OnToggleFavorite) },
            )
        )
    }

    override fun processUiEvent(event: NewsDetailsUiEvent) {
        when (event) {
            is NewsDetailsUiEvent.OnToggleFavorite -> {
                viewModelScope.launch {
                    ensureFavoriteTitles()
                    val isFavorite = newsRepository.isFavorite(title)
                    if (isFavorite) {
                        newsRepository.removeFromFavorites(title)
                        updateState { withArticleComponentStates(article = this.article, isFavorite = false) }
                        showToast(getString(Res.string.scr_favorite_removed))
                    } else {
                        val article = newsRepository.getCachedArticleByTitle(title)
                        if (article != null) {
                            newsRepository.addToFavorites(article)
                            updateState { withArticleComponentStates(article = article, isFavorite = true) }
                            showToast(getString(Res.string.scr_favorite_added))
                        }
                    }
                }
            }
        }
    }

    override fun onScreenCreated() {
        viewModelScope.launch {
            ensureFavoriteTitles()
            val article = newsRepository.getCachedArticleByTitle(title)
            val isFavorite = newsRepository.isFavorite(title)
            if (article != null) {
                updateState { withArticleComponentStates(article = article, isFavorite = isFavorite) }
            }
        }
    }

    private fun NewsDetailsState.withArticleComponentStates(
        article: Article?,
        isFavorite: Boolean,
    ): NewsDetailsState {
        return copy(
            article = article,
            isFavorite = isFavorite,
            titleTextState = EpsTextState(
                text = article?.title.orEmpty(),
                style = EpsTextStyle.HeadlineMedium,
            ),
            descriptionTextState = EpsTextState(
                text = article?.description.orEmpty(),
                style = EpsTextStyle.BodyLarge,
            ),
            favoriteButtonState = favoriteButtonState.copy(
                text = if (isFavorite) {
                    favoriteRemoveTitle
                } else {
                    favoriteAddTitle
                },
            ),
        )
    }

    private suspend fun ensureFavoriteTitles() {
        if (favoriteAddTitle.isEmpty()) {
            favoriteAddTitle = getString(Res.string.scr_favorite_add)
        }
        if (favoriteRemoveTitle.isEmpty()) {
            favoriteRemoveTitle = getString(Res.string.scr_favorite_remove)
        }
    }

    private var favoriteAddTitle: String = ""
    private var favoriteRemoveTitle: String = ""
}
