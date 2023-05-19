/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de6OOP;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {
    public static List<CanBoQuanLy> listCB=new ArrayList<>();
    public static Scanner sc=new Scanner(System.in);
    public static void Input(){
        System.out.println("Nhập n cán bộ quản lý: ");
        int n=sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("\nNhập thông tin cho cán bộ quản lý thứ "+(i+1));
            CanBoQuanLy cb=new CanBoQuanLy();
            cb.Nhap();
            listCB.add(cb);
        }
    }
    
    public static void OutPut(){
        for (CanBoQuanLy o : listCB) {
            o.HienThi();
            System.out.println("");
        }
    }
    
    public static float LuongMin(){
        float luong=listCB.get(0).TinhLuong();
        for (int i = 0; i < listCB.size(); i++) {
            if(listCB.get(i).TinhLuong() < luong){
                luong=listCB.get(i).TinhLuong();
            }
        }
        return luong;
    }
    
    public static void dsLuongMin(){
        System.out.println("\nDanh sách cán bộ có lương thấp nhất");
        for (int i = 0; i < listCB.size(); i++) {
            if(listCB.get(i).TinhLuong() == LuongMin()){
                listCB.get(i).HienThi();
            }
        }
    }
    
    public static void main(String[] args) {
        Input();
        System.out.println("Danh sách cán bộ sau khi nhập");
        OutPut();
        dsLuongMin();
    }
}
