package com.example.nupreco.repositories

import androidx.annotation.WorkerThread
import com.example.nupreco.models.Ingredient
import kotlinx.coroutines.flow.Flow

class NuPrecoRepository(private val nuPrecoDao: NuPrecoDao) {

    val allIngredients: Flow<List<Ingredient>> = nuPrecoDao.getAllIngredients()

    @Suppress("RedudantSuspendModifier")
    @WorkerThread
    suspend fun insertIngredient(ingredient: Ingredient) {
        nuPrecoDao.insertIngredient(ingredient)
    }
}