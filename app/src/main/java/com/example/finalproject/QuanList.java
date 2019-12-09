package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class QuanList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quanlist);
        // All of this is to make TextViews uneditable.
        TextView chlh421 = findViewById(R.id.chlh421);
        TextView atms120 = findViewById(R.id.atms120);
        TextView kin401 = findViewById(R.id.kin401);
        TextView cs105 = findViewById(R.id.cs105);
        TextView stat212 = findViewById(R.id.stat212);
        TextView stat200 = findViewById(R.id.stat200);
        TextView cs101 = findViewById(R.id.cs101);
        TextView cs125 = findViewById(R.id.cs125);
        TextView info102 = findViewById(R.id.info102);
        TextView soc380 = findViewById(R.id.soc380);

        chlh421.setKeyListener(null);
        atms120.setKeyListener(null);
        kin401.setKeyListener(null);
        cs105.setKeyListener(null);
        stat212.setKeyListener(null);
        stat200.setKeyListener(null);
        cs101.setKeyListener(null);
        cs125.setKeyListener(null);
        info102.setKeyListener(null);
        soc380.setKeyListener(null);

        call(chlh421);
        call(atms120);
        call(kin401);
        call(cs105);
        call(stat212);
        call(stat200);
        call(cs101);
        call(cs125);
        call(info102);
        call(soc380);
    }

    public void call(TextView name) {
        String a = name.getText().toString();
        String[] array = a.split(" ");
        Intent intent = new Intent(this, CourseInfo.class);
        intent.putExtra("subjectCode", array[0]);
        intent.putExtra("courseNumber", array[1].substring(0, 3));
        name.setOnClickListener(unused -> startActivity(intent));
    }
}
