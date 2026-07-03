package com.example.kursovikkmp.auth.ui.login

import androidx.compose.ui.text.input.KeyboardType
import androidx.lifecycle.viewModelScope
import com.example.kursovikkmp.auth.domain.AuthService
import com.example.kursovikkmp.mvvm.BaseViewModel
import com.example.kursovikkmp.navigation.NavigationAction
import com.example.kursovikkmp.uikit.component.topbar.EpsTopBarState
import kursovikkmp.core.uikit.generated.resources.Res
import kursovikkmp.core.uikit.generated.resources.invalid_phone_number
import kursovikkmp.core.uikit.generated.resources.login
import kursovikkmp.core.uikit.generated.resources.login_failed
import kursovikkmp.core.uikit.generated.resources.phone_number
import kursovikkmp.core.uikit.generated.resources.sign_up
import kotlinx.coroutines.launch

class LoginViewModel(
    private val authService: AuthService,
) : BaseViewModel<LoginUiEvent, LoginState>(LoginState()) {

    override fun initTopBarState(): suspend EpsTopBarState.() -> EpsTopBarState = {
        copy(title = getString(Res.string.login), showBackButton = false)
    }

    override fun initScreenStrings(): suspend LoginState.() -> LoginState = {
        copy(
            phoneTextFieldState = phoneTextFieldState.copy(
                label = getString(Res.string.phone_number),
                keyboardType = KeyboardType.Phone,
                onValueChange = { onUiEvent(LoginUiEvent.OnPhoneChanged(it)) },
            ),
            loginButtonState = loginButtonState.copy(
                text = getString(Res.string.login),
                enabled = false,
                onClick = { onUiEvent(LoginUiEvent.OnLoginClicked) },
            ),
            signUpButtonState = signUpButtonState.copy(
                text = getString(Res.string.sign_up),
                onClick = { onUiEvent(LoginUiEvent.OnSignUpClicked) },
            ),
        )
    }

    override fun processUiEvent(event: LoginUiEvent) {
        when (event) {
            is LoginUiEvent.OnPhoneChanged -> {
                val digitsOnly = event.phone.filter { it.isDigit() }
                val isValid = digitsOnly.length in 7..15
                viewModelScope.launch {
                    val phoneError = if (digitsOnly.isNotEmpty() && !isValid) {
                        getString(Res.string.invalid_phone_number)
                    } else {
                        null
                    }
                    updateState {
                        copy(
                            phoneTextFieldState = phoneTextFieldState.copy(
                                value = event.phone,
                                error = phoneError,
                            ),
                            loginButtonState = loginButtonState.copy(enabled = isValid),
                        )
                    }
                }
            }
            is LoginUiEvent.OnLoginClicked -> {
                viewModelScope.launch {
                    updateLoginButtonEnabled(false)
                    showLoading()
                    val result = authService.login(state.phoneTextFieldState.value)
                    result.onSuccess {
                        navigate(NavigationAction.NavigateToPin)
                    }.onFailure {
                        showToast(it.message ?: getString(Res.string.login_failed), isErrorToast = true)
                    }
                    hideLoading()
                    updateLoginButtonEnabled(state.phoneTextFieldState.value.filter { it.isDigit() }.length in 7..15)
                }
            }
            is LoginUiEvent.OnSignUpClicked -> {
                navigate(NavigationAction.NavigateToSignUp)
            }
        }
    }

    private fun updateLoginButtonEnabled(enabled: Boolean) {
        updateState {
            copy(loginButtonState = loginButtonState.copy(enabled = enabled))
        }
    }
}
