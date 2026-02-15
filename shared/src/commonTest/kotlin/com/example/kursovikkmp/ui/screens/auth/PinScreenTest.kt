package com.example.kursovikkmp.ui.screens.auth

import androidx.compose.ui.test.ExperimentalTestApi
import androidx.compose.ui.test.hasSetTextAction
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import androidx.compose.ui.test.performTextInput
import androidx.compose.ui.test.runComposeUiTest
import com.example.kursovikkmp.common.view.ButtonState
import com.example.kursovikkmp.common.view.updateValue
import com.example.kursovikkmp.feature.auth.pin.PinEvents
import com.example.kursovikkmp.feature.auth.pin.PinState
import kotlin.test.Test
import kotlin.test.Ignore
import kotlin.test.assertTrue

@Ignore
class PinScreenTest {

    @OptIn(ExperimentalTestApi::class)
    @Test
    fun inputAndConfirm_emitEvents() = runComposeUiTest {
        val events = mutableListOf<PinEvents>()
        val base = PinState()
        val state = base.copy(
            pinFieldState = base.pinFieldState.copy(placeholder = "PIN"),
            helperTextState = base.helperTextState.updateValue("Enter PIN"),
            confirmButtonState = ButtonState.primary("Confirm")
        )

        setContent {
            PinScreenView(state = state, onUiEvent = { events += it })
        }

        onNodeWithText("Confirm").assertExists().performClick()
        onNode(hasSetTextAction()).performTextInput("1234")

        assertTrue(events.any { it is PinEvents.ConfirmTapped })
        assertTrue(events.any { it is PinEvents.PinChanged && it.pin.contains("1234") })
    }
}
