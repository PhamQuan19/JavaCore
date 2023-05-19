/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cau1de3;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class KhachSan extends Nguoi{
    private int soNgay;
    private String loaiPhong;
    private double giaPhong;

    public KhachSan() {
    }

    public KhachSan(int soNgay, String loaiPhong, double giaPhong) {
        this.soNgay = soNgay;
        this.loaiPhong = loaiPhong;
        this.giaPhong = giaPhong;
    }

    public KhachSan(int soNgay, String loaiPhong, double giaPhong, String hoTen, int tuoi, int namSinh, String cmnd) {
        super(hoTen, tuoi, namSinh, cmnd);
        this.soNgay = soNgay;
        this.loaiPhong = loaiPhong;
        this.giaPhong = giaPhong;
    }

    public int getSoNgay() {
        return soNgay;
    }

    public void setSoNgay(int soNgay) {
        this.soNgay = soNgay;
    }

    public String getLoaiPhong() {
        return loaiPhong;
    }

    public void setLoaiPhong(String loaiPhong) {
        this.loaiPhong = loaiPhong;
    }

    public double getGiaPhong() {
        return giaPhong;
    }

    public void setGiaPhong(double giaPhong) {
        this.giaPhong = giaPhong;
    }
    Scanner sc=new Scanner(System.in);
    public void Nhap(){
        System.out.print("Nhập họ tên: ");
        this.setHoTen(sc.nextLine());
        System.out.print("Nhập tuổi: ");
        this.setTuoi(sc.nextInt());
        System.out.print("Nhập năm sinh: ");
        this.setNamSinh(sc.nextInt()); sc.nextLine();
        System.out.print("Nhập số cmnd: ");
        this.setCmnd(sc.nextLine());
        System.out.print("Nhập số ngày: ");
        soNgay=sc.nextInt();sc.nextLine();
        System.out.print("Nhập loại phòng: ");
        loaiPhong=sc.nextLine();
        System.out.print("Nhập giá phòng: ");
        giaPhong=sc.nextDouble();
        
    }

    public void Xuat(){
        System.out.println("Họ tên: "+this.getHoTen());
        System.out.println("Tuổi: "+this.getTuoi());
        System.out.println("Năm sinh: "+this.getNamSinh());
        System.out.println("Số cmnd: "+this.getCmnd());
        System.out.println("Số ngày: "+soNgay);
        System.out.println("Loại phòng: "+loaiPhong);
        System.out.println("Giá phòng: "+giaPhong);
        System.out.println("");
    }
    
}
