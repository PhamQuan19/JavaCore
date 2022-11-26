/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package canbo;

/**
 *
 * @author Admin
 */
public class NhanVien extends CanBo{
    private String congViec;

    public NhanVien() {
    }

    public NhanVien(String congViec, String hoTen, int tuoi, String gioiTinh, String diaChi) {
        super(hoTen, tuoi, gioiTinh, diaChi);
        this.congViec = congViec;
    }

    public String getCongViec() {
        return congViec;
    }

    public void setCongViec(String congViec) {
        this.congViec = congViec;
    }

    @Override
    public String toString() {
        return this.congViec+" "+this.getHoTen()+" "+this.getTuoi()+" "+
                this.getGioiTinh()+" "+this.getDiaChi();
    }
    
    
}
