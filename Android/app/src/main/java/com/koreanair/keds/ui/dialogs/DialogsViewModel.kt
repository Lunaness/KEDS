package com.koreanair.keds.ui.dialogs

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DialogsViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Dialogs Fragment"
    }
    val text: LiveData<String> = _text
}