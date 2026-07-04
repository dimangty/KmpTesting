package com.example.kursovikkmp.network

import kotlinx.serialization.Serializable

@Serializable
internal data class ApiErrorMessage(
    val message: String? = null,
)
