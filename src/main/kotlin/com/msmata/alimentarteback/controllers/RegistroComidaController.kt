package com.msmata.alimentarteback.controllers

import com.msmata.alimentarteback.entities.RegistroComida
import com.msmata.alimentarteback.services.RegistroComidaService
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class RegistroComidaController(val service: RegistroComidaService) {

    @GetMapping("/registros")
    @CrossOrigin(origins = ["http://localhost:3000"])
    fun listarRegistrosComida(): List<RegistroComida> {
        return service.listarRegistrosComida()
    }

    @PostMapping("/registros")
    @CrossOrigin(origins = ["http://localhost:3000"])
    fun agregarRegistroComida(@RequestBody registroComida: RegistroComida) {
        service.agregarRegistroComida(registroComida)
    }
}