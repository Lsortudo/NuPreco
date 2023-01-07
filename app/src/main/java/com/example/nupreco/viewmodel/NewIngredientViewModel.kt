package com.example.nupreco.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class NewIngredientViewModel : ViewModel() {
    private val _nameIngredient = MutableLiveData<String>().apply {

        /*value = "teste"*/

    }

    val nameIngredient : LiveData<String> = _nameIngredient

}