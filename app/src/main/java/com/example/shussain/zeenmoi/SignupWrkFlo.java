package com.example.shussain.zeenmoi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class SignupWrkFlo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_wrk_flo);

        final ImageButton imgBtnFb = (ImageButton) findViewById(R.id.imgBtnFb);
        final ImageButton imgBtnGoogle = (ImageButton) findViewById(R.id.imgBtnGoogle);
        final ImageButton imgBtnTwitter = (ImageButton) findViewById(R.id.imgBtnTwitter);

        final Button btnUserSignup = (Button) findViewById(R.id.btnUserSignup);

        btnUserSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent signUpScreen01 = new Intent(SignupWrkFlo.this, SignUpScreen01.class);
                Animation animation = new AlphaAnimation(1.0f,0.0f);
                animation.setDuration(500);
                btnUserSignup.setAnimation(animation);

                startActivity(signUpScreen01);
            }
        });

        imgBtnFb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation = new AlphaAnimation(1.0f,0.0f);
                animation.setDuration(500);
                imgBtnFb.setAnimation(animation);
                Toast.makeText(SignupWrkFlo.this, "Facebook Sign Up is not available right now, please proceed to 'Sign Up' ", Toast.LENGTH_SHORT).show();
            }
        });

        imgBtnGoogle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation = new AlphaAnimation(1.0f,0.0f);
                animation.setDuration(500);
                imgBtnGoogle.setAnimation(animation);
                Toast.makeText(SignupWrkFlo.this, "Google Sign Up is not available right now, please proceed to 'Sign Up' ", Toast.LENGTH_SHORT).show();
            }
        });

        imgBtnTwitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation = new AlphaAnimation(1.0f,0.0f);
                animation.setDuration(500);
                imgBtnTwitter.setAnimation(animation);
                Toast.makeText(SignupWrkFlo.this, "Twitter Sign Up is not available right now, please proceed to 'Sign Up' ", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
