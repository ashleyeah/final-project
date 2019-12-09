package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SBSList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sbslist);
        // All of this is to make TextViews uneditable.
        TextView socw297 = findViewById(R.id.socw297);
        TextView epsy201 = findViewById(R.id.epsy201);
        TextView hdfs105 = findViewById(R.id.hdfs105);
        TextView shs222 = findViewById(R.id.shs222);
        TextView sped322 = findViewById(R.id.sped322);
        TextView ansc305 = findViewById(R.id.ansc305);
        TextView shs271 = findViewById(R.id.shs271);
        TextView anth209 = findViewById(R.id.anth209);
        TextView shs120 = findViewById(R.id.shs120);
        TextView kin249 = findViewById(R.id.kin249);

        socw297.setKeyListener(null);
        epsy201.setKeyListener(null);
        hdfs105.setKeyListener(null);
        shs222.setKeyListener(null);
        sped322.setKeyListener(null);
        ansc305.setKeyListener(null);
        shs271.setKeyListener(null);
        anth209.setKeyListener(null);
        shs120.setKeyListener(null);
        kin249.setKeyListener(null);

        call(socw297);
        call(epsy201);
        call(hdfs105);
        call(shs222);
        call(sped322);
        call(ansc305);
        call(shs271);
        call(anth209);
        call(shs120);
        call(kin249);
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
