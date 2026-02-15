package com.example.kursovikkmp.shared

import app.cash.sqldelight.SuspendingTransacterImpl
import app.cash.sqldelight.db.AfterVersion
import app.cash.sqldelight.db.QueryResult
import app.cash.sqldelight.db.SqlDriver
import app.cash.sqldelight.db.SqlSchema
import com.example.kursovikkmp.Database
import com.example.kursovikkmp.database.ArticleDbQueries
import com.example.kursovikkmp.database.ProfileDbQueries
import kotlin.Long
import kotlin.Unit
import kotlin.reflect.KClass

internal val KClass<Database>.schema: SqlSchema<QueryResult.AsyncValue<Unit>>
  get() = DatabaseImpl.Schema

internal fun KClass<Database>.newInstance(driver: SqlDriver): Database = DatabaseImpl(driver)

private class DatabaseImpl(
  driver: SqlDriver,
) : SuspendingTransacterImpl(driver), Database {
  override val articleDbQueries: ArticleDbQueries = ArticleDbQueries(driver)

  override val profileDbQueries: ProfileDbQueries = ProfileDbQueries(driver)

  public object Schema : SqlSchema<QueryResult.AsyncValue<Unit>> {
    override val version: Long
      get() = 1

    override fun create(driver: SqlDriver): QueryResult.AsyncValue<Unit> = QueryResult.AsyncValue {
      driver.execute(null, """
          |CREATE TABLE ArticleDb (
          |author TEXT,
          |title TEXT,
          |description TEXT,
          |url TEXT,
          |urlToImage TEXT,
          |publishedAt TEXT,
          |content TEXT
          |)
          """.trimMargin(), 0).await()
      driver.execute(null, """
          |CREATE TABLE ProfileDb (
          |id INTEGER NOT NULL PRIMARY KEY,
          |firstName TEXT NOT NULL,
          |lastName TEXT NOT NULL,
          |gender TEXT NOT NULL,
          |birthDate TEXT NOT NULL,
          |country TEXT NOT NULL,
          |city TEXT NOT NULL,
          |email TEXT NOT NULL,
          |phone TEXT NOT NULL,
          |photoPath TEXT NOT NULL
          |)
          """.trimMargin(), 0).await()
    }

    override fun migrate(
      driver: SqlDriver,
      oldVersion: Long,
      newVersion: Long,
      vararg callbacks: AfterVersion,
    ): QueryResult.AsyncValue<Unit> = QueryResult.AsyncValue {
    }
  }
}
