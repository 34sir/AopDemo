package com.example.a835127729qqcom.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
@DebugLog
public class MainActivity extends AppCompatActivity {

    @Override
    @DebugLog
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("ssssss");
    }
}
