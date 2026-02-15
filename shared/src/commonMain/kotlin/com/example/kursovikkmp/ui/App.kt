package com.example.kursovikkmp.ui

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import cafe.adriel.voyager.navigator.Navigator
import com.example.kursovikkmp.navigation.VoyagerNavigationService
import com.example.kursovikkmp.ui.screens.auth.LoginScreen
import com.example.kursovikkmp.ui.theme.AppTheme
import org.koin.compose.koinInject

@Composable
fun App() {
    val navigationService: VoyagerNavigationService = koinInject()

    AppTheme {
        Navigator(LoginScreen) { navigator ->
            LaunchedEffect(navigator) {
                navigationService.setNavigator(navigator)
            }
            cafe.adriel.voyager.navigator.CurrentScreen()
        }
    }
}
