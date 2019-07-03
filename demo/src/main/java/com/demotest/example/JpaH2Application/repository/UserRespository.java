package com.demotest.example.JpaH2Application.repository;

import com.demotest.example.JpaH2Application.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRespository extends JpaRepository<User,Long> {

}
