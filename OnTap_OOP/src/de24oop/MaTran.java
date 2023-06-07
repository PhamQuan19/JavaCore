/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de24oop;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
class MaTran {
    private int hang;
    private int cot;
    private int[][] mang;

    public MaTran() {
    }

    public MaTran(int hang, int cot) {
        this.hang = hang;
        this.cot = cot;
        this.mang = new int[hang][cot];
    }

    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập thông tin ma trận:");
        for (int i = 0; i < hang; i++) {
            for (int j = 0; j < cot; j++) {
                System.out.print("Nhập phần tử [" + i + "][" + j + "]: ");
                mang[i][j] = scanner.nextInt();
            }
            System.out.println("");
        }
    }

    public void hienThi() {
        System.out.println("Thông tin ma trận:");
        for (int i = 0; i < hang; i++) {
            for (int j = 0; j < cot; j++) {
                System.out.print(mang[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static MaTran tinhHieu(MaTran matran1, MaTran matran2) {
        if (matran1.hang != matran2.hang || matran1.cot != matran2.cot) {
            System.out.println("Hai ma trận không cùng kích thước, không thể tính hiệu.");
            return null;
        }

        MaTran hieu = new MaTran(matran1.hang, matran1.cot);
        for (int i = 0; i < matran1.hang; i++) {
            for (int j = 0; j < matran1.cot; j++) {
                hieu.mang[i][j] = matran1.mang[i][j] - matran2.mang[i][j];
            }
        }

        return hieu;
    }
}

