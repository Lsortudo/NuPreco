package com.example.nupreco.repositories.repository

import androidx.annotation.WorkerThread
import com.example.nupreco.models.Ingredient
import com.example.nupreco.repositories.NuPrecoDao
import kotlinx.coroutines.flow.Flow

class IngredientRepository(private val ingredientDao: NuPrecoDao) {

    val allIngredients: Flow<List<Ingredient>> = ingredientDao.getAllIngredients()

    @Suppress("RedundantSuspendModifier")
    @WorkerThread
    suspend fun insert(ingredient: Ingredient) {
        ingredientDao.insertIngredient(ingredient)
    }

}