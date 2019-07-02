package com.demotest.example.demoTwo.实例工厂;

public class PersonFactory {

    public Person getPerson(String ethnic) {
        if (ethnic.equalsIgnoreCase("chin")) {
            return new Chinese();
        } else {
            return new American();
        }
    }
}
