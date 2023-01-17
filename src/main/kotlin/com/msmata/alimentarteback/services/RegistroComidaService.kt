package com.msmata.alimentarteback.services

import com.msmata.alimentarteback.entities.RegistroComida
import com.msmata.alimentarteback.repositories.RegistroComidaRepository
import org.springframework.stereotype.Service

@Service
class RegistroComidaService(val repository: RegistroComidaRepository) {
    fun listarRegistrosComida(): List<RegistroComida> {
        return repository.findAll()
    }

    fun agregarRegistroComida(registroComida: RegistroComida) {
        repository.insert(registroComida)
    }
}