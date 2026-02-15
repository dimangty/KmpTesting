package com.example.kursovikkmp

import app.cash.sqldelight.SuspendingTransacter
import app.cash.sqldelight.db.QueryResult
import app.cash.sqldelight.db.SqlDriver
import app.cash.sqldelight.db.SqlSchema
import com.example.kursovikkmp.database.ArticleDbQueries
import com.example.kursovikkmp.database.ProfileDbQueries
import com.example.kursovikkmp.shared.newInstance
import com.example.kursovikkmp.shared.schema
import kotlin.Unit

public interface Database : SuspendingTransacter {
  public val articleDbQueries: ArticleDbQueries

  public val profileDbQueries: ProfileDbQueries

  public companion object {
    public val Schema: SqlSchema<QueryResult.AsyncValue<Unit>>
      get() = Database::class.schema

    public operator fun invoke(driver: SqlDriver): Database = Database::class.newInstance(driver)
  }
}
