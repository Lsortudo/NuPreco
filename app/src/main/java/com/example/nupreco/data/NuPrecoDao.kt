package com.example.nupreco.data

import androidx.room.*
import com.example.nupreco.models.Ingredient
import kotlinx.coroutines.flow.Flow

@Dao
interface NuPrecoDao {

    @Query("SELECT * FROM Ingredient")
    fun getAllIngredients(): Flow<List<Ingredient>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertIngredient(ingredient: Ingredient)

}

// UTILIZAR NO LUGAR DE INSERT -> @Upsert

//@Query("SELECT * FROM Ingredient ORDER BY id ASC")
//@Query("SELECT * FROM Ingredient ORDER BY name ASC")