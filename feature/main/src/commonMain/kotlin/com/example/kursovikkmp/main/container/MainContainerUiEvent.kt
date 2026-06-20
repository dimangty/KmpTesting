package com.example.kursovikkmp.main.container

import com.example.kursovikkmp.mvvm.common.UiEvent

sealed interface MainContainerUiEvent : UiEvent {
    data class OnTabSelected(val tab: MainTab) : MainContainerUiEvent
}
