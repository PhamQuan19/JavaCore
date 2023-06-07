/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de23oop;

import de22oop.SoPhuc;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class KiemTra {
    public static List<MaTranVuong> listMT=new ArrayList<>();
    public static Scanner sc=new Scanner(System.in);
    
    public static void Input(){
        System.out.println("Nhập số cấp ma trận ");
        int k=sc.nextInt();
        for (int i = 0; i < 2; i++) {
            System.out.println("Nhập gia trị cho ma trận thứ "+(i+1));
            MaTranVuong mt=new MaTranVuong(k);
            mt.Nhap();
            listMT.add(mt);
        }
        
    }
    
    public static void Output(){
        for (MaTranVuong o : listMT) {
            o.HienThi();
        }
        System.out.println("");
    }
    
    public static MaTranVuong tinhTich(){
        MaTranVuong maTranTich=new MaTranVuong();
        for (MaTranVuong o : listMT) {
             maTranTich=o.tinhTich(o);
        }
        return maTranTich;
    }
    
    public static void main(String[] args) {
//        Input();
//        Output();
//       tinhTich().HienThi();
        
    MaTranVuong maTran1 = new MaTranVuong(3);
        System.out.println("Nhập ma trận 1:");
        maTran1.Nhap();

        // Tạo đối tượng maTran2 và nhập giá trị
        MaTranVuong maTran2 = new MaTranVuong(3);
        System.out.println("Nhập ma trận 2:");
        maTran2.Nhap();
        
        // Hiển thị hai ma trận vuông
        System.out.println("Hai ma trận vuông vừa nhập:");
        System.out.println("Ma trận 1:");
        maTran1.HienThi();
        System.out.println("Ma trận 2:");
        maTran2.HienThi();

         // Tính và hiển thị ma trận tích
        MaTranVuong maTranTich = maTran1.tinhTich(maTran2);
        System.out.println("Ma trận tích của hai ma trận:");
        maTranTich.HienThi();

    }
}
