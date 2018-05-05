package com.example.asus;

import android.os.CountDownTimer;
import android.os.Handler;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.List;
import java.util.Timer;

public class Main4Activity extends AppCompatActivity {
private Button UC3_button_back;
    private ImageView imageView=findViewById(R.id.imageView);
    private int[] image={R.id.imageView,R.id.imageView2,R.id.imageView3,R.id.imageView,R.id.imageView2,R.id.imageView3};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        UC3_button_back=findViewById(R.id.UC3_button_back);
        UC3_button_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });



    }
}
