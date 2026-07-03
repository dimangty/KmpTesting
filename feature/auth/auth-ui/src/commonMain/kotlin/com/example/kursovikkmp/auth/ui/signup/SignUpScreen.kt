package com.example.kursovikkmp.auth.ui.signup

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.kursovikkmp.mvvm.BaseScreen
import com.example.kursovikkmp.uikit.component.button.defaultbutton.EpsButton
import com.example.kursovikkmp.uikit.component.dropdown.EpsDropdown
import com.example.kursovikkmp.uikit.component.text.EpsText
import com.example.kursovikkmp.uikit.component.textfield.defaulttextfield.EpsTextField
import org.koin.compose.viewmodel.koinViewModel

@Composable
fun SignUpScreen() {
    val viewModel = koinViewModel<SignUpViewModel>()
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
                .verticalScroll(rememberScrollState())
                .padding(16.dp),
        ) {
            EpsTextField(state = state.firstNameTextFieldState)
            Spacer(modifier = Modifier.height(12.dp))

            EpsTextField(state = state.lastNameTextFieldState)
            Spacer(modifier = Modifier.height(12.dp))

            EpsDropdown(state = state.genderDropdownState)
            Spacer(modifier = Modifier.height(12.dp))

            EpsTextField(state = state.birthDateTextFieldState)
            Spacer(modifier = Modifier.height(12.dp))

            EpsDropdown(state = state.countryDropdownState)
            Spacer(modifier = Modifier.height(12.dp))

            EpsDropdown(state = state.cityDropdownState)
            Spacer(modifier = Modifier.height(12.dp))

            EpsTextField(state = state.emailTextFieldState)
            Spacer(modifier = Modifier.height(12.dp))

            EpsTextField(state = state.phoneTextFieldState)

            state.errorTextState?.let { errorState ->
                Spacer(modifier = Modifier.height(12.dp))
                EpsText(state = errorState)
            }

            Spacer(modifier = Modifier.height(24.dp))

            EpsButton(state = state.createAccountButtonState)
        }
    }
}
