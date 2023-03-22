/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraylistsinhvien;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {
    public static void menu(){
        System.out.println("1.Add Student");
        System.out.println("2.Display list student");
        System.out.println("3.Remove student");
        System.out.println("4.Edit student");
    }
    public static void main(String[] args) {
        Vali v = (Vali) new Validate();
        Scanner sc = new Scanner(System.in);
        List<Student> list = new ArrayList<>();
        list.add(new Student("nguyen van a", 19, 8.5));
        list.add(new Student("le van b", 17, 8.5));
        list.add(new Student("trinh van c", 21, 8.5));
        list.add(new Student("hoang van d", 22, 8.5));
        list.add(new Student("dang van e", 15, 8.5));
        while (true) {
            int index = 0;
            int choice = 0;
            menu();
            System.out.print("input choice: ");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    v.add(list);
                    break;
                case 2:
                    v.display(list);
                    break;
                case 3:
                    System.out.print("input remove index: ");
                    index = Integer.parseInt(sc.nextLine());
                    v.remove(list, index);
                    break;
                case 4:
                    System.out.print("input edit index: ");
                    index = Integer.parseInt(sc.nextLine());
                    v.edit(list, index);
                    break;
                case 0:
                    System.exit(0);
                    break;
            }
        }
    }
}
