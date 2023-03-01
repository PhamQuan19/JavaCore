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
public class Bai20DienSoConThieu {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
        }
        int[] cnt=new int[1000001];
        int L=Integer.MAX_VALUE, R=Integer.MIN_VALUE;
        
        for (int i = 0; i < n; i++) {
            cnt[a[i]]=1;
            L=Math.min(L,a[i]);
            R=Math.max(R, a[i]);
        }
        
        int ans=0;
        for (int i = L; i <=R ; i++) {
            if(cnt[i]==0){
                ++ans;
            }
        }
        System.out.println(ans);
    }
}
//5
//4 5 3 8 6