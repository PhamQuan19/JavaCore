/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de4oop;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class KHACHHANG {
    private String maKH;
    private String hoTen, diaChi,ngayLapHD;
    private double soKW, donGia, dinhMuc;

    public KHACHHANG() {
    }

    public KHACHHANG(String maKH, String hoTen, String diaChi, String ngayLapHD, double soKW, double donGia, double dinhMuc) {
        this.maKH = maKH;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.ngayLapHD = ngayLapHD;
        this.soKW = soKW;
        this.donGia = donGia;
        this.dinhMuc = dinhMuc;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
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

    public String getNgayLapHD() {
        return ngayLapHD;
    }

    public void setNgayLapHD(String ngayLapHD) {
        this.ngayLapHD = ngayLapHD;
    }

    public double getSoKW() {
        return soKW;
    }

    public void setSoKW(double soKW) {
        this.soKW = soKW;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public double getDinhMuc() {
        return dinhMuc;
    }

    public void setDinhMuc(double dinhMuc) {
        this.dinhMuc = dinhMuc;
    }
    
    Scanner sc=new Scanner(System.in);
    public void NhapKhachHang(){
        System.out.print("Nhập mã: ");
        maKH=sc.nextLine();
        System.out.print("Nhập họ tên: ");
        hoTen=sc.nextLine();
        System.out.print("Nhập địa chỉ: ");
        diaChi=sc.nextLine();
        System.out.print("Ngày lập hoá đơn: ");
        ngayLapHD=sc.nextLine();
        System.out.print("Nhập số KW điện: ");
        soKW=sc.nextDouble();
        System.out.print("Nhập đơn giá: ");
        donGia=sc.nextDouble();
        System.out.print("Nhập định mức: ");
        dinhMuc=sc.nextDouble();
    }

    
    public void HienThiKhachHang(){
        System.out.println("ma= " + maKH + ", hoTen= " + hoTen + ", diaChi= " 
                + diaChi + ", ngayLapHD= " + ngayLapHD + ", soKW= " 
                + soKW + ", donGia= " + donGia + ", dinhMuc= " + dinhMuc+"Thanhtien= "+ThanhTien());
    }
    
    public double ThanhTien() {
        double thanhTien=0;
        if(soKW <= dinhMuc){
            thanhTien=soKW*donGia;
        }else{
            thanhTien=(soKW* donGia*dinhMuc)+(soKW-dinhMuc)*donGia*2.5;
        }
        
        return thanhTien;
    }
    
    
}
