/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai3;

/**
 *
 * @author Admin
 */
public class XeTai extends XeOTo{
    private int maXe;
    private int bienXe;
    private float trongTai;

    public XeTai() {
    }

    public XeTai(int maXe, int bienXe, float trongTai) {
        this.maXe = maXe;
        this.bienXe = bienXe;
        this.trongTai = trongTai;
    }

    public XeTai(int maXe, int bienXe, float trongTai, String tenXe, String hangXe, int namSX) {
        super(tenXe, hangXe, namSX);
        this.maXe = maXe;
        this.bienXe = bienXe;
        this.trongTai = trongTai;
    }

    public int getMaXe() {
        return maXe;
    }

    public void setMaXe(int maXe) {
        this.maXe = maXe;
    }

    public int getBienXe() {
        return bienXe;
    }

    public void setBienXe(int bienXe) {
        this.bienXe = bienXe;
    }

    public float getTrongTai() {
        return trongTai;
    }

    public void setTrongTai(float trongTai) {
        this.trongTai = trongTai;
    }
    
    @Override
    public void Input(){
        super.Input();
        System.out.print("Nhap ma xe: ");
        maXe=sc.nextInt();
        System.out.print("Nhap bien so: ");
        bienXe=sc.nextInt();
        System.out.print("Nhap tai trong: ");
        trongTai=sc.nextFloat();
    }
    
    @Override
    public void Output(){
        super.Output();
        System.out.println("Ma xe: "+maXe);
        System.out.println("Bien so: "+bienXe);
        System.out.println("Trong tai: "+trongTai);
        System.out.println("");
    }
}
