package com.example.kursovikkmp.auth.ui.pin

import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.lifecycle.viewModelScope
import com.example.kursovikkmp.auth.domain.AuthService
import com.example.kursovikkmp.mvvm.BaseViewModel
import com.example.kursovikkmp.navigation.NavigationAction
import com.example.kursovikkmp.uikit.component.topbar.EpsTopBarState
import kursovikkmp.core.uikit.generated.resources.Res
import kursovikkmp.core.uikit.generated.resources.confirm_pin
import kursovikkmp.core.uikit.generated.resources.invalid_pin
import kursovikkmp.core.uikit.generated.resources.pin_placeholder
import kotlinx.coroutines.launch

class PinViewModel(
    private val authService: AuthService,
) : BaseViewModel<PinUiEvent, PinState>(PinState()) {

    override fun initTopBarState(): suspend EpsTopBarState.() -> EpsTopBarState = {
        copy(title = getString(Res.string.confirm_pin), showBackButton = true)
    }

    override fun initScreenStrings(): suspend PinState.() -> PinState = {
        val confirmPin = getString(Res.string.confirm_pin)
        copy(
            placeholderTextState = placeholderTextState.copy(
                text = getString(Res.string.pin_placeholder),
            ),
            pinTextFieldState = pinTextFieldState.copy(
                label = confirmPin,
                keyboardType = KeyboardType.Number,
                visualTransformation = PasswordVisualTransformation(),
                onValueChange = { onUiEvent(PinUiEvent.OnPinChanged(it)) },
            ),
            verifyButtonState = verifyButtonState.copy(
                text = confirmPin,
                enabled = false,
                onClick = { onUiEvent(PinUiEvent.OnVerifyClicked) },
            ),
        )
    }

    override fun processUiEvent(event: PinUiEvent) {
        when (event) {
            is PinUiEvent.OnPinChanged -> {
                val pin = event.pin.filter { it.isDigit() }.take(6)
                val isValid = pin.length == 6
                updateState {
                    copy(
                        pinTextFieldState = pinTextFieldState.copy(
                            value = pin,
                            error = null,
                        ),
                        verifyButtonState = verifyButtonState.copy(enabled = isValid),
                    )
                }
            }
            is PinUiEvent.OnVerifyClicked -> {
                viewModelScope.launch {
                    val pin = state.pinTextFieldState.value
                    if (pin.length == 6) {
                        updateVerifyButtonEnabled(false)
                        showLoading()
                        val result = authService.verifyPin(pin)
                        result.onSuccess {
                            navigate(NavigationAction.NavigateToMain)
                        }.onFailure {
                            updateState {
                                copy(
                                    pinTextFieldState = pinTextFieldState.copy(
                                        value = "",
                                        error = it.message,
                                    ),
                                    verifyButtonState = verifyButtonState.copy(enabled = false),
                                )
                            }
                            showToast(it.message ?: getString(Res.string.invalid_pin), isErrorToast = true)
                        }
                        hideLoading()
                        if (state.pinTextFieldState.value.length == 6) {
                            updateVerifyButtonEnabled(true)
                        }
                    }
                }
            }
        }
    }

    private fun updateVerifyButtonEnabled(enabled: Boolean) {
        updateState {
            copy(verifyButtonState = verifyButtonState.copy(enabled = enabled))
        }
    }
}
