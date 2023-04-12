/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practice4;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        System.out.print("input choice: ");
        choice = Integer.parseInt(sc.nextLine());
        Validate v = new Validate();
        System.out.print("input text: ");
        String txt = sc.nextLine();
        switch (choice) {
            case 1:
                v.f1(txt);
               // System.out.println("count: " + a);
                break;
            case 2:
                v.f2(txt);
                break;
            case 3:
                v.f3(txt);
                break;
            case 4:
                v.f4(txt);
                break;
            case 5:
                v.f5(txt);
                break;
            case 6:
//                int count = v.f6(txt);
//                System.out.println("count: " + count);
                break;
        }

    }
    
}
