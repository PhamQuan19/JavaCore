/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de5Form;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Admin
 */
public class DienThoaiDAO {
    Connection conn=null;
    PreparedStatement stm=null;
    
     public int Add(DienThoai dt){
        try {
            String sql="INSERT INTO dienthoai(MaDT,Hangsx,Namsx,Soluong)VALUES(?,?,?,?)";
            conn=ConnectMySql.getConnection();
            stm=conn.prepareStatement(sql);
            stm.setString(1,dt.getMaDT());
            stm.setString(2,dt.getHangSX());
            stm.setInt(3,dt.getNamSX());
            stm.setInt(4,dt.getSoLg());
            if(stm.executeUpdate()>0){
                System.out.println("Thêm thành công!");
                return 1;
            }
        } catch (Exception e) {
            System.out.println("Error"+e.toString());
        }
        
        return -1;
    }
     
      public int Update(DienThoai dt){
        try {
            String sql="Update dienthoai set Hangsx=?,Namsx=?,Soluong=? where MaDT=? ";
            conn=ConnectMySql.getConnection();
            stm=conn.prepareStatement(sql);
            stm.setString(4,dt.getMaDT());
            stm.setString(1,dt.getHangSX());
            stm.setInt(2,dt.getNamSX());
            stm.setInt(3,dt.getSoLg());
            if(stm.executeUpdate()>0){
                System.out.println("Thêm thành công!");
                return 1;
            }
        } catch (Exception e) {
            System.out.println("Error"+e.toString());
        }
        
        return -1;
    }
    
      public int Delete(String maDT){
        try {
            String sql="Delete From dienthoai Where MaDT=?";
            conn=ConnectMySql.getConnection();
            stm=conn.prepareStatement(sql);
            stm.setString(1,maDT);
            
            if(stm.executeUpdate()>0){
                System.out.println("Delete thành công!");
                return 1;
            }
        } catch (Exception e) {
            System.out.println("Error"+e.toString());
        }
        
        return -1;
    }
    public List<DienThoai> getAll(){
        List<DienThoai> lst=new ArrayList<>();
        ResultSet rs=null;
        Statement stm=null;
        try {
            String sql="Select *From dienthoai";
            conn=ConnectMySql.getConnection();
            stm=conn.createStatement();
            rs=stm.executeQuery(sql);
            while(rs.next()){
                DienThoai dt=new DienThoai();
                dt.setMaDT(rs.getString(1));
                dt.setHangSX(rs.getString(2));
                dt.setNamSX(rs.getInt(3));
                dt.setSoLg(rs.getInt(4));
                
                lst.add(dt);
                
            }
        } catch (Exception e) {
            System.out.println("Error"+e.toString());
        }
        return lst;
    }
    
    public List<DienThoai> timKiemName(String name){
        List<DienThoai> lst=new ArrayList<>();
        ResultSet rs=null;
        Statement stm=null;
        try {
            String sql="Select *From dienthoai Where Hangsx like '%"+name+"%'";
            conn=ConnectMySql.getConnection();
            stm=conn.createStatement();
            rs=stm.executeQuery(sql);
            while(rs.next()){
                DienThoai dt=new DienThoai();
                dt.setMaDT(rs.getString(1));
                dt.setHangSX(rs.getString(2));
                dt.setNamSX(rs.getInt(3));
                dt.setSoLg(rs.getInt(4));
                
                lst.add(dt);
                
            }
        } catch (Exception e) {
            System.out.println("Error"+e.toString());
        }
        return lst;
    }
}
