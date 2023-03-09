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
public class Bai7 {
    //in ra n so fibo
    public static void solve(int n){
        System.out.print("0 1 ");
        long fn1=1,fn2=0;
        for (int i = 3; i <= n; i++) {
            long fn=fn1+fn2;
            System.out.print(fn+" ");
            fn2=fn1;
            fn1=fn;
        }
    }
    //in ra so fibo thu n
    public static long solve1(int n){
        if(n==1) return 0;
        if(n==2) return 1;
        long fn1=1,fn2=0, fn=0;
        
        for (int i = 3; i <= n; i++) {
            fn=fn1+fn2;
            fn2=fn1;
            fn1=fn;
        }
        return fn;
    }
    
    public static void solve2(int n){
        long[] fibo=new long[n+1];
        fibo[0]=0;
        fibo[1]=1;
        for (int i = 2; i < n; i++) {
            fibo[i]=fibo[i-1]+fibo[i-2];
        }
     
        for (int i = 0; i <= n; i++) {
            System.out.print(fibo[n]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap n: ");
        int n=sc.nextInt();
        System.out.println("so fibo thu "+n+" là: "+solve1(n));
    }
}
