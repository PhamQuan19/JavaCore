/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLNV;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class main {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean check=true;
        while(check){
            System.out.println("............Menu..........");
            System.out.println("......Lựa chọn chức năng....");
            System.out.println("1.Quản lí nhân viên part time");
            System.out.println("2.Quản lí nhân viên full time");
            System.out.println("0.Thoát");
            System.out.println("Vui lòng nhập lựa chọn");
            int choose=sc.nextInt();
            
            switch (choose) {
                case 1:
                    ManagerPartTime managerPartTime=new ManagerPartTime();
                    managerPartTime.runPartTime();
                    break;
                case 2:
                    ManagerFullTime managerFullTime=new ManagerFullTime();
                    managerFullTime.runFullTime();
                    break;
                    
                case 0: 
                    System.out.println("Thoát");
                    check=false;
                    break;
                default:
//                    throw new AssertionError();
                    break;
            }
        }
    }
}
