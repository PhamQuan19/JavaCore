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
public class KhoiA extends ThiSinh{
    private float toan,li,hoa;

    public KhoiA() {
    }

    public float getToan() {
        return toan;
    }

    public void setToan(float toan) {
        this.toan = toan;
    }

    public float getLi() {
        return li;
    }

    public void setLi(float li) {
        this.li = li;
    }

    public float getHoa() {
        return hoa;
    }

    public void setHoa(float hoa) {
        this.hoa = hoa;
    }

    
    public KhoiA(float toan, float li, float hoa, int soBaoDanh, String hoTen,
            String diaChi, float uuTien) {
        super(soBaoDanh, hoTen, diaChi, uuTien);
        this.toan = toan;
        this.li = li;
        this.hoa = hoa;
    }
    Scanner sc=new Scanner(System.in);
    
    @Override
    public void Input(){
        super.Input();
        System.out.println("Nhap diem toan: ");
        this.setToan(sc.nextFloat());
        System.out.println("Nhap diem li: ");
        this.setLi(sc.nextFloat());
        System.out.println("Nhap diem hoa:");
        this.setHoa(sc.nextFloat());
    }
    
    @Override
    public void Output(){
        super.Output();
        System.out.println("Diem toan: "+this.getToan());
        System.out.println("Diem li: "+this.getLi());
        System.out.println("Diem hoa: "+this.getHoa());
        System.out.println("");
    }
//    public static void main(String[] args) {
//        KhoiA a=new KhoiA();
//        a.Input();
//        a.Output();
//    }
}
