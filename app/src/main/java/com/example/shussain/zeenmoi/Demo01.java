package com.example.shussain.zeenmoi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.GestureDetectorCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.Toast;

public class Demo01 extends AppCompatActivity {

    private GestureDetectorCompat gestureObject01;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo01);

        Toast.makeText(this,"Swipe Right >>", Toast.LENGTH_SHORT).show();


        gestureObject01 = new GestureDetectorCompat(this, new LearnGestures());

        /*final Button btnNext1 = (Button) findViewById(R.id.btnNext1);

        btnNext1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent nextScreen1 = new Intent(Demo01.this, Demo02.class);
                Animation animation = new AlphaAnimation(1.0f, 0.0f);
                animation.setDuration(500);
                btnNext1.startAnimation(animation);

                startActivity(nextScreen1);
            }
        });*/
    }
    //Gesture class file.

    public boolean onTouchEvent(MotionEvent event) {
        this.gestureObject01.onTouchEvent(event);
        return super.onTouchEvent(event);
    }

    //On create gesture object class.

    class LearnGestures extends GestureDetector.SimpleOnGestureListener {
        //SimpleOnGestureListener listens to what we want to do

        @Override
        public boolean onFling(MotionEvent event1, MotionEvent event2, float velocityX, float velocityY) {


            //Creating intent to navigate to next screen

            Intent naviDemo2 = new Intent(Demo01.this, Demo02.class);
            finish(); // this is used to stop history from mainActivity class
            startActivity(naviDemo2);
            return true;
        }

    }
}

