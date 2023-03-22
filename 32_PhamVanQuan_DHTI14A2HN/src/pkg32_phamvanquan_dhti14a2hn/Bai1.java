/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg32_phamvanquan_dhti14a2hn;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bai1 {

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        double epsilon, sum = 0.0, term = 0.0;
          int n=1;

        System.out.print("Nhap do chinh xac epsilon: ");
        epsilon = sc.nextDouble();
//        while (term < epsilon) {
//            term = 1.0 / (n * n);
//            sum += term;
//            n++;
//
//        }
        for (n = 1; ; n++) 
        {
            term = 1.0 / (n * n); // Tính giá trị của từng phần tử trong tổng

            if (term < epsilon) 
            {
                break; // Nếu giá trị của phần tử nhỏ hơn epsilon thì dừng vòng lặp
            }
            sum += term; // Cộng giá trị của phần tử vào tổng
        }

        System.out.println("Tong S la: " + sum + " voi do chinh xac epsilon la: " + epsilon);
    }
}







//    
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter the value of a: ");
//        double a = sc.nextDouble();
//
//        System.out.print("Enter the value of epsilon: ");
//        double epsilon = sc.nextDouble();
//
//        double sum = 0.0;
//        double term = 1.0;
//        int i = 1;
//
//        while (term > epsilon) {
//            term = 1.0 / Math.pow(i * a, 2);
//            sum += term;
//            i++;
//        }
//
//        System.out.println("The sum is: " + sum);
//    }
//}

