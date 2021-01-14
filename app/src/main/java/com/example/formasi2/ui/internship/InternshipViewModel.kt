package com.example.formasi2.ui.internship

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class InternshipViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Internship Fragment"
    }
    val text: LiveData<String> = _text
}