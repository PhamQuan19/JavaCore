/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de25oop;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class TamGiac {
    private float canh1,canh2,canh3;

    public TamGiac() {
    }

    public TamGiac(float canh1, float canh2, float canh3) {
        this.canh1 = canh1;
        this.canh2 = canh2;
        this.canh3 = canh3;
    }
    Scanner sc=new Scanner(System.in);
    public void Nhap(){
        System.out.println("Nhập cạnh 1: ");
        canh1=sc.nextFloat();
        System.out.println("Nhập cạnh 2 :");
        canh2=sc.nextFloat();
        System.out.println("Nhập cạnh 3: ");
        canh3=sc.nextFloat();
       
        while (!kiemTraDieuKien()) {
            System.out.println("Độ dài 3 cạnh không thoả mãn điều kiện của tam giác. Vui lòng nhập lại.");
            System.out.println("Nhập cạnh 1: ");
            canh1=sc.nextFloat();
            System.out.println("Nhập cạnh 2 :");
            canh2=sc.nextFloat();
            System.out.println("Nhập cạnh 3: ");
            canh3=sc.nextFloat();
        }
        
    }
    
    public void HienThi(){
        System.out.println("Ba cạnh tam giác: "+canh1+", "+canh2+", "+canh3);
    }
    
    public boolean kiemTraDieuKien() {
        return (canh1 + canh2 > canh3) && (canh1 + canh3 > canh2) && (canh2 + canh3 > canh1);
    }
    
    public boolean kiemTraTamGiacVuong() {
        float a2 = canh1 * canh1;
        float b2 = canh2 * canh2;
        float c2 = canh3 * canh3;

        return (a2 == b2 + c2) || (b2 == a2 + c2) || (c2 == a2 + b2);
    }
    
    
}
