package com.hamza.mvp.ui

import com.hamza.mvp.models.domains.User
import com.hamza.mvp.models.domains.Wisdom

interface IMainView {
    fun onUSerInfo(user:User)
    fun onFetchWisdom(wisdom: Wisdom)


}