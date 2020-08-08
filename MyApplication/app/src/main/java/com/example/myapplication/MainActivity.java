package com.example.myapplication;
package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edit;
    TextView tResult;
    Button btnOK;
    int Counter; //몇번만에 맞췄는지
    int n;   //난수를 저장

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Counter = 0;
        n = (int) (Math.random() * 501 + 500);
        edit = (EditText)findViewById(R.id.EditText1);
        btnOK = (Button)findViewById(R.id.Button1);
        tResult = (TextView)findViewById(R.id.TextView2);

        btnOK.setOnClickListener(new View.OnClickListener(){
            public void onClick(View arg0){
                String s;
                Counter++;

                int p = Integer.parseInt(edit.getText().toString());
                if(p<500 || p > 1000){
                    s = "범위를 벗어났습니다.";
                }
                else if(p == n){
                    s = Counter+ "번째에 맞췄습니다.";
                }
                else if(p<n) {
                    s = p + "보다 큽니다.";
                }
                else{
                    s = p+"보다 작습니다.";
                }
                tResult.setText(s);
            }
        });

    }
}