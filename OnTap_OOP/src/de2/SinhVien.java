/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de2;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class SinhVien {
    private String maSV;
    private String hoTen;
    private String ngaySinh;
    private String gioiTinh;
    private String diaChi;

    public SinhVien() {
    }

    public SinhVien(String maSV, String hoTen, String ngaySinh, String gioiTinh, String diaChi) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    Scanner sc=new Scanner(System.in);
    public void NhapSinhVien(){
        System.out.print("Nhập mã sinh viên: ");
        maSV=sc.nextLine();
        System.out.print("Nhập họ tên: ");
        hoTen=sc.nextLine();
        System.out.print("Nhập ngày sinh: ");
        ngaySinh=sc.nextLine();
        System.out.print("Nhập giới tính: ");
        gioiTinh=sc.nextLine();
        System.out.print("Nhập địa chỉ: ");
        diaChi=sc.nextLine();
        
    }
    
    public void HienThiSinhVien(){
        System.out.println("Mã sinh viên "+maSV);
        System.out.println("Họ tên "+hoTen);
        System.out.println("Ngày sinh "+ngaySinh);
        System.out.println("Giới tinh "+gioiTinh);
        System.out.println("Địa chỉ "+diaChi);
        System.out.println("");
    }
    
    
}
