/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de23oop;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class MaTranVuong {
    private int cap;
    private int[][] maTran;
    public MaTranVuong() {
    }

    public MaTranVuong(int cap) {
        this.cap = cap;
        this.maTran = new int[cap][cap];
    }
    Scanner sc=new Scanner(System.in);
    
    public void Nhap(){
        
        for (int i = 0; i < cap; i++) {
            for (int j = 0; j < cap; j++) {
                System.out.print("Phần tử ["+(i+1)+"]"+"["+(j+1)+"]= ");
                maTran[i][j]=sc.nextInt();
            }
            System.out.println("");
        }
    }
    
    public void HienThi(){
        System.out.println("Thông tin ma trận vuông:");
        for (int i = 0; i < cap; i++) {
            for (int j = 0; j < cap; j++) {
                System.out.print(maTran[i][j]+" ");
            }
            System.out.println();
        }
    }
    
    // Phương thức tính tích hai ma trận vuông
    public MaTranVuong tinhTich(MaTranVuong maTranVuong) {
        MaTranVuong ketQua = new MaTranVuong(cap);
        for (int i = 0; i < cap; i++) {
            for (int j = 0; j < cap; j++) {
                for (int k = 0; k < cap; k++) {
                    ketQua.maTran[i][j] += this.maTran[i][k] * maTranVuong.maTran[k][j];
                }
            }
        }
        return ketQua;
    }
}
