package com.example.kursovikkmp.auth.ui.signup

data class SignUpState(
    val firstName: String = "",
    val lastName: String = "",
    val gender: String = "",
    val birthDate: String = "",
    val country: String = "",
    val city: String = "",
    val email: String = "",
    val phone: String = "",
    val errorMessage: String? = null,
) {
    val isValid: Boolean
        get() = firstName.length >= 2
                && lastName.length >= 2
                && gender.isNotEmpty()
                && country.isNotEmpty()
                && city.isNotEmpty()
                && email.isNotEmpty()
                && phone.isNotEmpty()
}
