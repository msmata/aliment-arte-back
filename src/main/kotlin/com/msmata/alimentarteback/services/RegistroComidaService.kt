package com.msmata.alimentarteback.services

import com.msmata.alimentarteback.entities.Comida
import com.msmata.alimentarteback.entities.Momento
import com.msmata.alimentarteback.entities.RegistroComida
import org.springframework.stereotype.Service
import java.time.format.DateTimeFormatter

@Service
class RegistroComidaService {

    val registrosComida: MutableList<RegistroComida> = mutableListOf(
        RegistroComida(1, Comida("1", "Mantecol Bañado"), "06 10 2022", Momento("1", "Desayuno")),
        RegistroComida(2, Comida("2", "Pan Dulce"), "06 11 2022", Momento("1", "Desayuno")),
        RegistroComida(3, Comida("3", "Tostadas con pan integral"), "06 12 2022", Momento("1", "Desayuno")),
        RegistroComida(4, Comida("4", "Flan con dulce"), "06 13 2022", Momento("1", "Desayuno")),
        RegistroComida(5, Comida("5", "Te con Stevia(?)"), "06 14 2022", Momento("1", "Desayuno")),
        RegistroComida(6, Comida("6", "Cafe con Hileret(?)"), "06 15 2022", Momento("1", "Desayuno")),
        RegistroComida(7, Comida("6", "Cafe con Hileret(?)"), "06 16 2022", Momento("1", "Desayuno")),
        RegistroComida(8, Comida("7", "Fideos de semola"), "06 16 2022", Momento("2", "Almuerzo")),
        RegistroComida(9, Comida("8", "Milanesas con papas fritas"), "06 16 2022", Momento("2", "Almuerzo")),
        RegistroComida(10, Comida("9", "Ravioles"), "06 16 2022", Momento("2", "Almuerzo")),
        RegistroComida(11, Comida("5", "Te con Stevia(?)"), "06 16 2022", Momento("2", "Almuerzo")),
        RegistroComida(12, Comida("10", "Carne al horno con papas"), "06 16 2022", Momento("2", "Almuerzo")),
        RegistroComida(13, Comida("5", "Te con Stevia(?)"), "06 16 2022", Momento("2", "Almuerzo")),
        RegistroComida(14, Comida("6", "Cafe con Hileret(?)"), "06 16 2022", Momento("2", "Almuerzo")),
    )

    fun listarRegistrosComida(): List<RegistroComida> {
        return registrosComida
    }

    fun agregarRegistroComida(registroComida: RegistroComida) {
        registrosComida.add(registroComida)
    }
}