package com.example.kursovikkmp.auth.ui.pin

import com.example.kursovikkmp.mvvm.common.UiEvent
import com.example.kursovikkmp.mvvm.common.SingleClickUiEvent

sealed interface PinUiEvent : UiEvent {
    data class OnPinChanged(val pin: String) : PinUiEvent
    data object OnVerifyClicked : PinUiEvent, SingleClickUiEvent
}
