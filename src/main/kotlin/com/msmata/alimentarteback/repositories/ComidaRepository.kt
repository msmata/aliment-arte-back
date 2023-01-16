package com.msmata.alimentarteback.repositories

import com.msmata.alimentarteback.entities.Comida
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface ComidaRepository: MongoRepository<Comida, String> {

}