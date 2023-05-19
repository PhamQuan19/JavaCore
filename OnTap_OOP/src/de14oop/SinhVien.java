/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de14oop;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class SinhVien {
    private String maSV,hoTen,queQuan;
    private float diem;

    public SinhVien() {
    }

    public SinhVien(String maSV, String hoTen, String queQuan, float diem) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.queQuan = queQuan;
        this.diem = diem;
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

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public float getDiem() {
        return diem;
    }

    public void setDiem(float diem) {
        this.diem = diem;
    }
    Scanner sc=new Scanner(System.in);
    public void Nhap(){
        System.out.print("Nhập mã sinh viên: ");
        maSV=sc.nextLine();
        System.out.print("Nhập họ tên: ");
        hoTen=sc.nextLine();
        System.out.print("Nhập quên quán: ");
        queQuan=sc.nextLine();
        System.out.print("Nhập điểm: ");
        diem=sc.nextFloat();
    }
    
    public void HienThi(){
        System.out.println("maSV=" + maSV + ", hoTen=" + hoTen + ", queQuan=" + queQuan + ", diem=" + diem);
        
    }
}
