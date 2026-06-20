package com.example.kursovikkmp.favorites.ui.favoriteslist

import com.example.kursovikkmp.mvvm.common.UiEvent

sealed class FavoritesListUiEvent : UiEvent {
    data class OnArticleClick(val title: String) : FavoritesListUiEvent()
}
