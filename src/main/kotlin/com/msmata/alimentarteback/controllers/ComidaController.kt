package com.msmata.alimentarteback.controllers

import com.msmata.alimentarteback.entities.Comida
import com.msmata.alimentarteback.services.ComidaService
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ComidaController(val service: ComidaService) {

    @GetMapping("/comidas")
    @CrossOrigin(origins = ["http://localhost:3000"])
    fun listarComidas(): List<Comida> {
        return service.listarComidas()
    }
}