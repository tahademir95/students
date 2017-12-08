package com.taha.controller;

import java.io.Serializable;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "userData", eager = true)
@SessionScoped
public class StudentData implements Serializable {
    private static final long serialVersionUID = 1L;

    public List<StudentInfo> getStudents() {
        ResultSet rs = null;
        PreparedStatement pst = null;
        Connection con = getConnection();
        String stm = "Select * from students";
        List<StudentInfo> records = new ArrayList<StudentInfo>();

        try {
            pst = con.prepareStatement(stm);
            pst.execute();
            rs = pst.getResultSet();

            while(rs.next()) {
                StudentInfo student = new StudentInfo();
                student.setAd(rs.getString("Name"));
                student.setSoyad(rs.getString("Surname"));
                student.setGender(rs.getString("Gender"));
                student.setGpa(rs.getInt("GPA"));
                student.setPassword(rs.getString("Password"));


                records.add(student);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return records;
    }

    public Connection getConnection() {
        Connection con = null;
        String url = "jdbc:postgresql://localhost/postgres";
        String user = "USERNAME_FOR_DB";
        String password = "PASSWORD_FOR_DB";

        try {
            con = DriverManager.getConnection(url, user, password);
            System.out.println("Connection completed.");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        finally {
        }
        return con;
    }
}