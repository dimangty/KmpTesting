package com.example.kursovikkmp.ui.screens.profile

import androidx.compose.ui.test.ExperimentalTestApi
import androidx.compose.ui.test.onNodeWithContentDescription
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import androidx.compose.ui.test.runComposeUiTest
import com.example.kursovikkmp.feature.profile.ProfileState
import kotlin.test.Test
import kotlin.test.Ignore
import kotlin.test.assertEquals

@Ignore
class ProfileScreenTest {

    @OptIn(ExperimentalTestApi::class)
    @Test
    fun avatarAndLogout_callbacksInvoked() = runComposeUiTest {
        var avatarClicks = 0
        var logoutClicks = 0

        setContent {
            ProfileScreenView(
                state = ProfileState(
                    fullName = "John Doe",
                    gender = "Male",
                    birthDate = "1990-01-01",
                    location = "NYC",
                    email = "john@example.com",
                    phone = "+123",
                    isMockData = true
                ),
                onAvatarClick = { avatarClicks++ },
                onLogoutClick = { logoutClicks++ }
            )
        }

        onNodeWithText("Profile").assertExists()
        onNodeWithText("John Doe").assertExists()
        onNodeWithText("Logout").performClick()
        onNodeWithContentDescription("Profile placeholder").performClick()

        assertEquals(1, avatarClicks)
        assertEquals(1, logoutClicks)
    }
}
