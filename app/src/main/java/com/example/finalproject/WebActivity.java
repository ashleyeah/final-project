package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        WebView page = findViewById(R.id.page);
        page.getSettings().setDomStorageEnabled(true);
        page.loadUrl("https://waf.cs.illinois.edu/discovery/every_gen_ed_at_uiuc_by_gpa/");
    }
}
