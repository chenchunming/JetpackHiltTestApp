package com.example.jetpackhilttest.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.jetpackhilttest.R
import com.example.jetpackhilttest.hiltmodule.bindTigerAnimal
import com.example.jetpackhilttest.model.IAnimal
import com.example.jetpackhilttest.model.UserModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.fragment_user.*
import javax.inject.Inject

@AndroidEntryPoint
class AnimalFragment :Fragment(){

    var mRootView: View? = null
    @bindTigerAnimal
    @Inject lateinit var mAnimal:IAnimal
    lateinit var tvName:TextView

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        mRootView = inflater.inflate(R.layout.fragment_user,null)
        initView(mRootView!!)
        return mRootView
    }

    private fun initView(view:View){
        tvName = view.findViewById(R.id.tv_name)
        tvName.text = mAnimal.animalName()
    }

}