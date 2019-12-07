package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class EngActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eng);

        TextView comp = findViewById(R.id.comp);
        comp.setOnClickListener(unused -> startActivity(new Intent(this, ACList.class)));
        TextView hum = findViewById(R.id.hum);
        hum.setOnClickListener(unused -> startActivity(new Intent(this, HumList.class)));
        TextView soc = findViewById(R.id.soc);
        soc.setOnClickListener(unused -> startActivity(new Intent(this, SBSList.class)));
        TextView lib = findViewById(R.id.lib);
        // Uh idk what to do for this yet...
        TextView west = findViewById(R.id.west);
        west.setOnClickListener(unused -> startActivity(new Intent(this, WList.class)));
        TextView nonw = findViewById(R.id.nonw);
        nonw.setOnClickListener(unused -> startActivity(new Intent(this, NWList.class)));
        TextView us = findViewById(R.id.us);
        us.setOnClickListener(unused -> startActivity(new Intent(this, USMinList.class)));
    }
}
