/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai5;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class DeQuy {
    public static void hello(){
        System.out.println("Hello");
        hello(); //goi lai chinh no
    }
    public static int tong(int n){
        if(n==1) return 1;
        else return n+tong(n-1);
    }
    public static int nCk(int n,int k){
        if( k==0 || n==k) return 1;
        else{
            return nCk(n-1,k-1) +nCk(n-1,k);
        }
    }
    
    public static void in1(long n){
        if(n<10){
            System.out.print(n);
        }else{
            System.out.print(n%10+" ");
            in1(n/10);
        }
    }
    
    public static void in2(long n){
        if(n<10) System.out.print(n+" ");
        else{
            in2(n/10);
            System.out.print(n%10+" ");
        }
    }
    

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        System.out.println(tong(5));
          //to hop 
//          int n=sc.nextInt();
//          int k=sc.nextInt();
//          System.out.println(nCk(n, k));
        //in so
//        long n=sc.nextLong();
//        in2(n);System.out.println("");
//        in1(n);

    
    }
}
