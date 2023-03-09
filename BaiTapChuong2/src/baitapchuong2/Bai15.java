/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapchuong2;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bai15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập một xâu: ");
        String string = input.nextLine();
        String reverse_string = "";

        for (int i = string.length() - 1; i >= 0; i--) {
            reverse_string += string.charAt(i);
        }

        System.out.println("Xâu đảo ngược là: " + reverse_string);
    }
}
