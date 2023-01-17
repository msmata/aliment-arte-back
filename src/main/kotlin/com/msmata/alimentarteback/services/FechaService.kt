package com.msmata.alimentarteback.services

import org.springframework.stereotype.Service
import java.time.LocalDate
import java.time.format.DateTimeFormatter

@Service
class FechaService {

    val formatter: DateTimeFormatter = DateTimeFormatter.ofPattern("MM dd yyyy")

    fun getUltimasFechas(): List<String> {
        val listaDeFechas: MutableList<LocalDate> = mutableListOf<LocalDate>()
        val fechaHoy = LocalDate.now()

        for (i in 0..6) {
            listaDeFechas.add(LocalDate.of(fechaHoy.year, fechaHoy.month, fechaHoy.dayOfMonth - i))
        }

        return listaDeFechas.map { fecha -> formatter.format(fecha) }
    }
}