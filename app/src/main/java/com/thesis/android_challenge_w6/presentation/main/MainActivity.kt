package com.thesis.android_challenge_w6.presentation.main

import android.os.Bundle
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import com.thesis.android_challenge_w6.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)
    }


}