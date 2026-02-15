package com.example.kursovikkmp.ui.components.input

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import com.example.kursovikkmp.common.view.TextFieldState

@Composable
fun MyTextField(
    state: TextFieldState,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier
) {
    Column(modifier = modifier) {
        OutlinedTextField(
            value = state.value,
            onValueChange = onValueChange,
            modifier = Modifier.fillMaxWidth(),
            label = state.label?.let { { Text(it) } },
            placeholder = { Text(state.placeholder) },
            isError = state.error != null,
            enabled = state.isEnabled,
            keyboardOptions = KeyboardOptions(
                keyboardType = when (state.keyboardType) {
                    TextFieldState.KeyboardType.Text -> KeyboardType.Text
                    TextFieldState.KeyboardType.Number -> KeyboardType.Number
                    TextFieldState.KeyboardType.Email -> KeyboardType.Email
                    TextFieldState.KeyboardType.Phone -> KeyboardType.Phone
                }
            ),
            singleLine = true
        )

        state.error?.let { error ->
            Text(
                text = error,
                color = MaterialTheme.colorScheme.error,
                style = MaterialTheme.typography.bodySmall,
                modifier = Modifier.padding(start = 16.dp, top = 4.dp)
            )
        }
    }
}
