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
public class KetNoi {
    private Connection conn;
    public KetNoi() throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url="jdbc:mysql://localhost:3307/thongtin";
        this.conn=DriverManager.getConnection(url,"root","");
    }
    
     public ResultSet GetData(String sql) throws SQLException{
        ResultSet res=null;
        Statement st=conn.createStatement();
        res=st.executeQuery(sql);
        return res;
    }
}
