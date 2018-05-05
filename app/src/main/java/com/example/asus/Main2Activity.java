package com.example.asus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import android.view.Gravity;
import android.view.View;

import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    private Button UC1_button_back,UC1_button_Horizontal,UC1_button_Vertical,UC1_button_Left;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        UC1_button_back=findViewById(R.id.UC1_button_back);
        UC1_button_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
         /*------------------------------------------------------*/
        UC1_button_Horizontal=findViewById(R.id.UC1_button_Horizontal);
        UC1_button_Vertical=findViewById(R.id.UC1_button_Vertical);
        UC1_button_Left=findViewById(R.id.UC1_button_Left);
        /*------------------------------------------------------*/
        UC1_button_Horizontal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LinearLayout.LayoutParams Horizontalparams=(LinearLayout.LayoutParams)UC1_button_Horizontal.getLayoutParams();
                Horizontalparams.gravity=Gravity.CENTER_HORIZONTAL;
                UC1_button_Horizontal.setLayoutParams(Horizontalparams);

                LinearLayout.LayoutParams Verticalparams=(LinearLayout.LayoutParams)UC1_button_Vertical.getLayoutParams();
                UC1_button_Vertical.setLayoutParams(Horizontalparams);
                LinearLayout.LayoutParams Leftparams=(LinearLayout.LayoutParams)UC1_button_Left.getLayoutParams();
                UC1_button_Left.setLayoutParams(Horizontalparams);
            }
        });
        UC1_button_Vertical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LinearLayout.LayoutParams Verticalparams2=(LinearLayout.LayoutParams)UC1_button_Vertical.getLayoutParams();
                Verticalparams2.gravity=Gravity.CENTER_VERTICAL;
                UC1_button_Vertical.setLayoutParams(Verticalparams2);

                LinearLayout.LayoutParams Horizontalparams2=(LinearLayout.LayoutParams)UC1_button_Horizontal.getLayoutParams();
                UC1_button_Horizontal.setLayoutParams(Verticalparams2);
                LinearLayout.LayoutParams Leftparams=(LinearLayout.LayoutParams)UC1_button_Left.getLayoutParams();
                UC1_button_Left.setLayoutParams(Verticalparams2);
            }
        });
        UC1_button_Left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LinearLayout.LayoutParams Leftparams3=(LinearLayout.LayoutParams)UC1_button_Left.getLayoutParams();
                Leftparams3.gravity=Gravity.LEFT;
                UC1_button_Left.setLayoutParams(Leftparams3);

                LinearLayout.LayoutParams Horizontalparams2=(LinearLayout.LayoutParams)UC1_button_Horizontal.getLayoutParams();
                UC1_button_Horizontal.setLayoutParams(Leftparams3);
                LinearLayout.LayoutParams Leftparams=(LinearLayout.LayoutParams)UC1_button_Left.getLayoutParams();
                UC1_button_Vertical.setLayoutParams(Leftparams3);
            }
        });



        /*
        UC1_button2=findViewById(R.id.UC1_button2);
        UC1_button3=findViewById(R.id.UC1_button3);

        //得到intent的对像;getIntent取得數据
        Intent intent=getIntent();
        //通过intent讀取额外數据
        String message= intent.getStringExtra("MESSAGE");
        //显示到textView;setText安置數据;
        textView.setText(message);



        /*UC1_button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
*/



    }
}

