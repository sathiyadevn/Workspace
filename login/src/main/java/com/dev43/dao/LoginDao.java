package com.dev43.dao;

import java.sql.*;

public class LoginDao {
    String url = "jdbc:mysql://localhost:3306/demo";
    String u_name = "root";
    String u_pass = "root";

    String sql = "select * from login where uname=? and pass=?";

    public boolean check(String name, String pass) throws ClassNotFoundException, SQLException {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, u_name, u_pass);

            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, name);
            st.setString(2, pass);

            ResultSet rs = st.executeQuery();
            if (rs.next())
                return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
