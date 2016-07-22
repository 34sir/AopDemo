package com.example.a835127729qqcom.myapplication;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

import java.util.concurrent.TimeUnit;

/**
 * Created by 835127729qq.com on 16/7/20.
 */
@Aspect
public class Hugo {
    @Pointcut("within(@com.example.a835127729qqcom.myapplication.DebugLog *)")
    public void withinAnnotatedClass() {}

    @Pointcut("execution(!synthetic * *(..)) && withinAnnotatedClass()")
    public void methodInsideAnnotatedType() {}

    @Pointcut("execution(!synthetic *.new(..)) && withinAnnotatedClass()")
    public void constructorInsideAnnotatedType() {}

    @Pointcut("execution(@com.example.a835127729qqcom.myapplication.DebugLog * *(..)) || methodInsideAnnotatedType()")
    public void method() {}

    @Pointcut("execution(@com.example.a835127729qqcom.myapplication.DebugLog *.new(..)) || constructorInsideAnnotatedType()")
    public void constructor() {}

    @Around("method() || constructor()")
    public Object logAndExecute(ProceedingJoinPoint joinPoint) throws Throwable {
        long startNanos = System.nanoTime();
        Object result = joinPoint.proceed();
        long stopNanos = System.nanoTime();
        long lengthMillis = TimeUnit.NANOSECONDS.toMillis(stopNanos - startNanos);

        System.out.println("时间为"+lengthMillis);

        return result;
    }
}
