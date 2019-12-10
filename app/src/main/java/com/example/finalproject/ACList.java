package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.TextView;

public class ACList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aclist);
        // All of this is to make TextViews uneditable.
        TextView ansc205 = findViewById(R.id.ansc205);
        TextView me470 = findViewById(R.id.me470);
        TextView educ202 = findViewById(R.id.educ202);
        TextView phys280 = findViewById(R.id.phys280);
        TextView ece316 = findViewById(R.id.ece316);
        TextView ae443 = findViewById(R.id.ae443);
        TextView shs270 = findViewById(R.id.shs270);
        TextView aged230 = findViewById(R.id.aged230);
        TextView chlh304 = findViewById(R.id.chlh304);
        TextView btw250 = findViewById(R.id.btw250);

        ansc205.setKeyListener(null);
        me470.setKeyListener(null);
        educ202.setKeyListener(null);
        phys280.setKeyListener(null);
        ece316.setKeyListener(null);
        ae443.setKeyListener(null);
        shs270.setKeyListener(null);
        aged230.setKeyListener(null);
        chlh304.setKeyListener(null);
        btw250.setKeyListener(null);

        // Calls intent for each class
        call(ansc205);
        call(me470);
        call(educ202);
        call(phys280);
        call(ece316);
        call(ae443);
        call(shs270);
        call(aged230);
        call(chlh304);
        call(btw250);

        TextView credit = findViewById(R.id.credit);
        credit.setOnClickListener(unused -> startActivity(new Intent(this, WebActivity.class)));
    }

    // Used to set the subject code and course number based off the specific course
    // and then call the intent
    public void call(TextView name) {
        String a = name.getText().toString();
        String[] array = a.split(" ");
        Intent intent = new Intent(this, CourseInfo.class);
        intent.putExtra("subjectCode", array[0]);
        intent.putExtra("courseNumber", array[1].substring(0, 3));
        name.setOnClickListener(unused -> startActivity(intent));
    }
}

