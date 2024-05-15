package com.dev43.spring.springmvcdemo;

import com.dev43.spring.springmvcdemo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Integer> {
}
