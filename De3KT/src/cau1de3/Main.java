/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cau1de3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {
    private static List<KhachSan> listKS=new ArrayList<>();
    private static Scanner sc=new Scanner(System.in);
    
    public static void Input(){
        System.out.print("Nhập số khách trọ: ");
        int n=sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin cho khách trọ thứ "+(i+1));
            KhachSan ks=new KhachSan();
            ks.Nhap();
            listKS.add(ks);
        }
    }
    
    public static void OutPut(){
        System.out.println("\nDanh sách sau khi nhập");
        for (KhachSan o : listKS) {
            o.Xuat();
        }
    }
    
    
    public static void main(String[] args) {
        Input();
        OutPut();
    }
}
