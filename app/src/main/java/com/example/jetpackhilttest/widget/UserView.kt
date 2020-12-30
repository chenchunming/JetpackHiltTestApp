package com.example.jetpackhilttest.widget

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import com.example.jetpackhilttest.R
import com.example.jetpackhilttest.model.UserModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.layout_userview.view.*
import javax.inject.Inject

@AndroidEntryPoint
class UserView:LinearLayout{

    @Inject lateinit var user:UserModel

    constructor(context: Context):this(context,null,0)
    constructor(context: Context, attrs:AttributeSet?):this(context,attrs,0)
    constructor(context: Context, attrs:AttributeSet?,defStyleAttr:Int=0):super(context,attrs,0)

    init {
        LayoutInflater.from(context).inflate(R.layout.layout_userview,this)
        user.name = "UserView UserName"
        tv_name.text = user.name
    }

}