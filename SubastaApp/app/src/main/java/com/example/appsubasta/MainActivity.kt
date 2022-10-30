package com.example.appsubasta

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.room.Room
import com.example.appsubasta.data.UserDatabase
import com.example.appsubasta.data.UserRepository
import com.example.appsubasta.main.MainScreen
import com.example.appsubasta.main.MainViewModel

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //base de dates
        val db = Room.databaseBuilder(this, UserDatabase::class.java, "user_db").build()
        val dao = db.dao
        val repository =  UserRepository(dao)
        // aqua llama a los main para la connexion de los estates
        val viewmodel = MainViewModel(repository)
        setContent{
            MainScreen(viewmodel)
        }
    }
}