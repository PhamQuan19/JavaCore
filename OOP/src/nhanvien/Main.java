/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nhanvien;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean check=true;
        while(check){
            System.out.println("---------Menu----------");
            System.out.println("-----Lua chon chuc nang------");
            System.out.println("1.Quan li nhan vien PartTime");
            System.out.println("2.Quan li nhan vien FullTime");
            System.out.println("0.Thoat chuong trinh");
            
            System.out.println("---------------------------");
            System.out.println("Vui long lua chon chuc nang");
            int choose=sc.nextInt();
            
            switch (choose) {
                case 1:
                    ManagerPartTime managerPartTime=new ManagerPartTime();
                    managerPartTime.runPartTime();
                    break;
                case 2:
                    ManagerFullTime managerFullTime=new ManagerFullTime();
                    managerFullTime.runPartTime();
                    break;
                    
                case 0:
                    System.out.println("Thoat chuong trinh");
                    check=false;
                    break;
                default:
                    System.out.println("Lua chon khong hop le");
                    throw new AssertionError();
            }
        }
    }
}
