package com.example.nupreco.viewmodel

import androidx.lifecycle.*
import com.example.nupreco.data.NuPrecoRepository
import com.example.nupreco.models.Ingredient
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
