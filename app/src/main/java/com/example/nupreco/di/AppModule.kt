package com.example.nupreco.di

import com.example.nupreco.data.NuPrecoDatabase
import com.example.nupreco.data.NuPrecoRepository
import com.example.nupreco.viewmodel.IngredientViewModel
import org.koin.android.ext.koin.androidContext
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel { IngredientViewModel(get()) }
}

val repositoryModule = module {
    single { NuPrecoRepository(get()) }
}

val daoModule = module {
    single { NuPrecoDatabase.getDatabase(androidContext()).nuPrecoDao() }
}