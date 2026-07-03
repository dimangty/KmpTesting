package com.example.kursovikkmp.uikit.component.dropdown

data class EpsDropdownState(
    val value: String = "",
    val label: String = "",
    val options: List<String> = emptyList(),
    val enabled: Boolean = true,
    val onValueChange: ((String) -> Unit)? = null,
)
