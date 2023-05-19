/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de14oop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class DanhSach {
    public static List<SinhVien> listSV=new ArrayList<>();
    public static Scanner sc=new Scanner(System.in);
    
    public static void Input(){
        System.out.println("Nhập số sinh viên: ");
        int n=sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin cho sinh viên thứ "+(i+1));
            SinhVien sv=new SinhVien();
            sv.Nhap();
            listSV.add(sv);
        }
    }
    
    public static void Output(){
        for (SinhVien o : listSV) {
            o.HienThi();
        }
    }
    
    public static void f2(){
        for (SinhVien o : listSV) {
            if(o.getQueQuan().equals("Nam Dinh") && o.getDiem()>=7){
                o.HienThi();
            }
        }
    }
    
    public static float diemMax(){
        float diem=listSV.get(0).getDiem();
        for (int i = 0; i < listSV.size(); i++) {
            if(listSV.get(i).getDiem()>diem){
                diem=listSV.get(i).getDiem();
            }
        }
        return diem;
    }
    public static void f3(){
        for (SinhVien o : listSV) {
            float max=diemMax();
            if(o.getQueQuan().equals("Nam Dinh") && o.getDiem()==diemMax()){
                o.HienThi();
            }
        }
    }
    
    
    public static void main(String[] args) {
        Input();
        Output();
        System.out.println("sinh viên quê quán ở Nam Dinh và điểm thi >=7");
        f2();
        System.out.println("Sinh viên quê quán Nam Dinh có điêm cao nhất");
        f3();
    }
}
