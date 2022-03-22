package com.xlwe.testgit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    private val test1 = "SDFSDFSDFSDF"

    private val test2 = "SDFSDFSDFSDF"

    private val test3 = "SDFSDFSDFSDF"

    private val test4 = "TEST4"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        observe()
    }

    private fun observe() {

    }
}