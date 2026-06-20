package com.example.kursovikkmp.network

import kotlinx.datetime.LocalDate
import kotlinx.datetime.LocalDateTime
import kotlinx.datetime.TimeZone
import kotlinx.datetime.toInstant
import kotlinx.datetime.toLocalDateTime
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

object DateTimeSerializer : KSerializer<LocalDateTime> {
    override val descriptor: SerialDescriptor = PrimitiveSerialDescriptor(
        "DateTimeSerializer", PrimitiveKind.LONG
    )

    override fun deserialize(decoder: Decoder): LocalDateTime {
        val millis = decoder.decodeLong()
        return kotlinx.datetime.Instant.fromEpochMilliseconds(millis)
            .toLocalDateTime(TimeZone.currentSystemDefault())
    }

    override fun serialize(encoder: Encoder, value: LocalDateTime) {
        val longValue = value.toInstant(TimeZone.currentSystemDefault()).toEpochMilliseconds()
        encoder.encodeLong(longValue)
    }
}

object DateSerializer : KSerializer<LocalDate> {
    override val descriptor: SerialDescriptor = PrimitiveSerialDescriptor(
        "DateSerializer", PrimitiveKind.LONG
    )

    override fun deserialize(decoder: Decoder): LocalDate {
        val millis = decoder.decodeLong()
        val dateTime = kotlinx.datetime.Instant.fromEpochMilliseconds(millis)
            .toLocalDateTime(TimeZone.currentSystemDefault())
        return LocalDate(dateTime.year, dateTime.month, dateTime.dayOfMonth)
    }

    override fun serialize(encoder: Encoder, value: LocalDate) {
        val dateTime = LocalDateTime(
            year = value.year,
            monthNumber = value.monthNumber,
            dayOfMonth = value.dayOfMonth,
            hour = 0,
            minute = 0,
            second = 0,
            nanosecond = 0
        )
        val longValue = dateTime.toInstant(TimeZone.currentSystemDefault()).toEpochMilliseconds()
        encoder.encodeLong(longValue)
    }
}
