package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class HumList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_humlist);

        // All of this is to make TextViews uneditable.
        TextView cwl207 = findViewById(R.id.cwl207);
        TextView faa220 = findViewById(R.id.faa220);
        TextView art105 = findViewById(R.id.art105);
        TextView sped117 = findViewById(R.id.sped117);
        TextView danc100 = findViewById(R.id.danc100);
        TextView educ202 = findViewById(R.id.educ202);
        TextView thea110 = findViewById(R.id.thea110);
        TextView ece316 = findViewById(R.id.ece316);
        TextView art310 = findViewById(R.id.art310);
        TextView fr156 = findViewById(R.id.fr156);

        cwl207.setKeyListener(null);
        faa220.setKeyListener(null);
        art105.setKeyListener(null);
        sped117.setKeyListener(null);
        danc100.setKeyListener(null);
        educ202.setKeyListener(null);
        thea110.setKeyListener(null);
        ece316.setKeyListener(null);
        art310.setKeyListener(null);
        fr156.setKeyListener(null);

        call(cwl207);
        call(faa220);
        call(art105);
        call(sped117);
        call(danc100);
        call(educ202);
        call(thea110);
        call(ece316);
        call(art310);
        call(fr156);

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
