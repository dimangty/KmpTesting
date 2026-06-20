package com.example.kursovikkmp.auth.ui.login

data class LoginState(
    val phone: String = "",
    val phoneError: String? = null,
    val isLoginEnabled: Boolean = false,
)
