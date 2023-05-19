/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de12oop;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class HocVien {
    private int maHV;
    private String hoTen;
    private String queQuan;
    private float diemThi;

    public HocVien() {
    }

    public HocVien(int maHV, String hoTen, String queQuan, float diemThi) {
        this.maHV = maHV;
        this.hoTen = hoTen;
        this.queQuan = queQuan;
        this.diemThi = diemThi;
    }

    public int getMaHV() {
        return maHV;
    }

    public void setMaHV(int maHV) {
        this.maHV = maHV;
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

    public float getDiemThi() {
        return diemThi;
    }

    public void setDiemThi(float diemThi) {
        this.diemThi = diemThi;
    }
    Scanner sc=new Scanner(System.in);
    public void Input(){
        System.out.println("Nhap ma hoc vien: ");
        maHV=sc.nextInt();sc.nextLine();
        System.out.println("Nhap ho ten hoc vien: ");
        hoTen=sc.nextLine();
        System.out.println("Nhap que quan: ");
        queQuan=sc.nextLine();
        System.out.println("Nhap diem thi: ");
        diemThi=sc.nextFloat();
    }
    
    public void Output(){
        System.out.println("Ma: "+maHV);
        System.out.println("Ho ten: "+hoTen);
        System.out.println("Que quan: "+queQuan);
        System.out.println("Diem thi: "+diemThi);
    }
    
    
}
