/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlkhachsan;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import qlkhachsan.Phong;
/**
 *
 * @author Admin
 */
public class PhongDAO {
    public List<Phong>getAll(){
        List<Phong> list=new ArrayList<>();
        ResultSet rs=null;
        Statement stm=null;
        try {
            Connection conn=ConnectMySql.getConnection();
            String sql="Select *From Phong";
            stm=conn.createStatement();
            rs=stm.executeQuery(sql);
            
            while(rs.next()){
                Phong p=new Phong();
                p.setMaPhong(rs.getString(1));
                p.setTenPhong(rs.getString(2));
                p.setKieuPhong(rs.getString(3));
                p.setTrangThai(rs.getBoolean(4));
                list.add(p);
            }
        } catch (Exception e) {
            System.out.println("Error "+e.toString());
        }
        return list;
    }
    
    public int Update(Phong p){
        try {
            Connection conn=ConnectMySql.getConnection();
            String sql="Update phong Set TenPhong=?,KieuPhong=?,TrangThai=? Where MaPhong=?";
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.setString(4,p.getMaPhong());
            ps.setString(1,p.getTenPhong());
            ps.setString(2,p.getKieuPhong());
            ps.setBoolean(3,p.isTrangThai());
            if(ps.executeUpdate()>0){
                System.out.println("Update thành công!");
                return 1;
            }
        } catch (Exception e) {
            System.out.println(e.fillInStackTrace());
        }
        return -1;
    }
    
    public int Delete(Phong p){
        try {
            Connection conn=ConnectMySql.getConnection();
            String sql="Delete From phong Where MaPhong=?";
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.setString(1,p.getMaPhong());
           
            if(ps.executeUpdate()>0){
                System.out.println("Delete thành công!");
                return 1;
            }
        } catch (Exception e) {
            System.out.println(e.fillInStackTrace());
        }
        return -1;
    }
}
