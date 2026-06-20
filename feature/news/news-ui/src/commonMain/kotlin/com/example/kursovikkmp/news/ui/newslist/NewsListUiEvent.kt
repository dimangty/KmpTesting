package com.example.kursovikkmp.news.ui.newslist

import com.example.kursovikkmp.mvvm.common.UiEvent

sealed class NewsListUiEvent : UiEvent {
    data class OnArticleClick(val title: String) : NewsListUiEvent()
}
