package com.example.kursovikkmp

import com.example.kursovikkmp.common.moduleCommon
import com.example.kursovikkmp.di.databaseModule
import com.example.kursovikkmp.di.moduleNetwork
import com.example.kursovikkmp.domain.moduleDomain
import com.example.kursovikkmp.main.moduleMain
import com.example.kursovikkmp.memorycache.moduleMemoryCache
import com.example.kursovikkmp.mvvm.moduleMvvm
import com.example.kursovikkmp.navigation.moduleNavigation
import com.example.kursovikkmp.settings.moduleSettings
import com.example.kursovikkmp.uikit.moduleUiKit
import com.example.kursovikkmp.validation.moduleValidation
import org.koin.core.module.Module

val appModules get() = listOf(
    moduleCommon,
    moduleUiKit,
    moduleDomain,
    databaseModule,
    moduleMemoryCache,
    moduleNetwork,
    moduleSettings,
    moduleMvvm,
    moduleValidation,
    moduleNavigation,
    moduleMain,
    platformModule,
)

internal expect val platformModule: Module
