package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class LasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_las);
        TextView comp = findViewById(R.id.comp);
        comp.setOnClickListener(unused -> startActivity(new Intent(this, OtherActivity.class)));
    }
}
