package com.example.testlib;

/**
 * Created by 835127729qq.com on 16/7/22.
 */
public class TestMain {
    public static void TestAll(){
        //注解在类上,每个方法都打印成功
        TestClass testClass = new TestClass();
        testClass.spendTimeNms(1);
        testClass.spendTimeNms2(2);
        testClass.spendTimeNms3(3);

        //注解在方法上,static方法也可以成功
        TestMethodClass testMethodClass = new TestMethodClass();
        testMethodClass.spendTime1ms();
        TestMethodClass.spendTime2ms();
        testMethodClass.spendTime3ms();

        //注解在类上,子类继承,成功,但是无法识别出是子类
        TestSubClass testSubClass = new TestSubClass();
        testSubClass.spendTimeNms(30);

        //注解在方法上,子类继承普通方法和静态方法,成功,但是无法识别出是子类
        TestMethodSubClass testMethodSubClass = new TestMethodSubClass();
        testMethodClass.spendTime1ms();
        TestMethodSubClass.spendTime2ms();

        //注解在接口上,子类实现,失败
        TestInterfaceSubClass testInterfaceSubClass = new TestInterfaceSubClass();
        testInterfaceSubClass.spendTimeNms(12);
        TestInterfaceClass testInterfaceClass = new TestInterfaceSubClass();
        testInterfaceClass.spendTimeNms(13);

        //注解在接口方法上,子类实现,失败
        TestInterfaceMethodSubClass testInterfaceMethodSubClass = new TestInterfaceMethodSubClass();
        testInterfaceMethodSubClass.spendTimeNms(14);
        TestInterfaceMethodClass testInterfaceMethodClass = new TestInterfaceMethodSubClass();
        testInterfaceMethodClass.spendTimeNms(15);
    }
}
