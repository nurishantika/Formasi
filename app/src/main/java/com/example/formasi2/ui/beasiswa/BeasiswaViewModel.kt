package com.example.formasi2.ui.beasiswa

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class BeasiswaViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Beasiswa Fragment"
    }
    val text: LiveData<String> = _text
}