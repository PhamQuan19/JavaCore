/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ontap;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class TheMuon {
    public static List<SinhVien> listSV=new ArrayList<>();
    public static Scanner sc=new Scanner(System.in);
    
    public static void Input(){
        System.out.print("Nhập số sinh viên: ");
        int n=sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin cho sinh viên thứ "+(i+1));
            SinhVien sv=new SinhVien();
            sv.Nhap();
            listSV.add(sv);
            
        }
    }
    
    public static void Output(){
        for (SinhVien o : listSV) {
            o.Xuat();
        }
    }
    
    public static void SVCNTT(){
        System.out.println("Danh sách sinh viên CNTT");
        for (SinhVien o : listSV) {
            if(o.getLop().equals("CNTT")){
                o.Xuat();
            }
        }
    }
    
    public static void main(String[] args) {
        Input();
        System.out.println("Danh sách sinh viên vừa nhập");
        Output();
        SVCNTT();
    }
    
    
}
