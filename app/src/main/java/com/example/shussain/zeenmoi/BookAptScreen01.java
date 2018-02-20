package com.example.shussain.zeenmoi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class BookAptScreen01 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_apt_screen01);

        Button btnToday = (Button) findViewById(R.id.btnToday);
        Button btnLaterDate = (Button) findViewById(R.id.btnLaterDate);
        Button btnHomeCall = (Button) findViewById(R.id.btnHomeCall);

        btnToday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent nextScreen = new Intent(BookAptScreen01.this, BookAptScreen02.class);

                startActivity(nextScreen);

            }
        });

        btnLaterDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(BookAptScreen01.this, "Later date appointments are not available right now.", Toast.LENGTH_SHORT).show();
            }
        });

        btnHomeCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(BookAptScreen01.this, "Home call appointments are not available right now.", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
