/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kethua;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class DoWork implements IWorker{

    @Override
    public void dispalay(ArrayList<Worker> arrList) {
        for (Worker o : arrList) {
            o.display();
        }
    }

    @Override
    public void add(ArrayList<Worker> arrList) {
       
        Worker w=new Worker("Pham anh quan",10,20);
//        arrList.add(w);
//        for (Worker o : arrList) {
//            System.out.println(o);
//        }

        //tim ra thang co luong thap nhat dau tien va add w vao sau no
        double min=arrList.get(0).getSalaryPerday();
//        for (int i = 0; i < arrList.size(); i++) {
//            if(min > arrList.get(i).getSalaryPerday()){
//                min=arrList.get(i).getSalaryPerday();
//            }
//        }
        
        for (Worker o : arrList) {
            if(min> o.getSalaryPerday()){
                min=o.getSalaryPerday();
            }
        }
        //ket thuc vong for tim dc thang co luong thap nhat
        int index=0;
        for (int i = 0; i < arrList.size(); i++) {
            if(arrList.get(i).getSalaryPerday()==min){
                index=i;
                break;
            }
        }
        arrList.add(index+1,w);
         for (Worker o : arrList) {
            System.out.println(o);
        }
         
    }
    
    public void add1(ArrayList<Worker> arrList){
        Worker w=new Worker("Pham anh quan",10,20);
        double luongMin=arrList.get(0).getSalaryPerday() * arrList.get(0).getWorday();
        for (Worker o : arrList) {
            double luong=o.getSalaryPerday()* o.getWorday();
            if(luongMin > luong){
                luongMin=luong;
            }
        }
         //ket thuc vong for tim dc thang co tong luong thap nhat
        int index=0;
        for (int i = 0; i < arrList.size(); i++) {
            double luong=arrList.get(i).getSalaryPerday()*arrList.get(i).getWorday();
            if(luong==luongMin){
                index=i;
                break;
            }
        }
        arrList.add(index+1,w);
         for (Worker o : arrList) {
            System.out.println(o);
        }
    }

    @Override
    public void update(ArrayList<Worker> arrList, int index) {
        for (int i = 0; i < arrList.size(); i++) {
            if(i==index){
                Scanner sc=new Scanner(System.in);
                System.out.print("Input name: ");
                String name=sc.nextLine();
                System.out.print("Input salaryPerday: ");
                double salaryPerday=sc.nextDouble();
                System.out.print("Input worday: ");
                int worday=sc.nextInt();
                
                arrList.get(i).setName(name);
                arrList.get(i).setSalaryPerday(salaryPerday);
                arrList.get(i).setWorday(worday);
                break;
                
            }
        }
    }

    @Override
    public void delete(ArrayList<Worker> arrList, int index) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<Worker> list5(ArrayList<Worker> arrList) {
        Collections.sort(arrList, new Comparator<Worker>(){
            @Override
            public int compare(Worker o1, Worker o2) {
                //sap xep giam dan theo totalsalary
                double total1=o1.getSalaryPerday()*o1.getWorday();
                double total2=o2.getSalaryPerday()*o2.getWorday();
                if(total1>total2){
                    return -1;
                }else if(total1<total2){
                    return 1;
                }else return 0;
            }
            
        });
        ArrayList<Worker> top5=new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            top5.add(arrList.get(i));
        }
        return top5;
    }
    
}
