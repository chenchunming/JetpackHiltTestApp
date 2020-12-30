package com.example.jetpackhilttest.model

import android.util.Log
import javax.inject.Inject

class Tiger @Inject constructor():IAnimal{

    override fun eat() {
        Log.d("tiger===","eat meat")
    }

    override fun animalName(): String {
        return "我是老虎"
    }
}