package com.example.jetpackhilttest.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.jetpackhilttest.R
import com.example.jetpackhilttest.model.UserModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.fragment_user.*
import javax.inject.Inject

@AndroidEntryPoint
class UserFragment :Fragment(){

    var mRootView: View? = null
    @Inject lateinit var mUser:UserModel
    lateinit var tvName:TextView

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        mRootView = inflater.inflate(R.layout.fragment_user,null)
        initView(mRootView!!)
        return mRootView
    }

    private fun initView(view:View){
        tvName = view.findViewById(R.id.tv_name)
        mUser.name = "Fragment UserName"
        tvName.text = mUser.name
    }

}