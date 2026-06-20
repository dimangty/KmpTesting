package com.example.kursovikkmp.auth.ui.pin

data class PinState(
    val pin: String = "",
    val pinError: String? = null,
    val isVerifyEnabled: Boolean = false,
)
