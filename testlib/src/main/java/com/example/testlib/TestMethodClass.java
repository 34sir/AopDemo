package com.example.testlib;

import com.example.aoplib.DebugLog;

/**
 * Created by 835127729qq.com on 16/7/22.
 */
public class TestMethodClass {
    public TestMethodClass(){
        new Thread(){
            @Override
            @DebugLog
            public void run() {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }.start();
    }

    @DebugLog
    public void spendTime1ms(){
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @DebugLog
    public static void spendTime2ms(){
        try {
            Thread.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @DebugLog
    public final void spendTime3ms(){
        try {
            Thread.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
