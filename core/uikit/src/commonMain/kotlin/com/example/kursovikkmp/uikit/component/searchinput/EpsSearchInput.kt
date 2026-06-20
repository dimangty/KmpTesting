package com.example.kursovikkmp.uikit.component.searchinput

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun EpsSearchInput(state: EpsSearchInputState) {
    OutlinedTextField(
        value = state.value,
        onValueChange = { state.onValueChange?.invoke(it) },
        placeholder = { Text(state.placeholder) },
        modifier = Modifier.fillMaxWidth(),
    )
}
