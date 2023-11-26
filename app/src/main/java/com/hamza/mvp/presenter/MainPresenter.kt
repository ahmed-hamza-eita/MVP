package com.hamza.mvp.presenter

import com.hamza.mvp.ui.IMainView
import com.hamza.mvp.ui.MainRepository

class MainPresenter {

    private val repository = MainRepository()
    lateinit var view: IMainView

    fun fetchWisdom() {
        val result = repository.fetchWisdom()
        view.onFetchWisdom(result)
    }


    fun getUserInfo() {
        val result = repository.getUserInfo()
        view.onUSerInfo(result)
    }
}