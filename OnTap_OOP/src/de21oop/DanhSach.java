/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de21oop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class DanhSach {

    public static List<PhanSo> listPS = new ArrayList<>();
    public static Scanner sc = new Scanner(System.in);

    public static void Input() {
        System.out.println("Nhập số phân số: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập phân số thứ " + (i + 1));
            PhanSo ps = new PhanSo();
            ps.Nhap();
            listPS.add(ps);
        }

    }

    public static void Output() {
        for (PhanSo o : listPS) {
            o.HienThi();
        }
    }

    public static PhanSo tinhTong() {
        PhanSo tong = new PhanSo();
        for (PhanSo ps : listPS) {
            tong = tong.cong(ps);
        }
        tong.rutGon();
        return tong;
    }

    public static void PhanSoLonNhat() {
        PhanSo phanSoLonNhat = listPS.get(0);
        for (int i = 1; i < listPS.size(); i++) {
            if (listPS.get(i).lonHon(phanSoLonNhat)) {
                phanSoLonNhat = listPS.get(i);
            }
        }
        System.out.print("Phân số lớn nhất trong danh sách: ");
        phanSoLonNhat.HienThi();
    }

    public static void main(String[] args) {
        Input();
        Output();
        System.out.println("Tổng các phân số: ");
        tinhTong().HienThi();
        PhanSoLonNhat();

    }
}
