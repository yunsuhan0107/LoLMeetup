package com.example.lolmeetup;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ListAdapter;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;

public class HomeActivity extends AppCompatActivity {


    private CheckBox profile1, profile2, profile3, profile4, profile5, profile6, profile7, profile8, profile9, profile10,
            profile11, profile12, profile13, profile14, profile15, profile16, profile17, profile18, profile19, profile20,
            profile21, profile22, profile23, profile24, profile25, profile26, profile27, profile28, profile29, profile30,
            profile31, profile32, profile33, profile34, profile35, profile36, profile37, profile38, profile39, profile40,
            profile41, profile42, profile43, profile44, profile45, profile46;
    private Button choose;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        profile1= findViewById(R.id.profile1);
        profile2= findViewById(R.id.profile2);
        profile3= findViewById(R.id.profile3);
        profile4= findViewById(R.id.profile4);
        profile5= findViewById(R.id.profile5);
        profile6= findViewById(R.id.profile6);
        profile7= findViewById(R.id.profile7);
        profile8= findViewById(R.id.profile8);
        profile9= findViewById(R.id.profile9);
        profile10= findViewById(R.id.profile10);
        profile11= findViewById(R.id.profile11);
        profile12= findViewById(R.id.profile12);
        profile13= findViewById(R.id.profile13);
        profile14= findViewById(R.id.profile14);
        profile15= findViewById(R.id.profile15);
        profile16= findViewById(R.id.profile16);
        profile17= findViewById(R.id.profile17);
        profile18= findViewById(R.id.profile18);
        profile19= findViewById(R.id.profile19);
        profile20= findViewById(R.id.profile20);
        profile21= findViewById(R.id.profile21);
        profile22= findViewById(R.id.profile22);
        profile23= findViewById(R.id.profile23);
        profile24= findViewById(R.id.profile24);
        profile25= findViewById(R.id.profile25);
        profile26= findViewById(R.id.profile26);
        profile27= findViewById(R.id.profile27);
        profile28= findViewById(R.id.profile28);
        profile29= findViewById(R.id.profile29);
        profile30= findViewById(R.id.profile30);
        profile31= findViewById(R.id.profile31);
        profile32= findViewById(R.id.profile32);
        profile33= findViewById(R.id.profile33);
        profile34= findViewById(R.id.profile34);
        profile35= findViewById(R.id.profile35);
        profile36= findViewById(R.id.profile36);
        profile37= findViewById(R.id.profile37);
        profile38= findViewById(R.id.profile38);
        profile39= findViewById(R.id.profile39);
        profile40= findViewById(R.id.profile40);
        profile41= findViewById(R.id.profile41);
        profile42= findViewById(R.id.profile42);
        profile43= findViewById(R.id.profile43);
        profile44= findViewById(R.id.profile44);
        profile45= findViewById(R.id.profile45);
        profile46= findViewById(R.id.profile46);
        profile1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, Profile1.class);
                startActivity(intent);
            }
        });

        profile2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, Profile2.class);
                startActivity(intent);
            }
        });
        profile3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, Profile3.class);
                startActivity(intent);
            }
        });
        profile4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, Profile4.class);
                startActivity(intent);
            }
        });
        profile5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, Profile5.class);
                startActivity(intent);
            }
        });
        profile6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, Profile6.class);
                startActivity(intent);
            }
        });
        profile7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, Profile7.class);
                startActivity(intent);
            }
        });
        profile8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, Profile8.class);
                startActivity(intent);
            }
        });
        profile9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, Profile9.class);
                startActivity(intent);
            }
        });
        profile10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, Profile10.class);
                startActivity(intent);
            }
        });
        profile11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, Profile11.class);
                startActivity(intent);
            }
        });
        profile12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, Profile12.class);
                startActivity(intent);
            }
        });
        profile13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, Profile13.class);
                startActivity(intent);
            }
        });
        profile14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, Profile14.class);
                startActivity(intent);
            }
        });
        profile15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, Profile15.class);
                startActivity(intent);
            }
        });
        profile16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, Profile16.class);
                startActivity(intent);
            }
        });
        profile17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, Profile17.class);
                startActivity(intent);
            }
        });
        profile18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, Profile18.class);
                startActivity(intent);
            }
        });
        profile19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, Profile19.class);
                startActivity(intent);
            }
        });
        profile20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, Profile20.class);
                startActivity(intent);
            }
        });
        profile21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, Profile21.class);
                startActivity(intent);
            }
        });
        profile22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, Profile22.class);
                startActivity(intent);
            }
        });
        profile23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, Profile23.class);
                startActivity(intent);
            }
        });
        profile24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, Profile24.class);
                startActivity(intent);
            }
        });
        profile25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, Profile25.class);
                startActivity(intent);
            }
        });
        profile26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, Profile26.class);
                startActivity(intent);
            }
        });
        profile27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, Profile27.class);
                startActivity(intent);
            }
        });
        profile28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, Profile28.class);
                startActivity(intent);
            }
        });
        profile29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, Profile29.class);
                startActivity(intent);
            }
        });
        profile30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, Profile30.class);
                startActivity(intent);
            }
        });
        profile31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, Profile31.class);
                startActivity(intent);
            }
        });
        profile32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, Profile32.class);
                startActivity(intent);
            }
        });
        profile33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, Profile33.class);
                startActivity(intent);
            }
        });
        profile34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, Profile34.class);
                startActivity(intent);
            }
        });
        profile35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, Profile35.class);
                startActivity(intent);
            }
        });
        profile36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, Profile36.class);
                startActivity(intent);
            }
        });
        profile37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, Profile37.class);
                startActivity(intent);
            }
        });
        profile38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, Profile38.class);
                startActivity(intent);
            }
        });
        profile39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, Profile39.class);
                startActivity(intent);
            }
        });
        profile40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, Profile40.class);
                startActivity(intent);
            }
        });
        profile41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, Profile41.class);
                startActivity(intent);
            }
        });
        profile42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, Profile42.class);
                startActivity(intent);
            }
        });
        profile43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, Profile43.class);
                startActivity(intent);
            }
        });
        profile44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, Profile44.class);
                startActivity(intent);
            }
        });
        profile45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, Profile45.class);
                startActivity(intent);
            }
        });
        profile46.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, Profile46.class);
                startActivity(intent);
            }
        });


    }
}