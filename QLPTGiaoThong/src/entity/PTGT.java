/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author Admin
 */
public class PTGT {
    private String soKhungXe;
    private int namSanXuat;
    private double giaBan;
    private String mau;

    public PTGT() {
    }

    public PTGT(String soKhungXe, int namSanXuat, double giaBan, String mau) {
        this.soKhungXe = soKhungXe;
        this.namSanXuat = namSanXuat;
        this.giaBan = giaBan;
        this.mau = mau;
    }

    public String getSoKhungXe() {
        return soKhungXe;
    }

    public void setSoKhungXe(String soKhungXe) {
        this.soKhungXe = soKhungXe;
    }

    public int getNamSanXuat() {
        return namSanXuat;
    }

    public void setNamSanXuat(int namSanXuat) {
        this.namSanXuat = namSanXuat;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    public String getMau() {
        return mau;
    }

    public void setMau(String mau) {
        this.mau = mau;
    }

    @Override
    public String toString() {
        return soKhungXe +"\t" + namSanXuat + "\t" + giaBan + "\t" + mau ;
    }

    
   
    
    
    
    
}
