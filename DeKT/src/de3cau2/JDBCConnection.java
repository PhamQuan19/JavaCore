/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de3cau2;
import java.sql.*;
/**
 *
 * @author Admin
 */
public class JDBCConnection {
      private static String url="jdbc:mysql://localhost:3307/testconn";
    private static String  user="root";
    private static String password="";
    Connection conn=null;
    
    public static Connection getDBCConnection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(url,user,password);
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }

    }
    
//     public  JDBCConnection(){
//        Connection conn=null;
//        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            conn = DriverManager.getConnection(url,user, password);
//            if(conn != null){
//                System.out.println("Success");
//                 System.out.println(conn.getCatalog());
//            }
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        } catch (ClassNotFoundException e) {
//            throw new RuntimeException(e);
//        }
//        
//    }
   
}
