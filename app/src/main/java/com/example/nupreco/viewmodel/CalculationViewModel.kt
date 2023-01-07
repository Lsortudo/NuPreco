package com.example.nupreco.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CalculationViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        /*value = "This is notifications Fragment"*/
        value = "Pagina de calculos"
    }
    val text: LiveData<String> = _text
}