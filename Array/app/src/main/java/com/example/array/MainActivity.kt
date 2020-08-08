package com.example.array

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var mutableList = mutableListOf("MON", "TUE", "WED")
        mutableList.add("THU")

        var variable= mutableList.get(1)
        mutableList.set(1,"Tuesday")
        mutableList.removeAt(3)
    }
}