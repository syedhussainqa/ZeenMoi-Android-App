package com.example.shussain.zeenmoi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.Toast;

public class Login01 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login01);

        final Button btnSignUp = (Button) findViewById(R.id.btnSignUp);
        final Button btnLogIn = (Button) findViewById(R.id.btnLogIn);

        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent signUpWrkFlo = new Intent(Login01.this, SignupWrkFlo.class);
                Animation animation = new AlphaAnimation(1.0f,0.0f);
                animation.setDuration(500);
                btnSignUp.setAnimation(animation);

                startActivity(signUpWrkFlo);
            }
        });

        btnLogIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Animation animation = new AlphaAnimation(1.0f,0.0f);
                animation.setDuration(500);
                btnLogIn.setAnimation(animation);

                Toast.makeText(Login01.this, "Log in is not available right now, please check back later.", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
