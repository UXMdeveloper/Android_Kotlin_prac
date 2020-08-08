package com.example.widgetsratingbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //rating :현재 벌점
        //fromUser: 사용자 입력 여부
        ratingBar.setOnRatingBarChangeListener { ratingBar, rating  , fromUser ->
            textView.text = "$rating"
        }
    }
}