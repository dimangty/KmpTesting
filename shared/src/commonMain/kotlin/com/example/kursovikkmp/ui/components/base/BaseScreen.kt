package com.example.kursovikkmp.ui.components.base

import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.LaunchedEffect
import com.example.kursovikkmp.base.DefaultUiEvent
import com.example.kursovikkmp.common.mvvm.ErrorState
import com.example.kursovikkmp.common.mvvm.LceState

@Composable
fun BaseScreen(
    lceState: LceState,
    onDefaultUiEvent: (DefaultUiEvent) -> Unit,
    content: @Composable () -> Unit
) {
    DisposableEffect(Unit) {
        onDefaultUiEvent(DefaultUiEvent.OnScreenCreated)

        onDispose {
            onDefaultUiEvent(DefaultUiEvent.OnScreenDestroyed)
        }
    }

    // LaunchedEffect to handle screen resumed event
    LaunchedEffect(Unit) {
        onDefaultUiEvent(DefaultUiEvent.OnScreenResumed)
    }

    content()

    LceStateHandlerView(
        lceState = lceState
    )
}

@Composable
private fun LceStateHandlerView(
    lceState: LceState
) {
    when (val errorState = lceState.errorState) {
        null -> Unit
        is ErrorState.ApiAlertError -> {
            MyErrorDialog(state = errorState) {

            }
        }

        is ErrorState.AlertError -> {
            MyAlertDialog(state = errorState) {

            }
        }
    }

    if (lceState.isLoading) {
        LoadingDialog()
    }
}
