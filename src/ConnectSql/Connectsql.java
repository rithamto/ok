/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConnectSql;
import java.sql.*;
/**
 *
 * @author TuyenPVT
 */
public class Connectsql {
    public static Connection getCon() throws SQLException {
        String className = "com.mysql.cj.jdbc.Driver";
        try {
            Class.forName(className);
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/khoahoc","root","16082001");
            System.out.println("Thanh cong");
            return con;
        } catch (ClassNotFoundException ex) {
             System.out.println("That bai");
            System.out.println(ex.getMessage());
            return null;
        }
    }
      
}
