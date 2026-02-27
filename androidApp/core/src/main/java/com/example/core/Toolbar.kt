package com.example.core

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBars
import androidx.compose.foundation.layout.windowInsetsTopHeight
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.kursovikkmp.base.DefaultUiEvent
import com.example.kursovikkmp.common.view.TextState
import com.example.kursovikkmp.common.view.TitleBarState
import com.example.kursovikkmp.resources.AppColors
import com.example.kursovikkmp.resources.AppResources
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.resources.stringResource

private val ToolbarHeight = 40.dp

@Composable
fun Toolbar(
    modifier: Modifier = Modifier,
    toolbarState: TitleBarState = TitleBarState(),
) {
    ToolbarWithContent(
        onNavigateBackClicked = { toolbarState.onDefaultUiEvent(DefaultUiEvent.OnBackClicked) },
        navigateBackIcon = toolbarState.backIcon,
        modifier = modifier,
        titleState = toolbarState,
        isNavigateBackVisible = toolbarState.isNavigateBackVisible,
        contentColor = toolbarState.contentColor,
    )
}

@Composable
fun ToolbarWithContent(
    onNavigateBackClicked: () -> Unit,
    titleState: TitleBarState,
    contentColor: Color = AppColors.white,
    navigateBackIcon: org.jetbrains.compose.resources.DrawableResource = AppResources.drawable.ic_titlebar_back,
    modifier: Modifier = Modifier,
    isNavigateBackVisible: Boolean = true,
    endContent: @Composable RowScope.() -> Unit = {},
) {
    val titleText = titleState.titleResource?.let { stringResource(it) } ?: titleState.title.value

    Column {
        Spacer(
            Modifier
                .windowInsetsTopHeight(WindowInsets.statusBars)
                .background(Color.Transparent)
        )
        Box(
            modifier = modifier
                .fillMaxWidth()
                .height(ToolbarHeight),
            contentAlignment = Alignment.CenterStart,
        ) {
            if (titleText.isNotBlank()) {
                MyText(
                    state = titleState.title.copy(value = titleText),
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                    modifier = Modifier
                        .align(Alignment.Center)
                        .padding(horizontal = 50.dp)
                )
            }

            if (isNavigateBackVisible) {
                val focusManager = LocalFocusManager.current
                IconButton(
                    onClick = {
                        focusManager.clearFocus()
                        onNavigateBackClicked()
                    },
                    modifier = Modifier.padding(start = 2.dp),
                    content = {
                        Icon(
                            painter = painterResource(navigateBackIcon),
                            contentDescription = null,
                            tint = contentColor,
                        )
                    }
                )
            }

            Row(
                modifier = Modifier
                    .align(Alignment.CenterEnd)
                    .padding(horizontal = 2.dp)
            ) {
                endContent()
            }
        }
    }
}

@Suppress("MagicNumber")
@Preview(showBackground = true, backgroundColor = 0xFFFFFFFF)
@Composable
private fun PreviewToolbar() {
    MaterialTheme  {
        Column {
            Toolbar(
                toolbarState = TitleBarState.getMock(),
            )
        }
    }
}