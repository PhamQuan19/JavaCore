/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package canbo;

/**
 *
 * @author Admin
 */
public class KiSu extends CanBo{
    private String nganhDT;

    public KiSu() {
    }

    public KiSu(String nganhDT, String hoTen, int tuoi, String gioiTinh, String diaChi) {
        super(hoTen, tuoi, gioiTinh, diaChi);
        this.nganhDT = nganhDT;
    }

    public String getNganhDT() {
        return nganhDT;
    }

    public void setNganhDT(String nganhDT) {
        this.nganhDT = nganhDT;
    }

    @Override
    public String toString() {
        return this.nganhDT+" "+this.getHoTen()+" "+this.getTuoi()+" "+
                this.getGioiTinh()+" "+this.getDiaChi();
    }
    
    
    
}
