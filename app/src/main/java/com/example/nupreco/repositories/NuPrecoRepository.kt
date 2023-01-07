package com.example.nupreco.repositories

import com.example.nupreco.models.Ingredient

class NuPrecoRepository(private val nuPrecoDao: NuPrecoDao) {

    suspend fun insertIngredient(ingredient: Ingredient) {
        nuPrecoDao.insertIngredient(ingredient)
    }
}