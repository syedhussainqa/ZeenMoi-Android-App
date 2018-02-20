package com.example.shussain.zeenmoi;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.ImageButton;

public class BeautyCardScreen01 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beauty_card_screen01);

        final ImageButton imgBtnEarLength = (ImageButton) findViewById(R.id.imgBtnEarLength);
        final ImageButton imgBtnNeckLength = (ImageButton) findViewById(R.id.imgBtnNeckLength);
        final ImageButton imgBtnShoulderLength = (ImageButton) findViewById(R.id.imgBtnShoulderLength);
        final ImageButton imgBtnBackLength = (ImageButton) findViewById(R.id.imgBtnBackLength);
        final ImageButton imgBtnWaistLength = (ImageButton) findViewById(R.id.imgBtnWaistLength);

        final Button btnStraight = (Button) findViewById(R.id.btnStraight);
        final Button btnWavy = (Button) findViewById(R.id.btnWavy);
        final Button btnCurly = (Button) findViewById(R.id.btnCurly);
        final Button btnFrizzy = (Button) findViewById(R.id.btnFrizzy);

        final Button btnNextNail = (Button) findViewById(R.id.btnNextNail);
        btnNextNail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent nextScreen = new Intent(BeautyCardScreen01.this, BeautyCardScreen02.class);
                Animation animation = new AlphaAnimation(1.0f,0.0f);
                animation.setDuration(1000);
                btnNextNail.startAnimation(animation);

                startActivity(nextScreen);

            }
        });

        imgBtnEarLength.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgBtnEarLength.setBackgroundColor(Color.GRAY);
            }
        });
        imgBtnNeckLength.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgBtnNeckLength.setBackgroundColor(Color.GRAY);
            }
        });
        imgBtnShoulderLength.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgBtnShoulderLength.setBackgroundColor(Color.GRAY);
            }
        });
        imgBtnBackLength.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgBtnBackLength.setBackgroundColor(Color.GRAY);
            }
        });
        imgBtnWaistLength.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgBtnWaistLength.setBackgroundColor(Color.GRAY);
            }
        });

        btnStraight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnStraight.setBackgroundColor(Color.GRAY);
            }
        });

        btnWavy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnWavy.setBackgroundColor(Color.GRAY);
            }
        });

        btnCurly.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnCurly.setBackgroundColor(Color.GRAY);
            }
        });

        btnFrizzy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnFrizzy.setBackgroundColor(Color.GRAY);
            }
        });
    }
}
