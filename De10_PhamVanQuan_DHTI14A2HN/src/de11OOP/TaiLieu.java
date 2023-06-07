/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de11OOP;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class TaiLieu {
    private String maTL;
    private String tenTL;
    private int soXB;

    public TaiLieu() {
    }

    public TaiLieu(String maTL, String tenTL, int soXB) {
        this.maTL = maTL;
        this.tenTL = tenTL;
        this.soXB = soXB;
    }

    public String getMaTL() {
        return maTL;
    }

    public void setMaTL(String maTL) {
        this.maTL = maTL;
    }

    public String getTenTL() {
        return tenTL;
    }

    public void setTenTL(String tenTL) {
        this.tenTL = tenTL;
    }

    public int getSoXB() {
        return soXB;
    }

    public void setSoXB(int soXB) {
        this.soXB = soXB;
    }
    Scanner sc=new Scanner(System.in);
    public void Nhap(){
        System.out.print("Nhập mã tài liệu: ");
        maTL=sc.nextLine();
        System.out.print("Nhập tên tài liệu: ");
        tenTL=sc.nextLine();
        System.out.print("Nhập số xuất bản: ");
        soXB=sc.nextInt();
        sc.nextLine();
    }
    
    public void Xuat(){
        System.out.println("Mã tài liệu: "+maTL);
        System.out.println("Tên: "+tenTL);
        System.out.println("Số xuất bản: "+soXB);
    }
}
