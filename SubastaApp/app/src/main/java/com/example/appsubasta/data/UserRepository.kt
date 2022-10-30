package com.example.appsubasta.data

import com.example.appsubasta.main.User

class UserRepository(
    private val userDao: UserDao
) {
    suspend fun getUser(): List<User>{
        val entities = userDao.getUser()
        return entities.map{
            User(name = it.name)
        }

    }
    suspend fun insertUser (user : User){
        val entity = UserEntity(name = user.name)
        userDao.insertUser(entity)
    }

}