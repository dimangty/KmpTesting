package com.example.kursovikkmp.mvvm

import com.example.kursovikkmp.mvvm.common.connectivity.ConnectivityService
import com.example.kursovikkmp.mvvm.common.connectivity.ConnectivityServiceImpl
import com.example.kursovikkmp.mvvm.common.singleclick.SingleClickService
import com.example.kursovikkmp.mvvm.common.singleclick.SingleClickServiceImpl
import com.example.kursovikkmp.mvvm.common.topbar.TopBarStateManager
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module

val moduleMvvm = module {
    singleOf(::LceStateManager)
    singleOf(::TopBarStateManager)
    singleOf(::SingleClickServiceImpl) bind SingleClickService::class
    singleOf(::ConnectivityServiceImpl) bind ConnectivityService::class
}
