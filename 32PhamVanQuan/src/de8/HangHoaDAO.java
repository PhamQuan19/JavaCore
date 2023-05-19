/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de8;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Admin
 */
public class HangHoaDAO {
    public int Insert(HangHoa hh){
        try {
            Connection conn=ConnectMySql.getConnection();
            String sql="INSERT INTO mathang(mamathang,tenmathang,chatlieu,dvt,nhasanxuat) VALUES(?,?,?,?,?)";
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.setString(1,hh.getMaMaH());
            ps.setString(2,hh.getTenMH());
            ps.setString(3,hh.getChatLieu());
            ps.setString(4,hh.getDVT());
            ps.setString(5,hh.getNSX());
            if(ps.executeUpdate()>0){
                System.out.println("Insert thành công!");
                return 1;
            }
        } catch (Exception e) {
            System.out.println(e.fillInStackTrace());
        }
        return -1;
    }
    
    public int Update(HangHoa hh){
        try {
            Connection conn=ConnectMySql.getConnection();
            String sql="Update mathang Set tenmathang=?,chatlieu=?,dvt=?,nhasanxuat=? Where mamathang=?";
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.setString(5,hh.getMaMaH());
            ps.setString(1,hh.getTenMH());
            ps.setString(2,hh.getChatLieu());
            ps.setString(3,hh.getDVT());
            ps.setString(4,hh.getNSX());
            if(ps.executeUpdate()>0){
                System.out.println("Update thành công!");
                return 1;
            }
        } catch (Exception e) {
            System.out.println(e.fillInStackTrace());
        }
        return -1;
    }
    
    
    public List<HangHoa>getAll(){
        List<HangHoa> list=new ArrayList<>();
        ResultSet rs=null;
        Statement stm=null;
        try {
            Connection conn=ConnectMySql.getConnection();
            String sql="Select *From mathang";
            stm=conn.createStatement();
            rs=stm.executeQuery(sql);
            
            while(rs.next()){
                HangHoa hh=new HangHoa();
                hh.setMaMaH(rs.getString(1));
                hh.setTenMH(rs.getString(2));
                hh.setChatLieu(rs.getString(3));
                hh.setDVT(rs.getString(4));
                hh.setNSX(rs.getString(5));
                list.add(hh);
            }
        } catch (Exception e) {
            System.out.println("Error "+e.toString());
        }
        return list;
    }
}
