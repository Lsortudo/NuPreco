package com.example.nupreco.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Recipe(
    @PrimaryKey(autoGenerate = true) val id: Int?,
    val name: String,
    val quantity: Double,
    val percentage: Int,


)//:java.io.Serializable
