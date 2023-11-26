package com.hamza.mvp.models

import com.hamza.mvp.models.domains.User

class FakeDatabase {
    fun getCurrentUser() =
        User("Ahmed", 2002)

}