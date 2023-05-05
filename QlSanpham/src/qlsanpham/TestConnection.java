/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package qlsanpham;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestConnection {

    private Connection con;

    public TestConnection() throws ClassNotFoundException,
            SQLException {
      //  Class.forName("com.mysql.cj.jdbc.Driver");//nap trinh dieu khien
        this.con= DriverManager.getConnection("jdbc:mysql://localhost:3306/qlsanpham", "root", ""); //thuc hien ket noi
    }

    public ResultSet GetData(String tbName) throws SQLException {
        ResultSet kq = null;
        Statement statement = this.con.createStatement();//tao doi tuong truy van 
        String sql = "select * from " + tbName;
        kq = statement.executeQuery(sql);//thuc thi truy van
        return kq;
    }

    public void Update(int id, String name, int number) throws
            SQLException {
        Statement sta = this.con.createStatement();
        String sql1 = "Update Products set Name='" + name + "' where ID = " + id + "";
        String sql2 = "Update Products set Number=" + number + " where ID = " + id + "";
        sta.executeUpdate(sql1);
        sta.executeUpdate(sql2);
    }

    public void Insert(String id, String username, String pass) throws SQLException {
        Statement sta = this.con.createStatement();
        String sql1 = "Insert user values('" + id + "','" + username + "'," + pass + ")";
                    //"Insert products values('" + id + "','" + name + "'," + number + ")";
        sta.executeUpdate(sql1);
    }

    public void Delete(int id) throws SQLException {
        Statement sta = this.con.createStatement();
        String sql = "delete Products where ID =" + id + "";
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
        TestConnection pt = new TestConnection();
        ResultSet rs = pt.GetData("user");
        while (rs.next()) {
            System.out.print(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3));
            System.out.println("");
        }
        pt.Close();
    }

}
