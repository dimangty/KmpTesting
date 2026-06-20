package com.example.kursovikkmp.news.ui.newsdetails

import androidx.lifecycle.viewModelScope
import com.example.kursovikkmp.mvvm.BaseViewModel
import com.example.kursovikkmp.news.domain.NewsRepository
import com.example.kursovikkmp.uikit.component.topbar.EpsTopBarState
import kursovikkmp.core.uikit.generated.resources.Res
import kursovikkmp.core.uikit.generated.resources.scr_favorite_added
import kursovikkmp.core.uikit.generated.resources.scr_favorite_removed
import kotlinx.coroutines.launch

class NewsDetailsViewModel(
    private val title: String,
    private val newsRepository: NewsRepository
) : BaseViewModel<NewsDetailsUiEvent, NewsDetailsState>(NewsDetailsState()) {

    override fun initTopBarState(): suspend EpsTopBarState.() -> EpsTopBarState = {
        copy()
    }

    override fun processUiEvent(event: NewsDetailsUiEvent) {
        when (event) {
            is NewsDetailsUiEvent.OnToggleFavorite -> {
                viewModelScope.launch {
                    val isFavorite = newsRepository.isFavorite(title)
                    if (isFavorite) {
                        newsRepository.removeFromFavorites(title)
                        updateState { copy(isFavorite = false) }
                        showToast(getString(Res.string.scr_favorite_removed))
                    } else {
                        val article = newsRepository.getCachedArticleByTitle(title)
                        if (article != null) {
                            newsRepository.addToFavorites(article)
                            updateState { copy(isFavorite = true) }
                            showToast(getString(Res.string.scr_favorite_added))
                        }
                    }
                }
            }
        }
    }

    override fun onScreenCreated() {
        viewModelScope.launch {
            val article = newsRepository.getCachedArticleByTitle(title)
            val isFavorite = newsRepository.isFavorite(title)
            if (article != null) {
                updateState { copy(article = article, isFavorite = isFavorite) }
            }
        }
    }
}
