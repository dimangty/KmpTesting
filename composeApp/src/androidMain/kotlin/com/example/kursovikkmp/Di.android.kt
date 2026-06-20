package com.example.kursovikkmp

import com.example.kursovikkmp.common.device.DeviceService
import org.koin.core.module.Module
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

internal actual val platformModule: Module = module {
    singleOf(::DeviceService)
}
