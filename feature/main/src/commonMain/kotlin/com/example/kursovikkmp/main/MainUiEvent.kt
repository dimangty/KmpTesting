package com.example.kursovikkmp.main

import com.example.kursovikkmp.mvvm.common.UiEvent

sealed class MainUiEvent : UiEvent {
    data object OnAppUiStarted : MainUiEvent()
    data object OnAppUiStopped : MainUiEvent()
}
