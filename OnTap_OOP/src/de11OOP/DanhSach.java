/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de11OOP;

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
public class DanhSach {
    public static List<Sach> listSach=new ArrayList<>();
    public static Scanner sc=new Scanner(System.in);
    public static void Input(){
        System.out.println("Nhập số sách: ");
        int n=sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin cho sách thứ "+(i+1));
            Sach sach=new Sach();
            sach.Nhap();
            listSach.add(sach);
        }
    }
    
    public static void HienThi(){
        
        for (Sach sach : listSach) {
            sach.Xuat();
            System.out.println("");
        }
    }
    
    
    public static void SapXep(){
        System.out.println("Danh sách sau khi sắp xếp");
        Collections.sort(listSach,new Comparator<Sach>(){
            @Override
            public int compare(Sach o1, Sach o2) {
               return o1.NXB()-o2.NXB();
            }
            
        });
    }
    public static void main(String[] args) {
        Input();
        System.out.println("Danh sách sau khi nhập");
        HienThi();
        SapXep();
        HienThi();
                
    }
}
