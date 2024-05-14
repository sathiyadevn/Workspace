package com.dev43.spring.jdbcdemo.repo;

import com.dev43.spring.jdbcdemo.mdoel.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepo {
    private JdbcTemplate jdbcTemplate;      // Get database connectivity

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    @Autowired
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void save(User user){
        System.out.println("Added");
    }
    public List<User> findAll(){
        return new ArrayList<User>();
    }
}
