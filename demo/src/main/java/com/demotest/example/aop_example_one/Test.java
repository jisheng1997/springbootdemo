package com.demotest.example.aop_example_one;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("xml/aop_example_one.xml");
        IStudent student = (IStudent)ctx.getBean("student" );
        student.addStudent("dragon");
        student.addStudent("long");
    }
}
