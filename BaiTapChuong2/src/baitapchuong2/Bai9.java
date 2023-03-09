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
public class Bai9 {

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
    public static void nhapMT(int[][] A, int n, int m){
        int i, j;
        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
                System.out.print("A[" + (i + 1) + "][" + (j + 1) + "]= ");
                A[i][j] = nhap();
            }
            System.out.println("");
        }
    }
    public static void inMT(int[][] A, int n, int m) {
        int i, j;
        for (i = 0; i < n; i++) {
            System.out.print("\n");
            for (j = 0; j < m; j++) {
                System.out.print(" " + A[i][j]);
            }
        }
    }

    public static int findMaxMT(int[][] A, int n, int m) {
        int Max = A[0][0];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (Max < A[i][j]) {
                    Max = A[i][j];
                }
            }
        }
        return (Max);
    }
    
     public static void MaxMT(int[][] A, int n, int m){
         //Tim phan tu max 
         int i,j;
        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
                if (A[i][j] == findMaxMT(A, n, m)) {
                    System.out.println("\nPhan tu o hang " + i + " cot " + j + " dat Max: A[" + i + "][" + j + "]= " + A[i][j]);
                }
            }
        }
     }
    
    public static boolean Prime(int n){
        for (int i = 2; i <=Math.sqrt(n); i++) {
            if(n%i==0) return false;
        }
        return n>1;
    }
    public static void inMTNT(int[][] A, int n, int m) {
        System.out.print("Ma tran so nguyen to: ");
        int i, j;
        for (i = 0; i < n; i++) {
            System.out.print("\n");
            for (j = 0; j < m; j++) {
                if(Prime(A[i][j])){
                    System.out.print(" " + A[i][j]);
                }else{
                    A[i][j]=0;
                    System.out.print(" "+A[i][j]);
                }
            }
        }
    }
//    1.Lặp qua từng cột của ma trận.
//    2.Lấy ra các phần tử của cột hiện tại và lưu vào một mảng riêng biệt.
//    3.Sắp xếp mảng đó theo thứ tự tăng dần.
//    4.Gán lại các phần tử đã sắp xếp vào cột ban đầu của ma trận.
//    
    public static void sapxepCot(int[][] arr,int n,int m){
        for (int j = 0; j < arr.length; j++) {
            int[] colum=new int[arr.length];
            for (int i = 0; i < arr.length; i++) {
                colum[i]=arr[i][j];
            }
            Arrays.sort(colum);
             for (int i = 0; i < arr.length; i++) {
                arr[i][j]=colum[i];
            }
        }
    }
    
    public static void main(String[] args) {
        System.out.print("Nhap so hang n=");
        int n = nhap();
        System.out.print("Nhap so cot m=");
        int m = nhap();
        int[][] A = new int[n][m];
        //nhap
        nhapMT(A,n,m);
        //In ra ma tran nhap vao 
        System.out.print("Ma tran nhap vao: ");
        inMT(A, n, m);
        //max
        MaxMT(A,n,m);
        //ma tran so nguyen to
       // inMTNT(A, n, m);
        //sap xep cot
        System.out.print("Sap xep tang theo cot");
        sapxepCot(A,n,m);
        inMT(A, n, m);
        
    }
}



    
//public class cau12 {
//
//    public static void sxgd(int mang[]) {
//
//        int tam = 0;
//
//        for (int i = 0; i < mang.length; i++) {
//
//            for (int j = 0; j < mang.length; j++) {
//
//                if (mang[i] >= mang[j]) {
//
//                    tam = mang[i];
//
//                    mang[i] = mang[j];
//
//                    mang[j] = tam;
//
//                }
//
//            }
//
//        }
//
//        for (int j = 0; j < mang.length; j++) {
//            System.out.print(" " + mang[j]);
//        }
//
//    }
//
//    public static void chuyenm2c1c(int h, int c, int mang2c[][], int mang[]) {
//
//        int k = 0, i, j;
//
//        for (i = 0; i < h; i++) {
//            for (j = 0; j < c; j++) {
//                mang[k] = mang2c[i][j];
//
//                k++;
//
//            }
//        }
//
//        sxgd(mang);
//
//    }
//
//    public static void sxctd(int h, int c, int mang[][]) {
//        int tam = 0;
//
//        for (int k = 0; k < h; k++) {
//
//            for (int i = 0; i < c - 1; i++) {
//
//                for (int j = i + 1; j < c; j++) {
//
//                    if (mang[j][k] < mang[i][k]) {
//
//                        tam = mang[j][k];
//
//                        mang[j][k] = mang[i][k];
//
//                        mang[i][k] = tam;
//                    }
//
//                }
//
//            }
//
//        }
//        System.out.println("Sap xep theo cot tang dan:");
//
//        for (int i = 0; i < h; i++) {
//
//            for (int j = 0; j < c; j++) {
//
//                System.out.print(" " + mang[i][j] + " ");
//
//            }
//
//            System.out.println(" ");
//
//        }
//
//    }
//
//    public static void themPhanTu(int[] a, int n, int pt) {
//
//        a[0] = pt;
//
//        Arrays.sort(a);
//
//    }
//
//    public static void main(String[] args) {
//
//        Scanner input = new Scanner(System.in);
//
//        int h = 0, c = 0;
//
//        System.out.println("Nhap kich thuoc cua ma tran(hang x cot)");
//
//        h = input.nextInt();
//
//        c = input.nextInt();
//
//        int day[][] = new int[h][c];
//
//        int i, j = 0;
//
//        int max = 0;
//
//        int tam;
//
//        int k = 0, s = 0;
//
//        for (i = 0; i < h; i++) {
//
//            for (j = 0; j < c; j++) {
//
//                try {
//
//                    System.out.print(" Nhap vao phan tu thu: [" + i + "][" + j + "] ");
//
//                    day[i][j] = input.nextInt();
//
//                    if (day[i][j] > max) {
//
//                        max = day[i][j];
//
//                        k = i;
//                        s = j;
//
//                    }
//
//                } catch (NumberFormatException e1) {
//                    System.out.println("loi nhap ky tu");
//                    System.exit(0);
//                }
//
//            }
//
//        }
//
//        System.out.println(" mang vua nhap  la : ");
//
//        for (i = 0; i < h; i++) {
//
//            for (j = 0; j < c; j++) {
//
//                System.out.print(" " + day[i][j] + " ");
//
//            }
//
//            System.out.println(" ");
//
//        }
//
//        System.out.println("Max la " + max + " co chi so la: [" + k + "][" + s + "]");
//
//        sxctd(h, c, day);
//
//        //sxhtd(h,c,day);
//        int[] mang = new int[h * c];
//
//        System.out.print("sap xep mang giam dan:");
//
//        chuyenm2c1c(h, c, day, mang);
//
//        System.out.print("\nNhap phan tu muon them: ");
//
//        int pt = input.nextInt();
//
//        themPhanTu(mang, h, pt);
//
//        System.out.print("Mang sau khi dc sap xep:");
//
//        sxgd(mang);
//
//    
//}
