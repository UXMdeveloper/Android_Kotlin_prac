package com.example.widgetsradio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //위젯에 클릭 같은 변경사항이 실행되면서 첫 번째 파라미터에는 변경된 라디오그룹 위젯,
        // 두 번에는 라디오그룹 안에서 클릭된 라디오버튼의 id가 전달된다.
        radioGroup.setOnCheckedChangeListener{group, checkedID -> 
            when (checkedID) {
                R.id.radioApple -> Log.d("RadioButton", "사과가 선택되었습니다.")
                R.id.radioBanana-> Log.d("RadioButton", "바나나가 선택되었습니다.")
                R.id.radioOrange-> Log.d("RadioButton", "오렌지가 선택되었습니다.")

            }
        }
    }
}