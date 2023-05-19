/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlkhachsan;

/**
 *
 * @author Admin
 */
public class Phong {
    private String maPhong;
    private String tenPhong;
    private String kieuPhong;
    private boolean trangThai;

    public Phong() {
    }

    public Phong(String maPhong, String tenPhong, String kieuPhong, boolean trangThai) {
        this.maPhong = maPhong;
        this.tenPhong = tenPhong;
        this.kieuPhong = kieuPhong;
        this.trangThai = trangThai;
    }

    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public String getTenPhong() {
        return tenPhong;
    }

    public void setTenPhong(String tenPhong) {
        this.tenPhong = tenPhong;
    }

    public String getKieuPhong() {
        return kieuPhong;
    }

    public void setKieuPhong(String kieuPhong) {
        this.kieuPhong = kieuPhong;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        return  tenPhong ;
    }
    
    
}
