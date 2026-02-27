package com.example.kursovikkmp.feature.auth.signup

import androidx.lifecycle.viewModelScope
import com.example.kursovikkmp.base.BaseViewModel
import com.example.kursovikkmp.common.view.ButtonState
import com.example.kursovikkmp.common.view.DropdownFieldState
import com.example.kursovikkmp.common.view.TextFieldState
import com.example.kursovikkmp.common.view.TextState
import com.example.kursovikkmp.common.view.updateEnabled
import com.example.kursovikkmp.common.view.updateValue
import com.example.kursovikkmp.feature.auth.AuthService
import com.example.kursovikkmp.feature.auth.SignUpData
import com.example.kursovikkmp.feature.auth.ValidationService
import com.example.kursovikkmp.navigation.NavigationAction
import kotlinx.coroutines.launch
import com.example.kursovikkmp.resources.AppResources

import org.jetbrains.compose.resources.getString
import com.example.kursovikkmp.resources.AppColors

class SignUpViewModel(
    private val authService: AuthService,
    private val validationService: ValidationService
) : BaseViewModel<SignUpState, SignUpEvents>() {

    override fun initToolbar() {
        var titleBar = state.titleBarState.copy()
        titleBar = titleBar.copy(
            titleResource = AppResources.strings.sign_up_title,
            isNavigateBackVisible = true
        )
        updateState { copy(titleBarState = titleBar) }
    }

    override fun initScreenData() {
        // No initial data to load
        // Button strings are configured in state computed properties
        validateForm()
    }

    override fun initialState(): SignUpState {
        val genderOptions = listOf("Male", "Female", "Other")
        val countryOptions = listOf("USA", "UK", "Germany", "France")
        val cityOptions = listOf("New York", "London", "Berlin", "Paris")

        return SignUpState(
            genderOptions = genderOptions,
            countryOptions = countryOptions,
            cityOptions = cityOptions,
            firstNamePlaceholderResource = AppResources.strings.first_name,
            lastNamePlaceholderResource = AppResources.strings.last_name,
            genderPlaceholderResource = AppResources.strings.gender,
            birthDatePlaceholderResource = AppResources.strings.birth_date,
            countryPlaceholderResource = AppResources.strings.country,
            cityPlaceholderResource = AppResources.strings.city,
            emailPlaceholderResource = AppResources.strings.email,
            phonePlaceholderResource = AppResources.strings.phone,
            createAccountButtonResource = AppResources.strings.create_account
        )
    }

    override fun onEvent(event: SignUpEvents) {
        when (event) {
            is SignUpEvents.FirstNameChanged -> {
                updateState {
                    copy(
                        firstName = event.value,
                        firstNameField = firstNameField.updateValue(event.value),
                        errorMessage = null
                    )
                }
                validateForm()
            }

            is SignUpEvents.LastNameChanged -> {
                updateState {
                    copy(
                        lastName = event.value,
                        lastNameField = lastNameField.updateValue(event.value),
                        errorMessage = null
                    )
                }
                validateForm()
            }

            is SignUpEvents.GenderChanged -> {
                updateState {
                    copy(
                        gender = event.value,
                        genderField = genderField.updateValue(event.value),
                        errorMessage = null
                    )
                }
                validateForm()
            }

            is SignUpEvents.BirthDateChanged -> {
                updateState {
                    copy(
                        birthDate = event.value,
                        birthDateField = birthDateField.updateValue(event.value),
                        errorMessage = null
                    )
                }
                validateForm()
            }

            is SignUpEvents.CountryChanged -> {
                updateState {
                    copy(
                        country = event.value,
                        countryField = countryField.updateValue(event.value),
                        errorMessage = null
                    )
                }
                validateForm()
            }

            is SignUpEvents.CityChanged -> {
                updateState {
                    copy(
                        city = event.value,
                        cityField = cityField.updateValue(event.value),
                        errorMessage = null
                    )
                }
                validateForm()
            }

            is SignUpEvents.EmailChanged -> {
                updateState {
                    copy(
                        email = event.value,
                        emailField = emailField.updateValue(event.value),
                        errorMessage = null
                    )
                }
                validateForm()
            }

            is SignUpEvents.PhoneChanged -> {
                val filteredPhone = event.value.filter { it.isDigit() }.take(15)
                updateState {
                    copy(
                        phone = filteredPhone,
                        phoneField = phoneField.updateValue(filteredPhone),
                        errorMessage = null
                    )
                }
                validateForm()
            }

            is SignUpEvents.CreateAccountTapped -> {
                if (state.isFormValid) {
                    createAccount()
                }
            }

            is SignUpEvents.BackButtonTapped -> {
                navigateBack()
            }
        }
    }

    private fun validateForm() {
        val isValid = state.firstName.length >= 2
                && state.lastName.length >= 2
                && state.gender.isNotEmpty()
                && state.country.isNotEmpty()
                && state.city.isNotEmpty()
                && state.email.isNotEmpty()
                && state.phone.isNotEmpty()

        updateState {
            copy(
                isFormValid = isValid,
                createAccountButton = createAccountButton.copy(
                    isEnabled = isValid && !isLoading
                )
            )
        }
    }

    private fun updateButton() {
        updateState {
            copy(
                createAccountButton = createAccountButton.copy(
                    isEnabled = isFormValid && !isLoading
                )
            )
        }
    }

    private fun createAccount() {
        viewModelScope.launch {
            updateState {
                copy(
                    isLoading = true,
                    errorMessage = null,
                    errorTextState = null,
                    createAccountButton = createAccountButton.updateEnabled(false)
                )
            }

            val signUpData = SignUpData(
                firstName = state.firstName,
                lastName = state.lastName,
                gender = state.gender,
                birthDate = state.birthDate,
                country = state.country,
                city = state.city,
                email = state.email,
                phone = state.phone
            )


            authService.signUp(signUpData)
                .onSuccess {
                    updateState { copy(isLoading = false) }
                    validateForm()
                    navigate(NavigationAction.NavigateToPin)
                }
                .onFailure { error ->
                    val errorMsg = getString(AppResources.strings.sign_up_failed)
                    updateState {
                        copy(
                            isLoading = false,
                            errorMessage = errorMsg,
                            errorTextState = TextState.latoRegular(12, AppColors.red).updateValue(errorMsg)
                        )
                    }
                    validateForm()
                }
        }
    }
}
