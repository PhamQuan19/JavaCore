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
public class ViTriMin_Max {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        int minValue=Integer.MAX_VALUE, maxValue=Integer.MIN_VALUE;
        int pos1=-1,pos2=-1;
        for(int i=0;i<n;i++){
            if(a[i]<=minValue){
                minValue=a[i];
                pos1=i;
            }
            if(a[i]> maxValue){
                maxValue=a[i];
                pos2=i;
            }
        }
        System.out.println(pos1+" "+pos2);
    }
}

//9
//936 234 471 169 834 82 290 674 881