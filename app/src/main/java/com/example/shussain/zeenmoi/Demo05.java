package com.example.shussain.zeenmoi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.GestureDetectorCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.GestureDetector;
import android.view.MotionEvent;

public class Demo05 extends AppCompatActivity {

    private GestureDetectorCompat gestureObject5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo05);

        gestureObject5 = new GestureDetectorCompat(this, new LearnGestures());



        /*final Button btnNext5 = (Button) findViewById(R.id.btnContinue);

        btnNext5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent nextScreen4 = new Intent(Demo05.this, Demo06.class);
                Animation animation = new AlphaAnimation(1.0f,0.0f);
                animation.setDuration(500);
                btnNext5.setAnimation(animation);

                startActivity(nextScreen4);
            }
        });*/
    }
    //Gesture class file.

    public boolean onTouchEvent(MotionEvent event) {
        this.gestureObject5.onTouchEvent(event);
        return super.onTouchEvent(event);
    }

    //On create gesture object class.

    class LearnGestures extends GestureDetector.SimpleOnGestureListener {
        //SimpleOnGestureListener listens to what we want to do

        @Override
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {

            if (motionEvent.getX() > motionEvent1.getX()) {

                //Creating intent to navigate to next screen

                Intent naviDemo6 = new Intent(Demo05.this, Demo06.class);
                finish(); // this is used to stop history from mainActivity class
                startActivity(naviDemo6);
            }
            else if (motionEvent.getX() < motionEvent1.getX()){

                Intent naviBkDemo4 = new Intent(Demo05.this, Demo04.class);
                finish();
                startActivity(naviBkDemo4);
            }
            return true;



        }

    }
}
