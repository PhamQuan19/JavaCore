/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sapxep_timkiem;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author Admin
 */
public class Bai21HopVaGiao {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        TreeSet<Integer> set =new TreeSet<>();
        TreeMap<Integer,Integer> map =new TreeMap<>();
        for (int i = 0; i < n; i++) {
            int x=sc.nextInt();
            set.add(x);
            map.put(x, 1);
        }
        
        for (int i = 0; i < m; i++) {
            int x=sc.nextInt();
            set.add(x);
            if(map.containsKey(x)){
                map.put(x, 2);
            }
        }
        
        Set<Map.Entry<Integer,Integer>> entrySet=map.entrySet();
        for(Map.Entry<Integer,Integer> entry: entrySet){
            if(entry.getValue()==2){
                System.out.print(entry.getKey()+" ");
            }
        }
        
        System.out.println("");
        for(int x:set){
            System.out.print(x+" ");
        }
        
        
    }
}
//3 5
//1 2 3
//1 2 9 5 3
