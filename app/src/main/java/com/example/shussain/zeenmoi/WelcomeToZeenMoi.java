package com.example.shussain.zeenmoi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.Button;

public class WelcomeToZeenMoi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_to_zeen_moi);

        final Button btnCreateBeautyCard = (Button) findViewById(R.id.btnCreateBeautyCard);

        btnCreateBeautyCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Animation animation = new AlphaAnimation(1.0f,0.0f);
                animation.setDuration(1000);
                btnCreateBeautyCard.startAnimation(animation);

                Intent nextScreen = new Intent(WelcomeToZeenMoi.this, BeautyCardScreen01.class);
                startActivity(nextScreen);
            }
        });
    }
}
