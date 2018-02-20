package com.example.shussain.zeenmoi;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class BeautyCardScreen02 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beauty_card_screen02);


        final Button btnVLong = (Button) findViewById(R.id.btnVLong);
        final Button btnLong = (Button) findViewById(R.id.btnLong);
        final Button btnBitLong = (Button) findViewById(R.id.btnBitLong);
        final Button btnShort = (Button) findViewById(R.id.btnShort);
        final Button btnVShort = (Button) findViewById(R.id.btnVShort);


        final Button btnGel = (Button) findViewById(R.id.btnGel);
        final Button btnArtiNail = (Button) findViewById(R.id.btnArtiNail);
        final Button btnNailArt = (Button) findViewById(R.id.btnNailArt);
        final Button btnFrenchM = (Button) findViewById(R.id.btnFrenchM);
        final Button btnPadicure = (Button) findViewById(R.id.btnPadicure);
        final Button btnClassic = (Button) findViewById(R.id.btnClassic);

        Button btnNextToWallet = (Button) findViewById(R.id.btnNextToWallet);

        btnNextToWallet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent walletScreen = new Intent(BeautyCardScreen02.this, SetupWallet.class);
                startActivity(walletScreen);
            }
        });

        btnVLong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnVLong.setBackgroundColor(Color.GRAY);
            }
        });

        btnLong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnLong.setBackgroundColor(Color.GRAY);
            }
        });
        btnBitLong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnBitLong.setBackgroundColor(Color.GRAY);
            }
        });
        btnShort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnShort.setBackgroundColor(Color.GRAY);
            }
        });
        btnVShort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnVShort.setBackgroundColor(Color.GRAY);
            }
        });
        btnGel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnGel.setBackgroundColor(Color.GRAY);
            }
        });
        btnArtiNail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnArtiNail.setBackgroundColor(Color.GRAY);
            }
        });
        btnNailArt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnNailArt.setBackgroundColor(Color.GRAY);
            }
        });
        btnFrenchM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnFrenchM.setBackgroundColor(Color.GRAY);
            }
        });
        btnPadicure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnPadicure.setBackgroundColor(Color.GRAY);
            }
        });
        btnClassic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnClassic.setBackgroundColor(Color.GRAY);
            }
        });



    }
}
