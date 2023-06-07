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
public class KiemTra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số hàng của ma trận: ");
        int hang = scanner.nextInt();
        System.out.print("Nhập số cột của ma trận: ");
        int cot = scanner.nextInt();

        MaTran matran1 = new MaTran(hang, cot);
        matran1.nhap();

        MaTran matran2 = new MaTran(hang, cot);
        matran2.nhap();

        System.out.println("Ma trận 1:");
        matran1.hienThi();

        System.out.println("Ma trận 2:");
        matran2.hienThi();

        MaTran hieu = MaTran.tinhHieu(matran1, matran2);
        if (hieu != null) {
            System.out.println("Ma trận hiệu:");
            hieu.hienThi();
        }
    }
}
