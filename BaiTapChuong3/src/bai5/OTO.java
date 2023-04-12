/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai5;

/**
 *
 * @author Admin
 */
public class OTO extends PTGT{
    private int choNgoi;
    private float dongCo;

    public OTO() {
    }

    public OTO(int choNgoi, float dongCo) {
        this.choNgoi = choNgoi;
        this.dongCo = dongCo;
    }

    public int getChoNgoi() {
        return choNgoi;
    }

    public void setChoNgoi(int choNgoi) {
        this.choNgoi = choNgoi;
    }

    public float getDongCo() {
        return dongCo;
    }

    public void setDongCo(float dongCo) {
        this.dongCo = dongCo;
    }

    public OTO(int choNgoi, float dongCo, String moHinh, int nsx, double giaBan, String mau) {
        super(moHinh, nsx, giaBan, mau);
        this.choNgoi = choNgoi;
        this.dongCo = dongCo;
    }
    
     @Override
    public void Input(){
        super.Input();
        System.out.print("Nhập số chỗ: ");
        choNgoi=sc.nextInt();
         System.out.print("Nhập kiểu động cơ: ");
         dongCo=sc.nextFloat();
    }
    
    @Override
    public void Display(){
        super.Display();
        System.out.println("\t"+choNgoi+"\t"+dongCo);
    }
}
