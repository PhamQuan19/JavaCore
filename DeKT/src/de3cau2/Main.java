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
public class Main {
    public static void main(String[] args) throws SQLException {
        Connection conn= JDBCConnection.getDBCConnection();
        Statement statement =conn.createStatement();
        //insert
        String sql1="Insert Into sinhvien(ten, quequan) Values('Đức Anh','Hà Nội')";
        statement.executeUpdate(sql1);
        conn.close();

    }
}
