package com.example.kursovikkmp.database

import kotlin.Long
import kotlin.String

public data class ProfileDb(
  public val id: Long,
  public val firstName: String,
  public val lastName: String,
  public val gender: String,
  public val birthDate: String,
  public val country: String,
  public val city: String,
  public val email: String,
  public val phone: String,
  public val photoPath: String,
)
