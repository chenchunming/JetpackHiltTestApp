package com.example.jetpackhilttest.model

import android.util.Log
import javax.inject.Inject

class Monkey @Inject constructor():IAnimal{

    override fun eat() {
        Log.d("monkey===","eat banana")
    }

    override fun animalName(): String {
        return "我是猴子"
    }
}