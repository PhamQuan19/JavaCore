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
public class OTO extends PTGT implements TinhGia {

    private int soChoNgoi;

    public OTO() {
        super();
    }

    public OTO( String soKhungXe, int namSanXuat, double giaBan, String mau,int soChoNgoi) {
        super(soKhungXe, namSanXuat, giaBan, mau);
        this.soChoNgoi = soChoNgoi;
    }

    public int getSoChoNgoi() {
        return soChoNgoi;
    }

    public void setSoChoNgoi(int soChoNgoi) {
        this.soChoNgoi = soChoNgoi;
    }
    @Override
    public String toString(){
        return super.toString()+"\t$"+getGia()+"\t"+soChoNgoi;
    }
    @Override
    public double getGia(){
        Calendar cal=Calendar.getInstance();
        int yearNow=cal.get(Calendar.YEAR);
        if(yearNow - this.getNamSanXuat()>5){
            return this.getGiaBan()*0.7;
        }
        return this.getGiaBan();
    }
    

}
