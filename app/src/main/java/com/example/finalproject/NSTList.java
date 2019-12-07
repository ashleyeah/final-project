package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class NSTList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nstlist);
        // All of this is to make TextViews uneditable.
        TextView phys123 = findViewById(R.id.phys123);
        TextView chem105 = findViewById(R.id.chem105);
        TextView ansc110 = findViewById(R.id.ansc110);
        TextView atms120 = findViewById(R.id.atms120);
        TextView chem103 = findViewById(R.id.chem103);
        TextView ansc207 = findViewById(R.id.ansc207);
        TextView mcb170 = findViewById(R.id.mcb170);
        TextView cpsc113 = findViewById(R.id.cpsc113);
        TextView anth143 = findViewById(R.id.anth143);
        TextView fshn120 = findViewById(R.id.fshn120);

        phys123.setKeyListener(null);
        chem105.setKeyListener(null);
        ansc110.setKeyListener(null);
        atms120.setKeyListener(null);
        chem103.setKeyListener(null);
        ansc207.setKeyListener(null);
        mcb170.setKeyListener(null);
        cpsc113.setKeyListener(null);
        anth143.setKeyListener(null);
        fshn120.setKeyListener(null);
    }
}
