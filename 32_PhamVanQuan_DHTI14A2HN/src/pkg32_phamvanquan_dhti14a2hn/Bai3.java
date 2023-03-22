/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg32_phamvanquan_dhti14a2hn;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bai3 {
       public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        System.out.print("Nhap xau ky tu: ");
        String st = scanner.nextLine();

        String[] words = st.split("\\W+"); // Tach chuoi st thanh cac tu, loi bo cac ky tu dac biet

        for (int i = 0; i < words.length; i++) {
            if (words[i].equalsIgnoreCase("hoc")) { 
                count++;
            }
        }

        System.out.println("So lan xuat hien tu 'hoc' trong chuoi: " + count);
    }
}
