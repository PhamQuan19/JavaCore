/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de2cau1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class KhuPho extends Nguoi{
    private int soNguoi;
    private int soNha;

    public KhuPho() {
    }

    public KhuPho(int soNguoi, int soNha) {
        this.soNguoi = soNguoi;
        this.soNha = soNha;
    }

    public KhuPho(int soNguoi, int soNha, String hoTen, int tuoi, int namSinh, String ngheNghiep) {
        super(hoTen, tuoi, namSinh, ngheNghiep);
        this.soNguoi = soNguoi;
        this.soNha = soNha;
    }

    public int getSoNguoi() {
        return soNguoi;
    }

    public void setSoNguoi(int soNguoi) {
        this.soNguoi = soNguoi;
    }

    public int getSoNha() {
        return soNha;
    }

    public void setSoNha(int soNha) {
        this.soNha = soNha;
    }
    
    Scanner sc=new Scanner(System.in);
    @Override
    public void Nhap(){
        super.Nhap();
        System.out.print("Nhap so nguoi: ");
        soNguoi=sc.nextInt();
        System.out.println("Nhap so nha");
        soNha=sc.nextInt();
        System.out.println("");
    }
    
    @Override
    public void Display(){
        super.Display();
        System.out.println("So nguoi: "+soNguoi);
        System.out.println("So nha: "+soNha);
        System.out.println("");
    }
    
    
}
