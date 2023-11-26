package com.hamza.mvp.presenter

import com.hamza.mvp.models.FakeApiService
import com.hamza.mvp.models.FakeDatabase
import com.hamza.mvp.ui.IMainView

class MainPresenter {
    private val api = FakeApiService()
    private val database = FakeDatabase()

    lateinit var view: IMainView

    fun fetchWisdom() {
        val result = api.getRandomWisdom()
        view.onFetchWisdom(result)
    }


    fun getUserInfo() {
        val result = database.getCurrentUser()
        view.onUSerInfo(result)
    }
}