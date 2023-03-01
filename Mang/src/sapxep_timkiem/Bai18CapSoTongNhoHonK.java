/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sapxep_timkiem;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bai18CapSoTongNhoHonK {
    //tim vi tri cuoi cung cua phan tu < x
    public static int lastPos(int[]a,int l,int r,int x){
        int res=-1;
        while(l<=r){
            int m=(l+r)/2;
            if(a[m]<x){
                res=m;
                l=m+1;
            }else{
                r=m-1;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[]a =new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        long ans=0;
        for (int i = 0; i < n; i++) {
            int pos=lastPos(a, i+1, n-1, k-a[i]);
            if(pos!=-1){
                ans+=pos-i;
            }
        }
        System.out.println(ans);
    }
}
//4 5
//2 2 2 2