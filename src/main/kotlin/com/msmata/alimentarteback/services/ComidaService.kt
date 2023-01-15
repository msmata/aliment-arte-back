package com.msmata.alimentarteback.services

import com.msmata.alimentarteback.entities.Comida
import org.springframework.stereotype.Service

@Service
class ComidaService {
    val comidas: List<Comida> = listOf(
        Comida(1, "Polenta"),
        Comida(2, "Ravioles"),
        Comida(3, "Fideos")
    )

    fun listarComidas(): List<Comida> {
        return comidas
    }
}