/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai5;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class PTGT {
    private String moHinh;
    private int nsx;
    private double giaBan;
    private String mau;

    public PTGT() {
    }

    public PTGT(String moHinh, int nsx, double giaBan, String mau) {
        this.moHinh = moHinh;
        this.nsx = nsx;
        this.giaBan = giaBan;
        this.mau = mau;
    }

    public String getMoHinh() {
        return moHinh;
    }

    public void setMoHinh(String moHinh) {
        this.moHinh = moHinh;
    }

    public int getNsx() {
        return nsx;
    }

    public void setNsx(int nsx) {
        this.nsx = nsx;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    public String getMau() {
        return mau;
    }

    public void setMau(String mau) {
        this.mau = mau;
    }
    Scanner sc=new Scanner(System.in);
    public void Input(){
        System.out.print("Nhập mô hình: ");
        moHinh=sc.nextLine();
        System.out.print("Nhập năm sản xuất: ");
        nsx=sc.nextInt();
        System.out.print("Nhập giá bán: ");
        giaBan=sc.nextDouble();sc.nextLine();
        System.out.print("Nhập màu: ");
        mau=sc.nextLine();
        
    }
    
    public void Display(){
        System.out.print(moHinh+"\t"+nsx+"\t"+giaBan+"\t"+mau);
    }
}
