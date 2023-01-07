package com.example.nupreco.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class RecipeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        /*value = "This is home Fragment"*/
        value = "Pagina de receitas"
    }
    val text: LiveData<String> = _text
}