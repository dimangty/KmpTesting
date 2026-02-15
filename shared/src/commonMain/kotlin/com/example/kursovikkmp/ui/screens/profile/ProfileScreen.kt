package com.example.kursovikkmp.ui.screens.profile

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import cafe.adriel.voyager.core.screen.Screen
import org.koin.compose.koinInject
import com.example.kursovikkmp.feature.profile.ProfileEvents
import com.example.kursovikkmp.feature.profile.ProfileState
import com.example.kursovikkmp.feature.profile.ProfileViewModel

object ProfileScreen : Screen {
    @Composable
    override fun Content() {
        val viewModel: ProfileViewModel = koinInject()
        val state by viewModel.flowState.collectAsState()

        ProfileScreenView(
            state = state,
            onAvatarClick = { viewModel.pushEvent(ProfileEvents.AvatarTapped) },
            onLogoutClick = { viewModel.pushEvent(ProfileEvents.LogoutTapped) }
        )
    }
}

@Composable
fun ProfileScreenView(
    state: ProfileState,
    onAvatarClick: () -> Unit,
    onLogoutClick: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Text(
            text = "Profile",
            style = MaterialTheme.typography.headlineSmall
        )

        // Profile image placeholder
        Image(
            imageVector = Icons.Default.AccountCircle,
            contentDescription = "Profile placeholder",
            modifier = Modifier
                .size(120.dp)
                .clickable { onAvatarClick() }
        )

        if (state.isMockData) {
            Text(
                text = "Showing mock profile (database is empty)",
                style = MaterialTheme.typography.bodySmall,
                color = MaterialTheme.colorScheme.primary
            )
        }

        Card(modifier = Modifier.fillMaxWidth()) {
            Column(
                modifier = Modifier.padding(16.dp),
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                ProfileRow("Name", state.fullName)
                ProfileRow("Gender", state.gender)
                ProfileRow("Birth date", state.birthDate)
                ProfileRow("Location", state.location)
                ProfileRow("Email", state.email)
                ProfileRow("Phone", state.phone)
            }
        }

        Button(
            onClick = onLogoutClick,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Logout")
        }
    }
}

@Composable
private fun ProfileRow(label: String, value: String) {
    Column(verticalArrangement = Arrangement.spacedBy(2.dp)) {
        Text(
            text = label,
            style = MaterialTheme.typography.labelMedium,
            color = MaterialTheme.colorScheme.primary
        )
        Text(
            text = value,
            style = MaterialTheme.typography.bodyLarge
        )
    }
}
