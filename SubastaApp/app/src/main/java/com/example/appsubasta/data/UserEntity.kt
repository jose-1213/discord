package com.example.appsubasta.data

import androidx.room.Entity
import androidx.room.PrimaryKey
@Entity
data class UserEntity(
    //hace que las id se autocomplente solas
    @PrimaryKey(autoGenerate = true)
    val id: Int? = null,
    val name: String
)
