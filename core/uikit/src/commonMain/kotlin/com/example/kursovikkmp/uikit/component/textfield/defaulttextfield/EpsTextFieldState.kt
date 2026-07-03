package com.example.kursovikkmp.uikit.component.textfield.defaulttextfield

import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.VisualTransformation

data class EpsTextFieldState(
    val value: String = "",
    val placeholder: String = "",
    val label: String = "",
    val error: String? = null,
    val enabled: Boolean = true,
    val singleLine: Boolean = true,
    val keyboardType: KeyboardType = KeyboardType.Text,
    val visualTransformation: VisualTransformation = VisualTransformation.None,
    val onValueChange: ((String) -> Unit)? = null,
)
