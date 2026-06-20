package com.example.kursovikkmp

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class KursovikApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@KursovikApplication)
            modules(appModules)
        }
    }
}
