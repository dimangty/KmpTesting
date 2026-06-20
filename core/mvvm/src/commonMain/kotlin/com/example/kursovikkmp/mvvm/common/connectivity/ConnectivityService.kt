package com.example.kursovikkmp.mvvm.common.connectivity

interface ConnectivityService {
    suspend fun checkInternetAvailable(
        onAvailable: () -> Unit,
        onNotAvailable: () -> Unit,
    )
}
