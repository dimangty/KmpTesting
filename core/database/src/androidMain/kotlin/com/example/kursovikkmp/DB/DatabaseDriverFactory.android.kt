package com.example.kursovikkmp.DB

import android.content.Context
import app.cash.sqldelight.db.SqlDriver
import app.cash.sqldelight.driver.android.AndroidSqliteDriver
import com.example.kursovikkmp.database.KursovikDatabase

actual class DatabaseDriverFactory(private val context: Context) {
    actual fun create(): SqlDriver = AndroidSqliteDriver(KursovikDatabase.Schema, context, "KursoviiKMP.db")
}
