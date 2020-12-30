package com.example.jetpackhilttest

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.jetpackhilttest.fragment.AnimalFragment
import com.example.jetpackhilttest.hiltmodule.bindMonkeyAnimal
import com.example.jetpackhilttest.model.IAnimal
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.activity_animal.*
import javax.inject.Inject

@AndroidEntryPoint
class AnimalActivity : AppCompatActivity() {

    @bindMonkeyAnimal
    @Inject lateinit var animal:IAnimal

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animal)

        tv_activity_animal.text = animal.animalName()
        supportFragmentManager.beginTransaction().replace(R.id.layout_content, AnimalFragment()).commitAllowingStateLoss()
    }

}