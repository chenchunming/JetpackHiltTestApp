package com.example.jetpackhilttest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.jetpackhilttest.network.GitHubService
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.activity_main.tv_name
import kotlinx.coroutines.*
import javax.inject.Inject

@AndroidEntryPoint
class NetworkActivity : AppCompatActivity() ,CoroutineScope by MainScope(){

    @Inject
    lateinit var service:GitHubService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_network)

        launch (Dispatchers.Main){
            val repos= service.listRepos("octocat")
            tv_name.text = repos[0].archive_url
        }

    }

    override fun onDestroy() {
        cancel()
        super.onDestroy()
    }
}
