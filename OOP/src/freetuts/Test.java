/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package freetuts;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Test {
    static Scanner sc=new Scanner(System.in);
    public static void nhapXe(Vehicle xe){
        System.out.println("Nhập mã xe: ");
        xe.setMaXe(sc.nextInt());sc.nextLine();
        System.out.println("Nhập tên chủ xe: ");
        xe.setChuXe(sc.nextLine());
        System.out.println("Nhập dung tích: ");
        xe.setDungTich(Integer.parseInt(sc.nextLine()));
        System.out.println("Nhập trị giá xe: ");
        xe.setTriGia(Double.parseDouble(sc.nextLine()));
        System.out.println("Mô tả: ");
        xe.setMoTa(sc.nextLine());
        
    }
    
    public static void main(String[] args) {
        Vehicle v[] =null;
        int a,n=0;
        boolean flag=true;
        //sử dụng switch
        do{
            System.out.println("Chương trình");
            System.out.println("1.Tạo các đối tượng xe và nhập thông tin ");
            System.out.println("2.Xuất bảng kê khai tiền thuế của các xe");
            System.out.println("3.Nhập số khác để thoát chương trình");
            a=sc.nextInt();
            switch(a){
                case 1:
                    System.out.println("Nhập số lượng xe bạn muốn khai báo");
                    n=sc.nextInt();
                    v=new Vehicle[n];
                    for(int i=0;i<n;i++){
                        System.out.println("Xe thứ "+(i+1));
                        v[i]=new Vehicle();
                        nhapXe(v[i]);
                    }
                    break;
                    
                case 2:
                    System.out.printf("%5s %5s %5s %10s %10s %8s \n",
                            "Mã xe","Chủ xe","Dung tích","Trị giá","mô tả","Thuế");
                    for(int i=0;i<n;i++){
                        v[i].inThue();
                    }
                    break;
                    
                default:
                    System.out.println("Bye");
                    flag=false;
                    break;
            }
        }while(flag);
    }
}
