/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ontap;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class SinhVien {
    private String maSV;
    private String hoTen;
    private int namSinh;
    private String lop;

    public SinhVien() {
    }

    public SinhVien(String maSV, String hoTen, int namSinh, String lop) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.lop = lop;
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

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }
    Scanner sc=new Scanner(System.in);
    public void Nhap(){
        System.out.print("Nhập mã sinh viên: ");
        maSV=sc.nextLine();
        System.out.print("Nhập họ tên: ");
        hoTen=sc.nextLine();
        System.out.print("Nhập năm sinh: ");
        namSinh=sc.nextInt(); sc.nextLine();
        System.out.print("Nhập lớp: ");
        lop=sc.nextLine();
    }
    
    public void Xuat(){
        System.out.println("maSV=" + maSV + ", hoTen=" + hoTen + ", namSinh=" + namSinh + ", lop=" + lop);
    }

   
    
}
