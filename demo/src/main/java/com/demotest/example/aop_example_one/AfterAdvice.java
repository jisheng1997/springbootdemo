package com.demotest.example.aop_example_one;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class AfterAdvice implements AfterReturningAdvice {

    public void afterReturning(Object returnValue ,Method method, Object[] args,Object target) throws Throwable{
        System.out.println("这是AfterAdvice类的after方法.");
    }

}
