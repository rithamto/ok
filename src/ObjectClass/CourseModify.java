package ObjectClass;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import ObjectClass.Course;
import java.util.List;
import ConnectSql.Connectsql;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author TuyenPVT
 */
public class CourseModify {

    //Lay danh sach tat ca cac khoa hoc
    public static List<Course> findAll() {

        List<Course> allCourses = new ArrayList<>();
        Connection con = null;
        try {
            con = Connectsql.getCon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from dskhoahoc");

            while (rs.next()) {
                Course crs = new Course(rs.getString("idcourse"),
                        rs.getString("name"),
                        rs.getString("catelory"),
                        rs.getDouble("price"),
                        rs.getString("instructor"),
                        rs.getDouble("total_length"),
                        rs.getInt("lectures"),
                        rs.getInt("students"),
                        rs.getString("rate"));
                allCourses.add(crs);
            }
            System.out.println(allCourses);
        } catch (SQLException ex) {
            Logger.getLogger(CourseModify.class.getName()).log(Level.SEVERE, null, ex);
        }

        return allCourses;
    }

//    Them khoa hoc
    public static void insert(Course crs) {

        Connection con = null;
        PreparedStatement st;
        try {
            con = Connectsql.getCon();
            String insertCourse = "insert into dskhoahoc(idcourse,name,catelory,price,instructor,total_length,lectures,students,rate) values(?,?,?,?,?,?,?,?,?)";
            st = con.prepareCall(insertCourse);

            st.setString(0, crs.getIdCourse());
            st.setString(1, crs.getName());
            st.setString(2, crs.getCatelory());
            st.setDouble(3, crs.getPrice());
            st.setString(4, crs.getInstructor());
            st.setDouble(5, crs.getLength());
            st.setInt(6, crs.getLectures());
            st.setInt(7, 0);
            st.setString(8, "Chua co danh gia");
            st.execute();
        } catch (SQLException ex) {
            Logger.getLogger(CourseModify.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    
//    Cap nhat khoa hoc
    public static void update(Course crs) {

        Connection con = null;
        PreparedStatement st;
        try {
            con = Connectsql.getCon();
            String updateCourse = "update dskhoahoc set name=?, catelory=?, price=?, instructor=?, total_length=?, lectures=? where idcourse=?";
            st = con.prepareCall(updateCourse);

            st.setString(0, crs.getIdCourse());
            st.setString(1, crs.getName());
            st.setString(2, crs.getCatelory());
            st.setDouble(3, crs.getPrice());
            st.setString(4, crs.getInstructor());
            st.setDouble(5, crs.getLength());
            st.setInt(6, crs.getLectures());
            st.setInt(7, 0);
            st.setString(8, "Chua co danh gia");
            st.execute();
        } catch (SQLException ex) {
            Logger.getLogger(CourseModify.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    
//    Xoa khoa hoc
    public static void delete(Course crs) {

        Connection con = null;
        PreparedStatement st;
        try {
            con = Connectsql.getCon();
            String deleteCourse = "delete from dskhoahoc where idcourse=?";
            st = con.prepareCall(deleteCourse);

            st.setString(0, crs.getIdCourse());
            st.execute();
        } catch (SQLException ex) {
            Logger.getLogger(CourseModify.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
