/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de25oop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class KiemTra {
    public static List<TamGiac> listTG=new ArrayList<>();
    public static Scanner sc=new Scanner(System.in);
    
    public static void Input(){
        System.out.println("Nhập số tam giác: ");
        int n=sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin cho tam giác thứ "+(i+1));
            TamGiac tg=new TamGiac();
            tg.Nhap();
            
            listTG.add(tg);
        }
    }
    
    public static void Output(){
        for (TamGiac o : listTG) {
            o.HienThi();
        }
    }
    
    public static void Count(){
        int countTamGiacVuong = 0;
        for (TamGiac tamGiac : listTG) {
            if (tamGiac.kiemTraTamGiacVuong()) {
                countTamGiacVuong++;
            }
        }

        System.out.println("Số lượng tam giác vuông: " + countTamGiacVuong);

    }
    
    public static void xoa(){
        if (!listTG.isEmpty()) {
            listTG.remove(0);
            System.out.println("Đã xoá tam giác đầu tiên trong danh sách.");
        }
    }
    public static void main(String[] args) {
        Input();
        Output();
        Count();
        xoa();
        Output();
    }
}
