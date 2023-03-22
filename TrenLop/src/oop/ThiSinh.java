/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class ThiSinh {
    private int soBaoDanh;
    private String hoTen;
    private String diaChi;
    private float uuTien;

    public ThiSinh() {
    }

    public ThiSinh(int soBaoDanh, String hoTen, String diaChi, float uuTien) {
        this.soBaoDanh = soBaoDanh;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.uuTien = uuTien;
    }

    public int getSoBaoDanh() {
        return soBaoDanh;
    }

    public void setSoBaoDanh(int soBaoDanh) {
        this.soBaoDanh = soBaoDanh;
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

    public float getUuTien() {
        return uuTien;
    }

    public void setUuTien(float uuTien) {
        this.uuTien = uuTien;
    }
    
    public void Input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap so bao danh: ");
        soBaoDanh=sc.nextInt();sc.nextLine();
        System.out.println("Nhap ho ten: ");
        hoTen=sc.nextLine();
        System.out.println("Nhap dia chi: ");
        diaChi=sc.nextLine();
        System.out.println("Nhap diem uu tien: ");
        uuTien=sc.nextFloat();
    }
    
    public void Output(){
        System.out.println("So bao danh: "+soBaoDanh);
        System.out.println("Ho ten: "+hoTen);
        System.out.println("Dia chi: "+diaChi);
        System.out.println("Diem uu tien: "+uuTien);
         // System.out.println(soBaoDanh+"\t"+hoTen+"\t\t"+diaChi+"\t"+uuTien);
    }
    
    
}
