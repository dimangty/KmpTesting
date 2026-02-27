package com.example.kursovikkmp.feature.auth.signup

import com.example.kursovikkmp.base.BaseViewState
import com.example.kursovikkmp.common.view.ButtonState
import com.example.kursovikkmp.common.view.DropdownFieldState
import com.example.kursovikkmp.common.view.TextFieldState
import com.example.kursovikkmp.common.view.TextState
import com.example.kursovikkmp.common.view.TitleBarState
import com.example.kursovikkmp.common.view.getMock
import com.example.kursovikkmp.common.view.updateEnabled
import com.example.kursovikkmp.common.view.updateValue
import com.example.kursovikkmp.resources.AppColors
import com.example.kursovikkmp.resources.AppResources

import org.jetbrains.compose.resources.StringResource

data class SignUpState(
    val firstName: String = "",
    val lastName: String = "",
    val gender: String = "",
    val birthDate: String = "",
    val country: String = "",
    val city: String = "",
    val email: String = "",
    val phone: String = "",
    val isLoading: Boolean = false,
    val isFormValid: Boolean = false,
    val errorMessage: String? = null,
    val genderOptions: List<String> = listOf("Male", "Female", "Other"),
    val countryOptions: List<String> = listOf("USA", "UK", "Germany", "France"),
    val cityOptions: List<String> = listOf("New York", "London", "Berlin", "Paris"),
    // UI Components
    val firstNamePlaceholderResource: StringResource? = null,
    val firstNameField: TextFieldState = TextFieldState(
        value = "",
        placeholder = "",
        keyboardType = TextFieldState.KeyboardType.Text
    ),
    val lastNamePlaceholderResource: StringResource? = null,
    val lastNameField: TextFieldState = TextFieldState(
        value = "",
        placeholder = "",
        keyboardType = TextFieldState.KeyboardType.Text
    ),
    val genderPlaceholderResource: StringResource? = null,
    val genderField: DropdownFieldState = DropdownFieldState(
        value = "",
        placeholder = "",
        options = genderOptions
    ),
    val birthDatePlaceholderResource: StringResource? = null,
    val birthDateField: TextFieldState = TextFieldState(
        value = "",
        placeholder = "",
        keyboardType = TextFieldState.KeyboardType.Text
    ),
    val countryPlaceholderResource: StringResource? = null,
    val countryField: DropdownFieldState = DropdownFieldState(
        value = "",
        placeholder = "",
        options = countryOptions
    ),
    val cityPlaceholderResource: StringResource? = null,
    val cityField: DropdownFieldState = DropdownFieldState(
        value = "",
        placeholder = "",
        options = cityOptions
    ),
    val emailPlaceholderResource: StringResource? = null,
    val emailField: TextFieldState = TextFieldState(
        value = "",
        placeholder = "",
        keyboardType = TextFieldState.KeyboardType.Email
    ),
    val phonePlaceholderResource: StringResource? = null,
    val phoneField: TextFieldState = TextFieldState(
        value = "",
        placeholder = "",
        keyboardType = TextFieldState.KeyboardType.Phone
    ),
    val createAccountButtonResource: StringResource? = null,
    val createAccountButton: ButtonState = ButtonState.primary(
        value = "",
        background = AppColors.grey,
        isEnabled = false
    ),
    val errorTextState: TextState? = null,
    override val titleBarState: TitleBarState = TitleBarState.getMock()
) : BaseViewState
