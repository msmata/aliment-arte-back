package com.msmata.alimentarteback.repositories

import com.msmata.alimentarteback.entities.RegistroComida
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface RegistroComidaRepository: MongoRepository<RegistroComida, String> {
}