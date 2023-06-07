/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de17oop;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class KhachHang {
    private String maKH,tenKH,email,soTK;

    public KhachHang() {
    }

    public KhachHang(String maKH, String tenKH, String email, String soTK) {
        this.maKH = maKH;
        this.tenKH = tenKH;
        this.email = email;
        this.soTK = soTK;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSoTK() {
        return soTK;
    }

    public void setSoTK(String soTK) {
        this.soTK = soTK;
    }
    Scanner sc=new Scanner(System.in);
    public void Nhap(){
        System.out.print("Nhập mã khách hàng: ");
        maKH=sc.nextLine();
        System.out.print("Nhập họ tên: ");
        tenKH=sc.nextLine();
        System.out.print("Nhập email: ");
        email=sc.nextLine();
        System.out.print("Nhập số tài khoản: ");
        soTK=sc.nextLine();
    }

    public void HienThi(){
        System.out.println("maKH=" + maKH + ", tenKH=" + tenKH + ", email=" + email + ", soTK=" + soTK);
    }
    
    
}
