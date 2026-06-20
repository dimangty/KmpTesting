package com.example.kursovikkmp.remoteresult

sealed class RemoteResult<out T> {
    data class Success<T>(val data: T) : RemoteResult<T>()

    sealed class Error : RemoteResult<Nothing>() {
        data object NetworkError : Error()
        data object SerializationError : Error()
        data object ServerSignError : Error()
        data object TimeoutError : Error()
        data class ServerError(val code: Int, val message: String) : Error()
    }

    fun isErrorHandled(): Boolean = false
}

fun RemoteResult.Error.isErrorHandled(): Boolean = false
