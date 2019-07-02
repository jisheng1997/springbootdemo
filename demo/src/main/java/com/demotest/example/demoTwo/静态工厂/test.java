package com.demotest.example.demoTwo.静态工厂;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    public static void main(String[] args){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("xml_bean/静态工厂.xml");
        Being b1 = applicationContext.getBean("dog",Being.class);
        b1.testBeing();

        Being b2 = applicationContext.getBean("cat",Being.class);
        b2.testBeing();
    }
}
