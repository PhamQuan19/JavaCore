/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlmaytinh;
import java.sql.*;
/**
 *
 * @author Admin
 */
public class ConnectMySql {
    public static Connection conn=null;
    public static Connection getConnection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3307/qlmaytinh";
            conn=DriverManager.getConnection(url,"root","");
            if(conn!=null){
                System.out.println("Kết nối thành công!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
}
