package com.example.nupreco.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class IngredientViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        /*value = "This is dashboard Fragment"*/
        value = "Pagina de ingredientes"

    }
    val text: LiveData<String> = _text
}