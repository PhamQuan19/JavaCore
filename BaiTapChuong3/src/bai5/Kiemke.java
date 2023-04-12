/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Kiemke {
    public static List<PTGT> listPTGT=new ArrayList<>();
    public static Scanner sc=new Scanner(System.in);
    
    public static void Menu(){
        System.out.println("Mời chọn chương trình");
        System.out.println("1.Nhập đăng kí phương tiện");
        System.out.println("2.Tìm phương tiện theo mô hình");
        System.out.println("3.Tìm phương tiện theo màu");
        System.out.println("0.Thoát");
    }
    
    public static void Nhap(){
            int choose;
            do{
                System.out.println("1.Ô tô");
                System.out.println("2.Xe máy");
                System.out.println("3.Xe tải");
                System.out.println("0.Thoát");
                System.out.println("Chọn chương trình");
                choose=sc.nextInt();
                switch (choose) {
                    case 1:
                        PTGT x=new OTO();
                        x.Input();
                        listPTGT.add(x);
                        break;
                    case 2:
                        PTGT y=new XeMay();
                        y.Input();
                        listPTGT.add(y);
                        break; 
                        
                    case 3:
                        PTGT z=new XeTai();
                        z.Input();
                        listPTGT.add(z);
                        break;
                    case 0:
                        break;
                    default:
                        throw new AssertionError();
                }
            }while(choose !=0);
                
    }
    
    
    public static void Display(){
        for (PTGT ptgt : listPTGT) {
            ptgt.Display();
        }
    }
    
    public static void timMauXe(){
        System.out.print("Nhập màu cần tìm: ");
        String mau=sc.nextLine();
        for (PTGT ptgt : listPTGT) {
            if(ptgt.getMau().equals(mau)){
                ptgt.Display();
            }
        }
    }
    
    public static void timMoHinh(){
        System.out.print("Nhập mô hình cần tìm: ");
        String moHinh=sc.nextLine();
        for (PTGT ptgt : listPTGT) {
            if(ptgt.getMoHinh().equals(moHinh)){
                ptgt.Display();
            }
        }
    }
    
    
    
    public static void main(String[] args) {
        int choose;
        do{
            Menu();
            choose=sc.nextInt();
            switch (choose) {
                case 1:
                    Nhap();
                    break;
                case 2:
                    timMoHinh();
//                    Display();
                    break;
                case 3:
                    timMauXe();
                    break;
                case 0:
                    break;
                default:
                    throw new AssertionError();
            }
        }while(choose!=0);
    }
}
