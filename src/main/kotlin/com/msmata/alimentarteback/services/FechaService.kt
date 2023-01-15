package com.msmata.alimentarteback.services

import org.springframework.stereotype.Service
import java.time.LocalDate
import java.time.format.DateTimeFormatter

@Service
class FechaService {

    val formatter: DateTimeFormatter = DateTimeFormatter.ofPattern("MM dd yyyy")

    fun getUltimasFechas(): List<String> {
        return listOf(
            LocalDate.of(2022, 6, 10),
            LocalDate.of(2022, 6, 11),
            LocalDate.of(2022, 6, 12),
            LocalDate.of(2022, 6, 13),
            LocalDate.of(2022, 6, 14),
            LocalDate.of(2022, 6, 15),
            LocalDate.of(2022, 6, 16)
        ).map { fecha -> formatter.format(fecha) }
    }
}