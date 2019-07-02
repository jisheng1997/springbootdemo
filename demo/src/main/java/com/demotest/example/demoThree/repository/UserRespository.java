package com.demotest.example.demoThree.repository;

import com.demotest.example.demoThree.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRespository extends JpaRepository<User,Long> {

}
