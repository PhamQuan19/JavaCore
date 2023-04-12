/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class TuyenSinh {
     public static Scanner sc=new Scanner(System.in);
     public static List<ThiSinh> listThiSinh= new ArrayList<>();
     
     public static void input() {
        System.out.print("Nhap so thi sinh can them: ");
        int N=Integer.parseInt(sc.nextLine());
         for (int i = 0; i < N; i++) {
          //   int choose;

             // System.out.println("Nhap thong tin sinh vien thu "+(i+1));
//             do {
// 
//                 System.out.println("1.Thi sinh khoi A");
//                 System.out.println("2.Thi sinh khoi B");
//                 System.out.println("3.Thi sinh khoi C");
//                 System.out.println("Moi chon chuong trinh");
//                 choose = sc.nextInt();
//                 if (choose < 1 || choose > 3) {
//                     System.out.println("Vui long nhap lai");
//                 }
//             } while (choose < 1 || choose > 3);
             System.out.println("Nhập số báo danh: ");
             String sbd=sc.nextLine();
             if(sbd.charAt(0)=='A'){
                 ThiSinh x=new KhoiA();
                 x.Input();
                 listThiSinh.add(x);
             }
             else if(sbd.charAt(0)=='B'){
                 ThiSinh x=new KhoiB();
                 x.Input();
                 listThiSinh.add(x);
             }else if(sbd.charAt(0)=='C'){
                 ThiSinh x=new KhoiC();
                 x.Input();
                 listThiSinh.add(x);
             }

         }
    }
   
     public static void Output(){
         System.out.println("Danh sach thi sinh: ");
         for (ThiSinh o : listThiSinh) {
             o.Output();
         }
     }
     
     public static void timKiem(){
         System.out.println("Nhap so bao danh can tim kiem");
         String sbd=sc.nextLine();
         boolean check=false;
         for (ThiSinh o : listThiSinh) {
             if(o.getSoBaoDanh().equals(sbd)){
                 o.Output();
                 check=true;
             }
         }
         if(check==false){
             System.out.println("Khong co so bao danh nao");
         }
     }
     public static void main(String[] args) {
//        listThiSinh= new ArrayList<>();
      //  ThiSinh a=new KhoiA();
//        a.Input();
        input();
        Output();
//        timKiem();
        
    }
}
