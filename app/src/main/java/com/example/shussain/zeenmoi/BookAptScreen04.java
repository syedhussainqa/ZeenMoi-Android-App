package com.example.shussain.zeenmoi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class BookAptScreen04 extends AppCompatActivity {

    ArrayAdapter<CharSequence> adapter1;
    ArrayAdapter<CharSequence> adapter2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_apt_screen04);

        Button btnSetTime = (Button) findViewById(R.id.btnSetTime);

        btnSetTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nextScreen = new Intent(BookAptScreen04.this, BookAptScreen05.class);

                startActivity(nextScreen);
            }
        });


        Spinner walkSpinner = (Spinner) findViewById(R.id.walkSpinner);
        Spinner driveSpinner = (Spinner) findViewById(R.id.driveSpinner);
        adapter1 = ArrayAdapter.createFromResource(this, R.array.walking_distance, android.R.layout.simple_spinner_item);
        adapter1.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        walkSpinner.setAdapter(adapter1);

        adapter2 = ArrayAdapter.createFromResource(this, R.array.driving_distance, android.R.layout.simple_spinner_item);
        adapter2.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        driveSpinner.setAdapter(adapter2);

        walkSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                //Toast.makeText(SignUpScreen02.this, "Country is selected.", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        driveSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                //Toast.makeText(SignUpScreen02.this, "Country is selected.", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


    }
}
