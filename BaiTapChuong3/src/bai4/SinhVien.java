/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai4;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class SinhVien {
    private int sbd;
    private String hoTen;
    private String diaChi;
    private String monHoc;
    private float diemKiI;
    private float diemKiII;

    public SinhVien() {
    }

    public SinhVien(int sbd, String hoTen, String diaChi, String monHoc, float diemKiI, float diemKiII) {
        this.sbd = sbd;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.monHoc = monHoc;
        this.diemKiI = diemKiI;
        this.diemKiII = diemKiII;
    }

    public int getSbd() {
        return sbd;
    }

    public void setSbd(int sbd) {
        this.sbd = sbd;
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

    public String getMonHoc() {
        return monHoc;
    }

    public void setMonHoc(String monHoc) {
        this.monHoc = monHoc;
    }

    public float getDiemKiI() {
        return diemKiI;
    }

    public void setDiemKiI(float diemKiI) {
        this.diemKiI = diemKiI;
    }

    public float getDiemKiII() {
        return diemKiII;
    }

    public void setDiemKiII(float diemKiII) {
        this.diemKiII = diemKiII;
    }
    Scanner sc=new Scanner(System.in);
    public void Input(){
        System.out.print("Nhập số báo danh: ");
        sbd=sc.nextInt();sc.nextLine();
        System.out.print("Nhập họ tên: ");
        hoTen=sc.nextLine();
        System.out.print("Nhập địa chỉ: ");
        diaChi=sc.nextLine();
        System.out.print("Nhập tên môn học: ");
        monHoc=sc.nextLine();
        System.out.print("Nhập điểm kì 1: ");
        diemKiI=sc.nextFloat();
        System.out.print("Nhập điểm kì 2: ");
        diemKiII=sc.nextFloat();
    }

    @Override
    public String toString() {
        return "SinhVien{" + "sbd=" + sbd + ", hoTen=" + hoTen + ", diaChi=" + diaChi +
           ", monHoc=" + monHoc + ", diemKiI=" + diemKiI + ", diemKiII=" + diemKiII + '}';
    }
    
    
}
