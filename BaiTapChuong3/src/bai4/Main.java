/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {
    static List<SinhVien> sv=new ArrayList<>();
    static Scanner sc=new Scanner(System.in);
    public static void input(){
        System.out.print("Nhập số sinh viên cần thêm: ");
        int n=sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin cho sinh viên thứ "+(i+1));
            SinhVien x=new SinhVien();
            x.Input();
            sv.add(x);
        }
    }
    
    public static void display(){
        for (SinhVien o : sv) {
            System.out.println(o);
        }
    }
    
    public static void timKiem(){
        System.out.println("Nhập điểm cần tìm kiếm");
        float x=sc.nextFloat();
        for (SinhVien o : sv) {
            if(o.getDiemKiI()==x || o.getDiemKiII()==x){
                System.out.println(o.toString());
            }
        }
    }
    
    public static void menu(){
        System.out.println("1.Nhập thêm sinh viên");
        System.out.println("2.Xem thông tin sinh viên");
        System.out.println("3.Tìm sinh viên theo điểm");
        System.out.println("0.Kết thúc");
    }
    public static void main(String[] args) {
        int choose;
        do{
            menu();
            System.out.println("Mời chọn chương trình");
            choose=sc.nextInt();
            switch (choose) {
                case 1:
                    input();
                    break;
                case 2:
                    display();
                    break;
                case 3:
                    timKiem();
                    break;
                case 0:
                    break;
                default:
                    throw new AssertionError();
            }
        }while(choose!=0);
    }
}
