package com.example.lolmeetup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Profile4 extends AppCompatActivity {

    private Button goback;
    private TextView main;
    private TextView second;
    private String link1 = "https://www.op.gg/summoner/userName=" + "Kazekage";
    private String link2 = "https://www.op.gg/summoner/userName=" + "DUMAcia";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_4);

        main = findViewById(R.id.main4);
        main.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse(link1);
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        second = findViewById(R.id.second4);
        second.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse(link2);
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });


        goback = findViewById(R.id.back4);
        goback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Profile4.this, HomeActivity.class);
                startActivity(intent);
            }
        });
    }
}