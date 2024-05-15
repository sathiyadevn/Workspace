package com.dev43.spring.springmvcdemo;

import com.dev43.spring.springmvcdemo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepo extends JpaRepository<User,Integer> {
//    List<User> findByNameOrderByIdDesc(String name);      // Query DSL

    @Query("from User where name = :uname order by id desc ")                 // Domain Specific Language
    List<User> find(@Param("uname") String name);
}
