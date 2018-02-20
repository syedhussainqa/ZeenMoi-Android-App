package com.example.shussain.zeenmoi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.Spinner;

public class SignUpScreen02 extends AppCompatActivity {

    Spinner countrySpinner;
    ArrayAdapter<CharSequence> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_screen02);

        ImageButton imgBtnEmail = (ImageButton) findViewById(R.id.imgBtnEmail);
        ImageButton imgBtnPhone = (ImageButton) findViewById(R.id.imgBtnPhone);

        countrySpinner = (Spinner) findViewById(R.id.countrySpinner);
        adapter = ArrayAdapter.createFromResource(this, R.array.country_names, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        countrySpinner.setAdapter(adapter);

        countrySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                //Toast.makeText(SignUpScreen02.this, "Country is selected.", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        imgBtnEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent nextScreen01 = new Intent(SignUpScreen02.this, WelcomeToZeenMoi.class);
                startActivity(nextScreen01);

            }
        });

        imgBtnPhone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent nextScreen02 = new Intent(SignUpScreen02.this, WelcomeToZeenMoi.class);
                startActivity(nextScreen02);

            }
        });



    }
}
