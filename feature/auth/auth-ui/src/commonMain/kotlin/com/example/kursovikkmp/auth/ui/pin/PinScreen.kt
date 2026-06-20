package com.example.kursovikkmp.auth.ui.pin

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import com.example.kursovikkmp.mvvm.BaseScreen
import com.example.kursovikkmp.uikit.component.topbar.EpsTopBarState
import kursovikkmp.core.uikit.generated.resources.Res
import kursovikkmp.core.uikit.generated.resources.confirm_pin
import kursovikkmp.core.uikit.generated.resources.pin_placeholder
import org.jetbrains.compose.resources.stringResource
import org.koin.compose.viewmodel.koinViewModel

@Composable
fun PinScreen() {
    val viewModel = koinViewModel<PinViewModel>()
    val screenState by viewModel.stateFlow.collectAsState()
    val state = screenState.state
    val lceState = screenState.lceState
    val pinTitle = stringResource(Res.string.confirm_pin)
    val pinPlaceholder = stringResource(Res.string.pin_placeholder)

    BaseScreen(
        lceState = lceState,
        topBarState = EpsTopBarState(title = pinTitle, showBackButton = true),
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
            Text(text = pinPlaceholder)

            Spacer(modifier = Modifier.height(8.dp))

            OutlinedTextField(
                value = state.pin,
                onValueChange = { viewModel.onUiEvent(PinUiEvent.OnPinChanged(it)) },
                label = { Text(pinTitle) },
                isError = state.pinError != null,
                supportingText = state.pinError?.let { { Text(it) } },
                singleLine = true,
                visualTransformation = PasswordVisualTransformation(),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                modifier = Modifier.fillMaxWidth(),
            )

            Spacer(modifier = Modifier.height(20.dp))

            Button(
                onClick = { viewModel.onUiEvent(PinUiEvent.OnVerifyClicked) },
                enabled = state.isVerifyEnabled && !lceState.isLoading,
                modifier = Modifier.fillMaxWidth(),
            ) {
                Text(pinTitle)
            }
        }
    }
}
