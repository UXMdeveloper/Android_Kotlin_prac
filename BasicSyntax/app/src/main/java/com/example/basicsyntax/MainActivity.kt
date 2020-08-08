package com.example.basicsyntax

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var myName ="홍길동"
        var myAge :Int
        myAge = 27
        myAge = myAge +1
        Log.d("BasicSyntax", "myName = $myName , myAge= $myAge")

        var myNumbers = "1,2,3,4,5,6"
        var thisWeekNumbers = "5,6,7,8,9,10"
        if (myNumbers == thisWeekNumbers){
            Log.d("Lotto", "당첨되었습니다.")
        }
    }
}