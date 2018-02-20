package com.example.shussain.zeenmoi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class BookAptScreen02 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_apt_screen02);


        ImageButton imgBtnNail = (ImageButton) findViewById(R.id.imgBtnNail);

        imgBtnNail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nextScreen = new Intent(BookAptScreen02.this, BookAptScreen03.class);

                startActivity(nextScreen);
            }
        });
    }
}
