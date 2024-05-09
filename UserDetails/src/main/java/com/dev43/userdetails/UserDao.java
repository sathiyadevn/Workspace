package com.dev43.userdetails;

import java.sql.*;

public class UserDao {
    public User getUser(int uid){

        User user=new User();
//        user.setUid(1);       // static values
//        user.setName("dev");
//        user.setTech("Java");
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/sathiyadevn","root","root");
            PreparedStatement st=con.prepareStatement("select * from UserDetails where id="+uid);
            ResultSet rs=st.executeQuery();
            if(rs.next()){
                user.setUid(rs.getInt("id"));
                user.setName(rs.getString("name"));
                user.setTech(rs.getString("tech"));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return user;
    }
}
