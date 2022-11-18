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
public class B2SinhVien {
    private String Name,birthday;
    private float subject1,subject2,subject3;
//    private float sumMark;

    public B2SinhVien() {
    }

    public B2SinhVien(String Name, String birthday, float subject1, float subject2, float subject3) {
        this.Name = Name;
        this.birthday = birthday;
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
    }
    
    public float sumMark(){
        return this.subject1+this.subject2+this.subject3;
    }

    @Override
    public String toString() {
        String sf = String.format("%.1f", sumMark());
        return this.Name+" "+this.birthday+" "+sf;
        
    }
    
    public String chuanHoa(String s){
        StringBuilder sb=new StringBuilder(s);
        if(sb.charAt(1)=='/') sb.insert(0, "0");
        if(sb.charAt(4)=='/') sb.insert(3, "0");
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        String birthday=sc.nextLine();
        float mark1=sc.nextFloat();
        float mark2=sc.nextFloat();
        float mark3=sc.nextFloat();
        B2SinhVien sv=new B2SinhVien(name,birthday,mark1,mark2,mark3);
        System.out.println(sv);
    }
    
}
