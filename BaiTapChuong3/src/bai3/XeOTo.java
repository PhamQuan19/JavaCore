/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai3;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class XeOTo {
    private String tenXe;
    private String hangXe;
    private int namSX;

    public XeOTo() {
    }

    public XeOTo(String tenXe, String hangXe, int namSX) {
        this.tenXe = tenXe;
        this.hangXe = hangXe;
        this.namSX = namSX;
    }

    public String getTenXe() {
        return tenXe;
    }

    public void setTenXe(String tenXe) {
        this.tenXe = tenXe;
    }

    public String getHangXe() {
        return hangXe;
    }

    public void setHangXe(String hangXe) {
        this.hangXe = hangXe;
    }

    public int getNamSX() {
        return namSX;
    }

    public void setNamSX(int namSX) {
        this.namSX = namSX;
    }
    Scanner sc=new Scanner(System.in);
    public void Input(){
        System.out.print("Nhap ten xe: ");
        tenXe=sc.nextLine();
        System.out.print("Nhap hang xe: ");
        hangXe=sc.nextLine();
        System.out.print("Nhap nam san xuat: ");
        namSX=sc.nextInt();
    }
    
    public void Output(){
        System.out.println("Ten xe: "+tenXe);
        System.out.println("Hang xe: "+hangXe);
        System.out.println("Nam san xuat: "+namSX);
    }
    public int getBienXe(){
        return 0;
    }
    public float getTrongTai(){
        return 0;
    }
}
