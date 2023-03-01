/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package map;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author Admin
 */
public class TanSuat {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        TreeMap<Integer,Integer> map =new TreeMap<>();
        int n=sc.nextInt();
        for (int i = 0; i < n; i++) {
            int x=sc.nextInt();
            if(map.containsKey(x)){
                int tanSuat=map.get(x);
                ++tanSuat;
                map.put(x, tanSuat);
                
            }else{
                map.put(x, 1);
            }
        }
        Set<Map.Entry<Integer,Integer>> entry=map.entrySet();
        for(Map.Entry<Integer,Integer> x: entry){
            System.out.println(x.getKey()+" "+x.getValue());
        }
    }
}
//6
//1 1 2 1 3 4