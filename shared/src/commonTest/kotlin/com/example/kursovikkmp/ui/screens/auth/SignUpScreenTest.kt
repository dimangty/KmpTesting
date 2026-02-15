package com.example.kursovikkmp.ui.screens.auth

import androidx.compose.ui.test.ExperimentalTestApi
import androidx.compose.ui.test.hasSetTextAction
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import androidx.compose.ui.test.performTextInput
import androidx.compose.ui.test.runComposeUiTest
import com.example.kursovikkmp.common.view.ButtonState
import com.example.kursovikkmp.feature.auth.signup.SignUpEvents
import com.example.kursovikkmp.feature.auth.signup.SignUpState
import kotlin.test.Test
import kotlin.test.Ignore
import kotlin.test.assertTrue

@Ignore
class SignUpScreenTest {

    @OptIn(ExperimentalTestApi::class)
    @Test
    fun createAccount_emitsEvent() = runComposeUiTest {
        val events = mutableListOf<SignUpEvents>()
        val base = SignUpState()
        val state = base.copy(
            firstNameField = base.firstNameField.copy(placeholder = "First name"),
            lastNameField = base.lastNameField.copy(placeholder = "Last name"),
            emailField = base.emailField.copy(placeholder = "Email"),
            phoneField = base.phoneField.copy(placeholder = "Phone"),
            createAccountButton = ButtonState.primary("Create account")
        )

        setContent {
            SignUpScreenView(state = state, onUiEvent = { events += it })
        }

        onNode(hasSetTextAction()).performTextInput("John")
        onNodeWithText("Create account").assertExists().performClick()

        assertTrue(events.any { it is SignUpEvents.FirstNameChanged && it.value.contains("John") })
        assertTrue(events.any { it is SignUpEvents.CreateAccountTapped })
    }
}
