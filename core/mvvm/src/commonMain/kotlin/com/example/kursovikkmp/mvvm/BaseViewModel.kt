package com.example.kursovikkmp.mvvm

import androidx.compose.runtime.Stable
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.kursovikkmp.common.device.DeviceService
import com.example.kursovikkmp.common.resource.StringsService
import com.example.kursovikkmp.mvvm.common.DefaultUiEvent
import com.example.kursovikkmp.mvvm.common.ScreenState
import com.example.kursovikkmp.mvvm.common.UiEvent
import com.example.kursovikkmp.mvvm.common.ViewModelEffect
import com.example.kursovikkmp.mvvm.common.connectivity.ConnectivityService
import com.example.kursovikkmp.mvvm.common.singleclick.SingleClickService
import com.example.kursovikkmp.mvvm.common.topbar.TopBarStateManager
import com.example.kursovikkmp.navigation.NavigationAction
import com.example.kursovikkmp.navigation.navigationservice.AppNavigator
import com.example.kursovikkmp.remoteresult.RemoteResult
import com.example.kursovikkmp.uikit.component.dialog.UiDialogEffect
import com.example.kursovikkmp.uikit.component.dialog.alert.AlertDialogState
import com.example.kursovikkmp.uikit.component.dialog.bottomsheet.EpsBottomSheetState
import com.example.kursovikkmp.uikit.component.dialog.toast.ToastState
import com.example.kursovikkmp.uikit.component.dialog.toast.ToastType
import com.example.kursovikkmp.uikit.component.fullscreenerror.EpsFullscreenErrorState
import com.example.kursovikkmp.uikit.component.topbar.EpsTopBarState
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import org.jetbrains.compose.resources.StringResource
import org.koin.mp.KoinPlatform.getKoin

@Stable
interface UiEventReducer<TUiEvent : UiEvent> {
    fun onUiEvent(event: TUiEvent)
    fun onDefaultUiEvent(event: DefaultUiEvent)
}

