/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de12oop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class DanhSach {
    public static List<HocVien> listHV=new ArrayList<>();
    public static Scanner sc=new Scanner(System.in);
    public static void Input(){
        System.out.println("Nhap so hoc vien: ");
        int n=sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin cho hoc vien thu "+(i+1));
            HocVien x=new HocVien();
            x.Input();
            listHV.add(x);
        }
    }
    
    public static void Display(){
        for (HocVien o : listHV) {
            o.Output();
        }
        System.out.println("");
    }
    public static float Tile7(){
        int count =0;
        for (int i = 0; i < listHV.size(); i++) {
            if(listHV.get(i).getDiemThi()>=7){
                count++;
            }
        }
        
//        System.out.println("Ti le sinh vien dat 7: "+(float)((count/listHV.size())*100));
//        System.out.println("So sinh vien"+listHV.size());
        return (float)count/listHV.size()*100 ;
    }
    
    public static float DiemMax(){
        float diem=-1;
        int index=0;
        for (int i = 0; i < listHV.size(); i++) {
            if(listHV.get(i).getDiemThi()>diem){
                diem=listHV.get(i).getDiemThi();
            }
        }
//        for (int i = 0; i < listHV.size(); i++) {
//            listHV.get(index).Output();
//            break;
//        }
        return diem;
    }
    
    public static void DsMax(){
        for (int i = 0; i < listHV.size(); i++) {
            if(listHV.get(i).getDiemThi()==DiemMax()){
                listHV.get(i).Output();
            }
        }
    }
    public static void main(String[] args) {
        Input();
        System.out.println("Danh sach sau khi nhap");
        Display();
        System.out.print("Ti sinh vien dat diem tren 7: ");
        System.out.println(Tile7());
        System.out.println("Sinh vien co diem thi cao nhat");
        DsMax();
    }
}

/*
3
11
Pham Van Quan
Hung Yen
9
22
Pham Duc Anh
Ha Noi
7
33
Nguyen Van Duc
Hai Duong
7

*/