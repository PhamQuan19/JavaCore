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
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println(binarySearch(arr, n, x));
    }
}
