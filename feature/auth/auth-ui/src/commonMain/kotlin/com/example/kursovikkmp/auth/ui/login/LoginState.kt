package com.example.kursovikkmp.auth.ui.login

import com.example.kursovikkmp.uikit.component.button.defaultbutton.EpsButtonState
import com.example.kursovikkmp.uikit.component.button.defaultbutton.EpsButtonType
import com.example.kursovikkmp.uikit.component.textfield.defaulttextfield.EpsTextFieldState

data class LoginState(
    val phoneTextFieldState: EpsTextFieldState = EpsTextFieldState(),
    val loginButtonState: EpsButtonState = EpsButtonState(fillMaxWidth = true),
    val signUpButtonState: EpsButtonState = EpsButtonState(
        type = EpsButtonType.Text,
        fillMaxWidth = true,
    ),
)
