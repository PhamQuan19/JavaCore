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
public class Bai17CapSoTongBangK {
    
    public static int firstPos(int[]a,int l,int r,int x){
        int res=-1;
        while(l<=r){
            int m=(l+r)/2;
            if(a[m]==x){
                res=m;
                r=m-1;
            }
            else if(a[m]<x){
                l=m+1;
            }else{
                r=m-1;
            }
        }
        return res;
    }
    
    public static int lastPos(int[] a,int l,int r,int x){
        int res=-1;
        while(l<=r){
            int m=(l+r)/2;
            if(a[m]==x){
                res=m;
                l=m+1;
            }
            else if(a[m]<x){
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
        int[]a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        long ans=0;
        for(int i=0;i<n;i++){
            int pos1=firstPos(a, i+1, n-1, k-a[i]);
            int pos2=lastPos(a, i+1, n-1, k-a[i]);
            if(pos1!=-1){
                ans+=pos2-pos1+1;
            }
        }
        System.out.println(ans);
    }
}
//4 4
//2 2 2 2 