/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de11OOP;

/**
 *
 * @author Admin
 */
public class Sach extends TaiLieu{
    private String tacGia;
    private int namXB;
    private float giaTien;

    public Sach() {
    }

    public Sach(String tacGia, int namXB, float giaTien) {
        this.tacGia = tacGia;
        this.namXB = namXB;
        this.giaTien = giaTien;
    }

    public Sach(String tacGia, int namXB, float giaTien, String maTL, String tenTL, int soXB) {
        super(maTL, tenTL, soXB);
        this.tacGia = tacGia;
        this.namXB = namXB;
        this.giaTien = giaTien;
    }
    
    public int NXB(){
        return namXB;
    }
    @Override
    public void Nhap(){
        super.Nhap();
        System.out.print("Nhập tác giả: ");
        tacGia=sc.nextLine();
        System.out.print("Nhập năm xuất bản: ");
        namXB=sc.nextInt();
        System.out.print("Nhập giá tiền: ");
        giaTien=sc.nextFloat();
    }
    
    @Override
    public void Xuat(){
        super.Xuat();
        System.out.println("Tác giả: "+tacGia);
        System.out.println("Năm XB: "+namXB);
        System.out.println("Giá tiền: "+giaTien);
    }
    
}
