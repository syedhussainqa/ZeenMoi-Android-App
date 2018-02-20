package com.example.shussain.zeenmoi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class BookAptScreen03 extends AppCompatActivity {

    ArrayAdapter<CharSequence> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_apt_screen03);

        Button btnSetLocation = (Button) findViewById(R.id.btnSetLocation);


        Spinner priceSpinner = (Spinner) findViewById(R.id.priceSpinner);
        adapter = ArrayAdapter.createFromResource(this, R.array.service_price, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        priceSpinner.setAdapter(adapter);

        priceSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                //Toast.makeText(SignUpScreen02.this, "Country is selected.", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        btnSetLocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nextScreen = new Intent(BookAptScreen03.this, BookAptScreen04.class);

                startActivity(nextScreen);
            }
        });
    }
}
