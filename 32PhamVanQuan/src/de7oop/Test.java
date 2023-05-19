/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de7oop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Test {
    public static List<HocVien> listHV=new ArrayList<>();
    public static Scanner sc=new Scanner(System.in);
    public static void Input(){
        System.out.print("Nhập số học viên: ");
        int n=sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin cho học viên thu "+(i+1));
            HocVien hv=new HocVien();
            hv.Nhap();
            listHV.add(hv);
        }
    }
    
    public static void Output(){
        System.out.println("Danh sách sau khi nhập");
        for (HocVien o : listHV) {
            o.HienThi();
        }
    }
    
    public static void timKiem(){
        System.out.print("Nhập họ tên cần tìm kiếm: ");
        sc.nextLine();
        String name=sc.nextLine();
        System.out.println("Danh sách sau khi tìm kiếm");
        for (HocVien o : listHV) {
            if(o.getHoTen().equals(name))
                o.HienThi();
        }
    }
    
    public static void main(String[] args) {
        Input();
        Output();
        timKiem();
    }
}
