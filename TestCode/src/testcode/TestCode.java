/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testcode;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class TestCode {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng phần tử của mảng: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Nhập các phần tử của mảng: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Các số có giá trị bằng tổng các chữ số của nó có trong mảng là: ");
        for (int i = 0; i < n; i++) {
            int sum = 0;
            int num = arr[i];
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            if (sum == arr[i]) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
   
