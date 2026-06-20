package com.example.kursovikkmp.auth.ui.signup

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.ExposedDropdownMenuDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import com.example.kursovikkmp.mvvm.BaseScreen
import com.example.kursovikkmp.uikit.component.topbar.EpsTopBarState
import kursovikkmp.core.uikit.generated.resources.Res
import kursovikkmp.core.uikit.generated.resources.berlin
import kursovikkmp.core.uikit.generated.resources.birth_date
import kursovikkmp.core.uikit.generated.resources.city
import kursovikkmp.core.uikit.generated.resources.country
import kursovikkmp.core.uikit.generated.resources.create_account
import kursovikkmp.core.uikit.generated.resources.email
import kursovikkmp.core.uikit.generated.resources.female
import kursovikkmp.core.uikit.generated.resources.first_name
import kursovikkmp.core.uikit.generated.resources.france
import kursovikkmp.core.uikit.generated.resources.gender
import kursovikkmp.core.uikit.generated.resources.germany
import kursovikkmp.core.uikit.generated.resources.last_name
import kursovikkmp.core.uikit.generated.resources.london
import kursovikkmp.core.uikit.generated.resources.male
import kursovikkmp.core.uikit.generated.resources.new_york
import kursovikkmp.core.uikit.generated.resources.other
import kursovikkmp.core.uikit.generated.resources.paris
import kursovikkmp.core.uikit.generated.resources.phone
import kursovikkmp.core.uikit.generated.resources.sign_up_title
import kursovikkmp.core.uikit.generated.resources.uk
import kursovikkmp.core.uikit.generated.resources.usa
import org.jetbrains.compose.resources.stringResource
import org.koin.compose.viewmodel.koinViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SignUpScreen() {
    val viewModel = koinViewModel<SignUpViewModel>()
    val screenState by viewModel.stateFlow.collectAsState()
    val state = screenState.state
    val lceState = screenState.lceState
    val title = stringResource(Res.string.sign_up_title)
    val firstNameTitle = stringResource(Res.string.first_name)
    val lastNameTitle = stringResource(Res.string.last_name)
    val birthDateTitle = stringResource(Res.string.birth_date)
    val emailTitle = stringResource(Res.string.email)
    val phoneTitle = stringResource(Res.string.phone)
    val createAccountTitle = stringResource(Res.string.create_account)

    BaseScreen(
        lceState = lceState,
        topBarState = EpsTopBarState(title = title, showBackButton = true),
        defaultEffectFlow = viewModel.defaultEffectFlow,
        onDefaultUiEvent = viewModel::onDefaultUiEvent,
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
                .padding(16.dp),
        ) {
            OutlinedTextField(
                value = state.firstName,
                onValueChange = { viewModel.onUiEvent(SignUpUiEvent.OnFirstNameChanged(it)) },
                label = { Text(firstNameTitle) },
                singleLine = true,
                modifier = Modifier.fillMaxWidth(),
            )
            Spacer(modifier = Modifier.height(12.dp))

            OutlinedTextField(
                value = state.lastName,
                onValueChange = { viewModel.onUiEvent(SignUpUiEvent.OnLastNameChanged(it)) },
                label = { Text(lastNameTitle) },
                singleLine = true,
                modifier = Modifier.fillMaxWidth(),
            )
            Spacer(modifier = Modifier.height(12.dp))

            GenderDropdown(
                value = state.gender,
                onValueChange = { viewModel.onUiEvent(SignUpUiEvent.OnGenderChanged(it)) },
            )
            Spacer(modifier = Modifier.height(12.dp))

            OutlinedTextField(
                value = state.birthDate,
                onValueChange = { viewModel.onUiEvent(SignUpUiEvent.OnBirthDateChanged(it)) },
                label = { Text(birthDateTitle) },
                singleLine = true,
                modifier = Modifier.fillMaxWidth(),
            )
            Spacer(modifier = Modifier.height(12.dp))

            CountryDropdown(
                value = state.country,
                onValueChange = { viewModel.onUiEvent(SignUpUiEvent.OnCountryChanged(it)) },
            )
            Spacer(modifier = Modifier.height(12.dp))

            CityDropdown(
                value = state.city,
                onValueChange = { viewModel.onUiEvent(SignUpUiEvent.OnCityChanged(it)) },
            )
            Spacer(modifier = Modifier.height(12.dp))

            OutlinedTextField(
                value = state.email,
                onValueChange = { viewModel.onUiEvent(SignUpUiEvent.OnEmailChanged(it)) },
                label = { Text(emailTitle) },
                singleLine = true,
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
                modifier = Modifier.fillMaxWidth(),
            )
            Spacer(modifier = Modifier.height(12.dp))

            OutlinedTextField(
                value = state.phone,
                onValueChange = { viewModel.onUiEvent(SignUpUiEvent.OnPhoneChanged(it)) },
                label = { Text(phoneTitle) },
                singleLine = true,
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone),
                modifier = Modifier.fillMaxWidth(),
            )

            state.errorMessage?.let { error ->
                Spacer(modifier = Modifier.height(12.dp))
                Text(text = error, color = Color.Red)
            }

            Spacer(modifier = Modifier.height(24.dp))

            Button(
                onClick = { viewModel.onUiEvent(SignUpUiEvent.OnSignUpClicked) },
                enabled = state.isValid && !lceState.isLoading,
                modifier = Modifier.fillMaxWidth(),
            ) {
                Text(createAccountTitle)
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun GenderDropdown(value: String, onValueChange: (String) -> Unit) {
    val options = listOf(
        stringResource(Res.string.male),
        stringResource(Res.string.female),
        stringResource(Res.string.other),
    )
    val title = stringResource(Res.string.gender)
    var expanded by remember { mutableStateOf(false) }

    ExposedDropdownMenuBox(
        expanded = expanded,
        onExpandedChange = { expanded = it },
    ) {
        OutlinedTextField(
            value = value,
            onValueChange = {},
            readOnly = true,
            label = { Text(title) },
            trailingIcon = { ExposedDropdownMenuDefaults.TrailingIcon(expanded = expanded) },
            modifier = Modifier.fillMaxWidth().menuAnchor(),
        )
        ExposedDropdownMenu(
            expanded = expanded,
            onDismissRequest = { expanded = false },
        ) {
            options.forEach { option ->
                DropdownMenuItem(
                    text = { Text(option) },
                    onClick = {
                        onValueChange(option)
                        expanded = false
                    },
                )
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun CountryDropdown(value: String, onValueChange: (String) -> Unit) {
    val options = listOf(
        stringResource(Res.string.usa),
        stringResource(Res.string.uk),
        stringResource(Res.string.germany),
        stringResource(Res.string.france),
    )
    val title = stringResource(Res.string.country)
    var expanded by remember { mutableStateOf(false) }

    ExposedDropdownMenuBox(
        expanded = expanded,
        onExpandedChange = { expanded = it },
    ) {
        OutlinedTextField(
            value = value,
            onValueChange = {},
            readOnly = true,
            label = { Text(title) },
            trailingIcon = { ExposedDropdownMenuDefaults.TrailingIcon(expanded = expanded) },
            modifier = Modifier.fillMaxWidth().menuAnchor(),
        )
        ExposedDropdownMenu(
            expanded = expanded,
            onDismissRequest = { expanded = false },
        ) {
            options.forEach { option ->
                DropdownMenuItem(
                    text = { Text(option) },
                    onClick = {
                        onValueChange(option)
                        expanded = false
                    },
                )
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun CityDropdown(value: String, onValueChange: (String) -> Unit) {
    val options = listOf(
        stringResource(Res.string.new_york),
        stringResource(Res.string.london),
        stringResource(Res.string.berlin),
        stringResource(Res.string.paris),
    )
    val title = stringResource(Res.string.city)
    var expanded by remember { mutableStateOf(false) }

    ExposedDropdownMenuBox(
        expanded = expanded,
        onExpandedChange = { expanded = it },
    ) {
        OutlinedTextField(
            value = value,
            onValueChange = {},
            readOnly = true,
            label = { Text(title) },
            trailingIcon = { ExposedDropdownMenuDefaults.TrailingIcon(expanded = expanded) },
            modifier = Modifier.fillMaxWidth().menuAnchor(),
        )
        ExposedDropdownMenu(
            expanded = expanded,
            onDismissRequest = { expanded = false },
        ) {
            options.forEach { option ->
                DropdownMenuItem(
                    text = { Text(option) },
                    onClick = {
                        onValueChange(option)
                        expanded = false
                    },
                )
            }
        }
    }
}
