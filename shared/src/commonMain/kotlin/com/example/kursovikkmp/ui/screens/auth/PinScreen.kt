package com.example.kursovikkmp.ui.screens.auth

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import cafe.adriel.voyager.core.screen.Screen
import org.koin.compose.koinInject
import com.example.kursovikkmp.feature.auth.pin.PinEvents
import com.example.kursovikkmp.feature.auth.pin.PinState
import com.example.kursovikkmp.feature.auth.pin.PinViewModel
import com.example.kursovikkmp.ui.components.base.BaseScreen
import com.example.kursovikkmp.ui.components.base.VSpacer
import com.example.kursovikkmp.ui.components.buttons.MyButton
import com.example.kursovikkmp.ui.components.input.MyTextField
import com.example.kursovikkmp.ui.components.text.MyText

object PinScreen : Screen {
    @Composable
    override fun Content() {
        val viewModel: PinViewModel = koinInject()
        val state by viewModel.flowState.collectAsState()
        val lceState by viewModel.lceState.collectAsState()

        BaseScreen(
            lceState = lceState,
            onDefaultUiEvent = viewModel::onDefaultUiEvent
        ) {
            PinScreenView(
                state = state,
                onUiEvent = viewModel::pushEvent
            )
        }
    }
}

@Composable
fun PinScreenView(
    state: PinState,
    onUiEvent: (PinEvents) -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        MyTextField(
            state = state.pinFieldState,
            onValueChange = { onUiEvent(PinEvents.PinChanged(it)) }
        )

        VSpacer(8.dp)
        MyText(state = state.helperTextState)
        VSpacer(20.dp)

        MyButton(
            state = state.confirmButtonState,
            onClick = { onUiEvent(PinEvents.ConfirmTapped) }
        )

        state.errorTextState?.let { errorState ->
            VSpacer(16.dp)
            MyText(state = errorState)
        }
    }
}
