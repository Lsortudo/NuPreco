package com.example.nupreco.repositories

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.nupreco.models.Ingredient
import kotlinx.coroutines.flow.Flow

@Dao
interface NuPrecoDao {
    @Query("SELECT * FROM Ingredient ORDER BY id ASC")
    fun getAllIngredients(): Flow<List<Ingredient>>

    @Insert
    suspend fun insertIngredient(ingredient: Ingredient)

    /*@Query("SELECT COUNT(id) FROM ingredient")
    suspend fun getTotalItems(): Long*/
}