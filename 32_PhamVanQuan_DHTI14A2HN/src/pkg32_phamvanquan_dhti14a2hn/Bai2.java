/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg32_phamvanquan_dhti14a2hn;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bai2 {
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
    public static void showHoanHao(int[]a,int n){
        for (int i = 0; i < n; i++) {
            if(soHoanHao(a[i])) System.out.print(a[i]+" ");
        }
        
    }
    public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
        System.out.println("Nhap so phan tu mang:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        
        for (int i = 0; i < n; i++) {
            System.out.print("a["+i+"]= ");
            arr[i]=sc.nextInt();
        }
        System.out.println("Cac so hoan hao trong mang: ");
        showHoanHao(arr,n);
    }
}
