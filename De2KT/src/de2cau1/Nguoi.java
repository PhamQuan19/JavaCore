/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de2cau1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Nguoi {
    private String hoTen;
    private int tuoi;
    private int namSinh;
    private String ngheNghiep;

    public Nguoi() {
    }

    public Nguoi(String hoTen, int tuoi, int namSinh, String ngheNghiep) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.namSinh = namSinh;
        this.ngheNghiep = ngheNghiep;
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

    public String getNgheNghiep() {
        return ngheNghiep;
    }

    public void setNgheNghiep(String ngheNghiep) {
        this.ngheNghiep = ngheNghiep;
    }
    
    Scanner sc=new Scanner(System.in);
    public void Nhap(){
        System.out.print("Nhap ho ten: ");
        hoTen=sc.nextLine();
        System.out.print("Nhap tuoi: ");
        tuoi=sc.nextInt();
        System.out.print("Nhap nam sinh: ");
        namSinh=sc.nextInt(); sc.nextLine();
        System.out.print("Nhap nghe nghiep: ");
        ngheNghiep=sc.nextLine();
    }
    
    public void Display(){
        System.out.println("Ho ten: "+hoTen);
        System.out.println("Tuoi: "+tuoi);
        System.out.println("Nam sinh: "+namSinh);
        System.out.println("Nghe nghiep: "+ngheNghiep);
    }
}
