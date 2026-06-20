package com.example.kursovikkmp.auth.ui.login

import com.example.kursovikkmp.mvvm.common.UiEvent
import com.example.kursovikkmp.mvvm.common.SingleClickUiEvent

sealed interface LoginUiEvent : UiEvent {
    data class OnPhoneChanged(val phone: String) : LoginUiEvent
    data object OnLoginClicked : LoginUiEvent, SingleClickUiEvent
    data object OnSignUpClicked : LoginUiEvent, SingleClickUiEvent
}
