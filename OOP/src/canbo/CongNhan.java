/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package canbo;

/**
 *
 * @author Admin
 */
public class CongNhan extends CanBo{
    private int Bac;

    public CongNhan() {
    }

    public CongNhan(int Bac) {
        this.Bac = Bac;
    }

    public CongNhan(int Bac, String hoTen, int tuoi, String gioiTinh, String diaChi) {
        super(hoTen, tuoi, gioiTinh, diaChi);
        this.Bac = Bac;
    }

    public int getBac() {
        return Bac;
    }

    public void setBac(int Bac) {
        this.Bac = Bac;
    }

    @Override
    public String toString() {
         return this.Bac+" "+this.getHoTen()+" "+this.getTuoi()+" "+
                this.getGioiTinh()+" "+this.getDiaChi();
    }
    
    
}
