package com.example.kursovikkmp.main

import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.togetherWith
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.calculateEndPadding
import androidx.compose.foundation.layout.calculateStartPadding
import androidx.compose.foundation.layout.consumeWindowInsets
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleEventObserver
import androidx.lifecycle.compose.LocalLifecycleOwner
import androidx.lifecycle.viewmodel.navigation3.rememberViewModelStoreNavEntryDecorator
import androidx.navigation3.runtime.rememberNavBackStack
import androidx.navigation3.runtime.rememberSaveableStateHolderNavEntryDecorator
import androidx.navigation3.ui.NavDisplay
import com.example.kursovikkmp.mvvm.BaseActivityScreen
import com.example.kursovikkmp.navigation.NavigationAction
import com.example.kursovikkmp.navigation.RoutesSerializationConfig
import com.example.kursovikkmp.navigation.navigationservice.AppNavigator
import com.example.kursovikkmp.uikit.component.main.MainApp
import org.koin.compose.koinInject
import org.koin.compose.navigation3.koinEntryProvider
import org.koin.compose.viewmodel.koinViewModel
import org.koin.core.annotation.KoinExperimentalAPI
import org.koin.core.parameter.parametersOf

@OptIn(KoinExperimentalAPI::class)
@Composable
fun MainView() {
    val backstack = rememberNavBackStack(
        RoutesSerializationConfig,
        NavigationAction.NavigateToLogin
    )
    val coroutineScope = rememberCoroutineScope()
    val appNavigator = koinInject<AppNavigator> { parametersOf(backstack, coroutineScope) }
    val viewModel: MainViewModel = koinViewModel()
    val state by viewModel.stateFlow.collectAsState()
    val lifecycleOwner = LocalLifecycleOwner.current

    DisposableEffect(lifecycleOwner, viewModel) {
        val observer = LifecycleEventObserver { _, event ->
            when (event) {
                Lifecycle.Event.ON_START -> viewModel.onUiEvent(MainUiEvent.OnAppUiStarted)
                Lifecycle.Event.ON_STOP -> viewModel.onUiEvent(MainUiEvent.OnAppUiStopped)
                else -> Unit
            }
        }

        lifecycleOwner.lifecycle.addObserver(observer)
        onDispose { lifecycleOwner.lifecycle.removeObserver(observer) }
    }

    MainApp {
        Scaffold { paddingValues ->
            val appPadding = paddingValues.copy(top = 0.dp, bottom = 0.dp)

            BaseActivityScreen(
                lceState = state.lceState,
                defaultEffectFlow = viewModel.defaultEffectFlow,
                onDefaultUiEvent = viewModel::onDefaultUiEvent,
            ) {
                NavDisplay(
                    backStack = appNavigator.backstack,
                    entryDecorators = listOf(
                        rememberSaveableStateHolderNavEntryDecorator(),
                        rememberViewModelStoreNavEntryDecorator()
                    ),
                    entryProvider = koinEntryProvider(),
                    onBack = { appNavigator.pop() },
                    modifier = Modifier.consumeWindowInsets(appPadding).padding(appPadding),
                    transitionSpec = { fadeIn() togetherWith fadeOut() },
                    popTransitionSpec = { fadeIn() togetherWith fadeOut() },
                    predictivePopTransitionSpec = { fadeIn() togetherWith fadeOut() },
                )
            }
        }
    }
}

@Composable
private fun PaddingValues.copy(
    start: Dp? = null,
    top: Dp? = null,
    end: Dp? = null,
    bottom: Dp? = null,
): PaddingValues {
    val layoutDirection = LocalLayoutDirection.current
    return PaddingValues(
        start = start ?: this.calculateStartPadding(layoutDirection),
        top = top ?: this.calculateTopPadding(),
        end = end ?: this.calculateEndPadding(layoutDirection),
        bottom = bottom ?: this.calculateBottomPadding(),
    )
}
