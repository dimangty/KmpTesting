package com.example.kursovikkmp.common

import com.example.kursovikkmp.common.resource.StringsService
import com.example.kursovikkmp.common.resource.StringsServiceImpl
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module

val moduleCommon = module {
    singleOf(::StringsServiceImpl) bind StringsService::class
}
