package com.example.shussain.zeenmoi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.GestureDetectorCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.GestureDetector;
import android.view.MotionEvent;

public class Demo03 extends AppCompatActivity {

    private GestureDetectorCompat gestureObject3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo03);

        gestureObject3 = new GestureDetectorCompat(this, new LearnGestures());

        //final Button btnNext3 = (Button) findViewById(R.id.btnNext3);

       /* btnNext3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent nextScreen3 = new Intent(Demo03.this, Demo04.class);
                Animation animation = new AlphaAnimation(1.0f,0.0f);
                animation.setDuration(500);
                btnNext3.setAnimation(animation);

                startActivity(nextScreen3);
            }
        });*/
    }

    //Gesture class file.

    public boolean onTouchEvent(MotionEvent event) {
        this.gestureObject3.onTouchEvent(event);
        return super.onTouchEvent(event);
    }

    //On create gesture object class.

    class LearnGestures extends GestureDetector.SimpleOnGestureListener {
        //SimpleOnGestureListener listens to what we want to do

        @Override
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {

            if (motionEvent.getX() > motionEvent1.getX()) {

                //Creating intent to navigate to next screen

                Intent naviDemo4 = new Intent(Demo03.this, Demo04.class);
                finish(); // this is used to stop history from mainActivity class
                startActivity(naviDemo4);
            }
            else
            if (motionEvent.getX() < motionEvent1.getX()){

                Intent naviBkDemo2 = new Intent(Demo03.this, Demo02.class);
                finish();
                startActivity(naviBkDemo2);
            }
            return true;



        }

    }
}
