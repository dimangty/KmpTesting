package com.example.kursovikkmp.navigation

import com.example.kursovikkmp.navigation.navigationservice.AppNavigator
import com.example.kursovikkmp.navigation.navigationservice.AppNavigatorImpl
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module

val moduleNavigation = module {
    singleOf(::AppNavigatorImpl) bind AppNavigator::class
}
