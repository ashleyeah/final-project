package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class USMinList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usminlist);
        // All of this is to make TextViews uneditable.
        TextView socw297 = findViewById(R.id.socw297);
        TextView educ201 = findViewById(R.id.educ201);
        TextView shs222 = findViewById(R.id.shs222);
        TextView hist104 = findViewById(R.id.hist104);
        TextView ais101 = findViewById(R.id.ais101);
        TextView socw300 = findViewById(R.id.socw300);
        TextView epsy202 = findViewById(R.id.epsy202);
        TextView aas100 = findViewById(R.id.aas100);
        TextView soc225 = findViewById(R.id.soc225);
        TextView lls100 = findViewById(R.id.lls100);

        socw297.setKeyListener(null);
        educ201.setKeyListener(null);
        shs222.setKeyListener(null);
        hist104.setKeyListener(null);
        ais101.setKeyListener(null);
        socw300.setKeyListener(null);
        epsy202.setKeyListener(null);
        aas100.setKeyListener(null);
        soc225.setKeyListener(null);
        lls100.setKeyListener(null);

        call(socw297);
        call(educ201);
        call(shs222);
        call(hist104);
        call(ais101);
        call(socw300);
        call(epsy202);
        call(aas100);
        call(soc225);
        call(lls100);

        TextView credit = findViewById(R.id.credit7);
        credit.setOnClickListener(unused -> startActivity(new Intent(this, WebActivity.class)));
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

