package com.example.kursovikkmp.settings

import com.russhwolf.settings.ExperimentalSettingsApi
import com.russhwolf.settings.Settings

class AppSettings(settings: Settings) {
    private val settings: Settings = settings

    fun getString(key: String, defaultValue: String = ""): String {
        return settings.getString(key, defaultValue)
    }

    fun putString(key: String, value: String) {
        settings.putString(key, value)
    }
}
