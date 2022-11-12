/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop;

/**
 *
 * @author Admin
 */
public class SinhVien {
    //thuoc tinh
    private String maSinhVien;
    private String hoTen;
    private double gpa;
    
    //constructor
    public SinhVien() {
    }

    public SinhVien(String maSinhVien, String hoTen, double gpa) {
        this.maSinhVien = maSinhVien;
        this.hoTen = hoTen;
        this.gpa = gpa;
    }
    
    //phuong thuc
    public String getMaSinhVien() {
        return maSinhVien;
    }
    
    public static void main(String[] args) {
        SinhVien x=new SinhVien("CNTT1","Nguyen Van Teo",3.2);
        System.out.println(x.hoTen);
        
    }
    
}
