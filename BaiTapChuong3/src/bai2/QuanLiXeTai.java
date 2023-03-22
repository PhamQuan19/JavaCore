/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class QuanLiXeTai {
    public static Scanner sc=new Scanner(System.in);
    public static List<XeTai> listXeTai;
    
    public static void input() {
        System.out.print("Nhap so xe can them: ");
        int N=Integer.parseInt(sc.nextLine());
        for (int i = 0; i < N; i++) {
            XeTai xetai=new XeTai();
            xetai.Input();
            listXeTai.add(xetai);
        }
    }
    
    public static void disPlay() {
        System.out.println("Hien thi thong tin xe");
        for (XeTai xe : listXeTai) {
            xe.Output();
        }
    }
    
    public static void search(){
        System.out.println("Nhap bien so can tim: ");
        int x=sc.nextInt();
        boolean check=false;
         for (XeTai xe : listXeTai) {
            if(xe.getBienSo()==x){
                xe.Output();
                check=true;
            }
        }
         if(check==false){
             System.out.println("Khong tim thay xe nao");
         }
    }
    
    private static void Sort() {
        Collections.sort(listXeTai,new Comparator<XeTai>(){
            @Override
            public int compare(XeTai o1, XeTai o2) {
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
        Scanner sc=new Scanner(System.in);
        listXeTai=new ArrayList<>();
        int choose;
        do{
            Menu();
            choose=sc.nextInt();
            switch (choose) {
                case 1:
                    input();
                    break;
                case 2:
                    search();
                    break;
                case 3:
                    Sort();
                    disPlay();
                    break;
                case 0:
                    break;
                default:
                    throw new AssertionError();
            }
            
        }while(choose!=0);
    }
}
