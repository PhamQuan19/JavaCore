/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapchuong2;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bai11 {
    public static Scanner sc=new Scanner(System.in);
    public static void Nhap(int[]arr,int n){
        for (int i = 0; i < n; i++) {
            System.out.print("arr["+i+"] =");
            arr[i]=sc.nextInt();
        }
    }
    public static void Xuat(int[] arr,int n){
        System.out.println("Mang sau khi nhap: ");
        for (int i = 0; i < n; i++) {
            System.out.print(" "+arr[i]);
        }
    }
    
    public static void sortDESC(int[]arr,int n){
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                if(arr[i]<arr[j]){
                    int tmp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=tmp;
                }
            }
        }
    }
//1.Tạo một mảng gồm các số nguyên đầu vào arr.
//2.Tạo một phương thức findLargestAndSecondLargest để tìm phần tử lớn nhất và lớn thứ hai trong mảng.
//3.Khởi tạo biến largest và secondLargest bằng giá trị đầu tiên của mảng.
//4.Duyệt qua từng phần tử trong mảng và kiểm tra nếu phần tử đó lớn hơn largest
//thì đặt largest bằng giá trị đó và đặt secondLargest bằng giá trị hiện tại của largest.
//5.Nếu phần tử đó lớn hơn secondLargest và khác với largest thì đặt secondLargest bằng giá trị đó.
//6.In ra phần tử lớn nhất và lớn thứ hai.
    public static void findLargestAndSecondLargest(int[]arr,int n){
        int max=arr[0];
        int secondMax=arr[0];
        for (int i = 0; i < n; i++) {
            if(arr[i]>max){
                secondMax=max;
                max=arr[i];
            }else if(arr[i] > secondMax  && arr[i]!= max){
                secondMax=arr[i];
            }
        }
        System.out.println("\nPhan tu lon nhat la: "+max);
        System.out.println("Phan tu lon thu hai la: "+secondMax);
    }
    
    public static int[] insertInSortedOrder(int[]arr,int n,int x){
        int[] result=Arrays.copyOf(arr, n+1);
        int i;
        for ( i = n-1; i >=0; i--) {
            if(arr[i]<x){
                break;
            }
            result[i+1]=arr[i];
        }
        result[i+1]=x;
        return result;
    }
    
    public static void addSort(int[]arr,int n,int x){
        arr[0]=x;
        Arrays.sort(arr);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap so phan tu mang: ");
        int n=sc.nextInt();
        int[] arr=new int[n+1];
        Nhap(arr,n);
        Xuat(arr,n);
        findLargestAndSecondLargest(arr,n);
        sortDESC(arr,n);
        System.out.println("Mang khi sap xep giam dan");
        Xuat(arr,n);
//        System.out.println("\nNhap phan tu x can chen: ");
//        int x=sc.nextInt();
//        arr=insertInSortedOrder(arr,n,x);
//        System.out.println(Arrays.toString(arr));
//        Xuat(arr,n);
    }
}



//public class Main {
//
//    public static int nhap() {
//        Scanner input = new Scanner(System.in);
//        boolean check = false;
//        int n = 0;
//        while (!check) {
//            System.out.print(" ");
//            try {
//                n = input.nextInt();
//                check = true;
//            } catch (Exception e) {
//                System.out.println("Ban phai nhap so! hay nhap lai...");
//                input.nextLine();
//            }
//        }
//        return (n);
//    }
//
//    public static int viTriMaxInt(int a[], int n) {
//        int max = a[0];
//        int key = 0;
//        for (int j = 0; j < n; j++) {
//            if (max < a[j]) {
//                max = a[j];
//                key = j;
//            }
//        }
//        return (key);
//    }
//
//    public static void inArray(int[] a, int begin, int end) {
//        System.out.println();
//        int i;
//        for (i = begin; i < end; i++) {
//            System.out.print(" " + a[i]);
//        }
//        System.out.println();
//    }
//
//    public static int viTriMax2(int[] a, int n) {
//        int i, key = 0, Max2 = 0;
//        for (i = 0; i < n; i++) {
//            if (a[i] > Max2 && a[i] != a[viTriMaxInt(a, n)]) {
//                Max2 = a[i];
//                key = i;
//            }
//        }
//        return (key);
//    }
//
//    public static void themPhanTu(int[] a, int n, int pt) {
//        a[0] = pt;
//        Arrays.sort(a);
//    }
//
//    public static void main(String[] args) {
//        System.out.print("Nhap n= ");
//        int n = nhap();
//        int[] a = new int[n + 1];
//        int i;
//        for (i = 0; i < n; i++) {
//            System.out.print("\n Nhap phan tu thu " + i + " = ");
//            a[i] = nhap();
//        }
//        for (i = 0; i < n; i++) {
//            if (a[i] == a[viTriMax2(a, n)]) {
//                System.out.println(" Phan tu thu " + i + " lon thu 2 trong mang a[" + i + "]= " + a[i]);
//            }
//        }
//        Arrays.sort(a);
//        inArray(a, 1, n + 1);
//        System.out.print("Nhap phan tu muon them pt= ");
//        int pt = nhap();
//        themPhanTu(a, n + 1, pt);
//        inArray(a, 0, n);
//    }
//}
