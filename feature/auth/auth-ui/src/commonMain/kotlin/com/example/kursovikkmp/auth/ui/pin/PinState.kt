package com.example.kursovikkmp.auth.ui.pin

import com.example.kursovikkmp.uikit.component.button.defaultbutton.EpsButtonState
import com.example.kursovikkmp.uikit.component.text.EpsTextState
import com.example.kursovikkmp.uikit.component.textfield.defaulttextfield.EpsTextFieldState

data class PinState(
    val placeholderTextState: EpsTextState = EpsTextState(),
    val pinTextFieldState: EpsTextFieldState = EpsTextFieldState(),
    val verifyButtonState: EpsButtonState = EpsButtonState(fillMaxWidth = true),
)
