package com.example.appsubasta.main

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier



@Composable
fun MainScreen(viewModel: MainViewModel) {
// aqui me voy a comunicar con la interfaz y state
    val state = viewModel.state
//borrar
  Column(modifier = Modifier.fillMaxHeight()){
      TextField(value = state.name, onValueChange = {viewModel.onNameChange(it)})
      Button(onClick = {viewModel.saveUser()}){
          Text(text = "Guardar")
      }

      LazyColumn(modifier = Modifier.fillMaxHeight()){
          items(listOf<String>()){
              Text(text = it)
          }
      }
  }
}