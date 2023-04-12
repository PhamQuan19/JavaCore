/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class KhuPho {
    private int soThanhVien;
    private int soNha;

    public KhuPho() {
    }

    public KhuPho(int soThanhVien, int soNha) {
        this.soThanhVien = soThanhVien;
        this.soNha = soNha;
    }

    public int getSoThanhVien() {
        return soThanhVien;
    }

    public void setSoThanhVien(int soThanhVien) {
        this.soThanhVien = soThanhVien;
    }

    public int getSoNha() {
        return soNha;
    }

    public void setSoNha(int soNha) {
        this.soNha = soNha;
    }
    Scanner sc=new Scanner(System.in);
    public void Input(){
        System.out.println("Nhap so thanh vien: ");
        soThanhVien=sc.nextInt();
        System.out.println("Nhap so nha: ");
        soNha=sc.nextInt();
    }
    
    public void Display(){
        System.out.println("So thanh vien: "+soThanhVien);
        System.out.println("So nha: "+soNha);
    }
}
