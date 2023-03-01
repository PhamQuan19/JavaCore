/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author Admin
 */
public class Basic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        Map<Integer,Integer> map=new HashMap<>();
//        LinkedHashMap<Integer,Integer> map=new LinkedHashMap<>();
        TreeMap<Integer,Integer> map=new TreeMap<>();
        map.put(10, 20);
        map.put(20, 30);
        map.put(30, 40);
        map.put(600, 20);
        map.put(50, 20);
        System.out.println(map.size());
        Set<Map.Entry<Integer,Integer>> entry=map.entrySet();
        for(Map.Entry<Integer,Integer> x: entry){
            System.out.println(x.getKey()+" "+x.getValue());
        }
        System.out.println(map.firstEntry());
        System.out.println(map.lastEntry());
        System.out.println(map.firstKey());
        System.out.println(map.lastKey());
        
    }
}
