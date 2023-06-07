/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de15oop;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class XeMay {
    private String bienSo;
    private String tenXe,mauXe,hangXe;

    public XeMay() {
    }

    public XeMay(String bienSo, String tenXe, String mauXe, String hangXe) {
        this.bienSo = bienSo;
        this.tenXe = tenXe;
        this.mauXe = mauXe;
        this.hangXe = hangXe;
    }

    public String getBienSo() {
        return bienSo;
    }

    public void setBienSo(String bienSo) {
        this.bienSo = bienSo;
    }

    public String getTenXe() {
        return tenXe;
    }

    public void setTenXe(String tenXe) {
        this.tenXe = tenXe;
    }

    public String getMauXe() {
        return mauXe;
    }

    public void setMauXe(String mauXe) {
        this.mauXe = mauXe;
    }

    public String getHangXe() {
        return hangXe;
    }

    public void setHangXe(String hangXe) {
        this.hangXe = hangXe;
    }
    Scanner sc=new Scanner(System.in);
    public void Nhap(){
        System.out.print("Nhập biển số xe: ");
        bienSo=sc.nextLine();
        System.out.print("Nhập tên xe: ");
        tenXe=sc.nextLine();
        System.out.print("Nhập màu xe: ");
        mauXe=sc.nextLine();
        System.out.print("Nhập hãng xe: ");
        hangXe=sc.nextLine();
    }

    
    public void Xuat(){
        System.out.println("Biển số: " + bienSo + ", Tên Xe=" + tenXe + ", Màu Xe=" + mauXe + ", Hang Xe=" + hangXe);
    }
}
