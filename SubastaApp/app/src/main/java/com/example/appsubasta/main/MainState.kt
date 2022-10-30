package com.example.appsubasta.main

data class MainState(
    val name: String = "",
    val names: List<User> = emptyList()
)
