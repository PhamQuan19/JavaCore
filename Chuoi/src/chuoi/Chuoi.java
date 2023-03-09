/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chuoi;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author Admin
 */
public class Chuoi {

    /**
     * @param args the command line arguments
     */
    public static boolean soNguyenTo(int n){
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if(n%i==0) return false;
        }
        return n>1;
    }
    
    public static boolean soHoanHao(int n){
        int sum=0;
        for (int i = 1; i <= n/2; i++) {
            if(n%i==0){
                sum+=i;
            }
        }
        if(sum==n) return true;
        return false;
    }
    
    public static int daoNguoc(int n){
        int res=0, rever=0;
        while(n!=0){
            res=n%10;
            rever=rever*10+res;
            n/=10;
        }
        return rever;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap so phan tu mang:");
        int n=sc.nextInt();
//        int[] arr=new int[n];
//        
//        for (int i = 0; i < n; i++) {
//            arr[i]=sc.nextInt();
//        }
//        System.out.println("Cac so nguyen to:");
//        for (int i = 0; i < n; i++) {
//            if(soNguyenTo(arr[i])){
//                System.out.print(arr[i]+" ");
//            }
//        }
//        
//        System.out.println("\nCac so hoan hao: ");
//        for (int i = 0; i < n; i++) {
//            if(soHoanHao(arr[i])){
//                System.out.print(arr[i]+" ");
//            }
//        }
//        

        System.out.println(daoNguoc(n));
        
        
    }
    
}
