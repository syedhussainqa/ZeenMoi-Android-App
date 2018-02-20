package com.example.shussain.zeenmoi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.GestureDetectorCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.GestureDetector;
import android.view.MotionEvent;

public class Demo02 extends AppCompatActivity {

    private GestureDetectorCompat gestureObject2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo02);

        gestureObject2 = new GestureDetectorCompat(this, new LearnGestures());

        /*final Button btnNext2 = (Button) findViewById(R.id.btnNext2);

        btnNext2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent nextScreen2 = new Intent(Demo02.this, Demo03.class);
                Animation animation = new AlphaAnimation(1.0f,0.0f);
                animation.setDuration(500);
                btnNext2.setAnimation(animation);

                startActivity(nextScreen2);
            }
        });*/
    }

    //Gesture class file.

    public boolean onTouchEvent(MotionEvent event) {
        this.gestureObject2.onTouchEvent(event);
        return super.onTouchEvent(event);
    }

    //On create gesture object class.

    class LearnGestures extends GestureDetector.SimpleOnGestureListener {
        //SimpleOnGestureListener listens to what we want to do


            @Override
            public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {

                if (motionEvent.getX() > motionEvent1.getX()) {

                    //Creating intent to navigate to next screen from right to left

                    Intent naviDemo3 = new Intent(Demo02.this, Demo03.class);
                    finish(); // this is used to stop history from mainActivity class
                    startActivity(naviDemo3);
                }
                else if (motionEvent.getX() < motionEvent1.getX()){

                    //Creating intent to navigate to next screen from left to right

                    Intent naviBkDemo1 = new Intent(Demo02.this, Demo01.class);
                    finish();
                    startActivity(naviBkDemo1);
                }
                return true;
            }
        }

    }

