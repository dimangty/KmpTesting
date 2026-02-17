package com.example.kursovikkmp.feature.news.details

import com.example.kursovikkmp.base.BaseEvent

sealed class NewsDetailsEvents: BaseEvent {
    data object OnFavoriteClicked : NewsDetailsEvents()
    data object OnOpenClicked : NewsDetailsEvents()
}