package com.example.kursovikkmp.uikit.component.main

import androidx.compose.runtime.Composable
import com.example.kursovikkmp.ui.theme.AppTheme

@Composable
fun MainApp(content: @Composable () -> Unit) {
    AppTheme(content = content)
}
