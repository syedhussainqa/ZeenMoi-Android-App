package com.example.shussain.zeenmoi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.GestureDetectorCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.GestureDetector;
import android.view.MotionEvent;

public class Demo04 extends AppCompatActivity {

    private GestureDetectorCompat gestureObject4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo04);

        gestureObject4 = new GestureDetectorCompat(this, new LearnGestures());

        /*final Button btnNext4 = (Button) findViewById(R.id.btnNext4);

        btnNext4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent nextScreen4 = new Intent(Demo04.this, Demo05.class);
                Animation animation = new AlphaAnimation(1.0f,0.0f);
                animation.setDuration(500);
                btnNext4.setAnimation(animation);

                startActivity(nextScreen4);
            }
        });*/

    }
    //Gesture class file.

    public boolean onTouchEvent(MotionEvent event) {
        this.gestureObject4.onTouchEvent(event);
        return super.onTouchEvent(event);
    }

    //On create gesture object class.

    class LearnGestures extends GestureDetector.SimpleOnGestureListener {
        //SimpleOnGestureListener listens to what we want to do

        @Override
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {

            if (motionEvent.getX() > motionEvent1.getX()) {

                //Creating intent to navigate to next screen

                Intent naviDemo5 = new Intent(Demo04.this, Demo05.class);
                finish(); // this is used to stop history from mainActivity class
                startActivity(naviDemo5);
            }
            else if (motionEvent.getX() < motionEvent1.getX()){

                Intent naviBkDemo3 = new Intent(Demo04.this, Demo03.class);
                finish();
                startActivity(naviBkDemo3);
            }
            return true;



        }

    }
}
