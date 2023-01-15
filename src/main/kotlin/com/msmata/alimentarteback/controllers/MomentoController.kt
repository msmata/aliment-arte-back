package com.msmata.alimentarteback.controllers

import com.msmata.alimentarteback.entities.Momento
import com.msmata.alimentarteback.services.MomentoService
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class MomentoController(val service: MomentoService) {
    @GetMapping("/")
    fun index(@RequestParam("name") name: String) = "Hello, $name!"

    @GetMapping("/momentos")
    @CrossOrigin(origins = ["http://localhost:3000"])
    fun getMomentos(): List<Momento> {
        return service.listarMomentos()
    }
}