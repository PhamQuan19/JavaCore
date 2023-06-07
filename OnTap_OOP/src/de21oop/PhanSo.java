/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de21oop;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class PhanSo {
    private int tu;
    private int mau;

    public PhanSo() {
        this.tu = 0;
        this.mau = 1;
    }

    public PhanSo(int tu, int mau) {
        this.tu = tu;
        this.mau = mau;
    }

    public int getTu() {
        return tu;
    }

    public void setTu(int tu) {
        this.tu = tu;
    }

    public int getMau() {
        return mau;
    }

    public void setMau(int mau) {
        this.mau = mau;
    }
    Scanner sc=new Scanner(System.in);
    public void Nhap(){
        System.out.println("Nhập tử số: ");
        tu=sc.nextInt();
        System.out.println("Nhập mẫu số: ");
        mau=sc.nextInt();
    }
    
    public void HienThi() {
        System.out.println(tu + "/" + mau);
    }
    
    public int gcd(int a,int b){
        if(b==0){
            return a;
        }else{
            return gcd(b,a%b);
        }
              
    }
    
    public void rutGon(){
        int ucln=gcd(tu,mau);
        tu=tu/ucln;
        mau=mau/ucln;
    }
    
    public PhanSo cong(PhanSo ps) {
        int tongTu = tu * ps.mau + mau * ps.tu;
        int tongMau = mau * ps.mau;
        PhanSo tong = new PhanSo(tongTu, tongMau);
        return tong;
    }
    public boolean lonHon(PhanSo ps) {
        double giaTriHienTai = (double) tu / mau;
        double giaTriSoSanh = (double) ps.tu / ps.mau;

        return giaTriHienTai > giaTriSoSanh;
    }
  
}
