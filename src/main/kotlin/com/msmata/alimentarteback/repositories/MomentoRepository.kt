package com.msmata.alimentarteback.repositories

import com.msmata.alimentarteback.entities.Momento
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface MomentoRepository: MongoRepository<Momento, String>{
}