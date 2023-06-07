/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de10Form;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

/**
 *
 * @author Admin
 */
public class ConnectMySql {
      public static  Connection conn=null;
    public static Connection getConnection(){
         try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3307/qls";
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
