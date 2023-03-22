/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraylistsinhvien;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Validate implements Vali{

    @Override
    public void add(List<Student> list) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Input name: ");
        String name=sc.nextLine();
        System.out.print("Input age: ");
        int age=Integer.parseInt(sc.nextLine());
        System.out.print("Input mark: ");
        double mark=Double.parseDouble(sc.nextLine());
        Student s=new Student(name, age, mark);
        list.add(s);
    }

    @Override
    public void display(List<Student> list) {
        for (Student student : list) {
            System.out.println(student);
        }
    }

    @Override
    public void remove(List<Student> list, int i) {
        for (int j = 0; j < list.size(); j++) {
            if(j==i){
                list.remove(j);
                break;
            }
        }
        
    }

    @Override
    public void edit(List<Student> list, int i) {
        for (int j = 0; j < list.size(); j++) {
            if(j==i){
                Scanner sc=new Scanner(System.in);
                System.out.print("Input name: ");
                String name=sc.nextLine();
                System.out.print("Input age: ");
                int age=Integer.parseInt(sc.nextLine());
                System.out.print("Input mark: ");
                double mark=Double.parseDouble(sc.nextLine());
                
                list.get(j).setName(name);
                list.get(j).setAge(age);
                list.get(j).setMark(mark);
                break;
            }
        }
    }
    
}
