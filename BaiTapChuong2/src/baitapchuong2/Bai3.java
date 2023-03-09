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

//Hãy viết chương trình tính tổng các chữ số của một số nguyên bất kỳ. Ví dụ:
//Số 8545604 có tổng các chữ số là: 8+5+4+5+6+0+4= 32
public class Bai3 {
    public static long sumNumber(long n){
        long du;long sum=0;
        while(n!=0){
            du=n%10;
            sum+=du;
            n/=10;
        }
        return sum;
    }
     public static int tinhTong(long i) {
        int sum = 0;
        long n;
        while (i != 0) {
            n = i % 10;
            sum += n;
            i /= 10;
        }
        return (sum);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        System.out.println("Tong: "+sumNumber(n));
    }
    
   
}




