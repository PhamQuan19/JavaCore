/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kethua;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Worker> arrList=new ArrayList<>();
        Worker w0=new Worker("Nguyen van a",30,20);
        Worker w1=new Worker("Nguyen van b",20,10);
        Worker w2=new Worker("Nguyen van c",30,20);
        Worker w3=new Worker("Nguyen van d",10,30);
        
        arrList.add(w0);
        arrList.add(w1);
        arrList.add(w2);
        arrList.add(w3);
        
        DoWork d=new DoWork();
       // d.dispalay(arrList);
//        d.add(arrList);
        d.add1(arrList);
    }
}
