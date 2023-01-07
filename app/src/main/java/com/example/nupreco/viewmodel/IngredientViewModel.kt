package com.example.nupreco.viewmodel

import androidx.lifecycle.*
import com.example.nupreco.models.Ingredient
import com.example.nupreco.repositories.NuPrecoRepository
import kotlinx.coroutines.launch

class IngredientViewModel(private val repository: NuPrecoRepository) : ViewModel() {
    // Gerado automaticamente
    /*private val _text = MutableLiveData<String>().apply {
        *//*value = "This is dashboard Fragment"*//*
        value = "Pagina de ingredientes"

    }
    val text: LiveData<String> = _text*/

    val allIngredients: LiveData<List<Ingredient>> =
        repository.allIngredients.asLiveData()

    fun insert(ingredient: Ingredient) =
        viewModelScope.launch {
            //Insertions on database should ALWAYS be on ANY thread besides the main one (using coroutines inside my viewModelScope)
            repository.insertIngredient(ingredient)
        }
}

class IngredientViewModelFactory(private val repository: NuPrecoRepository) :
    ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(IngredientViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return IngredientViewModel(repository) as T
            //return super.create(modelClass)
        }
        throw IllegalArgumentException("Unknown ViewModel class")

    }

}