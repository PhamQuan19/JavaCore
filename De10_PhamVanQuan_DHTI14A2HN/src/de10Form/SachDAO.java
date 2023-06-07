/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de10Form;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Admin
 */
public class SachDAO {
    Connection conn=null;
    PreparedStatement stm=null;
    public int Add(Sach sach){
        try {
            String sql="INSERT INTO sach(masach,tensach,tacgia,gia)VALUES(?,?,?,?)";
            conn=ConnectMySql.getConnection();
            stm=conn.prepareStatement(sql);
            stm.setInt(1,sach.getMaSach());
            stm.setString(2,sach.getTenSach());
            stm.setString(3,sach.getTacGia());
            stm.setFloat(4,sach.getGiaTien());
            if(stm.executeUpdate()>0){
                System.out.println("Thêm thành công!");
                return 1;
            }
        } catch (Exception e) {
            System.out.println("Error"+e.toString());
        }
        
        return -1;
    }
    
     public int Update(Sach sach){
        try {
            String sql="Update sach set tensach=?,tacgia=?,gia=? where masach=? ";
            conn=ConnectMySql.getConnection();
            stm=conn.prepareStatement(sql);
            stm.setInt(4,sach.getMaSach());
            stm.setString(1,sach.getTenSach());
            stm.setString(2,sach.getTacGia());
            stm.setFloat(3,sach.getGiaTien());
            if(stm.executeUpdate()>0){
                System.out.println("Update thành công!");
                return 1;
            }
        } catch (Exception e) {
            System.out.println("Error"+e.toString());
        }
        
        return -1;
    }
    
      public int Delete(String maSach){
        try {
            String sql="Delete From sach Where masach=?";
            conn=ConnectMySql.getConnection();
            stm=conn.prepareStatement(sql);
            stm.setString(1,maSach);
            
            if(stm.executeUpdate()>0){
                System.out.println("Delete thành công!");
                return 1;
            }
        } catch (Exception e) {
            System.out.println("Error"+e.toString());
        }
        
        return -1;
    }
      
      public List<Sach> getAll(){
        List<Sach> lst=new ArrayList<>();
        ResultSet rs=null;
        Statement stm=null;
        try {
            String sql="Select *From sach";
            conn=ConnectMySql.getConnection();
            stm=conn.createStatement();
            rs=stm.executeQuery(sql);
            while(rs.next()){
                Sach s=new Sach();
                s.setMaSach(rs.getInt(1));
                s.setTenSach(rs.getString(2));
                s.setTacGia(rs.getString(3));
                s.setGiaTien(rs.getFloat(4));
                
                lst.add(s);
                
            }
        } catch (Exception e) {
            System.out.println("Error"+e.toString());
        }
        return lst;
    }
      
       public List<Sach> timKiemName(String name){
        List<Sach> lst=new ArrayList<>();
        ResultSet rs=null;
        Statement stm=null;
        try {
            String sql="Select *From sach Where tensach like '%"+name+"%'";
            conn=ConnectMySql.getConnection();
            stm=conn.createStatement();
            rs=stm.executeQuery(sql);
            while(rs.next()){
                Sach s=new Sach();
                s.setMaSach(rs.getInt(1));
                s.setTenSach(rs.getString(2));
                s.setTacGia(rs.getString(3));
                s.setGiaTien(rs.getFloat(4));
                
                lst.add(s);
                
            }
        } catch (Exception e) {
            System.out.println("Error"+e.toString());
        }
        return lst;
    }
}
