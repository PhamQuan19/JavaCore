/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de8;

/**
 *
 * @author Admin
 */
public class HangHoa {
    private String maMaH;
    private String tenMH;
    private String chatLieu;
    private String DVT;
    private String NSX;

    public HangHoa() {
    }

    public HangHoa(String maMaH, String tenMH, String chatLieu, String DVT, String NSX) {
        this.maMaH = maMaH;
        this.tenMH = tenMH;
        this.chatLieu = chatLieu;
        this.DVT = DVT;
        this.NSX = NSX;
    }

    public String getMaMaH() {
        return maMaH;
    }

    public void setMaMaH(String maMaH) {
        this.maMaH = maMaH;
    }

    public String getTenMH() {
        return tenMH;
    }

    public void setTenMH(String tenMH) {
        this.tenMH = tenMH;
    }

    public String getChatLieu() {
        return chatLieu;
    }

    public void setChatLieu(String chatLieu) {
        this.chatLieu = chatLieu;
    }

    public String getDVT() {
        return DVT;
    }

    public void setDVT(String DVT) {
        this.DVT = DVT;
    }

    public String getNSX() {
        return NSX;
    }

    public void setNSX(String NSX) {
        this.NSX = NSX;
    }
    
    
}
