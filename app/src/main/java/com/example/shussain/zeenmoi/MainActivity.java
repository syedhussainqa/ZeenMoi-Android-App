package com.example.shussain.zeenmoi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button btnShowAround = (Button) findViewById(R.id.btnShowAround);

        btnShowAround.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent nextScreen = new Intent(MainActivity.this, Demo01.class);
                Animation animation = new AlphaAnimation(1.0f,0.0f);
                animation.setDuration(1000);
                btnShowAround.startAnimation(animation);

                startActivity(nextScreen);

            }
        });



    }
}
