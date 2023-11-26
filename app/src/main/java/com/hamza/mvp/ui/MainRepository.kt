package com.hamza.mvp.ui

import com.hamza.mvp.models.FakeApiService
import com.hamza.mvp.models.FakeDatabase

class MainRepository {
    private val api = FakeApiService()
    private val database = FakeDatabase()

    fun fetchWisdom() = api.getRandomWisdom()


    fun getUserInfo() = database.getCurrentUser()


}