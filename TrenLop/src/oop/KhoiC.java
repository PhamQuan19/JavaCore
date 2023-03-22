/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class KhoiC extends ThiSinh{
    private float van,su,dia;

    public KhoiC() {
    }

    public KhoiC(float van, float su, float dia, int soBaoDanh, String hoTen, String diaChi, float uuTien) {
        super(soBaoDanh, hoTen, diaChi, uuTien);
        this.van = van;
        this.su = su;
        this.dia = dia;
    }

    public float getVan() {
        return van;
    }

    public void setVan(float van) {
        this.van = van;
    }

    public float getSu() {
        return su;
    }

    public void setSu(float su) {
        this.su = su;
    }

    public float getDia() {
        return dia;
    }

    public void setDia(float dia) {
        this.dia = dia;
    }
    
    Scanner sc=new Scanner(System.in);
    
    @Override
    public void Input(){
        super.Input();
        System.out.println("Nhap diem van: ");
        this.setVan(sc.nextFloat());
        System.out.println("Nhap diem su: ");
        this.setSu(sc.nextFloat());
        System.out.println("Nhap diem dia:");
        this.setDia(sc.nextFloat());
    }
    
    @Override
    public void Output(){
        super.Output();
        System.out.println("Diem van: "+this.getVan());
        System.out.println("Diem su: "+this.getSu());
        System.out.println("Diem dia: "+this.getDia());
        System.out.println("");
    }
}
