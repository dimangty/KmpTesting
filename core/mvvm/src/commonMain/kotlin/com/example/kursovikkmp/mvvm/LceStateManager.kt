package com.example.kursovikkmp.mvvm

import com.example.kursovikkmp.common.device.DeviceService
import com.example.kursovikkmp.mvvm.common.LceState
import com.example.kursovikkmp.uikit.component.fullscreenerror.EpsFullscreenErrorState
import com.example.kursovikkmp.uikit.component.fullscreenerror.FullScreenErrorType
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import kotlin.time.Duration.Companion.seconds

private const val NO_INTERNET_ERROR_TIMEOUT = 15

class LceStateManager(
    private val deviceService: DeviceService,
) {

    private val _lceState = MutableStateFlow(LceState())
    val lceState = _lceState.asStateFlow()

    private var noInternetReconnectJob: Job? = null
    private var noInternetReconnectAttemptTime = NO_INTERNET_ERROR_TIMEOUT
    private var checkInternetAction: (suspend (CoroutineScope) -> Unit)? = null

    init {
        updateState {
            copy(osType = deviceService.osType)
        }
    }

    fun initCheckInternetAction(action: (suspend (CoroutineScope) -> Unit)?) {
        checkInternetAction = action
    }

    fun initializeIsRootScreen(isRootScreen: Boolean) {
        updateState { copy(isRootScreen = isRootScreen) }
    }

    fun setUiInitialized(isUiInitialized: Boolean) {
        updateState { copy(isUiInitialized = isUiInitialized) }
    }

    fun showLoading() {
        updateState { copy(isLoading = true) }
    }

    fun hideLoading() {
        updateState { copy(isLoading = false) }
    }

    fun isLoading(): Boolean = lceState.value.isLoading

    fun showError(errorState: EpsFullscreenErrorState) {
        updateState { copy(errorState = errorState) }
    }

    fun hideError() {
        noInternetReconnectJob?.cancel()
        updateState { copy(errorState = null) }
    }

    fun isNoInternetErrorShowing(): Boolean {
        val errorState = lceState.value.errorState
        return errorState != null && errorState.errorType == FullScreenErrorType.NoInternetError
    }

    fun showFullScreenError(
        repeatAction: () -> Unit,
        backAction: () -> Unit,
        errorTitle: String = "",
        errorMessage: String = "",
    ) {
        showError(
            if (lceState.value.isRootScreen) {
                EpsFullscreenErrorState.createOneButtonError(
                    title = errorTitle.ifEmpty { "Something went wrong" },
                    subtitle = errorMessage.ifEmpty { "Please try again later" },
                    buttonTitle = "Try again",
                    buttonAction = { repeatAction() },
                )
            } else {
                EpsFullscreenErrorState.createTwoButtonsError(
                    title = errorTitle.ifEmpty { "Something went wrong" },
                    subtitle = errorMessage.ifEmpty { "Please try again later" },
                    firstButtonTitle = "Try again",
                    secondButtonTitle = "Back",
                    firstButtonAction = { repeatAction() },
                    secondButtonAction = { backAction() },
                )
            }
        )
    }

    fun showNoInternetError() {
        noInternetReconnectJob?.cancel()
        showError(
            EpsFullscreenErrorState.createNoInternet(
                title = "No internet connection",
                subtitle = "Reconnecting in $NO_INTERNET_ERROR_TIMEOUT sec",
                reconnectButtonTitle = "Reconnect",
                reconnectButtonEnabled = true,
                bottomText = "Contact support",
                bottomLink = "",
                middleButtonAction = { reconnectToInternet() },
                linkTextAction = {},
            )
        )
    }

    private fun reconnectToInternet() {
        noInternetReconnectJob?.cancel()
        checkInternetAction?.let { action ->
            noInternetReconnectJob = CoroutineScope(kotlinx.coroutines.Dispatchers.Main).launch {
                action(this)
            }
        }
    }

    private fun updateState(transform: LceState.() -> LceState) {
        _lceState.update { transform.invoke(lceState.value) }
    }
}
