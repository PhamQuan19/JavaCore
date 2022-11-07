/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kieudulieu;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class KieuDuLieu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        int dienTich=100;
        Scanner sc=new Scanner(System.in);
//        dienTich= sc.nextInt();
//        System.out.println(dienTich);
        float banKinh=3.14342f;
        System.out.printf("%.3f",banKinh);
        System.out.println("");
        int a=100,b=200;
        System.out.println(a+b+" "+"abc");
        
       double PI=3.14f;
        int R=sc.nextInt();
        double chuVi=(double)2*PI*R;
        double dienTich=(double)PI*R*R;
        System.out.printf("%.4f",chuVi);
        System.out.print(" ");
        System.out.printf("%.4f",dienTich);
    }
    
}
