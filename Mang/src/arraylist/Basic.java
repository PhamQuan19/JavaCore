/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Admin
 */
public class Basic {
    public static int tongChuSO(int n){
        int sum=0;
        while(n!=0){
            sum+=n%10;
            n/=10;
        }
        return sum;
    }
    public static void main(String[] args) {
//        ArrayList<Integer> arr=new ArrayList<Integer>();
//        List<Integer> arr1=new ArrayList<Integer>();
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(22);
        arr.add(11);
        arr.add(8);
        arr.add(33);
        arr.add(9);
        arr.add(14);
        
        Collections.sort(arr,new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2) {
                return tongChuSO(o1)-tongChuSO(o2);
            }
            
        });
        for(int x: arr){
            System.out.print(x+" ");
        }
        
    }
}
