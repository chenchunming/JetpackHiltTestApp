package com.example.jetpackhilttest.model

import java.io.Serializable
import javax.inject.Inject

class UserModel @Inject constructor():Serializable{

    var id = 0
    var name = ""

    override fun toString(): String {
        return "UserModel(name=$name id$id)"
    }
}