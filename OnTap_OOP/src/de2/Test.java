/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Test {
    public static List<SinhVien> listSV=new ArrayList<>();
    public static Scanner sc=new Scanner(System.in);
    public static void Input(){
        System.out.println("Nhập n sinh viên: ");
        int n=sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("\nNhập thông tin cho sinh viên thứ "+(i+1));
            SinhVien sv=new SinhVien();
            sv.NhapSinhVien();
            listSV.add(sv);
        }
    }
    
    public static void OutPut(){
        for (SinhVien o : listSV) {
            o.HienThiSinhVien();
            System.out.println("");
        }
    }
    
    public static void SapXep(){
        Collections.sort(listSV, new Comparator<SinhVien>(){
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                return o1.getHoTen().compareTo(o2.getHoTen());
            }
            
        });
    }
    public static void main(String[] args) {
        Input();
        System.out.println("Danh sách sau khi nhập");
        OutPut();
        System.out.println("Danh sách sau khi sắp xếp tăng dần theo tên");
        SapXep();
        OutPut();
    }
}
