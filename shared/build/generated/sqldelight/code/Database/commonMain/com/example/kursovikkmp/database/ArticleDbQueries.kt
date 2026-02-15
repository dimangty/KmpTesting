package com.example.kursovikkmp.database

import app.cash.sqldelight.Query
import app.cash.sqldelight.SuspendingTransacterImpl
import app.cash.sqldelight.db.QueryResult
import app.cash.sqldelight.db.SqlCursor
import app.cash.sqldelight.db.SqlDriver
import kotlin.Any
import kotlin.String

public class ArticleDbQueries(
  driver: SqlDriver,
) : SuspendingTransacterImpl(driver) {
  public fun <T : Any> `get`(title: String?, mapper: (
    author: String?,
    title: String?,
    description: String?,
    url: String?,
    urlToImage: String?,
    publishedAt: String?,
    content: String?,
  ) -> T): Query<T> = GetQuery(title) { cursor ->
    mapper(
      cursor.getString(0),
      cursor.getString(1),
      cursor.getString(2),
      cursor.getString(3),
      cursor.getString(4),
      cursor.getString(5),
      cursor.getString(6)
    )
  }

  public fun `get`(title: String?): Query<ArticleDb> = get(title) { author, title_, description,
      url, urlToImage, publishedAt, content ->
    ArticleDb(
      author,
      title_,
      description,
      url,
      urlToImage,
      publishedAt,
      content
    )
  }

  public fun <T : Any> getAll(mapper: (
    author: String?,
    title: String?,
    description: String?,
    url: String?,
    urlToImage: String?,
    publishedAt: String?,
    content: String?,
  ) -> T): Query<T> = Query(-1_357_444_749, arrayOf("ArticleDb"), driver, "ArticleDb.sq", "getAll",
      "SELECT * FROM ArticleDb") { cursor ->
    mapper(
      cursor.getString(0),
      cursor.getString(1),
      cursor.getString(2),
      cursor.getString(3),
      cursor.getString(4),
      cursor.getString(5),
      cursor.getString(6)
    )
  }

  public fun getAll(): Query<ArticleDb> = getAll { author, title, description, url, urlToImage,
      publishedAt, content ->
    ArticleDb(
      author,
      title,
      description,
      url,
      urlToImage,
      publishedAt,
      content
    )
  }

  public suspend fun insert(ArticleDb: ArticleDb) {
    driver.execute(-1_291_869_759,
        """INSERT OR REPLACE INTO ArticleDb VALUES (?, ?, ?, ?, ?, ?, ?)""", 7) {
          bindString(0, ArticleDb.author)
          bindString(1, ArticleDb.title)
          bindString(2, ArticleDb.description)
          bindString(3, ArticleDb.url)
          bindString(4, ArticleDb.urlToImage)
          bindString(5, ArticleDb.publishedAt)
          bindString(6, ArticleDb.content)
        }.await()
    notifyQueries(-1_291_869_759) { emit ->
      emit("ArticleDb")
    }
  }

  public suspend fun delete(title: String?) {
    driver.execute(null,
        """DELETE FROM ArticleDb WHERE title ${ if (title == null) "IS" else "=" } ?""", 1) {
          bindString(0, title)
        }.await()
    notifyQueries(-1_443_535_693) { emit ->
      emit("ArticleDb")
    }
  }

  public suspend fun clear() {
    driver.execute(783_996_485, """DELETE FROM ArticleDb""", 0).await()
    notifyQueries(783_996_485) { emit ->
      emit("ArticleDb")
    }
  }

  private inner class GetQuery<out T : Any>(
    public val title: String?,
    mapper: (SqlCursor) -> T,
  ) : Query<T>(mapper) {
    override fun addListener(listener: Query.Listener) {
      driver.addListener("ArticleDb", listener = listener)
    }

    override fun removeListener(listener: Query.Listener) {
      driver.removeListener("ArticleDb", listener = listener)
    }

    override fun <R> execute(mapper: (SqlCursor) -> QueryResult<R>): QueryResult<R> =
        driver.executeQuery(null,
        """SELECT * FROM ArticleDb WHERE title ${ if (title == null) "IS" else "=" } ? LIMIT 1""",
        mapper, 1) {
      bindString(0, title)
    }

    override fun toString(): String = "ArticleDb.sq:get"
  }
}
