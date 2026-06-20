package com.example.kursovikkmp.auth.ui.login

import androidx.compose.foundation.clickable
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
import androidx.compose.ui.unit.dp
import com.example.kursovikkmp.mvvm.BaseScreen
import com.example.kursovikkmp.uikit.component.topbar.EpsTopBarState
import kursovikkmp.core.uikit.generated.resources.Res
import kursovikkmp.core.uikit.generated.resources.login
import kursovikkmp.core.uikit.generated.resources.phone_number
import kursovikkmp.core.uikit.generated.resources.sign_up
import org.jetbrains.compose.resources.stringResource
import org.koin.compose.viewmodel.koinViewModel

@Composable
fun LoginScreen() {
    val viewModel = koinViewModel<LoginViewModel>()
    val screenState by viewModel.stateFlow.collectAsState()
    val state = screenState.state
    val lceState = screenState.lceState
    val loginTitle = stringResource(Res.string.login)
    val phoneTitle = stringResource(Res.string.phone_number)
    val signUpTitle = stringResource(Res.string.sign_up)

    BaseScreen(
        lceState = lceState,
        topBarState = EpsTopBarState(title = loginTitle, showBackButton = false),
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
            OutlinedTextField(
                value = state.phone,
                onValueChange = { viewModel.onUiEvent(LoginUiEvent.OnPhoneChanged(it)) },
                label = { Text(phoneTitle) },
                isError = state.phoneError != null,
                supportingText = state.phoneError?.let { { Text(it) } },
                singleLine = true,
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone),
                modifier = Modifier.fillMaxWidth(),
            )

            Spacer(modifier = Modifier.height(20.dp))

            Button(
                onClick = { viewModel.onUiEvent(LoginUiEvent.OnLoginClicked) },
                enabled = state.isLoginEnabled && !lceState.isLoading,
                modifier = Modifier.fillMaxWidth(),
            ) {
                Text(loginTitle)
            }

            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = signUpTitle,
                modifier = Modifier.clickable { viewModel.onUiEvent(LoginUiEvent.OnSignUpClicked) },
            )
        }
    }
}
