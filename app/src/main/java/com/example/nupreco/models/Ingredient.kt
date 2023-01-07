package com.example.nupreco.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Ingredient(
    @PrimaryKey(autoGenerate = true) var id: Int?,
    val name: String,
    val brand: String,
    val price: Double,
    val quantity: Double,
    val medida: String,
    // Primeira versão do app não contará com imagem pois quero por com services, tirando da biblioteca, e não com link
    //val image: String,
)//:java.io.Serializable
