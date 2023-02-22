/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package function;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class BaiTap {
    public static void demUoc(){
        Scanner sc=new Scanner(System.in);
        long res=1;
        int t=sc.nextInt();
        for (int i = 0; i < t; i++) {
            int p=sc.nextInt();
            int e=sc.nextInt();
            res*=(e+1);
            res%=1000000007;
        }
        System.out.println(res);
    }
    
    public static boolean nguyenTo(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return n>1;
    }
    
    public static int legendre(int n,int p){
        int res=0;
        for (int i = p; i <=n; i*=p) {
            res+=n/i;
        }
        return res;
    }
    
    public static boolean hoanHao(long n){
        for (int p = 0; p <=32; p++) {
            if(nguyenTo(p)){
                long tmp=(long)Math.pow(2, p)-1;
                long hh=(long)Math.pow(2,p-1)*tmp;
                if(hh==n) return true;
            }
        }
        return false;
    }
    
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        demUoc();
//        int n=sc.nextInt();
//        long res=1;
//        for (int i = 1; i <=n; i++) {
//            if(nguyenTo(i)){
//                int bac=legendre(n, i);
//                res*=(bac+1);
//                res%=1000000007;
//            }
//        }
//        System.out.println(res);

        long n=sc.nextLong();
        System.out.println(hoanHao(n));
    }
}
