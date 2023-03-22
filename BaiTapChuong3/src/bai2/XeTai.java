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
public class XeTai extends XeOTo{
    private int maXe;
    private int bienSo;
    private float trongTai;

    public XeTai(String tenXe, String hangSX, int namSX) {
        super(tenXe, hangSX, namSX);
    }

    public XeTai() {
        super(null, null, 0);
    }

    public XeTai(int maXe, int bienSo, float trongTai, String tenXe, String hangSX, int namSX) {
        super(tenXe, hangSX, namSX);
        this.maXe = maXe;
        this.bienSo = bienSo;
        this.trongTai = trongTai;
    }

    public void Input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap ma xe: ");
        maXe=sc.nextInt();
        System.out.println("Nhap bien so: ");
        bienSo=sc.nextInt();
        System.out.println("Nhap trong tai: ");
        trongTai=sc.nextInt();
    }
   
    public void Output(){
        System.out.println("Ma xe: "+maXe);
        System.out.println("Bien so: "+bienSo);
        System.out.println("Tai trong: "+trongTai);
        System.out.println("");
    }

    public int getMaXe() {
        return maXe;
    }

    public void setMaXe(int maXe) {
        this.maXe = maXe;
    }

    public int getBienSo() {
        return bienSo;
    }

    public void setBienSo(int bienSo) {
        this.bienSo = bienSo;
    }

    public float getTrongTai() {
        return trongTai;
    }

    public void setTrongTai(float trongTai) {
        this.trongTai = trongTai;
    }
    
    
}
