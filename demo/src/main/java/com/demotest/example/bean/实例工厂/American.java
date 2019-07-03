package com.demotest.example.bean.实例工厂;

public class American implements Person {
    @Override
    public String sayHello(String name){
        return name + ",Hello！";
    }

    @Override
    public String sayGoodBye(String name){
        return name + ",Good Bye!";
    }
}
