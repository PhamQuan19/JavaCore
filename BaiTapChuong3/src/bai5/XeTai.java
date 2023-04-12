/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai5;

/**
 *
 * @author Admin
 */
public class XeTai extends PTGT{
    private float taiTrong;

    public XeTai() {
    }

    public XeTai(float taiTrong) {
        this.taiTrong = taiTrong;
    }
    
     @Override
    public void Input(){
        super.Input();
        System.out.print("Nhập tải trọng: ");
        taiTrong=sc.nextFloat();
    }
    
    @Override
    public void Display(){
        super.Display();
        System.out.println("\t"+taiTrong);
    }
    
}
