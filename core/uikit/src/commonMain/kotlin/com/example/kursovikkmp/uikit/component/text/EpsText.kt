package com.example.kursovikkmp.uikit.component.text

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

data class EpsTextState(
    val text: String = "",
)

@Composable
fun EpsText(state: EpsTextState) {
    Text(text = state.text)
}
