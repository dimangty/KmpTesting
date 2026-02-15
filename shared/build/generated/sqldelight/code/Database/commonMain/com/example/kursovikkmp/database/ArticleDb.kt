package com.example.kursovikkmp.database

import kotlin.String

public data class ArticleDb(
  public val author: String?,
  public val title: String?,
  public val description: String?,
  public val url: String?,
  public val urlToImage: String?,
  public val publishedAt: String?,
  public val content: String?,
)
