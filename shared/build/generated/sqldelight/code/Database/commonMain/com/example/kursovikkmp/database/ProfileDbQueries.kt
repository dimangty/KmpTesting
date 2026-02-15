package com.example.kursovikkmp.database

import app.cash.sqldelight.Query
import app.cash.sqldelight.SuspendingTransacterImpl
import app.cash.sqldelight.db.SqlDriver
import kotlin.Any
import kotlin.Long
import kotlin.String

public class ProfileDbQueries(
  driver: SqlDriver,
) : SuspendingTransacterImpl(driver) {
  public fun <T : Any> `get`(mapper: (
    id: Long,
    firstName: String,
    lastName: String,
    gender: String,
    birthDate: String,
    country: String,
    city: String,
    email: String,
    phone: String,
    photoPath: String,
  ) -> T): Query<T> = Query(2_049_321_467, arrayOf("ProfileDb"), driver, "ProfileDb.sq", "get",
      "SELECT * FROM ProfileDb WHERE id = 0 LIMIT 1") { cursor ->
    mapper(
      cursor.getLong(0)!!,
      cursor.getString(1)!!,
      cursor.getString(2)!!,
      cursor.getString(3)!!,
      cursor.getString(4)!!,
      cursor.getString(5)!!,
      cursor.getString(6)!!,
      cursor.getString(7)!!,
      cursor.getString(8)!!,
      cursor.getString(9)!!
    )
  }

  public fun `get`(): Query<ProfileDb> = get { id, firstName, lastName, gender, birthDate, country,
      city, email, phone, photoPath ->
    ProfileDb(
      id,
      firstName,
      lastName,
      gender,
      birthDate,
      country,
      city,
      email,
      phone,
      photoPath
    )
  }

  public suspend fun insert(
    firstName: String,
    lastName: String,
    gender: String,
    birthDate: String,
    country: String,
    city: String,
    email: String,
    phone: String,
    photoPath: String,
  ) {
    driver.execute(-1_558_648_332, """
        |INSERT OR REPLACE INTO ProfileDb(
        |    id,
        |    firstName,
        |    lastName,
        |    gender,
        |    birthDate,
        |    country,
        |    city,
        |    email,
        |    phone,
        |    photoPath
        |)
        |VALUES (
        |    0,
        |    ?,
        |    ?,
        |    ?,
        |    ?,
        |    ?,
        |    ?,
        |    ?,
        |    ?,
        |    ?
        |)
        """.trimMargin(), 9) {
          bindString(0, firstName)
          bindString(1, lastName)
          bindString(2, gender)
          bindString(3, birthDate)
          bindString(4, country)
          bindString(5, city)
          bindString(6, email)
          bindString(7, phone)
          bindString(8, photoPath)
        }.await()
    notifyQueries(-1_558_648_332) { emit ->
      emit("ProfileDb")
    }
  }

  public suspend fun updatePhoto(photoPath: String) {
    driver.execute(-1_375_776_626, """
        |UPDATE ProfileDb
        |SET photoPath = ?
        |WHERE id = 0
        """.trimMargin(), 1) {
          bindString(0, photoPath)
        }.await()
    notifyQueries(-1_375_776_626) { emit ->
      emit("ProfileDb")
    }
  }

  public suspend fun clear() {
    driver.execute(-1_995_555_918, """DELETE FROM ProfileDb""", 0).await()
    notifyQueries(-1_995_555_918) { emit ->
      emit("ProfileDb")
    }
  }
}
