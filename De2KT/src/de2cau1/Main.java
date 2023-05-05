/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de2cau1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {
    public static List<KhuPho> listKP=new ArrayList<>();
    public static Scanner sc=new Scanner(System.in);
    public static void Input(){
        System.out.print("Nhap so ho dan: ");
        int n=sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin cho ho dan thu "+(i+1));
            KhuPho kp=new KhuPho();
            kp.Nhap();
            listKP.add(kp);
        }
    }
    
    public static void Output(){
        for (KhuPho o : listKP) {
            o.Display();
        }
    }
    
 
    public static void main(String[] args) {
        Input();
        System.out.println("---------------Danh sach ho dan sau khi nhap-----------------");
        Output();
    }
}
