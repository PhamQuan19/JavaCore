/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de6;

/**
 *
 * @author Admin
 */
public class NhanVien {
    private String Ma;
    private String HoTen;
    private String DiaChi;

    public NhanVien() {
    }

    public NhanVien(String Ma, String HoTen, String DiaChi) {
        this.Ma = Ma;
        this.HoTen = HoTen;
        this.DiaChi = DiaChi;
    }

    public String getMa() {
        return Ma;
    }

    public void setMa(String Ma) {
        this.Ma = Ma;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    
}
