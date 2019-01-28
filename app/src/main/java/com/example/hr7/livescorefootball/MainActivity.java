package com.example.hr7.livescorefootball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    WebView wv1;
    WebSettings ws1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wv1 = (WebView)findViewById(R.id.wv1);
        ws1 = wv1.getSettings();

        wv1.setWebViewClient(new WebViewClient());
        wv1.loadUrl("https://www.bola.net/jadwal_skor/score.html");
    }
}
