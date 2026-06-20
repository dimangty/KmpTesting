package com.example.kursovikkmp.auth.ui.pin

import androidx.lifecycle.viewModelScope
import com.example.kursovikkmp.auth.domain.AuthService
import com.example.kursovikkmp.mvvm.BaseViewModel
import com.example.kursovikkmp.navigation.NavigationAction
import com.example.kursovikkmp.uikit.component.topbar.EpsTopBarState
import kursovikkmp.core.uikit.generated.resources.Res
import kursovikkmp.core.uikit.generated.resources.invalid_pin
import kotlinx.coroutines.launch

class PinViewModel(
    private val authService: AuthService,
) : BaseViewModel<PinUiEvent, PinState>(PinState()) {

    override fun initTopBarState(): suspend EpsTopBarState.() -> EpsTopBarState = {
        copy()
    }

    override fun processUiEvent(event: PinUiEvent) {
        when (event) {
            is PinUiEvent.OnPinChanged -> {
                val pin = event.pin.filter { it.isDigit() }.take(6)
                val isValid = pin.length == 6
                updateState {
                    copy(
                        pin = pin,
                        pinError = null,
                        isVerifyEnabled = isValid
                    )
                }
            }
            is PinUiEvent.OnVerifyClicked -> {
                viewModelScope.launch {
                    val pin = state.pin
                    if (pin.length == 6) {
                        showLoading()
                        val result = authService.verifyPin(pin)
                        result.onSuccess {
                            navigate(NavigationAction.NavigateToMain)
                        }.onFailure {
                            updateState { copy(pin = "", pinError = it.message, isVerifyEnabled = false) }
                            showToast(it.message ?: getString(Res.string.invalid_pin), isErrorToast = true)
                        }
                        hideLoading()
                    }
                }
            }
        }
    }
}
