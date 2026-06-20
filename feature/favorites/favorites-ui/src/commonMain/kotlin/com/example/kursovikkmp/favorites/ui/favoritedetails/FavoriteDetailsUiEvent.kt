package com.example.kursovikkmp.favorites.ui.favoritedetails

import com.example.kursovikkmp.mvvm.common.UiEvent

sealed class FavoriteDetailsUiEvent : UiEvent {
    data object OnToggleFavorite : FavoriteDetailsUiEvent()
}
