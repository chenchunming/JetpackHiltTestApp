package com.example.jetpackhilttest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.jetpackhilttest.fragment.UserFragment
import com.example.jetpackhilttest.model.UserModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var user:UserModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        user.name = "Activity UserName"
        user.id = 1

        tv_name.text = user.name

        supportFragmentManager.beginTransaction().replace(R.id.layout_content,UserFragment()).commitAllowingStateLoss()

    }
}
