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
public class KhoiB extends ThiSinh{
    private float toan,hoa,sinh;

    public KhoiB() {
    }

    public KhoiB(float toan, float hoa, float sinh, String soBaoDanh, String hoTen, String diaChi, float uuTien) {
        super(soBaoDanh, hoTen, diaChi, uuTien);
        this.toan = toan;
        this.hoa = hoa;
        this.sinh = sinh;
    }

    public float getToan() {
        return toan;
    }

    public void setToan(float toan) {
        this.toan = toan;
    }

    public float getHoa() {
        return hoa;
    }

    public void setHoa(float hoa) {
        this.hoa = hoa;
    }

    public float getSinh() {
        return sinh;
    }

    public void setSinh(float sinh) {
        this.sinh = sinh;
    }
    
    Scanner sc=new Scanner(System.in);
    @Override
    public void Input(){
        super.Input();
        System.out.println("Nhap diem toan: ");
        this.setToan(sc.nextFloat());
        System.out.println("Nhap diem hoa:");
        this.setHoa(sc.nextFloat());
        System.out.println("Nhap diem sinh:");
        this.setSinh(sc.nextFloat());
    }
    
    @Override
    public void Output(){
        super.Output();
        System.out.println("Diem toan: "+this.getToan());
        System.out.println("Diem hoa: "+this.getHoa());
        System.out.println("Diem sinh: "+this.getSinh());
        System.out.println("");
    }
}
