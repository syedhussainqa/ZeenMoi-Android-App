package com.example.shussain.zeenmoi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.GestureDetectorCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.Button;

public class Demo06 extends AppCompatActivity {

    private GestureDetectorCompat gestureObject6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo06);

        gestureObject6 = new GestureDetectorCompat(this, new LearnGestures());

        final Button btnContinue = (Button) findViewById(R.id.btnContinue);

        btnContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent login = new Intent(Demo06.this, Login01.class);
                Animation animation = new AlphaAnimation(1.0f,0.0f);
                animation.setDuration(500);
                btnContinue.setAnimation(animation);

                startActivity(login);
            }
        });
    }

    //Gesture class file.

    public boolean onTouchEvent(MotionEvent event) {
        this.gestureObject6.onTouchEvent(event);
        return super.onTouchEvent(event);
    }

    //On create gesture object class.

    class LearnGestures extends GestureDetector.SimpleOnGestureListener {
        //SimpleOnGestureListener listens to what we want to do

        @Override
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {


                //Creating intent to navigate to next screen

                Intent naviBkDemo5 = new Intent(Demo06.this, Demo05.class);
                finish(); // this is used to stop history from mainActivity class
                startActivity(naviBkDemo5);

                return true;
        }

    }
}
