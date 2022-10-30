package com.example.appsubasta.main

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.appsubasta.data.UserRepository
import kotlinx.coroutines.launch

class MainViewModel(
    private val repository: UserRepository
)
    :ViewModel() {
    var state by mutableStateOf(MainState())
        private set
    // esta funcion hace que al ingresar el dato se copie y lo almacene
    fun onNameChange(name:String) {
        state = state.copy(
            name= name
        )
    }
    fun saveUser() {
        val user = User(
            name = state.name
        )
        viewModelScope.launch {
           repository.insertUser(user)
        }
    }
}