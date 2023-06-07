/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de22oop;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class SoPhuc {
    private float Thuc;
    private float Ao;

    public SoPhuc() {
    }

    public SoPhuc(float Thuc, float Ao) {
        this.Thuc = Thuc;
        this.Ao = Ao;
    }

    public float getThuc() {
        return Thuc;
    }

    public void setThuc(float Thuc) {
        this.Thuc = Thuc;
    }

    public float getAo() {
        return Ao;
    }

    public void setAo(float Ao) {
        this.Ao = Ao;
    }
    Scanner sc=new Scanner(System.in);
    public void Nhap(){
        System.out.print("Nhập phần thực: ");
        Thuc=sc.nextFloat();
        System.out.print("Nhập phần ảo: ");
        Ao=sc.nextFloat();
    }
    
    public void Xuat(){
        System.out.println(Thuc+" + "+Ao+"i");
    }
    
    // Phương thức tính tổng hai số phức
    public SoPhuc cong(SoPhuc soPhuc) {
        float tongThuc = this.Thuc + soPhuc.Thuc;
        float tongAo = this.Ao + soPhuc.Ao;
        return new SoPhuc(tongThuc, tongAo);
    }
}
