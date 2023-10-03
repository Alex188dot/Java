package com.example.demo.controller;

import java.sql.*;

public class DBConnection {

   public static void main(String[] args) {
           try {
               Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:8889/javaDB", "root", "root");
               Statement st = conn.createStatement();
               ResultSet rs = st.executeQuery("SELECT * FROM users");

               while (rs.next()) {
                   System.out.println(rs.getString("name"));
                   System.out.println(rs.getString("lastname"));
                   System.out.println("-----------------");
               }

               rs.close();
               st.close();
               conn.close();
           } catch (SQLException e) {
               e.printStackTrace();

       }
   }
}