package com.example.kursovikkmp.uikit.component.textfield.defaulttextfield

data class EpsTextFieldState(
    val value: String = "",
    val placeholder: String = "",
    val label: String = "",
    val error: String? = null,
    val enabled: Boolean = true,
    val onValueChange: ((String) -> Unit)? = null,
)
