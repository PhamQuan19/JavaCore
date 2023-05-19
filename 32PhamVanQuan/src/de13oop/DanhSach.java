/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de13oop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class DanhSach {
    public static List<GiaoVien> listGV=new ArrayList<>();
    public static Scanner sc=new Scanner(System.in);
    
    public static void Input(){
        System.out.println("Nhập số giáo viên: ");
        int n=sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin giáo viên thứ: "+(i+1));
            GiaoVien gv=new GiaoVien();
            gv.Nhap();
            listGV.add(gv);
        }
        
    }
    
    public static void Ouput(){
        for (GiaoVien o : listGV) {
            o.HienThi();
        }
    }
    public static void Add(){
        
        int index=sc.nextInt();
        GiaoVien gv=new GiaoVien();
         gv.Nhap();
         listGV.add(index,gv);
        
    }
    
     public static void Count(){
         int cnt=0;
        for (GiaoVien o : listGV) {
            if(o.getHeSolg()>3.99){
                cnt++;
            }
        }
         System.out.println("Có "+cnt+" bậc lương lớn hơn 3.99");
    }
    
    public static void main(String[] args) {
        Input();
        System.out.print("Nhập vị trí cần thêm: ");
        Ouput();
        Count();
        Add();
        Ouput();
    }
}
