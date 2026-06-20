package com.example.kursovikkmp.auth.ui.login

import androidx.lifecycle.viewModelScope
import com.example.kursovikkmp.auth.domain.AuthService
import com.example.kursovikkmp.mvvm.BaseViewModel
import com.example.kursovikkmp.navigation.NavigationAction
import com.example.kursovikkmp.uikit.component.topbar.EpsTopBarState
import kursovikkmp.core.uikit.generated.resources.Res
import kursovikkmp.core.uikit.generated.resources.invalid_phone_number
import kursovikkmp.core.uikit.generated.resources.login_failed
import kotlinx.coroutines.launch

class LoginViewModel(
    private val authService: AuthService,
) : BaseViewModel<LoginUiEvent, LoginState>(LoginState()) {

    override fun initTopBarState(): suspend EpsTopBarState.() -> EpsTopBarState = {
        copy()
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
                            phone = event.phone,
                            phoneError = phoneError,
                            isLoginEnabled = isValid
                        )
                    }
                }
            }
            is LoginUiEvent.OnLoginClicked -> {
                viewModelScope.launch {
                    showLoading()
                    val result = authService.login(state.phone)
                    result.onSuccess {
                        navigate(NavigationAction.NavigateToPin)
                    }.onFailure {
                        showToast(it.message ?: getString(Res.string.login_failed), isErrorToast = true)
                    }
                    hideLoading()
                }
            }
            is LoginUiEvent.OnSignUpClicked -> {
                navigate(NavigationAction.NavigateToSignUp)
            }
        }
    }
}
