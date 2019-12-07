package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class NWList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nwlist);
        // All of this is to make TextViews uneditable.
        TextView cwl207 = findViewById(R.id.cwl207);
        TextView cpsc116 = findViewById(R.id.cpsc116);
        TextView cpsc131 = findViewById(R.id.cpsc131);
        TextView arab150 = findViewById(R.id.arab150);
        TextView cwl114 = findViewById(R.id.cwl114);
        TextView ling111 = findViewById(R.id.ling111);
        TextView rel110 = findViewById(R.id.rel110);
        TextView geog101 = findViewById(R.id.geog101);
        TextView ealc130 = findViewById(R.id.ealc130);
        TextView hist100 = findViewById(R.id.hist100);

        cwl207.setKeyListener(null);
        cpsc116.setKeyListener(null);
        cpsc131.setKeyListener(null);
        arab150.setKeyListener(null);
        cwl114.setKeyListener(null);
        ling111.setKeyListener(null);
        rel110.setKeyListener(null);
        geog101.setKeyListener(null);
        ealc130.setKeyListener(null);
        hist100.setKeyListener(null);
    }
}
