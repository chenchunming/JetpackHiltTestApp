package com.example.jetpackhilttest.model

import android.util.Log
import javax.inject.Inject

class Sheep @Inject constructor():IAnimal{

    override fun eat() {
        Log.d("sheep===","eat green grass")
    }

    override fun animalName(): String {
        return "我是羊"
    }
}