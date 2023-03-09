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
public class Bai12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng phần tử trong mảng: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Nhập dãy số nguyên:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int minDistance = Integer.MAX_VALUE;
        for (int i = 0; i < n - 1; i++) {
            int distance = Math.abs(arr[i] - arr[i + 1]);
            if (distance < minDistance) {
                minDistance = distance;
            }
        }

        System.out.println("Khoảng cách ngắn nhất giữa hai số liền kề: " + minDistance);
    }

}

//1.Chương trình bắt đầu bằng việc yêu cầu người dùng nhập số lượng phần tử của mảng.
//2.Tiếp theo, chương trình khởi tạo một mảng arr với số phần tử là n,
//sau đó yêu cầu người dùng nhập dãy số nguyên.
//3.Sau khi nhập dãy số nguyên, chương trình duyệt từ đầu đến cuối mảng và tính khoảng
//cách giữa mỗi cặp số liền kề bằng cách sử dụng hàm Math.abs() để lấy giá trị tuyệt đối của hiệu giữa hai số.
//4.Trong quá trình tính toán khoảng cách, chương trình cập nhật giá trị 
//nhỏ nhất tìm được bằng cách so sánh khoảng cách hiện tại với giá trị nhỏ nhất đã biết trước đó.
//5.Sau khi tính toán xong, chương trình in ra khoảng cách ngắn nhất giữa hai số liền kề.