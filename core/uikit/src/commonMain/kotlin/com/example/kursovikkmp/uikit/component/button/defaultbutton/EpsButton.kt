package com.example.kursovikkmp.uikit.component.button.defaultbutton

import androidx.compose.material3.*
import androidx.compose.runtime.Composable

@Composable
fun EpsButton(state: EpsButtonState) {
    when (state.type) {
        EpsButtonType.Primary -> {
            Button(onClick = { state.onClick?.invoke() }, enabled = state.enabled) {
                Text(state.text)
            }
        }
        EpsButtonType.Secondary -> {
            OutlinedButton(onClick = { state.onClick?.invoke() }, enabled = state.enabled) {
                Text(state.text)
            }
        }
        EpsButtonType.Text -> {
            TextButton(onClick = { state.onClick?.invoke() }, enabled = state.enabled) {
                Text(state.text)
            }
        }
    }
}
