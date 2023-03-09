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
//Viết chương trình phân tích một số nguyên thành các thừa số nguyên tố
// Ví dụ: Số 28 được phân tích thành 2 x 2 x 7

//Gap 1 
public class Bai4 {
    public static void phanTich(int n){
        for (int i = 2; i <= Math.sqrt(n); i++) {
            while(n%i==0){
                System.out.print(i+" x ");
                n/=i;
            }
        }
        if(n!=1) System.out.print(n);
    }
    public static int nhap() {
        Scanner input = new Scanner(System.in);
        boolean check = false;
        int n = 0;
        while (!check) {
            System.out.print(" ");
            try {
                n = input.nextInt();
                check = true;
            } catch (Exception e) {
                System.out.println("Ban phai nhap so! hay nhap lai...");
                input.nextLine();
            }
        }
        return (n);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap n: ");
        int n=nhap();
        System.out.print("n= ");
        phanTich(n);
    }
}

