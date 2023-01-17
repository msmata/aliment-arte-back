package com.msmata.alimentarteback.entities

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.Field

@Document("comidas")
data class Comida(
    @Id
    val id: String,
    @Field("name")
    val name: String) {
}