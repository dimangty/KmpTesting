package com.example.kursovikkmp.auth.data

import com.example.kursovikkmp.auth.domain.AuthError
import com.example.kursovikkmp.auth.domain.AuthService
import com.example.kursovikkmp.auth.domain.SignUpData
import kotlinx.coroutines.delay

class AuthServiceImpl : AuthService {
    private companion object {
        const val MOCK_PIN = "555555"
    }

    override suspend fun login(phone: String): Result<Unit> {
        val digitsOnly = phone.filter { it.isDigit() }

        if (digitsOnly.length < 7 || digitsOnly.length > 15) {
            return Result.failure(AuthError.InvalidPhone)
        }

        delay(400)
        return Result.success(Unit)
    }

    override suspend fun signUp(data: SignUpData): Result<Unit> {
        if (data.firstName.isEmpty() || data.lastName.isEmpty()) {
            return Result.failure(AuthError.InvalidData)
        }

        delay(600)
        return Result.success(Unit)
    }

    override suspend fun verifyPin(pin: String): Result<Unit> {
        delay(700)
        return if (pin == MOCK_PIN) {
            Result.success(Unit)
        } else {
            Result.failure(AuthError.InvalidPin)
        }
    }

    override suspend fun logout() {
    }
}
