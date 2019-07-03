package com.demotest.example.configuration;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = "com.demotest.example.configuration")
public class TestConfiguration {

    public TestConfiguration(){
        System.out.println("TestConfiguration容器启动初始化.");
    }

    @Bean(name="testBean",initMethod="start",destroyMethod="cleanUp")
    @Scope("prototype")
    public TestBean testBean(){
        return new TestBean();
    }

}
