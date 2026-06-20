package com.example.kursovikkmp.auth.ui.signup

import androidx.lifecycle.viewModelScope
import com.example.kursovikkmp.auth.domain.AuthService
import com.example.kursovikkmp.auth.domain.SignUpData
import com.example.kursovikkmp.mvvm.BaseViewModel
import com.example.kursovikkmp.navigation.NavigationAction
import com.example.kursovikkmp.uikit.component.topbar.EpsTopBarState
import kursovikkmp.core.uikit.generated.resources.Res
import kursovikkmp.core.uikit.generated.resources.sign_up_failed
import kotlinx.coroutines.launch

class SignUpViewModel(
    private val authService: AuthService,
) : BaseViewModel<SignUpUiEvent, SignUpState>(SignUpState()) {

    override fun initTopBarState(): suspend EpsTopBarState.() -> EpsTopBarState = {
        copy()
    }

    override fun processUiEvent(event: SignUpUiEvent) {
        when (event) {
            is SignUpUiEvent.OnFirstNameChanged -> updateState { copy(firstName = event.value) }
            is SignUpUiEvent.OnLastNameChanged -> updateState { copy(lastName = event.value) }
            is SignUpUiEvent.OnGenderChanged -> updateState { copy(gender = event.value) }
            is SignUpUiEvent.OnBirthDateChanged -> updateState { copy(birthDate = event.value) }
            is SignUpUiEvent.OnCountryChanged -> updateState { copy(country = event.value) }
            is SignUpUiEvent.OnCityChanged -> updateState { copy(city = event.value) }
            is SignUpUiEvent.OnEmailChanged -> updateState { copy(email = event.value) }
            is SignUpUiEvent.OnPhoneChanged -> updateState { copy(phone = event.value) }
            is SignUpUiEvent.OnSignUpClicked -> {
                viewModelScope.launch {
                    showLoading()
                    val data = SignUpData(
                        firstName = state.firstName,
                        lastName = state.lastName,
                        gender = state.gender,
                        birthDate = state.birthDate,
                        country = state.country,
                        city = state.city,
                        email = state.email,
                        phone = state.phone,
                    )
                    val result = authService.signUp(data)
                    result.onSuccess {
                        navigate(NavigationAction.NavigateToPin)
                    }.onFailure {
                        updateState { copy(errorMessage = it.message) }
                        showToast(it.message ?: getString(Res.string.sign_up_failed), isErrorToast = true)
                    }
                    hideLoading()
                }
            }
        }
    }
}
