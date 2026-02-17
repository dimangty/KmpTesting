package com.example.kursovikkmp.feature.auth

sealed class AuthError : Exception() {
    object InvalidPhone : AuthError()
    object InvalidData : AuthError()
}

data class SignUpData(
    val firstName: String,
    val lastName: String,
    val gender: String,
    val birthDate: String,
    val country: String,
    val city: String,
    val email: String,
    val phone: String
)

interface AuthService {
    suspend fun login(phone: String): Result<Unit>
    suspend fun signUp(data: SignUpData): Result<Unit>
    suspend fun verifyPin(pin: String): Result<Unit>
    suspend fun logout()
}
