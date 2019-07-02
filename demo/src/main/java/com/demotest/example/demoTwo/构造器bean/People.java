package com.demotest.example.demoTwo.构造器bean;

public class People {

    private String name;
    private int age;
    private String sex;

    //
    public People(String name,int age,String sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public void print(){
        System.out.println("name: " + name);
        System.out.println("age: " + age);
        System.out.println("sex: " + sex);
    }

}
