package com.msmata.alimentarteback.services

import com.msmata.alimentarteback.entities.Comida
import com.msmata.alimentarteback.repositories.ComidaRepository
import org.springframework.stereotype.Service

@Service
class ComidaService(val repository: ComidaRepository) {
    fun listarComidas(): List<Comida> {
        return repository.findAll()
    }
}