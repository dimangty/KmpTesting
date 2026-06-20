package com.example.kursovikkmp.uikit.component.dialog.bottomsheet

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun EpsBottomSheet(
    state: EpsBottomSheetState,
    isIOS: Boolean = false,
    onDismissed: () -> Unit,
) {
    when (state) {
        is EpsBottomSheetState.ApiErrorBottomSheet -> {
            ModalBottomSheet(onDismissRequest = onDismissed) {
                Column(modifier = Modifier.padding(24.dp)) {
                    Text(state.title, style = MaterialTheme.typography.titleMedium)
                    Spacer(Modifier.height(8.dp))
                    Text(state.subtitle, style = MaterialTheme.typography.bodyMedium)
                    Spacer(Modifier.height(16.dp))
                    Button(onClick = onDismissed) {
                        Text(state.bottomButtonTitle)
                    }
                }
            }
        }
        is EpsBottomSheetState.GenericBottomSheet -> {
            ModalBottomSheet(onDismissRequest = onDismissed) {
                Column(modifier = Modifier.padding(24.dp)) {
                    Text(state.title, style = MaterialTheme.typography.titleMedium)
                    state.items.forEach { item ->
                        Text(item, modifier = Modifier.padding(vertical = 4.dp))
                    }
                }
            }
        }
    }
}
