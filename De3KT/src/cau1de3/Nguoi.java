/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cau1de3;

/**
 *
 * @author Admin
 */
public class Nguoi {
    private String hoTen;
    private int tuoi;
    private int namSinh;
    private String cmnd;

    public Nguoi() {
    }

    public Nguoi(String hoTen, int tuoi, int namSinh, String cmnd) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.namSinh = namSinh;
        this.cmnd = cmnd;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    
    
}
