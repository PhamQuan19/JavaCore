/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de15oop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class DanhSach {
    public static List<XeMay> listXeMay=new ArrayList<>();
    public static Scanner sc=new Scanner(System.in);

    
    public static void Input(){
        String choose;
        do{
            XeMay xemay=new XeMay();
            xemay.Nhap();
            listXeMay.add(xemay);
            System.out.println("Tiếp tục nhập? Y/N");
            choose=sc.nextLine();
            
            
        }while(!choose.equals("N"));
        
    }
    
    public static void Output(){
        for (XeMay o : listXeMay) {
            o.Xuat();
        }
    }
    
    
    public static void TimMau(){
        System.out.println("Nhập màu xe cần tìm kiếm: ");
        String mau=sc.nextLine();
        for (XeMay o : listXeMay) {
            if(o.getMauXe().equals(mau)){
                o.Xuat();
            }
        }
    }
    
    public static void demHonda(){
        int cnt=0;
        for (XeMay o : listXeMay) {
            if(o.getHangXe().equals("Honda")){
                cnt++;
            }
        }
        System.out.println("Số xe Honda trong danh sách: "+cnt);
    }
    
    public static void main(String[] args) {
        Input();
        Output();
        TimMau();
        demHonda();
    }
}
