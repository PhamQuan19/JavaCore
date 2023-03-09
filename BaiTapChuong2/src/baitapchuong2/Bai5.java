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
//Viết chương trình liệt kê tất cả các số nguyên tố nhỏ hơn n cho trước.
public class Bai5 {
    public static int[] prime=new int[1000001];
    public static void sang(){
        for (int i = 1; i <=1000000 ; i++) {
            prime[i]=1;
        }
        prime[0]=prime[1]=0;
        for (int i = 2; i <= Math.sqrt(1000000); i++) {
            if(prime[i]==1){
                for (int j = i*i; j <= 10000000; j+=i) {
                    prime[j]=0;
                }
            }
        }
    }
    
    public static boolean nguyenTo(int n){
        for (int i = 2; i <=Math.sqrt(n); i++) {
            if(n%i==0) return false;
        }
        return n>1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        sang();
        System.out.println("Nhap n: ");
        int n=sc.nextInt();
        for (int i = 0; i < n; i++) {
            if(nguyenTo(i)){
                System.out.print(i+" ");
            }
        }
    }
}
