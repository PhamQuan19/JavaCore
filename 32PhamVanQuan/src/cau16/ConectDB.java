/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cau16;
import java.sql.*;
/**
 *
 * @author Admin
 */
public class ConectDB {
    public static Connection conn=null;

    public ConectDB() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url="jdbc:mysql://localhost:3307/thongtin";
        this.conn=DriverManager.getConnection(url,"root","");
    }
    
    public static Connection getConnection(){
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3307/thongtin";
            conn=DriverManager.getConnection(url,"root","");
            if(conn!=null){
                System.out.println("Ket noi thanh cong!");
            }
        }catch(Exception ex){
            System.out.println(ex.toString());
        }
        return conn;
    }
}
