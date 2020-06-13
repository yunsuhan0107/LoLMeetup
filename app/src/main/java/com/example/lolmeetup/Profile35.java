package com.example.lolmeetup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Profile35 extends AppCompatActivity {

    private Button goback;
    private TextView main;
    private String link = "https://www.op.gg/summoner/userName=" + "T1 Unknown";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_35);

        main = findViewById(R.id.main35);
        main.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse(link);
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        goback = findViewById(R.id.back35);
        goback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Profile35.this, HomeActivity.class);
                startActivity(intent);
            }
        });
    }
}