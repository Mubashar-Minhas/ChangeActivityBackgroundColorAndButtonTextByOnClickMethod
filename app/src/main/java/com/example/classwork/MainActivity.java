package com.example.classwork;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity  {
    private Button btnChangeColor;
    private RelativeLayout cloBackground;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnChangeColor=findViewById(R.id.btnChangeColor);
        cloBackground=findViewById(R.id.cloBackGround);
        cloBackground.setBackgroundColor(Color.RED);
        changeBackgroundColor();
    }


    //through using onClick tag in xml
//    public void ChangeBackgroundColor(View view) {
//        btnChangeColor.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                int color = ((ColorDrawable)
//                        cloBackground.getBackground()).getColor();
//                if (color == Color.RED) {
//                    cloBackground.setBackgroundColor(Color.BLUE);
//                    //btnChangeColor.setText("Blue");
//                } else {
//                    cloBackground.setBackgroundColor(Color.RED);
//                   // btnChangeColor.setText("Red");
//                }
//            }
//
//        });
//
//    }


// Through creating function and calling onClickListener
    public void changeBackgroundColor() {
        btnChangeColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int color = ((ColorDrawable)
                        cloBackground.getBackground()).getColor();
                if (color == Color.RED) {
                    cloBackground.setBackgroundColor(Color.BLUE);
                    btnChangeColor.setText("Blue");
                } else {
                    cloBackground.setBackgroundColor(Color.RED);
                    btnChangeColor.setText("Red");
                }
            }

        });
    }
}


