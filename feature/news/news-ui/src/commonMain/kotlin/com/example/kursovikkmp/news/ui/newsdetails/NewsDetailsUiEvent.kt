package com.example.kursovikkmp.news.ui.newsdetails

import com.example.kursovikkmp.mvvm.common.UiEvent

sealed class NewsDetailsUiEvent : UiEvent {
    data object OnToggleFavorite : NewsDetailsUiEvent()
}
