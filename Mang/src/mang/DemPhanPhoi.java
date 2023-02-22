/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mang;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class DemPhanPhoi {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        int[] cnt=new int[1001];
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
            cnt[a[i]]++;
        }
        int[] cnt2 =new int[1001];
        for (int i = 0; i < 1001; i++) {
            cnt2[i]=cnt[i];
        }
        for (int i = 0; i < n; i++) {
            if(cnt[a[i]]!=0){
                System.out.println(a[i]+" "+cnt[a[i]]);
                cnt[a[i]]=0;
            }
        }
        System.out.println("");
        for (int i = 0; i < 1000; i++) {
            if(cnt2[i]!=0){
                System.out.println(i+ " "+cnt2[i]);
            }
        }
        int maxFre =0,maxValue=-1;
        for (int i = 0; i <= 1000; i++) {
            if(cnt2[i]!=0 && cnt2[i]>=maxFre){
                maxFre=cnt2[i];
                maxValue=i;
            }
        }
        int minFre=1000000,minValue=-1;
        for (int i = 0; i <= 1000; i++) {
            if(cnt2[i]!=0 && cnt2[i]<minFre){
                minFre=cnt2[i];
                minValue=i;
            }
        }
        System.out.println("");
        System.out.println(maxValue);
        System.out.println(minValue);
        
    }
}
//13
//660 133 177 168 602 422 716 595 614 626 576 53 550