/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ketnoimysql;

import com.mysql.cj.jdbc.Driver;
import com.sun.jdi.connect.spi.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class ConnectionMySQL {
    public static Connection getJDBCConnection(){
        String url="jdbc:mysql://localhost:3307/qlbv";
        String  user="root";
        String password="";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            //Class.forName("com.mysql.jdbc.Driver");
         //   Driver driver = new org.gjt.mm.mysql.Driver();
            try {
                return (Connection) DriverManager.getConnection(url,user,password);
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
     public static Connection getConnection() {
         String url="jdbc:mysql://localhost:3307/qlbv";
        String  user="root";
        String password="";
        Connection conn = null;
        try {
          //  Class.forName("com.mysql.jdbc.Driver");
            conn = (Connection) DriverManager.getConnection(url, user, password);
            System.out.println("connect successfully!");
        } catch (Exception ex) {
            System.out.println("connect failure!");
            ex.printStackTrace();
        }
        return conn;
    }
    public static void main(String[] args) {
        Connection conn =getConnection();
        if(conn!=null){
            System.out.println("Kết nối thành công");
        }else{
            System.out.println("Thất bại");
        }
    }
}
