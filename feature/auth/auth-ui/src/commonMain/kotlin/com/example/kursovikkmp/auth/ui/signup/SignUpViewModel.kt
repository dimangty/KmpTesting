package com.example.kursovikkmp.auth.ui.signup

import androidx.compose.ui.text.input.KeyboardType
import androidx.lifecycle.viewModelScope
import com.example.kursovikkmp.auth.domain.AuthService
import com.example.kursovikkmp.auth.domain.SignUpData
import com.example.kursovikkmp.mvvm.BaseViewModel
import com.example.kursovikkmp.navigation.NavigationAction
import com.example.kursovikkmp.uikit.component.text.EpsTextState
import com.example.kursovikkmp.uikit.component.topbar.EpsTopBarState
import kursovikkmp.core.uikit.generated.resources.Res
import kursovikkmp.core.uikit.generated.resources.berlin
import kursovikkmp.core.uikit.generated.resources.birth_date
import kursovikkmp.core.uikit.generated.resources.city
import kursovikkmp.core.uikit.generated.resources.country
import kursovikkmp.core.uikit.generated.resources.create_account
import kursovikkmp.core.uikit.generated.resources.email
import kursovikkmp.core.uikit.generated.resources.female
import kursovikkmp.core.uikit.generated.resources.first_name
import kursovikkmp.core.uikit.generated.resources.france
import kursovikkmp.core.uikit.generated.resources.gender
import kursovikkmp.core.uikit.generated.resources.germany
import kursovikkmp.core.uikit.generated.resources.last_name
import kursovikkmp.core.uikit.generated.resources.london
import kursovikkmp.core.uikit.generated.resources.male
import kursovikkmp.core.uikit.generated.resources.new_york
import kursovikkmp.core.uikit.generated.resources.other
import kursovikkmp.core.uikit.generated.resources.paris
import kursovikkmp.core.uikit.generated.resources.phone
import kursovikkmp.core.uikit.generated.resources.sign_up_failed
import kursovikkmp.core.uikit.generated.resources.sign_up_title
import kursovikkmp.core.uikit.generated.resources.uk
import kursovikkmp.core.uikit.generated.resources.usa
import kotlinx.coroutines.launch

