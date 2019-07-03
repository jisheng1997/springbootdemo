package com.demotest.example.bean.实例工厂;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test{
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("xml/实例工厂.xml");

        System.out.println("==================Chinese==================");
        Person p1 = (Person)applicationContext.getBean("chinese");
        System.out.println(p1.sayHello("thw"));
        System.out.println(p1.sayGoodBye("thw"));

        System.out.println();

        System.out.println("==================American==================");
        Person p2 = (Person) applicationContext.getBean("american");
        System.out.println(p2.sayHello("thw"));
        System.out.println(p2.sayGoodBye("thw"));


    }
}
