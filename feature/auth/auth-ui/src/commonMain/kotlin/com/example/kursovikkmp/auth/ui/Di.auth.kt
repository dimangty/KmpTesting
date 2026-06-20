package com.example.kursovikkmp.auth.ui

import com.example.kursovikkmp.auth.data.moduleAuthData
import com.example.kursovikkmp.auth.domain.moduleAuthDomain
import com.example.kursovikkmp.auth.ui.login.LoginScreen
import com.example.kursovikkmp.auth.ui.login.LoginViewModel
import com.example.kursovikkmp.auth.ui.pin.PinScreen
import com.example.kursovikkmp.auth.ui.pin.PinViewModel
import com.example.kursovikkmp.auth.ui.signup.SignUpScreen
import com.example.kursovikkmp.auth.ui.signup.SignUpViewModel
import com.example.kursovikkmp.navigation.NavigationAction
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.module
import org.koin.dsl.navigation3.navigation

val moduleAuth = module {
    viewModelOf(::LoginViewModel)
    viewModelOf(::PinViewModel)
    viewModelOf(::SignUpViewModel)

    navigation<NavigationAction.NavigateToLogin> { LoginScreen() }
    navigation<NavigationAction.NavigateToPin> { PinScreen() }
    navigation<NavigationAction.NavigateToSignUp> { SignUpScreen() }

    includes(moduleAuthData, moduleAuthDomain)
}
