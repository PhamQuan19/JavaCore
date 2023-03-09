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
//Viết chương trình tìm ước số chung lớn nhất, bội số chung nhỏ nhất của hai số
//tự nhiên a và b.
public class Bai1 {
    // tìm ước số chung lớn nhất
    public static int gcd(int a,int b){
        if (b == 0)
          return a;
        else
            return gcd (b, a % b);
    }
    //bội số chung nhỏ nhất
    public static int lcm(int a,int b){
        return a / gcd(a, b) * b;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap so a: ");
        int a=sc.nextInt();
        System.out.println("Nhap so b: ");
        int b=sc.nextInt();
        System.out.println("Uoc chung lon nhat của 2 so "+a+" va "+b+" là: "+gcd(a,b));
        System.out.println("Boi chung nhỏ nhat của 2 so "+a+" va "+b+" là: "+lcm(a,b));

    }
}
