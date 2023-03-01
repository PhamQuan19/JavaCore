/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiTap;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Admin
 */
public class TruyVan {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Set<Integer> set=new HashSet<>();
        int n=sc.nextInt();
        for (int i = 0; i < n; i++) {
            int x=sc.nextInt();
            set.add(x);
        }
        int q=sc.nextInt();
        while(q-- >0){
            int x=sc.nextInt();
            if(set.contains(x)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
//5
//1 2 1 3 4
//2
//1
//6