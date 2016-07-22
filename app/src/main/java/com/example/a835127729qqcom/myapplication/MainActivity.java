package com.example.a835127729qqcom.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.aoplib.DebugLog;
import com.example.testlib.TestClass;
import com.example.testlib.TestInterfaceClass;
import com.example.testlib.TestInterfaceMethodClass;
import com.example.testlib.TestInterfaceMethodSubClass;
import com.example.testlib.TestInterfaceSubClass;
import com.example.testlib.TestMain;
import com.example.testlib.TestMethodClass;
import com.example.testlib.TestMethodSubClass;
import com.example.testlib.TestSubClass;

public class MainActivity extends AppCompatActivity {

    @Override
    @DebugLog
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("ssssss");
        TestMain.TestAll();
    }
}
