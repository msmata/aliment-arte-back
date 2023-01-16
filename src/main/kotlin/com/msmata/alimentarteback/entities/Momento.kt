package com.msmata.alimentarteback.entities

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.Field

@Document("momentos")
data class Momento(
    @Id
    val id: String,
    @Field
    val name: String
) {
}

