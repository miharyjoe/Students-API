package com.studentapi.studentapi.service;

import com.studentapi.studentapi.model.Students;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentsImplJdbc {
    public List<Students> findAll(){
        List<Students> results = new ArrayList<>();
        Connection db = null;
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            db = DriverManager.getConnection("jdbc:postgresql://localhost:5432/students", "postgres", "akira211212");
        } catch (SQLException e) {
            e.printStackTrace();
        }
     try {
         PreparedStatement pStm = db.getConnection().prepareStatememt( "SELECT * FROM Students");
         ResultSet res = pStm.executeQuery();

         while(res.next()){
             results.add(new Students(
                     res.getInt("id"),
                     res.getString("name"),
                     res.getString("groups_id")));
         }
     } catch (SQLException e) {
         throw new RuntimeException(e);
     }
     return results;
    }
}
