/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testcode;
//import java.sql.*;
//import com.mysql.cj.xdevapi.Statement;
import com.sun.jdi.connect.spi.Connection;
import database.JDBCConnection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Admin
 */
public class Test {
    public static void main(String[] args) throws SQLException   {
        //B1 Tao ket noi
        Connection conn=  JDBCConnection.getDBCConnection();
        //B2tao ra doi tuong statement
//        Statement st = 
        //B3
        String sql="INSERT INTO `person` (`last_name`, `first_name`, `gender`, `dob`, `income`)"
                + " VALUES ('Pham', 'Duc', 'Nam', '2023-08-05', '1500000')";
        //st.executeUpdate(sql);
        
        
        //B5 Ngat ket noi
        //JDBCConnection.closeConnection(conn);
    }
}
