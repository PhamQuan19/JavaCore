/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sapxep_timkiem;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class timkiem {
    public static boolean linearSearch(int[]a,int n,int x){
        for (int i = 0; i < n; i++) {
            if(a[i]==x) return true;
        }
        return false;
    }
    public static boolean binarySearch(int[]a,int n,int x){
        int left=0,right=n-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(a[mid]==x){
                return true;
            }else if(a[mid]<x){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return false;
    }
    //tim vi tri xuat hien dau tien va xuat hien cuoi cung cua 1 pt trong mang da sap xep
    public static int firtsPost(int[]a,int n,int x){
        int res=-1;
        int left=0,right=n-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(a[mid]==x){
                res=mid;
                right=mid-1;
            }else if(a[mid]<x){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return res;
    }
    
    //tim vi tri xuat hien cuoi cung 1 pt trong mang sap xep
    public static int lastPost(int[]a,int n ,int x){
        int res=-1;
        int left=0,right=n-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(a[mid]==x){
                res=mid;
                //tim them ơ ben phai
                left=mid+1;
            }else if(a[mid]<x){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return res;
    }
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
      //  System.out.println(binarySearch(arr, n, x));
        System.out.println(firtsPost(arr, n, x));
        System.out.println(lastPost(arr, n, x));
    }
}
//7 2
//1 2 2 2 4 5 8