/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de3cau1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Nguoi {
    private String hoTen;
    private int tuoi;
    private int namSinh;
    private String cmnd;

    public Nguoi() {
    }

    public Nguoi(String hoTen, int tuoi, int namSinh, String cmnd) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.namSinh = namSinh;
        this.cmnd = cmnd;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }
    Scanner sc=new Scanner(System.in);
    public void Nhap(){
        System.out.print("Nhập họ và tên: ");
        hoTen=sc.nextLine();
        System.out.print("Nhập tuổi: ");
        tuoi=sc.nextInt();
        System.out.print("Nhập năm sinh: ");
        namSinh=sc.nextInt();sc.nextLine();
        System.out.print("Nhập số chứng minh thư: ");
        cmnd=sc.nextLine();
    }
    
    public void Xuat(){
        System.out.println("Họ và Tên: "+hoTen);
        System.out.println("Tuổi: "+tuoi);
        System.out.println("Năm sinh: "+namSinh);
        System.out.println("Số chưng minh thư: "+cmnd);
        
    }
    
    
    
}