class SignUpViewModel(
    private val authService: AuthService,
) : BaseViewModel<SignUpUiEvent, SignUpState>(SignUpState()) {

    override fun initTopBarState(): suspend EpsTopBarState.() -> EpsTopBarState = {
        copy(title = getString(Res.string.sign_up_title), showBackButton = true)
    }

    override fun initScreenStrings(): suspend SignUpState.() -> SignUpState = {
        copy(
            firstNameTextFieldState = firstNameTextFieldState.copy(
                label = getString(Res.string.first_name),
                onValueChange = { onUiEvent(SignUpUiEvent.OnFirstNameChanged(it)) },
            ),
            lastNameTextFieldState = lastNameTextFieldState.copy(
                label = getString(Res.string.last_name),
                onValueChange = { onUiEvent(SignUpUiEvent.OnLastNameChanged(it)) },
            ),
            genderDropdownState = genderDropdownState.copy(
                label = getString(Res.string.gender),
                options = listOf(
                    getString(Res.string.male),
                    getString(Res.string.female),
                    getString(Res.string.other),
                ),
                onValueChange = { onUiEvent(SignUpUiEvent.OnGenderChanged(it)) },
            ),
            birthDateTextFieldState = birthDateTextFieldState.copy(
                label = getString(Res.string.birth_date),
                onValueChange = { onUiEvent(SignUpUiEvent.OnBirthDateChanged(it)) },
            ),
            countryDropdownState = countryDropdownState.copy(
                label = getString(Res.string.country),
                options = listOf(
                    getString(Res.string.usa),
                    getString(Res.string.uk),
                    getString(Res.string.germany),
                    getString(Res.string.france),
                ),
                onValueChange = { onUiEvent(SignUpUiEvent.OnCountryChanged(it)) },
            ),
            cityDropdownState = cityDropdownState.copy(
                label = getString(Res.string.city),
                options = listOf(
                    getString(Res.string.new_york),
                    getString(Res.string.london),
                    getString(Res.string.berlin),
                    getString(Res.string.paris),
                ),
                onValueChange = { onUiEvent(SignUpUiEvent.OnCityChanged(it)) },
            ),
            emailTextFieldState = emailTextFieldState.copy(
                label = getString(Res.string.email),
                keyboardType = KeyboardType.Email,
                onValueChange = { onUiEvent(SignUpUiEvent.OnEmailChanged(it)) },
            ),
            phoneTextFieldState = phoneTextFieldState.copy(
                label = getString(Res.string.phone),
                keyboardType = KeyboardType.Phone,
                onValueChange = { onUiEvent(SignUpUiEvent.OnPhoneChanged(it)) },
            ),
            createAccountButtonState = createAccountButtonState.copy(
                text = getString(Res.string.create_account),
                enabled = false,
                onClick = { onUiEvent(SignUpUiEvent.OnSignUpClicked) },
            ),
        )
    }

    override fun processUiEvent(event: SignUpUiEvent) {
        when (event) {
            is SignUpUiEvent.OnFirstNameChanged -> updateState {
                copy(
                    firstNameTextFieldState = firstNameTextFieldState.copy(value = event.value),
                    errorTextState = null,
                ).withCreateAccountButtonState()
            }
            is SignUpUiEvent.OnLastNameChanged -> updateState {
                copy(
                    lastNameTextFieldState = lastNameTextFieldState.copy(value = event.value),
                    errorTextState = null,
                ).withCreateAccountButtonState()
            }
            is SignUpUiEvent.OnGenderChanged -> updateState {
                copy(
                    genderDropdownState = genderDropdownState.copy(value = event.value),
                    errorTextState = null,
                ).withCreateAccountButtonState()
            }
            is SignUpUiEvent.OnBirthDateChanged -> updateState {
                copy(
                    birthDateTextFieldState = birthDateTextFieldState.copy(value = event.value),
                    errorTextState = null,
                ).withCreateAccountButtonState()
            }
            is SignUpUiEvent.OnCountryChanged -> updateState {
                copy(
                    countryDropdownState = countryDropdownState.copy(value = event.value),
                    errorTextState = null,
                ).withCreateAccountButtonState()
            }
            is SignUpUiEvent.OnCityChanged -> updateState {
                copy(
                    cityDropdownState = cityDropdownState.copy(value = event.value),
                    errorTextState = null,
                ).withCreateAccountButtonState()
            }
            is SignUpUiEvent.OnEmailChanged -> updateState {
                copy(
                    emailTextFieldState = emailTextFieldState.copy(value = event.value),
                    errorTextState = null,
                ).withCreateAccountButtonState()
            }
            is SignUpUiEvent.OnPhoneChanged -> updateState {
                copy(
                    phoneTextFieldState = phoneTextFieldState.copy(value = event.value),
                    errorTextState = null,
                ).withCreateAccountButtonState()
            }
            is SignUpUiEvent.OnSignUpClicked -> {
                viewModelScope.launch {
                    updateCreateAccountButtonEnabled(false)
                    showLoading()
                    val data = SignUpData(
                        firstName = state.firstNameTextFieldState.value,
                        lastName = state.lastNameTextFieldState.value,
                        gender = state.genderDropdownState.value,
                        birthDate = state.birthDateTextFieldState.value,
                        country = state.countryDropdownState.value,
                        city = state.cityDropdownState.value,
                        email = state.emailTextFieldState.value,
                        phone = state.phoneTextFieldState.value,
                    )
                    val result = authService.signUp(data)
                    result.onSuccess {
                        navigate(NavigationAction.NavigateToPin)
                    }.onFailure {
                        updateState {
                            copy(
                                errorTextState = EpsTextState(
                                    text = it.message.orEmpty(),
                                    color = 0xFFFF0000,
                                )
                            )
                        }
                        showToast(it.message ?: getString(Res.string.sign_up_failed), isErrorToast = true)
                    }
                    hideLoading()
                    updateState { withCreateAccountButtonState() }
                }
            }
        }
    }

    private fun updateCreateAccountButtonEnabled(enabled: Boolean) {
        updateState {
            copy(createAccountButtonState = createAccountButtonState.copy(enabled = enabled))
        }
    }

    private fun SignUpState.withCreateAccountButtonState(): SignUpState {
        return copy(createAccountButtonState = createAccountButtonState.copy(enabled = isValid))
    }
}
