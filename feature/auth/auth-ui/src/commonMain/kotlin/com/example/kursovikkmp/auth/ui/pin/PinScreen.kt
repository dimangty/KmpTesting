package com.example.kursovikkmp.auth.ui.pin

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.kursovikkmp.mvvm.BaseScreen
import com.example.kursovikkmp.uikit.component.button.defaultbutton.EpsButton
import com.example.kursovikkmp.uikit.component.text.EpsText
import com.example.kursovikkmp.uikit.component.textfield.defaulttextfield.EpsTextField
import org.koin.compose.viewmodel.koinViewModel

@Composable
fun PinScreen() {
    val viewModel = koinViewModel<PinViewModel>()
    val screenState by viewModel.stateFlow.collectAsState()
    val state = screenState.state
    val lceState = screenState.lceState

    BaseScreen(
        lceState = lceState,
        topBarState = screenState.topBarState,
        defaultEffectFlow = viewModel.defaultEffectFlow,
        onDefaultUiEvent = viewModel::onDefaultUiEvent,
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            EpsText(state = state.placeholderTextState)

            Spacer(modifier = Modifier.height(8.dp))

            EpsTextField(state = state.pinTextFieldState)

            Spacer(modifier = Modifier.height(20.dp))

            EpsButton(state = state.verifyButtonState)
        }
    }
}
