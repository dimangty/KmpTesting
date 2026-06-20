package com.example.kursovikkmp.auth.ui.signup

import com.example.kursovikkmp.mvvm.common.UiEvent
import com.example.kursovikkmp.mvvm.common.SingleClickUiEvent

sealed interface SignUpUiEvent : UiEvent {
    data class OnFirstNameChanged(val value: String) : SignUpUiEvent
    data class OnLastNameChanged(val value: String) : SignUpUiEvent
    data class OnGenderChanged(val value: String) : SignUpUiEvent
    data class OnBirthDateChanged(val value: String) : SignUpUiEvent
    data class OnCountryChanged(val value: String) : SignUpUiEvent
    data class OnCityChanged(val value: String) : SignUpUiEvent
    data class OnEmailChanged(val value: String) : SignUpUiEvent
    data class OnPhoneChanged(val value: String) : SignUpUiEvent
    data object OnSignUpClicked : SignUpUiEvent, SingleClickUiEvent
}
