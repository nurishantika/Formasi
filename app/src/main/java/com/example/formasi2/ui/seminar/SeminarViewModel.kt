package com.example.formasi2.ui.seminar

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SeminarViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Seminar Fragment"
    }
    val text: LiveData<String> = _text
}