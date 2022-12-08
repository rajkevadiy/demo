package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    String b1,b2,b3,b4,b5,b6,b7,b8,b9;
    int flag;
    int count;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }
        private void init () {
            btn1 = findViewById(R.id.btn1);
            btn2 = findViewById(R.id.btn2);
            btn3 = findViewById(R.id.btn3);
            btn4 = findViewById(R.id.btn4);
            btn5 = findViewById(R.id.btn5);
            btn6 = findViewById(R.id.btn6);
            btn7 = findViewById(R.id.btn7);
            btn8 = findViewById(R.id.btn8);
            btn9 = findViewById(R.id.btn9);


        }

        public void check (View view){
       Button btncurrent=(Button) view;
       count++;
       if(flag==0){
           btncurrent.setText("x");
           flag=1;
       }else {
           btncurrent.setText("0");
           flag=0;
       }

       if(count>4){


           b1=btn1.getText().toString();
           b2=btn2.getText().toString();
           b3=btn3.getText().toString();
           b4=btn4.getText().toString();
           b5=btn5.getText().toString();
           b6=btn6.getText().toString();
           b7=btn7.getText().toString();
           b8=btn8.getText().toString();
           b9=btn9.getText().toString();

       }

        }

}