package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.finalproject.ui.main.MainFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, MainFragment.newInstance())
                    .commitNow();
        }
        Button las = findViewById(R.id.las);
        Button eng = findViewById(R.id.eng);
        Button bus = findViewById(R.id.bus);
        Button aces = findViewById(R.id.aces);
        Button faa = findViewById(R.id.faa);
        las.setOnClickListener(unused -> startActivity(new Intent(this, LasActivity.class)));
        eng.setOnClickListener(unused -> startActivity(new Intent(this, EngActivity.class)));
        bus.setOnClickListener(unused -> startActivity(new Intent(this, BusActivity.class)));
        aces.setOnClickListener(unused -> startActivity(new Intent(this, OtherActivity.class)));
        faa.setOnClickListener(unused -> startActivity(new Intent(this, OtherActivity.class)));


    }
}
