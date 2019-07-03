package com.demotest.example.bean.构造器bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("xml/构造器bean.xml");
        People people = (People)applicationContext.getBean("people");
        people.print();
    }

}
