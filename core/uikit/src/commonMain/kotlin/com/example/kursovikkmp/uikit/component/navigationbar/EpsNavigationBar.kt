package com.example.kursovikkmp.uikit.component.navigationbar

import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun EpsNavigationBar(state: EpsNavigationBarState) {
    NavigationBar {
        state.items.forEach { item ->
            NavigationBarItem(
                selected = item.selected,
                onClick = { item.onClick?.invoke() },
                label = { Text(item.label) },
                icon = {},
            )
        }
    }
}
