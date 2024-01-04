package br.com.springtestkotlin.entities

import java.util.UUID

data class Products (
    val id: UUID,
    val nome: String,
    val price: Double
)