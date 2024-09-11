package com.example.chacknorrisjokes.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.chacknorrisjokes.data.network.HttpConnect
import kotlinx.coroutines.launch

class ResponseViewModel : ViewModel() {

    fun getElem() {
        viewModelScope.launch {
            HttpConnect().getResponse()
        }
    }
}