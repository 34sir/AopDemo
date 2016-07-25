package com.example.libinlib;

import android.util.Log;

import com.example.aoplib.DebugLog;

/**
 * Created by 835127729qq.com on 16/7/25.
 */
public class TestLog {
    @DebugLog
    public void doSomeThing(){
        Log.d("testlog","this is testlog");
    }
}
