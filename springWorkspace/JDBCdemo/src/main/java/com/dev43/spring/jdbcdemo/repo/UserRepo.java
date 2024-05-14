package com.dev43.spring.jdbcdemo.repo;

import com.dev43.spring.jdbcdemo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
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

    public void save(User user) {
        System.out.println("Added");
        String sql = "insert into userTable(id,name,tech) values ( ?,?,? )";
        int rows = jdbcTemplate.update(sql, user.getId(), user.getName(), user.getTech());
        System.out.println(rows + " row/s affected");
    }

    public List<User> findAll() {
        String sql = "select * from userTable";

        RowMapper<User> mapper = new RowMapper<User>() {
            @Override
            public User mapRow(ResultSet rs, int rowNum) throws SQLException {
                User u = new User();
                u.setId(rs.getInt(1));
                u.setName(rs.getString(2));
                u.setTech(rs.getString(3));
                return u;
            }
        };

        List<User> users = jdbcTemplate.query(sql, mapper);
        return users;
    }
}
