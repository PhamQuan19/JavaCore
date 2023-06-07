/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de17oop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class DanhSach {
    public static List<KhachHang> listKH=new ArrayList<>();
    public static Scanner sc=new Scanner(System.in);
    public static void Input(){
        String choice;
        do{
            KhachHang kh=new KhachHang();
            kh.Nhap();
            listKH.add(kh);
            System.out.print("Tiếp tục nhập? (Y/N): ");
            choice = sc.nextLine();
        }while(!choice.equals("N"));
    }
    
    public static void Output(){
        for (KhachHang o : listKH) {
            o.HienThi();
        }
    }
    
    public static void f2(){
        System.out.println("Nhập mã khách hàng: ");
        String ma=sc.nextLine();
        for (KhachHang o : listKH) {
            if(o.getMaKH().equals(ma)){
                System.out.println("Số tài khoản: "+o.getSoTK());
            }
        }
    }
    
    public static void f3(){
        System.out.println("Thêm 1 khách hàng vào đầu danh sách");
        KhachHang kh=new KhachHang();
        kh.Nhap();
        listKH.add(0, kh);
    }
    
    public static void main(String[] args) {
        Input();
        System.out.println("Danh sách sau khi nhập");
        Output();
        f2();
        f3();
        System.out.println("=====F3======");
        Output();
    }
}
