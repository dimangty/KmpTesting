package com.example.kursovikkmp.ui.screens.auth

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import cafe.adriel.voyager.core.screen.Screen
import org.koin.compose.koinInject
import com.example.kursovikkmp.feature.auth.signup.SignUpEvents
import com.example.kursovikkmp.feature.auth.signup.SignUpState
import com.example.kursovikkmp.feature.auth.signup.SignUpViewModel
import com.example.kursovikkmp.platform.toComposeString
import com.example.kursovikkmp.ui.components.base.BaseScreen
import com.example.kursovikkmp.ui.components.base.Toolbar
import com.example.kursovikkmp.ui.components.base.VSpacer
import com.example.kursovikkmp.ui.components.buttons.MyButton
import com.example.kursovikkmp.ui.components.input.MyDropdownField
import com.example.kursovikkmp.ui.components.input.MyTextField
import com.example.kursovikkmp.MR

object SignUpScreen : Screen {
    @Composable
    override fun Content() {
        val viewModel: SignUpViewModel = koinInject()
        val state by viewModel.flowState.collectAsState()
        val lceState by viewModel.lceState.collectAsState()

        BaseScreen(
            lceState = lceState,
            onDefaultUiEvent = viewModel::onDefaultUiEvent
        ) {
            SignUpScreenView(
                state = state,
                onUiEvent = viewModel::pushEvent
            )
        }
    }
}

@Composable
fun SignUpScreenView(
    state: SignUpState,
    onUiEvent: (SignUpEvents) -> Unit
) {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Toolbar(toolbarState = state.titleBarState)

        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
                .padding(16.dp)
        ) {
            // Personal Information Section
            Text(
                text = MR.strings.personal_information.toComposeString(),
                modifier = Modifier.padding(bottom = 8.dp)
            )

            MyTextField(
                state = state.firstNameField,
                onValueChange = { onUiEvent(SignUpEvents.FirstNameChanged(it)) },
                modifier = Modifier.fillMaxWidth()
            )

            VSpacer(12.dp)

            MyTextField(
                state = state.lastNameField,
                onValueChange = { onUiEvent(SignUpEvents.LastNameChanged(it)) },
                modifier = Modifier.fillMaxWidth()
            )

            VSpacer(12.dp)

            MyDropdownField(
                state = state.genderField,
                onValueChange = { onUiEvent(SignUpEvents.GenderChanged(it)) },
                modifier = Modifier.fillMaxWidth()
            )

            VSpacer(12.dp)

            MyTextField(
                state = state.birthDateField,
                onValueChange = { onUiEvent(SignUpEvents.BirthDateChanged(it)) },
                modifier = Modifier.fillMaxWidth()
            )

            VSpacer(24.dp)

            // Location Section
            Text(
                text = MR.strings.location.toComposeString(),
                modifier = Modifier.padding(bottom = 8.dp)
            )

            MyDropdownField(
                state = state.countryField,
                onValueChange = { onUiEvent(SignUpEvents.CountryChanged(it)) },
                modifier = Modifier.fillMaxWidth()
            )

            VSpacer(12.dp)

            MyDropdownField(
                state = state.cityField,
                onValueChange = { onUiEvent(SignUpEvents.CityChanged(it)) },
                modifier = Modifier.fillMaxWidth()
            )

            VSpacer(24.dp)

            // Contact Section
            Text(
                text = MR.strings.contact.toComposeString(),
                modifier = Modifier.padding(bottom = 8.dp)
            )

            MyTextField(
                state = state.emailField,
                onValueChange = { onUiEvent(SignUpEvents.EmailChanged(it)) },
                modifier = Modifier.fillMaxWidth()
            )

            VSpacer(12.dp)

            MyTextField(
                state = state.phoneField,
                onValueChange = { onUiEvent(SignUpEvents.PhoneChanged(it)) },
                modifier = Modifier.fillMaxWidth()
            )

            VSpacer(24.dp)

            // Create Account Button
            MyButton(
                state = state.createAccountButton,
                onClick = { onUiEvent(SignUpEvents.CreateAccountTapped) },
                modifier = Modifier.fillMaxWidth()
            )
        }
    }
}
