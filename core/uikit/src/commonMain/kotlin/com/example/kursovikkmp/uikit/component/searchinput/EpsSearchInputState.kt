package com.example.kursovikkmp.uikit.component.searchinput

data class EpsSearchInputState(
    val value: String = "",
    val placeholder: String = "Search",
    val onValueChange: ((String) -> Unit)? = null,
)
