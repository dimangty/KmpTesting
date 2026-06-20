package com.example.kursovikkmp.remoteresult

suspend fun <T, R> RemoteResult<T>.mapSuccess(transform: suspend (T) -> R): RemoteResult<R> =
    when (this) {
        is RemoteResult.Success -> RemoteResult.Success(transform(data))
        is RemoteResult.Error -> this
    }
