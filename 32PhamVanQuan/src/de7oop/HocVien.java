/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de7oop;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class HocVien extends Nguoi{
    private String maHV;
    private float diemTB;

    public HocVien() {
    }

    public HocVien(String maHV, float diemTB) {
        this.maHV = maHV;
        this.diemTB = diemTB;
    }

    public HocVien(String maHV, float diemTB, String hoTen, String diaChi, String gioiTinh) {
        super(hoTen, diaChi, gioiTinh);
        this.maHV = maHV;
        this.diemTB = diemTB;
    }

    public String getMaHV() {
        return maHV;
    }

    public void setMaHV(String maHV) {
        this.maHV = maHV;
    }

    public float getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(float diemTB) {
        this.diemTB = diemTB;
    }
    Scanner sc=new Scanner(System.in);
    public void Nhap(){
        System.out.print("Nhập họ tên: ");
        this.setHoTen(sc.nextLine());
        System.out.print("Nhập địa chỉ: ");
        this.setDiaChi(sc.nextLine());
        System.out.print("Nhập giới tính: ");
        this.setGioiTinh(sc.nextLine());
        System.out.print("Nhập mã học viên: ");
        maHV=sc.nextLine();
        System.out.print("Nhập điểm TB: ");
        diemTB=sc.nextFloat();
    }

   
    
    public void HienThi(){
        System.out.print("Ho ten: "+this.getHoTen());
        System.out.print(" Địa chỉ: "+this.getDiaChi());
        System.out.print(" giới tính: "+this.getGioiTinh());
        System.out.println(" maHV= " + maHV + ", diemTB= " + diemTB );
    }
}
