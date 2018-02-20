package com.example.shussain.zeenmoi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class SetupWallet extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setup_wallet);

        ImageButton imgbtnWallet = (ImageButton) findViewById(R.id.imgbtnWallet);

        Button btnSkip = (Button) findViewById(R.id.btnSkip);

        imgbtnWallet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(SetupWallet.this, "Wallet setup is not available at the moment.", Toast.LENGTH_SHORT).show();
            }
        });

        btnSkip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent nextScreen = new Intent(SetupWallet.this, BookAptScreen01.class);

                startActivity(nextScreen);

            }
        });
    }
}
