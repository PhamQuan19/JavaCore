/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentlist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Admin
 */
public class Main {
     public void f0(List<Student> list) {
        for (Student o : list) {
            System.out.println(o);
        }
    }

    //dem xem co bao nhieu student co diem >5
    public int f1(List<Student> list) {
        int count = 0;
        for (Student o : list) {
            if(o.getMark() >=5){
                count++;
            }
        }
        return count;
    }

    //dem xem co bao nhieu student dat 10 diem
    public int f2(List<Student> list) {
        int count = 0;
        for (Student o : list) {
            if(o.getMark()==10){
                count++;
            }
        }
        return count;
    }

    //sap xep list tang dan theo tuoi
    public void f3(List<Student> list) {
        Collections.sort(list,new Comparator<Student>(){
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge()-o2.getAge();
            }
            
        });

    }
    //sap xep list tang dan theo diem
    public void f4(List<Student> list) {
          Collections.sort(list,new Comparator<Student>(){
              @Override
              public int compare(Student o1, Student o2) {
                  if(o1.getMark()>o2.getMark()){
                      return 1;
                  }else if(o1.getMark()<o2.getMark()){
                      return -1;
                  }else{
                      return 0;
                  }
              }
              
          });
    }
   

    //hien thi thong tin cua ban "nguyen van b"
    public Student f5(List<Student> list) {
        for (Student o : list) {
            if(o.getName().equals("nguyen van b")){
                return o;
            }
        }
        return null;
    }

    //hien thi ra thong tin cua nhung sinh vien co diem 10
    public ArrayList<Student> f6(List<Student> list) {
        ArrayList<Student> list10 = new ArrayList<>();
        for (Student o : list) {
            if(o.getMark() == 10){
                list10.add(o);
            }
        }
        return list10;
    }

    public void Display(List<Student> list){
        for (Student o : list) {
            System.out.println(o);
        }
    }
    public static void main(String[] args) {
        Main m = new Main();
        Student s0 = new Student("nguyen van g", 20, 10);
        Student s1 = new Student("nguyen van c", 21, 5.5);
        Student s2 = new Student("nguyen van k", 19, 4.5);
        Student s3 = new Student("nguyen van b", 20, 9.5);
        Student s4 = new Student("nguyen van e", 18, 10);
        Student s5 = new Student("nguyen van a", 26, 7.5);
        Student s6 = new Student("nguyen van l", 25, 6.5);
        List<Student> list = new ArrayList<>();
        list.add(s0);
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);
        list.add(s6);

        //fo
        System.out.println("----------------fo--------------");
        m.f0(list);
        
        //f1
        System.out.println("----------------f1--------------");
        int count1 = m.f1(list);
        System.out.println("so sv co diem > 5 la: " + count1);

        //f2
        System.out.println("----------------f2--------------");
        int count2 = m.f2(list);
        System.out.println("so sv dat 10 diem la: " + count2);

        //f3
        m.f3(list);
        System.out.println("----------------f3--------------");
        System.out.println("------danh sach sinh vien tang dan theo tuoi----------");
        m.Display(list);
        //f4
        m.f4(list);
        System.out.println("----------------f4--------------");
        System.out.println("------danh sach sinh vien tang dan theo mark----------");
        m.Display(list);
        //f5
        System.out.println("----------------f5--------------");
        Student s = m.f5(list);
        System.out.println("------thong tin la-------");
        System.out.println(s);
        
        
        //f6
        System.out.println("----------------f6--------------");
        System.out.println("--------list sinh vien 10 diem------");
        List<Student> list1 = m.f6(list);
        //uncomment after complete f6
        for (Student o : list1) {
            System.out.println(o);
        }

    }
}
