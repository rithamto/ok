package ObjectClass;

import ConnectSql.Connectsql;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TuyenPVT
 */
public class StudentModify {
        public static List<Student> findAll() {

        List<Student>  Students = new ArrayList<>();
        Connection con = null;
        try {
            con = Connectsql.getCon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from students");

            while (rs.next()) {
                Student std = new Student(rs.getString("idstudents"),
                        rs.getString("email"),
                        rs.getString("password"),
                        rs.getString("firstname"),
                        rs.getString("lastname"),
                        rs.getString("address"),
                        rs.getString("idcourse") );
                      
                Students.add(std);
            }
            System.out.println(Students);
        } catch (SQLException ex) {
            Logger.getLogger(CourseModify.class.getName()).log(Level.SEVERE, null, ex);
        }

        return Students;
    }

//    Them khoa hoc
    public static void insert(Student std) {

        Connection con = null;
        PreparedStatement st;
        try {
            con = Connectsql.getCon();
            String insertStudent = "insert into dskhoahoc(idstudents,email,password,firstname,lastname,address,idcourse) values(?,?,?,?,?,?,?)";
            st = con.prepareCall(insertStudent);

            st.setString(0, std.getIdCourse());
            st.setString(1, std.getEmail());
            st.setString(2, std.getPassWord());
            st.setString(3, std.getFirstName());
            st.setString(4, std.getLastName());
            st.setString(5, std.getAddress());
            st.setString(6, std.getIdCourse());
          
            st.execute();
        } catch (SQLException ex) {
            Logger.getLogger(CourseModify.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    
//    Cap nhat khoa hoc
    public static void update(Student std) {

        Connection con = null;
        PreparedStatement st;
        try {
            con = Connectsql.getCon();
            String updateStudent = "update dskhoahoc set name=?, catelory=?, price=?, instructor=?, total_length=?, lectures=? where idcourse=?";
            st = con.prepareCall(updateStudent);
//
//            st.setString(0, std.getIdCourse());
//            st.setString(1, crs.getName());
//            st.setString(2, crs.getCatelory());
//            st.setString(3, crs.getPrice());
//            st.setString(4, crs.getInstructor());
//            st.setString(5, crs.getLength());
//            st.setString(6, crs.getLectures());
           
            st.execute();
        } catch (SQLException ex) {
            Logger.getLogger(CourseModify.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    
//    Xoa khoa hoc
    public static void delete(Student std) {

        Connection con = null;
        PreparedStatement st;
        try {
            con = Connectsql.getCon();
            String insertCourse = "delete from students where idcourse=?";
            st = con.prepareCall(insertCourse);

            st.setString(0, std.getIdCourse());
            st.execute();
        } catch (SQLException ex) {
            Logger.getLogger(CourseModify.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
