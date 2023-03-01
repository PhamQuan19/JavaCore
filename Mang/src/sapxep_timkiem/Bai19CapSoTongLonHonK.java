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
public class Bai19CapSoTongLonHonK {
    //tim phan tu dau tien > x
    public static int firstPost(int[]a,int l,int r,int x){
        int res=-1;
        while(l<=r){
            int m=(l+r)/2;
            if(a[m]>x){
                res=m;
                r=m-1;
            }else{
                l=m+1;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[]a=new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        long ans=0;
        for (int i = 0; i < n; i++) {
            int pos=firstPost(a, i+1, n-1, k-a[i]);
            if(pos!=-1){
                ans+=n-pos;
            }
        }
        System.out.println(ans);
    }
}
//4 5
//2 3 4 5