package com.example.testlib;

/**
 * Created by 835127729qq.com on 16/7/22.
 */
public class TestInterfaceMethodSubClass implements TestInterfaceMethodClass{
    @Override
    public void spendTimeNms(int n) {
        try {
            Thread.sleep(n);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
