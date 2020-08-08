package com.example.controlflowwhile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //1. 일반적인 while 사용하기
        var current =1
        val until = 12
        while(current<until){
            Log.d("while", "현재 값은 ${current}입니다.")
            //current를 1씩 증가시켜서 열한 번 반복한 후 while문을 빠져나갑니다.
            current = current +1
        }
        //2. do~ while 사용하기
        var game= 1
        val match= 6
        do{
            Log.d("while", "${game}이겼습니다.우승까지 ${match-game} 남았습니다.")
            game+=1
        }while(game<match)

        //3. while vs do~while
        //while test
        game=6
        while(game<match){
            Log.d("while", "****while test입니다.")
            game +=1
        }
        //do ~while test
        game=6
        do{
            Log.d("while", "**** do~ while 테스트입니다. ****")
            game +=1
        }while(game<match)
        //4. break 반복문 탈출하기
        for(index in 1..10){
            Log.d("while", "break>현재 index는 ${index} 입니다.")
            if(index >5){
                break
            }
        }
        //5. continue 다음 반복문으로
        for (except in 1..10) {
            //except가 3보다 크고 8보다 작으면 continue 명령으로 로그를 찍지 않고 랙ansdml
            //처음으로 jump 합니다.
            if (except > 3 && except < 8) {
                continue
            }
            //따라서 4~7은 출력되지 않습니다.
            Log.d("while", "continue > 현재 index는 $except 입니다.")
        }
    }
}