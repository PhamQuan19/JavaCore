/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlsanpham;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Connect_DB {

    private Connection con;

    public Connect_DB() throws ClassNotFoundException,
            SQLException {
      //  Class.forName("com.mysql.cj.jdbc.Driver");//nap trinh dieu khien
       // this.con = DriverManager.getConnection("jdbc:mysql://localhost:3307/qlsp", "root", ""); //thuc hien ket noi
        //String url="jdbc:mysql://localhost:3307/thongtin1";
        
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url="jdbc:mysql://localhost:3307/qlsp";
        this.con=DriverManager.getConnection(url,"root","");
    
    }

    public ResultSet GetData(String tbName) throws SQLException {
        ResultSet kq = null;
        Statement statement = this.con.createStatement();
        String sql = "select * from " + tbName;
        kq = statement.executeQuery(sql);
        return kq;
    }

    public ResultSet GetData_TK(String ID) throws SQLException {
        ResultSet kq = null;
        Statement statement = this.con.createStatement();
        String sql = "SELECT * FROM `products` WHERE `ID`='" + ID + "'";
        kq = statement.executeQuery(sql);
        return kq;
    }

    public ResultSet Getdata_Sluong(int sl) throws SQLException {
        ResultSet kq = null;
        Statement statement = this.con.createStatement();

        String sql = "SELECT * FROM `products` WHERE Number <= " + sl + "";
        kq = statement.executeQuery(sql);
        return kq;
    } 
    public void Update(String id, String name, int number) throws SQLException {
        Statement sta = this.con.createStatement();
        String sql1 = "Update Products set Name='" + name + "' where ID = '" + id + "'";
        String sql2 = "Update Products set Number=" + number + " where ID = '" + id + "'";
        sta.executeUpdate(sql1);
        sta.executeUpdate(sql2);

    }

    public void Insert(String id, String name, int number) throws SQLException {

        Statement sta = this.con.createStatement();
        String sql1 = "Insert Products values('" + id + "','" + name + "'," + number + ")";
        sta.executeUpdate(sql1);
    }

    public void Delete(String id) throws SQLException {
        Statement sta = this.con.createStatement();
        String sql = "DELETE FROM `products` WHERE ID = '" + id + "'";
        sta.executeUpdate(sql);
    }

    public void Close() throws SQLException {
        if (this.con != null) {
            this.con.close();
        }
    }

    public static void main(String[] args) throws ClassNotFoundException,
            SQLException {
        // TODO code application logic here
        int dem = 0;
        try {
            Connect_DB pt = new Connect_DB();
            ResultSet rs = pt.GetData("Products");
           while(rs.next()) {
                    dem++;
                }
          
            pt.Close();
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Dangnhap.class.getName()).log(Level.SEVERE, null, ex);
        }
                System.out.println("------------------------");

        System.out.println(dem);

    }
}
