/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai5;

/**
 *
 * @author Admin
 */
public class XeMay extends PTGT{
    private int congSuat;

    public XeMay() {
    }

    public XeMay(int congSuat) {
        this.congSuat = congSuat;
    }

    public XeMay(int congSuat, String moHinh, int nsx, double giaBan, String mau) {
        super(moHinh, nsx, giaBan, mau);
        this.congSuat = congSuat;
    }
    
    @Override
    public void Input(){
        super.Input();
        System.out.print("Nhập công suất: ");
        congSuat=sc.nextInt();
    }
    
    @Override
    public void Display(){
        super.Display();
        System.out.println("\t"+congSuat);
    }
}
