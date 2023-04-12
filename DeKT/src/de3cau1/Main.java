/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de3cau1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {
    public static List<KhachSan> listKS=new ArrayList<>();
    public static Scanner sc=new Scanner(System.in);
    public static void Input(){
        System.out.print("Nhập số người: ");
        int n=sc.nextInt();
        for (int i = 0; i <n ; i++) {
            System.out.println("Nhập thông tin khách thu "+(i+1));
            KhachSan ks=new KhachSan();
            ks.Nhap();
            listKS.add(ks);
        }
    }
    
    public static void Output(){
        for (KhachSan o : listKS) {
            o.Xuat();
            System.out.println("");
        }
    }
    
    public static void main(String[] args) {
        Input();
        System.out.println("-----Danh sách khách hàng vừa nhập------");
        Output();
    }
}
