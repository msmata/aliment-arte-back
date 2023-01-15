package com.msmata.alimentarteback.controllers

import com.msmata.alimentarteback.services.FechaService
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class FechaController(val service: FechaService) {

    @GetMapping("/ultimasFechas")
    @CrossOrigin(origins = ["http://localhost:3000"])
    fun getUltimasFechas(): List<String> {
        return service.getUltimasFechas()
    }
}
