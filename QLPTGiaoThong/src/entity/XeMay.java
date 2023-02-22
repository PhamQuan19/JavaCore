/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.util.Calendar;

/**
 *
 * @author Admin
 */
public class XeMay extends PTGT implements TinhGia{
    private double congSuat;

    public XeMay() {
        super();
    }

    public XeMay( String soKhungXe, int namSanXuat, double giaBan, String mau,double congSuat) {
        super(soKhungXe, namSanXuat, giaBan, mau);
        this.congSuat = congSuat;
    }

    public double getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(double congSuat) {
        this.congSuat = congSuat;
    }
    
    @Override
    public double getGia() {
        Calendar cal=Calendar.getInstance();
        int yearNow=cal.get(Calendar.YEAR);
        if(yearNow - this.getNamSanXuat()>5){
            return this.getGiaBan()*0.9;
        }
        return this.getGiaBan();
    }
    
}
