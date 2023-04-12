/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testconnection;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Admin
 */
public class ConnectToXampp {
    private String url="jdbc:mysql://localhost:3307/thongtin";
    private String  user="root";
    private String password="";
    
    public  ConnectToXampp(){
        Connection conn=null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url,user, password);
            if(conn != null){
                System.out.println("Success");
                 System.out.println(conn.getCatalog());
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        
    }
    public static void main(String[] args) {
//        String url="jdbc:mysql://localhost:3307/qlbv";
//        String  user="root";
//        String password="";
//        try(Connection conn =DriverManager.getConnection(url,user,password)){
//            System.out.println("Done");
//            System.out.println(conn.getCatalog());
//        } catch (SQLException ex) {
//            Logger.getLogger(ConnectToXampp.class.getName()).log(Level.SEVERE, null, ex);
//        }

        ConnectToXampp conn=new ConnectToXampp();

    }
    
}
