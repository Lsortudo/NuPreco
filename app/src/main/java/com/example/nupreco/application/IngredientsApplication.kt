package com.example.nupreco.application

import android.app.Application
import com.example.nupreco.repositories.NuPrecoDatabase
import com.example.nupreco.repositories.NuPrecoRepository
import com.example.nupreco.repositories.repository.IngredientRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.SupervisorJob

class IngredientsApplication: Application() {

    val applicationScope = CoroutineScope(SupervisorJob())
    val database by lazy { NuPrecoDatabase.getDatabase(applicationScope, this) }
    val repository by lazy { NuPrecoRepository(database.nuPrecoDao()) }


}