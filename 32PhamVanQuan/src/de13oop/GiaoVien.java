/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de13oop;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class GiaoVien {
    private String maGv,hoTen,diaChi;
    private float heSolg;

    public GiaoVien() {
    }

    public GiaoVien(String maGv, String hoTen, String diaChi, float heSolg) {
        this.maGv = maGv;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.heSolg = heSolg;
    }

    public String getMaGv() {
        return maGv;
    }

    public void setMaGv(String maGv) {
        this.maGv = maGv;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public float getHeSolg() {
        return heSolg;
    }

    public void setHeSolg(float heSolg) {
        this.heSolg = heSolg;
    }
    Scanner sc=new Scanner(System.in);
    public void Nhap(){
        System.out.print("Nhập mã giáo viên: ");
        maGv=sc.nextLine();
        System.out.print("Nhập họ tên: ");
        hoTen=sc.nextLine();
        System.out.print("Nhập địa chỉ: ");
        diaChi=sc.nextLine();
        System.out.print("Nhập hệ số lương: ");
        heSolg=sc.nextFloat();
        
                
    }

    public void HienThi(){
        System.out.println("maGv=" + maGv + ", hoTen=" + hoTen + ", diaChi=" + diaChi + ", heSolg=" + heSolg);
    }
    
}
