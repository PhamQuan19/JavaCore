/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de4oop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Test {
    public static List<KHACHHANG> listKH=new ArrayList<>();
    public static Scanner sc=new Scanner(System.in);
    public static void Input(){
        System.out.print("Nhập số khách hàng: ");
        int n=sc.nextInt();
        for (int i = 0; i <n; i++) {
            System.out.println("Nhập thông tin khách hàng thu "+(i+1));
            KHACHHANG kh=new KHACHHANG();
            kh.NhapKhachHang();
            listKH.add(kh);
        }
    }
    
    public static void Output(){
        for (KHACHHANG o : listKH) {
            o.HienThiKhachHang();
//            System.out.println("");
        }
    }
    
    public static void vuotDM(){
        System.out.println("Danh sách khách hàng vượt định mức");
        for (KHACHHANG o : listKH) {
            if((o.getSoKW()-o.getDinhMuc())>0)
            o.HienThiKhachHang();
//            System.out.println("");
        }
    }
    
    public static void main(String[] args) {
        Input();
        Output();
        vuotDM();
    }
}
