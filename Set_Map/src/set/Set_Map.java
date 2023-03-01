/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Admin
 */
public class Set_Map {
   
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       // Set<Integer> set=new HashSet<Integer>();
//        LinkedHashSet<Integer> set = new LinkedHashSet<>(); //giua nguyen thu tu truyen vao
        TreeSet<Integer> set=new TreeSet<Integer>(); //dc sap xep tang dan
        
        set.add(100);
        set.add(200);
        set.add(100);
        set.add(300);
        set.add(200);
        set.add(5);
        for(int x : set){
            System.out.println(x);
        }
        System.out.println(set.first());
        System.out.println(set.last());
        System.out.println("Phan tu lon nhat ma nho hon 150: "+set.lower(150));
        System.out.println("Phan tu nho nhat ma lon hon Or bang 150: "+set.ceiling(150));
        System.out.println("Tra ve phan tu lon nhat trong set ma <= 150: "+set.floor(150));
        
//        System.out.println(set.size());
//        System.out.println(set.isEmpty());
 //cho 1 mang gom n so nguyen ==> co bao nhieu phan tu khac nhau trong set
        
        int n=sc.nextInt();
        Set<Integer> set1=new HashSet<>();
        for (int i = 0; i < n; i++) {
            int x=sc.nextInt();
            set1.add(x);
        }
        System.out.println(set1.size());
    }
    
}
