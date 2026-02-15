package com.example.kursovikkmp.ui.screens.auth

import androidx.compose.ui.test.ExperimentalTestApi
import androidx.compose.ui.test.hasSetTextAction
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import androidx.compose.ui.test.performTextInput
import androidx.compose.ui.test.runComposeUiTest
import com.example.kursovikkmp.common.view.ButtonState
import com.example.kursovikkmp.common.view.updateValue
import com.example.kursovikkmp.feature.auth.login.LoginEvents
import com.example.kursovikkmp.feature.auth.login.LoginState
import kotlin.test.Test
import kotlin.test.Ignore
import kotlin.test.assertTrue

@Ignore
class LoginScreenTest {

    @OptIn(ExperimentalTestApi::class)
    @Test
    fun inputAndButtons_emitEvents() = runComposeUiTest {
        val events = mutableListOf<LoginEvents>()
        val base = LoginState()
        val state = base.copy(
            phoneFieldState = base.phoneFieldState.copy(placeholder = "Phone"),
            confirmButtonState = ButtonState.primary("Login"),
            signUpButtonState = base.signUpButtonState.updateValue("Sign Up")
        )

        setContent {
            LoginScreenView(state = state, onUiEvent = { events += it })
        }

        onNodeWithText("Login").assertExists().performClick()
        onNodeWithText("Sign Up").assertExists().performClick()
        onNode(hasSetTextAction()).performTextInput("+123")

        assertTrue(events.any { it is LoginEvents.LoginButtonTapped })
        assertTrue(events.any { it is LoginEvents.SignUpButtonTapped })
        assertTrue(events.any { it is LoginEvents.PhoneChanged && it.phone.contains("123") })
    }
}
