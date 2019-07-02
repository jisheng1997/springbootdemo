package com.demotest.example.demoOne.service.impl;

import com.demotest.example.demoOne.domain.User;
import com.demotest.example.demoOne.domain.UserRepository;
import com.demotest.example.demoOne.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserServiceImpl implements UserService {


    @Autowired
    UserRepository userRepository;

    @Override
    public List<User> findAll(){

        return userRepository.findAll();
    }

    @Override
    public User insertByUser(User user){
        System.out.println("新增用户：" + user.toString());
        return userRepository.save(user);
    }

    @Override
    public User update(User user){
        System.out.println("更新用户：" + user.toString());
        return userRepository.save(user);
    }

    @Override
    public User delete(Long id){
        User user = userRepository.findById(id).get();
        userRepository.delete(user);
        System.out.println("删除用户：" + user.toString());
        return user;
    }

    @Override
    public User findById(Long id){
        System.out.println("获取用户ID: " + id);
        return userRepository.findById(id).get();
    }
}
