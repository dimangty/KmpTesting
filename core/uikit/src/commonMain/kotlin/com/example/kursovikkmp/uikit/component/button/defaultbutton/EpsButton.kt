package com.example.kursovikkmp.uikit.component.button.defaultbutton

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun EpsButton(state: EpsButtonState) {
    val modifier = if (state.fillMaxWidth) Modifier.fillMaxWidth() else Modifier
    when (state.type) {
        EpsButtonType.Primary -> {
            Button(
                onClick = { state.onClick?.invoke() },
                enabled = state.enabled,
                modifier = modifier,
            ) {
                Text(state.text)
            }
        }
        EpsButtonType.Secondary -> {
            OutlinedButton(
                onClick = { state.onClick?.invoke() },
                enabled = state.enabled,
                modifier = modifier,
            ) {
                Text(state.text)
            }
        }
        EpsButtonType.Text -> {
            TextButton(
                onClick = { state.onClick?.invoke() },
                enabled = state.enabled,
                modifier = modifier,
            ) {
                Text(state.text)
            }
        }
    }
}
