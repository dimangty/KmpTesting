package com.example.kursovikkmp

import androidx.compose.ui.window.ComposeUIViewController
import com.example.kursovikkmp.main.MainView
import org.koin.core.context.startKoin

private var isKoinStarted = false

fun MainViewController() = ComposeUIViewController {
    if (!isKoinStarted) {
        startKoin {
            modules(appModules)
        }
        isKoinStarted = true
    }

    MainView()
}
