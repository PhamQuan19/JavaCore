/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapchuong2;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bai10 {
    public static void menu(){
        System.out.println("1:Tính tổng các số từ 1 đến n");
        System.out.println("2:Kiểm tra n có là số nguyên tố");
        System.out.println("3:Kiểm tra n có là số hoàn hảo");
        System.out.println("4:In ra các số nguyên tố từ 1 đến n");
        System.out.println("5:In ra các số hoàn hảo từ 1 đến n");
        System.out.println("6:Hiển thị số n thành tích các thừa số nguyên tố");
    }
    
    public static long tinhTong(int n){
        long sum=0;
        for (int i = 0; i <= n; i++) {
            sum+=i;
        }
        return sum;
    }
    
    public static boolean nguyenTo(int n){
        for (int i = 2; i <=Math.sqrt(n); i++) {
            if(n%i==0) return false;
        }
        return n>1;
    }
    
    public static boolean checkHH(int n){
        int sum=0;
        for (int i = 1; i <= n/2; i++) {
            if(n%i==0){
                sum+=i;
            }
        }
        if(sum==n) return true;
         return false;
    }
    
    public static void phanTich(int n){
        for (int i = 2; i <= Math.sqrt(n); i++) {
            while(n%i==0){
                System.out.print(i+" x ");
                n/=i;
            }
        }
        if(n!=1) System.out.print(n);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap n: ");
        int n=sc.nextInt();
         int choose;
        
        do {
            menu();
            System.out.println("Moi chon chuong trinh: ");
            choose = sc.nextInt();
            switch(choose) {
                case 1:
                    System.out.println("Tong cac so tu 1->n: "+tinhTong(n));
                    break;
                case 2:
                    if(nguyenTo(n)) System.out.println(n+" là số nguyên tố");
                    else System.out.println(n+" không phải số nguyên tố");
                    break;
                case 3:
                    if(checkHH(n)) System.out.println(n+" Là số hoàn hảo");
                    else System.out.println(n+" Không phải số hoàn hảo");
                    break;
                case 4:
                    for (int i = 0; i <= n; i++) {
                        if(nguyenTo(i)){
                            System.out.print(i+" ");
                        }
                    }
                    System.out.println("");
                    break;
                case 5:
                    System.out.println("So hoan hao ");
                    for (int i = 1; i <= n; i++) {
                        if(checkHH(i)){
                            System.out.print(i+" ");
                        }
                    }
                    System.out.println("");
                    break;
                case 6:
                    System.out.println("Phan Tich cac thua so nguyen to:");
                    phanTich(n);
                    break;
                case 0:
                    break;
            }
        } while(choose != 0);
    }
    
}
