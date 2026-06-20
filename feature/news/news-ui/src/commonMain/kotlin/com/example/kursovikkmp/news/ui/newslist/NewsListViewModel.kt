package com.example.kursovikkmp.news.ui.newslist

import androidx.lifecycle.viewModelScope
import com.example.kursovikkmp.mvvm.BaseViewModel
import com.example.kursovikkmp.navigation.NavigationAction
import com.example.kursovikkmp.news.domain.NewsRepository
import com.example.kursovikkmp.remoteresult.RemoteResult
import com.example.kursovikkmp.uikit.component.topbar.EpsTopBarState
import kursovikkmp.core.uikit.generated.resources.Res
import kursovikkmp.core.uikit.generated.resources.scr_news_load_failed
import kotlinx.coroutines.launch

class NewsListViewModel(
    private val newsRepository: NewsRepository
) : BaseViewModel<NewsListUiEvent, NewsListState>(NewsListState()) {

    override fun initTopBarState(): suspend EpsTopBarState.() -> EpsTopBarState = {
        copy()
    }

    override fun processUiEvent(event: NewsListUiEvent) {
        when (event) {
            is NewsListUiEvent.OnArticleClick -> {
                navigate(NavigationAction.NavigateToNewsDetails(event.title))
            }
        }
    }

    override fun onScreenCreated() {
        viewModelScope.launch {
            when (val result = newsRepository.getNews()) {
                is RemoteResult.Success -> {
                    updateState { copy(articles = result.data) }
                }
                is RemoteResult.Error -> {
                    showToast(getString(Res.string.scr_news_load_failed), isErrorToast = true)
                }
            }
        }
    }
}
