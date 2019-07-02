package com.demotest.example.demoOne.domain;

import org.springframework.data.annotation.Id;

import javax.persistence.GeneratedValue;
import java.io.Serializable;

/**
 *  用户实体类
 *
 *  Create by jisheng on 02/07/2019
 */


public class User implements Serializable {


    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private Integer age;

    private String birthday;

    public User(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString(){
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                '}';
    }

}
