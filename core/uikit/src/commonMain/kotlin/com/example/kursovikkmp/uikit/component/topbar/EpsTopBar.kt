package com.example.kursovikkmp.uikit.component.topbar

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun EpsTopBar(state: EpsTopBarState) {
    if (!state.isVisible) return
    TopAppBar(
        title = { Text(state.title) },
        navigationIcon = {
            if (state.showBackButton && state.onBackClick != null) {
                TextButton(onClick = state.onBackClick) {
                    Text("Back")
                }
            }
        },
        actions = {
            if (state.showNotificationsButton && state.onNotificationsClick != null) {
                TextButton(onClick = state.onNotificationsClick) {
                    Text("Bell")
                }
            }
        }
    )
}
