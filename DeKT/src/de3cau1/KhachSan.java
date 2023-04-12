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
public class KhachSan extends Nguoi{
    private int soNgayTro;
    private String loaiTro;
    private float giaPhong;

    public KhachSan() {
    }

    public KhachSan(int soNgayTro, String loaiTro, float giaPhong) {
        this.soNgayTro = soNgayTro;
        this.loaiTro = loaiTro;
        this.giaPhong = giaPhong;
    }

    public KhachSan(int soNgayTro, String loaiTro, float giaPhong, String hoTen, int tuoi, int namSinh, String cmnd) {
        super(hoTen, tuoi, namSinh, cmnd);
        this.soNgayTro = soNgayTro;
        this.loaiTro = loaiTro;
        this.giaPhong = giaPhong;
    }

    public int getSoNgayTro() {
        return soNgayTro;
    }

    public void setSoNgayTro(int soNgayTro) {
        this.soNgayTro = soNgayTro;
    }

    public String getLoaiTro() {
        return loaiTro;
    }

    public void setLoaiTro(String loaiTro) {
        this.loaiTro = loaiTro;
    }

    public float getGiaPhong() {
        return giaPhong;
    }

    public void setGiaPhong(float giaPhong) {
        this.giaPhong = giaPhong;
    }
    Scanner sc=new Scanner(System.in);
    
    @Override
    public void Nhap(){
        super.Nhap();
        System.out.print("Nhập số ngày trọ: ");
        soNgayTro=sc.nextInt(); sc.nextLine();
        System.out.print("Nhập loại trọ: ");
        loaiTro=sc.nextLine();
        System.out.print("Nhập giá trọ: ");
        giaPhong=sc.nextFloat();
        System.out.println("");
    }
    
    @Override
    public void Xuat(){
        super.Xuat();
        System.out.println("Số ngày: "+soNgayTro);
        System.out.println("Loại trọ: "+loaiTro);
        System.out.println("Giá: "+giaPhong);
    }
    
}
