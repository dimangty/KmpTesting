package com.example.kursovikkmp.uikit.component.spacer

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun EpsSpacer(state: EpsSpacerState) {
    val height = when (state.type) {
        EpsSpacerType.Small -> 8.dp
        EpsSpacerType.Medium -> 16.dp
        EpsSpacerType.Large -> 32.dp
    }
    Spacer(Modifier.height(height))
}
