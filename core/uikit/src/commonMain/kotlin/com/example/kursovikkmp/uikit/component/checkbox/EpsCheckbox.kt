package com.example.kursovikkmp.uikit.component.checkbox

import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment

@Composable
fun EpsCheckbox(state: EpsCheckboxState) {
    Row(verticalAlignment = Alignment.CenterVertically) {
        Checkbox(
            checked = state.checked,
            onCheckedChange = { state.onCheckedChange?.invoke(it) }
        )
        Text(state.label)
    }
}
