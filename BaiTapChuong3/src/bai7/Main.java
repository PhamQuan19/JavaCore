/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {
    public static List<QuanLiDiem> listMark=new ArrayList<>();
    public static Scanner sc=new Scanner(System.in);
    public static void Input(){
        listMark.add(new QuanLiDiem("Pham Anh Quan", 9));
        listMark.add(new QuanLiDiem("Luu Thuy Trang", 10));
        listMark.add(new QuanLiDiem("Pham Duc Anh", 8));
        listMark.add(new QuanLiDiem("Tran Van Teo", 10));
        listMark.add(new QuanLiDiem("Nguyen Van Ti", 7));

    }
    public static void Display(){
        for (QuanLiDiem o : listMark) {
            System.out.println(o.toString());
        }
    }
    public static void Delete(){
        System.out.println("Nhap ten sinh vien can xoa: ");
        String ten=sc.nextLine();
        for (int i = 0; i < listMark.size(); i++) {
            if(listMark.get(i).getTen().equals(ten)){
                listMark.remove(i);
            }
        }

//        System.out.println("Nhap vi tri can xoa: ");
//        int x=sc.nextInt();
//        listMark.remove(x);
      
    }
    public static void main(String[] args) {
        Input();
        Display();
        Delete();
        System.out.println("Danh sach sau khi xoa");
        Display();

        
    }
}
