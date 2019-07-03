package com.demotest.example.aop_example_one;

public class IStudentImpl implements IStudent{

    @Override
    public void addStudent(String name){
        System.out.println("Welcome, " + name + "!");
    }
}
