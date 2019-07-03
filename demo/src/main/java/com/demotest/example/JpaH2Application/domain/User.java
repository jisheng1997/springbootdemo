package com.demotest.example.JpaH2Application.domain;

import org.springframework.data.annotation.Id;

import javax.persistence.GeneratedValue;


public class User {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String url;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
