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
//Viết chương trình chuyển đổi một số tự nhiên ở hệ cơ số 10 thành số ở hệ cơ số
//b bất kì (1< b≤ 36)
public class Bai2 {
        public static String doiCoSo1(int n, int base) {
           String res="";
           while(n>0){
               int du=n%base;
               if(du<10){
                   res=du+res;
               }else{
                   res=(char)(du-10+'A')+res;
               }
               n/=base;
           }
           return res;
        }
        
        public static void doiCoSo(int n, int base) {
        if (n >= base) {
            doiCoSo(n / base, base);
        }
        if (n % base > 9) {
            System.out.printf("%c", n % base + 55);
        } else {
            System.out.print((n % base));
        }
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
            System.out.println("Nhap n");
            int n = nhap();
            System.out.println("Nhap vao co so can chuyen sang b");
            int b = nhap();
            System.out.print("So " + n + " chuyen sang co so " + b + " thanh: "+doiCoSo1(n, b));
//            doiCoSo(n, b);
        }
    
}

//3295
//16

//101010
//16