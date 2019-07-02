package com.demotest.demo.service;

import com.demotest.demo.domain.User;

import java.util.List;

/**
 * User 业务层接口
 *
 * created by jisheng on 02/07/2019
 */

public interface UserService {

    List<User> findAll();

    User insertByUser(User user);

    User update(User user);

    User delete(Long id);

    User findById(Long id);
}
