package com.msmata.alimentarteback.services

import com.msmata.alimentarteback.entities.Momento
import com.msmata.alimentarteback.repositories.MomentoRepository
import org.springframework.stereotype.Service

@Service
class MomentoService(val repository: MomentoRepository) {
    fun listarMomentos(): List<Momento> {
        return repository.findAll()
    }
}