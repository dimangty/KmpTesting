@file:Suppress("UnusedParameter")

package com.example.kursovikkmp.mvvm

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.fadeIn
import androidx.compose.animation.scaleIn
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.backhandler.BackHandler
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.lifecycle.compose.LocalLifecycleOwner
import com.example.kursovikkmp.common.device.OsType
import com.example.kursovikkmp.mvvm.common.DefaultUiEvent
import com.example.kursovikkmp.mvvm.common.LceState
import com.example.kursovikkmp.mvvm.common.OnScreenResumed
import com.example.kursovikkmp.mvvm.common.OnScreenStarted
import com.example.kursovikkmp.uikit.base.extension.color
import com.example.kursovikkmp.uikit.base.figmamapping.EpsColor
import com.example.kursovikkmp.uikit.component.barspacer.EpsBottomBarSpacer
import com.example.kursovikkmp.uikit.component.barspacer.EpsStatusBarSpacer
import com.example.kursovikkmp.uikit.component.dialog.UiDialogEffect
import com.example.kursovikkmp.uikit.component.dialog.alert.AlertDialogState
import com.example.kursovikkmp.uikit.component.dialog.alert.EpsAlertDialog
import com.example.kursovikkmp.uikit.component.dialog.bottomsheet.EpsBottomSheet
import com.example.kursovikkmp.uikit.component.dialog.bottomsheet.EpsBottomSheetState
import com.example.kursovikkmp.uikit.component.dialog.toast.EpsToast
import com.example.kursovikkmp.uikit.component.dialog.toast.ToastState
import com.example.kursovikkmp.uikit.component.fullscreenerror.EpsFullscreenError
import com.example.kursovikkmp.uikit.component.loader.EpsLoader
import com.example.kursovikkmp.uikit.component.topbar.EpsTopBar
import com.example.kursovikkmp.uikit.component.topbar.EpsTopBarState
import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach

@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun BaseScreen(
    lceState: LceState,
    topBarState: EpsTopBarState,
    defaultEffectFlow: SharedFlow<UiDialogEffect>,
    onDefaultUiEvent: (DefaultUiEvent) -> Unit,
    addStatusBarSpacer: Boolean = true,
    addBottomBarSpacer: Boolean = true,
    addTopBar: Boolean = true,
    isUseBaseBackHandler: Boolean = true,
    background: EpsColor = EpsColor.ElementsPrimary,
    shape: Shape = RectangleShape,
    content: @Composable () -> Unit,
) {
    var toast by remember { mutableStateOf<ToastState?>(null) }
    var alertDialog by remember { mutableStateOf<AlertDialogState?>(null) }
    var bottomSheetDialog by remember { mutableStateOf<EpsBottomSheetState?>(null) }

    LaunchedEffect(Unit) {
        onDefaultUiEvent(DefaultUiEvent.OnScreenCreated)
    }

    if (isUseBaseBackHandler && !lceState.isRootScreen) {
        BackHandler { onDefaultUiEvent(DefaultUiEvent.OnBackClicked) }
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(background.color(), shape)
    ) {
        if (lceState.isUiInitialized) {
            if (addStatusBarSpacer) {
                EpsStatusBarSpacer()
            }
            if (addTopBar) {
                EpsTopBar(topBarState)
            }
            Box(modifier = Modifier.weight(1f)) {
                content()
            }
            if (addBottomBarSpacer) {
                EpsBottomBarSpacer()
            }
        }
    }

    OnScreenResumed(lifecycleOwner = LocalLifecycleOwner.current) {
        onDefaultUiEvent(DefaultUiEvent.OnScreenResumed)
    }

    OnScreenStarted(lifecycleOwner = LocalLifecycleOwner.current) {
        onDefaultUiEvent(DefaultUiEvent.OnScreenStarted)
    }

    LaunchedEffect(Unit) {
        defaultEffectFlow.onEach { defaultEffect ->
            when (defaultEffect) {
                is ToastState -> toast = defaultEffect
                is AlertDialogState -> alertDialog = defaultEffect
                is EpsBottomSheetState -> bottomSheetDialog = defaultEffect
            }
        }.launchIn(this)
    }

    HandleDialogs(
        osType = lceState.osType,
        bottomSheetDialog = bottomSheetDialog,
        alertDialog = alertDialog,
        toastState = toast,
        onDismissBottomSheet = { bottomSheetDialog = null },
        onDismissAlertDialog = { alertDialog = null },
        onDismissToast = { toast = null }
    )

    LceStateHandlerView(
        lceState = lceState,
        isHandleErrors = true,
    )
}

@Composable
fun BaseActivityScreen(
    lceState: LceState,
    defaultEffectFlow: SharedFlow<UiDialogEffect>,
    onDefaultUiEvent: (DefaultUiEvent) -> Unit,
    content: @Composable () -> Unit,
) {
    var toast by remember { mutableStateOf<ToastState?>(null) }
    var alertDialog by remember { mutableStateOf<AlertDialogState?>(null) }
    var bottomSheetDialog by remember { mutableStateOf<EpsBottomSheetState?>(null) }

    LaunchedEffect(Unit) {
        onDefaultUiEvent(DefaultUiEvent.OnScreenCreated)
    }

    if (lceState.isUiInitialized) {
        content()
    }

    LaunchedEffect(Unit) {
        defaultEffectFlow.onEach { defaultEffect ->
            when (defaultEffect) {
                is ToastState -> toast = defaultEffect
                is AlertDialogState -> alertDialog = defaultEffect
                is EpsBottomSheetState -> bottomSheetDialog = defaultEffect
            }
        }.launchIn(this)
    }

    HandleDialogs(
        osType = lceState.osType,
        bottomSheetDialog = bottomSheetDialog,
        alertDialog = alertDialog,
        toastState = toast,
        onDismissBottomSheet = { bottomSheetDialog = null },
        onDismissAlertDialog = { alertDialog = null },
        onDismissToast = { toast = null }
    )

    LceStateHandlerView(
        lceState = lceState,
        isHandleErrors = false,
    )
}

@Composable
private fun HandleDialogs(
    osType: OsType,
    bottomSheetDialog: EpsBottomSheetState?,
    alertDialog: AlertDialogState?,
    toastState: ToastState?,
    onDismissBottomSheet: () -> Unit = {},
    onDismissAlertDialog: () -> Unit = {},
    onDismissToast: () -> Unit = {},
) {
    when (bottomSheetDialog) {
        null -> Unit
        else -> EpsBottomSheet(
            state = bottomSheetDialog,
            isIOS = osType == OsType.IOS,
            onDismissed = onDismissBottomSheet,
        )
    }

    when (alertDialog) {
        null -> Unit
        else -> EpsAlertDialog(
            state = alertDialog,
            isIOS = osType == OsType.IOS,
            onDismissed = onDismissAlertDialog,
        )
    }

    AnimatedVisibility(
        visible = toastState != null,
        modifier = Modifier
            .fillMaxWidth()
            .statusBarsPadding(),
        enter = fadeIn() + scaleIn(),
    ) {
        toastState?.run {
            EpsToast(state = toastState, onCloseClicked = onDismissToast)
        }
    }
}

@Composable
private fun LceStateHandlerView(
    lceState: LceState,
    isHandleErrors: Boolean,
) {
    if (isHandleErrors) {
        when (val errorState = lceState.errorState) {
            null -> Unit
            else -> EpsFullscreenError(errorState)
        }
    }

    if (lceState.isLoading) {
        EpsLoader()
    }
}
