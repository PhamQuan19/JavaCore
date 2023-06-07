/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de22oop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class DanhSach {
    public static List<SoPhuc> listSP=new ArrayList<>();
    public static Scanner sc=new Scanner(System.in);

    
    public static void NhapSP(){
        System.out.println("Nhập n số phức: ");
        int n=sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin cho số phức thứ "+(i+1));
            SoPhuc sp=new SoPhuc();
            sp.Nhap();
            listSP.add(sp);
        }
    }
    
    public static void XuatSP(){
        for (SoPhuc o : listSP) {
            o.Xuat();
        }
        System.out.println("");
    }
    
    public static SoPhuc tinhTong() {
        SoPhuc tong = new SoPhuc();
        for (SoPhuc soPhuc : listSP) {
            tong = tong.cong(soPhuc);
        }
        return tong;
    }
    
    public static void Xoa(){
        System.out.println("Nhập vị trí cần xoá: ");
        int k=sc.nextInt();
        if(k>=1 && k<=listSP.size()){
            listSP.remove(k-1);
         System.out.println("Đã xoá số phức thứ " + k + " khỏi danh sách.");
        } else {
            System.out.println("Số phức thứ " + k + " không tồn tại trong danh sách.");
        }
    }
    public static void main(String[] args) {
        NhapSP();
        System.out.println("Danh sách sau khi nhập");
        XuatSP();
        System.out.println("Tổng số phức: ");
        tinhTong().Xuat();
        Xoa();
        XuatSP();
    }
}
    