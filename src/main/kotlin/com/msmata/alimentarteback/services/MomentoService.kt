package com.msmata.alimentarteback.services

import com.msmata.alimentarteback.entities.Momento
import org.springframework.stereotype.Service

@Service
class MomentoService() {

    val momentos: List<Momento> = listOf<Momento>(
                    Momento(1, "Desayuno"),
                    Momento(2, "Almuerzo"),
                    Momento(3, "Merienda"),
                    Momento(4, "Cena"),
                    Momento(5, "Colaciòn"))

    fun listarMomentos(): List<Momento> {
        return momentos
    }
}