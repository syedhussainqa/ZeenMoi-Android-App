package com.example.shussain.zeenmoi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class SignUpScreen01 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_screen01);

        final ImageButton imgBtnMan = (ImageButton) findViewById(R.id.imgBtnMan);
        final ImageButton imgBtnWoman = (ImageButton) findViewById(R.id.imgBtnWoman);

        Button btnFinalStep = (Button) findViewById(R.id.btnFinalStep);

        imgBtnMan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(SignUpScreen01.this, "Gender Male is selected.", Toast.LENGTH_LONG).show();

                imgBtnWoman.setVisibility(View.INVISIBLE);
            }
        });

        imgBtnWoman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(SignUpScreen01.this, "Gender Female is selected.", Toast.LENGTH_LONG).show();

                imgBtnMan.setVisibility(View.INVISIBLE);
            }
        });

        btnFinalStep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent next = new Intent(SignUpScreen01.this, SignUpScreen02.class);
                startActivity(next);
            }
        });


    }
}
