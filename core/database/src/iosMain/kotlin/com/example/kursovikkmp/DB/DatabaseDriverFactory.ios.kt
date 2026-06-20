package com.example.kursovikkmp.DB

import app.cash.sqldelight.db.SqlDriver
import app.cash.sqldelight.driver.native.NativeSqliteDriver
import com.example.kursovikkmp.database.KursovikDatabase

actual class DatabaseDriverFactory {
    actual fun create(): SqlDriver = NativeSqliteDriver(KursovikDatabase.Schema, "database.db")
}
