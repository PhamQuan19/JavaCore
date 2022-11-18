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
public class B3SinhVien {
    private String maSv;
    private String Name;
    private String ngaySinh;
    private String Lop;
    private float gpa;

    public B3SinhVien() {
        this.maSv=this.Name=this.Lop=this.ngaySinh="";
        this.gpa=0;
    }

    public B3SinhVien(String maSv, String Name, String ngaySinh, String Lop, float gpa) {
        this.maSv = maSv;
        this.Name = Name;
        this.Lop = Lop;
        this.ngaySinh=ngaySinh;
        this.gpa = gpa;
    }
    
    public String chuanHoa(String s){
        StringBuilder sb=new StringBuilder(s);
        if(sb.charAt(1)=='/') sb.insert(0, "0");
        if(sb.charAt(4)=='/') sb.insert(3, "0");
        return sb.toString();
    }

    @Override
    public String toString() {
        String sf = String.format("%.2f", this.gpa);
        return this.maSv+" "+this.Name+" "+this.Lop+" "+chuanHoa(this.ngaySinh)+" "+sf;
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        String maSv;
        String hoTen=sc.nextLine();
        String Lop=sc.nextLine();
        String NgaySinh=sc.nextLine();
        float gpa=sc.nextFloat();
        
        B3SinhVien sv=new B3SinhVien("SV001",hoTen,NgaySinh, Lop,gpa);
        System.out.println(sv);
    }
    
}
