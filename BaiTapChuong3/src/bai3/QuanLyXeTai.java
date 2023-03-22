/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class QuanLyXeTai {
    public static Scanner sc=new Scanner(System.in);
    public static List<XeOTo> listXe=new ArrayList<>();
    
    public static void input(){
        System.out.println("Nhap so xe can them: ");
        int n=sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("\nNhap thong tin xe thu "+(i+1));
            XeOTo xe=new XeTai();
            xe.Input();
            listXe.add(xe);
        }
    }
    
    public static void display(){
        System.out.println("Danh sach xe tai");
        for (XeOTo o : listXe) {
           o.Output();
        }
    }
    
    public static void timBien(){
        System.out.println("Nhap bien so xe can tim kiem: ");
        int x=sc.nextInt();
        boolean check=true;
        for (XeOTo o : listXe) {
            if(o.getBienXe()==x){
                o.Output();
            }
        }
    }
    
    public static void Sort(){
        Collections.sort(listXe, new Comparator<XeOTo>(){
            @Override
            public int compare(XeOTo o1, XeOTo o2) {
                if(o1.getTrongTai() > o2.getTrongTai()){
                    return 1;
                }
                return -1;
            }
            
        });
    }
    
    public static void Menu(){
        System.out.println("1.Them xe tai");
        System.out.println("2.Tim kiem bien so");
        System.out.println("3.Danh sach tang dan theo tai trong");
        System.out.println("0.Thoat");
        System.out.println("Nhap lua chon: ");
    }
    
    
    
    public static void main(String[] args) {
        int choose;
        do{
            Menu();
            choose=sc.nextInt();
            switch (choose) {
                case 1:
                    input();
                    break;
                case 2:
                    timBien();
                    break;
                case 3:
                    Sort();
                    display();
                    break;
                case 0:
                    break;
                default:
                    throw new AssertionError();
            }
        }while(choose!=0);
    }
}
