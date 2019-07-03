package com.demotest.example.configuration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMain {

    public static void main(String [] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TestConfiguration.class);
        TestBean tb1 = (TestBean)context.getBean("testBean");
        tb1.sayHello();
        System.out.println(tb1);
        TestBean tb2 = (TestBean)context.getBean("testBean");
        tb2.sayHello();
        System.out.println(tb2);
    }

}
