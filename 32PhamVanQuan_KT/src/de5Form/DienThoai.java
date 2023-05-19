/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de5Form;

/**
 *
 * @author Admin
 */
public class DienThoai {
    private String maDT;
    private String hangSX;
    private int namSX;
    private int soLg;

    public DienThoai() {
    }

    public DienThoai(String maDT, String hangSX, int namSX, int soLg) {
        this.maDT = maDT;
        this.hangSX = hangSX;
        this.namSX = namSX;
        this.soLg = soLg;
    }

    public String getMaDT() {
        return maDT;
    }

    public void setMaDT(String maDT) {
        this.maDT = maDT;
    }

    public String getHangSX() {
        return hangSX;
    }

    public void setHangSX(String hangSX) {
        this.hangSX = hangSX;
    }

    public int getNamSX() {
        return namSX;
    }

    public void setNamSX(int namSX) {
        this.namSX = namSX;
    }

    public int getSoLg() {
        return soLg;
    }

    public void setSoLg(int soLg) {
        this.soLg = soLg;
    }
    
}
