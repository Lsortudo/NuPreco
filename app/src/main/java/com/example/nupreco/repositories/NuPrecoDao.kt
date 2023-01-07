package com.example.nupreco.repositories

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.nupreco.models.Ingredient

@Dao
interface NuPrecoDao {

    @Insert
    suspend fun insertIngredient(ingredient: Ingredient)

    @Query("SELECT COUNT(id) FROM ingredient")
    suspend fun getTotalItems(): Long
}