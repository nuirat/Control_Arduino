package com.droiduino.bluetoothconn;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class camera extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);
        WebView myWebView = (WebView) findViewById(R.id.webview);
        myWebView.loadUrl("http://172.20.10.4");
    }
}