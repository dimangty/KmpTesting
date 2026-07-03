package com.example.kursovikkmp.auth.ui.signup

import com.example.kursovikkmp.uikit.component.button.defaultbutton.EpsButtonState
import com.example.kursovikkmp.uikit.component.dropdown.EpsDropdownState
import com.example.kursovikkmp.uikit.component.text.EpsTextState
import com.example.kursovikkmp.uikit.component.textfield.defaulttextfield.EpsTextFieldState

data class SignUpState(
    val firstNameTextFieldState: EpsTextFieldState = EpsTextFieldState(),
    val lastNameTextFieldState: EpsTextFieldState = EpsTextFieldState(),
    val genderDropdownState: EpsDropdownState = EpsDropdownState(),
    val birthDateTextFieldState: EpsTextFieldState = EpsTextFieldState(),
    val countryDropdownState: EpsDropdownState = EpsDropdownState(),
    val cityDropdownState: EpsDropdownState = EpsDropdownState(),
    val emailTextFieldState: EpsTextFieldState = EpsTextFieldState(),
    val phoneTextFieldState: EpsTextFieldState = EpsTextFieldState(),
    val errorTextState: EpsTextState? = null,
    val createAccountButtonState: EpsButtonState = EpsButtonState(fillMaxWidth = true),
) {
    val isValid: Boolean
        get() = firstNameTextFieldState.value.length >= 2
                && lastNameTextFieldState.value.length >= 2
                && genderDropdownState.value.isNotEmpty()
                && countryDropdownState.value.isNotEmpty()
                && cityDropdownState.value.isNotEmpty()
                && emailTextFieldState.value.isNotEmpty()
                && phoneTextFieldState.value.isNotEmpty()
}
