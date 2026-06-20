package com.example.kursovikkmp.uikit.component.textfield.defaulttextfield

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun EpsTextField(state: EpsTextFieldState) {
    OutlinedTextField(
        value = state.value,
        onValueChange = { state.onValueChange?.invoke(it) },
        label = { Text(state.label) },
        placeholder = { Text(state.placeholder) },
        isError = state.error != null,
        supportingText = if (state.error != null) {
            { Text(state.error) }
        } else null,
        enabled = state.enabled,
        modifier = Modifier.fillMaxWidth(),
    )
}
