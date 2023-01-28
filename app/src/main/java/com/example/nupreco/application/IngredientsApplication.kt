package com.example.nupreco.application

import android.app.Application
import com.example.nupreco.repositories.NuPrecoDatabase
import com.example.nupreco.repositories.NuPrecoRepository
import com.example.nupreco.repositories.repository.IngredientRepository

class IngredientsApplication: Application {

    val database by lazy { NuPrecoDatabase.getDatabase(this) }
    val repository by lazy { IngredientRepository(database.ingredientDao()) }


}