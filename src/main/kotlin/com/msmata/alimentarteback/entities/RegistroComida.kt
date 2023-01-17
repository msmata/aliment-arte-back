package com.msmata.alimentarteback.entities

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.Field

@Document("registros")
class RegistroComida(
    @Id
    val id: String,
    val comida: Comida,
    @Field(name="fecha")
    val fecha: String,
    val momento: Momento
) {
}