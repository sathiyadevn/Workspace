package com.dev43.spring.jdbcdemo.repo;

import com.dev43.spring.jdbcdemo.mdoel.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepo {
    public void save(User user){
        System.out.println("Added");
    }
    public List<User> findAll(){
        return new ArrayList<User>();
    }
}