@Suppress("TooManyFunctions")
abstract class BaseViewModel<
    TUiEvent : UiEvent,
    TState : Any,
    >(initialState: TState) : ViewModel(), UiEventReducer<TUiEvent> {
    private val singleClickService by getKoin().inject<SingleClickService>()
    private val connectivityService by getKoin().inject<ConnectivityService>()
    private val lceStateManager by getKoin().inject<LceStateManager>()
    private val topBarStateManager by getKoin().inject<TopBarStateManager>()
    private val stringsService by getKoin().inject<StringsService>()
    protected val appNavigator by getKoin().inject<AppNavigator>()
    protected val deviceService by getKoin().inject<DeviceService>()

    private var isScreenDataInitialized = false
    protected open val isRootScreen = false

    private val _stateFlow =
        MutableStateFlow<ScreenState<TState>>(ScreenState(state = initialState))
    val stateFlow get() = _stateFlow.asStateFlow()

    protected val state: TState get() = stateFlow.value.state

    protected fun updateState(transform: TState.() -> TState) {
        _stateFlow.update { stateFlow.value.copy(state = transform.invoke(state)) }
    }

    protected fun updateStateSuspend(transform: suspend TState.() -> TState) {
        viewModelScope.launch {
            _stateFlow.update { stateFlow.value.copy(state = transform.invoke(state)) }
        }
    }

    init {
        lceStateManager.lceState.onEach { lceState ->
            _stateFlow.update { stateFlow.value.copy(lceState = lceState) }
        }.launchIn(viewModelScope)

        topBarStateManager.topBarState.onEach { topBarState ->
            _stateFlow.update {
                stateFlow.value.copy(topBarState = topBarState)
            }
        }.launchIn(viewModelScope)

        topBarStateManager.defaultUiEvent.onEach { topBarDefaultUiEvent ->
            onDefaultUiEvent(topBarDefaultUiEvent)
        }.launchIn(viewModelScope)

        lceStateManager.initCheckInternetAction {
            viewModelScope.launch {
                connectivityService.checkInternetAvailable(
                    onAvailable = {
                        hideError()
                        viewModelScope.launch { onInternetReconnected() }
                    },
                    onNotAvailable = {
                        showNoInternetError()
                    },
                )
            }
        }
    }

    private fun initializeScreenData() {
        viewModelScope.launch {
            lceStateManager.setUiInitialized(false)
            initTopBarInternal()
            initScreenStringsInternal()
            lceStateManager.setUiInitialized(true)
            loadScreenDataInternal()
        }
    }

    private suspend fun initTopBarInternal() {
        topBarStateManager.initTopBar {
            topBarStateManager.updateTopBar { initTopBarState().invoke(this) }
            topBarStateManager.topBarState.value
        }
    }

    protected suspend fun updateTopBar(action: suspend EpsTopBarState.() -> EpsTopBarState) {
        topBarStateManager.updateTopBar(action)
    }

    private suspend fun initScreenStringsInternal() {
        _stateFlow.update { stateFlow.value.copy(state = initScreenStrings().invoke(state)) }
    }

    protected fun forceLoadScreenData() {
        loadScreenDataInternal()
    }

    private fun loadScreenDataInternal() {
        viewModelScope.launch {
            showLoading()

            when (val loadDataResult = loadScreenData()) {
                is RemoteResult.Success -> {
                    hideLoading()
                    hideError()
                }

                RemoteResult.Error.NetworkError -> {
                    hideLoading()
                    showNoInternetError()
                }

                RemoteResult.Error.SerializationError -> {
                    hideLoading()
                    showFullScreenError(
                        repeatAction = ::loadScreenDataInternal,
                        errorTitle = "Serialization error",
                    )
                }

                RemoteResult.Error.ServerSignError -> {
                    hideLoading()
                    showFullScreenError(
                        repeatAction = ::loadScreenDataInternal,
                        errorTitle = "Server sign error",
                    )
                }

                RemoteResult.Error.TimeoutError,
                -> {
                    hideLoading()
                    showFullScreenError(
                        repeatAction = ::loadScreenDataInternal,
                        errorTitle = "Timeout error",
                    )
                }

                is RemoteResult.Error.ServerError -> {
                    hideLoading()

                    if (loadDataResult.isErrorHandled()) {
                        return@launch
                    }

                    showFullScreenError(
                        repeatAction = ::loadScreenDataInternal,
                        errorMessage = loadDataResult.message,
                    )
                }
            }
        }
    }

    private fun showFullScreenError(
        repeatAction: () -> Unit,
        errorTitle: String = "",
        errorMessage: String = "",
    ) {
        lceStateManager.showFullScreenError(
            repeatAction = repeatAction,
            backAction = { navigateBack() },
            errorTitle = errorTitle,
            errorMessage = errorMessage,
        )
    }

    private fun showNoInternetError() {
        lceStateManager.showNoInternetError()
    }

    protected open fun showLoading() {
        lceStateManager.showLoading()
    }

    protected open fun hideLoading() {
        lceStateManager.hideLoading()
    }

    protected fun isLoading(): Boolean {
        return lceStateManager.isLoading()
    }

    protected fun processRemoteError(error: RemoteResult.Error) {
        if (error.isErrorHandled()) {
            return
        }

        if (error is RemoteResult.Error.NetworkError) {
            showNoInternetError()
        } else {
            showRemoteErrorBottomSheet(error)
        }
    }

    private fun showRemoteErrorBottomSheet(error: RemoteResult.Error) {
        if (error.isErrorHandled()) {
            return
        }

        viewModelScope.launch {
            val msg = when (error) {
                is RemoteResult.Error.ServerError -> error.message
                else -> null
            }
            emitDefaultEffect(
                EpsBottomSheetState.ApiErrorBottomSheet(
                    title = "Error",
                    subtitle = msg ?: "Something went wrong, please try again later",
                    bottomButtonTitle = "OK",
                )
            )
        }
    }

    protected fun showBottomSheet(epsBottomSheetState: EpsBottomSheetState) {
        emitDefaultEffect(epsBottomSheetState)
    }

    protected fun showError(errorState: EpsFullscreenErrorState) {
        lceStateManager.showError(errorState)
    }

    protected fun hideError() {
        lceStateManager.hideError()
    }

    fun showAlert(alertDialog: AlertDialogState) {
        emitDefaultEffect(alertDialog)
    }

    fun showToast(message: String, isErrorToast: Boolean = false) {
        emitDefaultEffect(ToastState(if (isErrorToast) ToastType.Error else ToastType.Success, message))
    }

    protected open fun initTopBarState(): suspend EpsTopBarState.() -> EpsTopBarState {
        return { copy() }
    }

    protected open fun initScreenStrings(): suspend TState.() -> TState {
        return { state }
    }

    protected open suspend fun loadScreenData(): RemoteResult<*> {
        return RemoteResult.Success(Unit)
    }

    private val _effectFlow = MutableSharedFlow<ViewModelEffect>()
    val effectFlow = _effectFlow.asSharedFlow()

    private val _defaultEffectFlow = MutableSharedFlow<UiDialogEffect>()
    val defaultEffectFlow = _defaultEffectFlow.asSharedFlow()

    protected fun emitEffect(effect: ViewModelEffect) {
        viewModelScope.launch { _effectFlow.emit(effect) }
    }

    protected fun emitDefaultEffect(effect: UiDialogEffect) {
        viewModelScope.launch { _defaultEffectFlow.emit(effect) }
    }

    override fun onUiEvent(event: TUiEvent) {
        if (!singleClickService.isClickAllowed(event)) {
            return
        }

        processUiEvent(event)
    }

    override fun onDefaultUiEvent(event: DefaultUiEvent) {
        if (!singleClickService.isClickAllowed(event)) {
            return
        }

        when (event) {
            DefaultUiEvent.OnScreenCreated -> {
                if (!isScreenDataInitialized) {
                    isScreenDataInitialized = true
                    initializeScreenData()
                }
                onScreenCreated()
                if (isRootScreen) {
                    lceStateManager.initializeIsRootScreen(true)
                }
            }

            DefaultUiEvent.OnScreenResumed -> onScreenResumed()
            DefaultUiEvent.OnScreenStarted -> onScreenStarted()
            DefaultUiEvent.OnBackClicked -> processBackClicked()
            DefaultUiEvent.OnNotificationsClicked -> { /* override in subclass if needed */ }
        }
    }

    protected open fun processBackClicked() {
        navigateBack()
    }

    protected abstract fun processUiEvent(event: TUiEvent)

    protected open fun onScreenResumed() = Unit

    protected open fun onScreenStarted() = Unit

    protected open fun onScreenCreated() = Unit

    protected open suspend fun onInternetReconnected() {
        loadScreenDataInternal()
    }

    protected suspend fun getString(stringRes: StringResource): String {
        return stringsService.getString(stringRes)
    }

    protected suspend fun getString(stringRes: StringResource, args: List<String>): String {
        return stringsService.getString(stringRes, args)
    }

    protected fun navigate(navigationAction: NavigationAction) {
        appNavigator.push(navigationAction)
    }

    protected open fun navigateBack() {
        appNavigator.pop()
    }

    protected fun replaceRoot(action: NavigationAction) {
        appNavigator.replaceAll(action)
    }

    protected inline fun withNavigator(block: AppNavigator.() -> Unit) = block(appNavigator)

    protected fun <T> setResult(key: String, value: T) {
        appNavigator.setPreviousBackStackEntry(key, value)
    }

    protected fun <T> getResult(key: String): T? {
        return appNavigator.getCurrentBackStackEntry(key)
    }

    protected fun <T> clearResult(key: String) {
        return appNavigator.clearCurrentBackStackEntry<T>(key)
    }

    protected fun <T> consumeResult(key: String): T? {
        return getResult<T>(key).also {
            clearResult<T>(key)
        }
    }
}
