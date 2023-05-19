/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de6;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class CanBoQuanLy extends NhanVien{
    private String ChucVu;
    private float HeSoLuong;
    private float PhuCap;

    public CanBoQuanLy() {
    }

    public CanBoQuanLy(String ChucVu, float HeSoLuong, float PhuCap) {
        this.ChucVu = ChucVu;
        this.HeSoLuong = HeSoLuong;
        this.PhuCap = PhuCap;
    }

    public CanBoQuanLy(String ChucVu, float HeSoLuong, float PhuCap, String Ma, String HoTen, String DiaChi) {
        super(Ma, HoTen, DiaChi);
        this.ChucVu = ChucVu;
        this.HeSoLuong = HeSoLuong;
        this.PhuCap = PhuCap;
    }

    public String getChucVu() {
        return ChucVu;
    }

    public void setChucVu(String ChucVu) {
        this.ChucVu = ChucVu;
    }

    public float getHeSoLuong() {
        return HeSoLuong;
    }

    public void setHeSoLuong(float HeSoLuong) {
        this.HeSoLuong = HeSoLuong;
    }

    public float getPhuCap() {
        return PhuCap;
    }

    public void setPhuCap(float PhuCap) {
        this.PhuCap = PhuCap;
    }

    
    Scanner sc=new Scanner(System.in);
    public void Nhap(){
        System.out.print("Nhập mã: ");
        this.setMa(sc.nextLine());
        System.out.print("Nhập họ tên: ");
        this.setHoTen(sc.nextLine());
        System.out.print("Nhập địa chỉ: ");
        this.setDiaChi(sc.nextLine());
        System.out.print("Nhập chức vụ: ");
        this.setChucVu(sc.nextLine());
        System.out.print("Nhập hệ số lương: ");
        this.setHeSoLuong(sc.nextFloat());
        System.out.print("Nhập phụ cấp: ");
        this.setPhuCap(sc.nextFloat());
        
    }
    
    public void HienThi(){
        System.out.println("Mã: "+this.getMa());
        System.out.println("Họ tên: "+this.getHoTen());
        System.out.println("Địa chỉ: "+this.getDiaChi());
        System.out.println("Chức vụ: "+this.getChucVu());
        System.out.println("Hệ số lương: "+this.getHeSoLuong());
        System.out.println("Phụ cấp: "+this.getPhuCap());
        System.out.println("Lương: "+TinhLuong());
        
    }
    
    public float TinhLuong(){
        float luong=1450*(getHeSoLuong()+getPhuCap());
        return luong;
    }
    
}
