package com.koreanair.keds.ui.buttons

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ButtonsViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is buttons Fragment"
    }
    val text: LiveData<String> = _text
}