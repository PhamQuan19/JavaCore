/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitap;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class B4NhanVien {
    private String maNv;
    private String hoTen;
    private String gioiTinh;
    private String ngaySinh,diaChi,msThue,ngayKiHD;

    public B4NhanVien() {
    }

    public B4NhanVien(String maNv, String hoTen, String gioiTinh, String ngaySinh,
            String diaChi, String msThue, String ngayKiHD) {
        this.maNv = maNv;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.msThue = msThue;
        this.ngayKiHD = ngayKiHD;
    }
    
    public String chuanHoa(String s){
        StringBuilder sb=new StringBuilder(s);
        if(s.charAt(1) =='/') sb.insert(0,'0');
        if(s.charAt(4) =='/') sb.insert(3,'0');
        return sb.toString();
    }

    @Override
    public String toString() {
        return this.maNv+" "+this.hoTen+" "+this.gioiTinh+" "+chuanHoa(this.ngaySinh)+" "+
                this.diaChi+" "+this.msThue+" "+chuanHoa(this.ngayKiHD); 
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String hoTen=sc.nextLine();
        String gioiTinh=sc.nextLine();
        String ngaySinh=sc.nextLine();
        String diaChi=sc.nextLine();
        String msThue=sc.nextLine();
        String ngyKiHD=sc.nextLine();
        
        B4NhanVien nv=new B4NhanVien("00001", hoTen, gioiTinh, ngaySinh, diaChi, msThue, ngyKiHD);
        System.out.println(nv);
    }
    
    
}
