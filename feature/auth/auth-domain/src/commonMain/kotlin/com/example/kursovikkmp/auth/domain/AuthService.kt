package com.example.kursovikkmp.auth.domain

data class SignUpData(
    val firstName: String = "",
    val lastName: String = "",
    val gender: String = "",
    val birthDate: String = "",
    val country: String = "",
    val city: String = "",
    val email: String = "",
    val phone: String = "",
)

sealed class AuthError : Throwable() {
    data object InvalidPhone : AuthError()
    data object InvalidData : AuthError()
    data object InvalidPin : AuthError()
}

interface AuthService {
    suspend fun login(phone: String): Result<Unit>
    suspend fun signUp(data: SignUpData): Result<Unit>
    suspend fun verifyPin(pin: String): Result<Unit>
    suspend fun logout()
}
