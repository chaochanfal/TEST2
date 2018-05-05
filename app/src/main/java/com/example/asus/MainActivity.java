package com.example.asus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText et_main__essage;
    private Button btn_main_strat1;
    private Button btn_main_strat2;
    private Button btn_main_strat3;
    private Button btn_main_strat4;
    private Button btn_main_strat5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //初始化视图对像
        et_main__essage = findViewById(R.id.main_massage);
        btn_main_strat1 = findViewById(R.id.button_stack1);
        btn_main_strat2 = findViewById(R.id.button_stack2);
        btn_main_strat3 = findViewById(R.id.button_stack3);
        btn_main_strat4 = findViewById(R.id.button_stack4);
        btn_main_strat5 = findViewById(R.id.button_stack5);
        //設置点击监听
        btn_main_strat1.setOnClickListener(this);
        btn_main_strat2.setOnClickListener(this);
        btn_main_strat3.setOnClickListener(this);
        btn_main_strat4.setOnClickListener(this);
        btn_main_strat5.setOnClickListener(this);

              /*
              另一种做法
                     btn_main_strat5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                    Intent intent=new Intent(MainActivity.this,Main6Activity.class);
                    }
                }
                */

    }

    @Override
    public void onClick(View view) {
        if (view == btn_main_strat1) {
            Intent intent = new Intent(this, Main2Activity.class);
            //getText取得
            String message = et_main__essage.getText().toString();
            //putExtra赋予额外
            intent.putExtra("MESSAGE", message);
            startActivity(intent);
        } else if (view == btn_main_strat2) {
            Intent intent = new Intent(this, Main3Activity.class);
            startActivity(intent);
        } else if (view == btn_main_strat3) {
            Intent intent = new Intent(this, Main4Activity.class);
            startActivity(intent);
        } else if (view == btn_main_strat4) {
            Intent intent = new Intent(this, Main5Activity.class);
            startActivity(intent);
        } else if (view == btn_main_strat5) {
            Intent intent = new Intent(this, Main6Activity.class);
            startActivity(intent);
        }
    }
}
