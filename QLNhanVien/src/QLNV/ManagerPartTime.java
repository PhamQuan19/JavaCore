/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLNV;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class ManagerPartTime {
    Scanner sc=new Scanner(System.in);
    ArrayList<EmployPartTime> listEmployPartTime=new ArrayList<>();

    

    public ArrayList<EmployPartTime> getListEmployPartTime() {
        return listEmployPartTime;
    }

    public void setListEmployPartTime(ArrayList<EmployPartTime> listEmployPartTime) {
        this.listEmployPartTime = listEmployPartTime;
    }
    
    public void displayListEmployPartTime(){
        System.out.println("............Danh sách nhân viên Parttime...........");
        for(int i=0;i<listEmployPartTime.size();i++){
            listEmployPartTime.get(i).display();
        }
    }
    //tinh tong luong
    public void sumSalaryPartTime(){
        double sumSalary=0;
        for (int i = 0; i < listEmployPartTime.size(); i++) {
            sumSalary+=listEmployPartTime.get(i).getSalary();
        }
        System.out.println("Tổng tiền lương của nhân viên PartTime: "+sumSalary);
    }
    
    public void SearchPartTime(){
        System.out.println("Nhập tên nhân viên cần tìm: ");
        sc.nextLine();
        String name=sc.nextLine();
        boolean isFound=false;
        for (int i = 0; i < listEmployPartTime.size(); i++) {
            if(listEmployPartTime.get(i).getName().equals(name)){
                listEmployPartTime.get(i).display();
            }
        }
        if(isFound!=true) System.out.println("Không tìm nhân viên nào!");
    }
    
    public void SortEmployName(){
        for(int i=0;i<listEmployPartTime.size();i++){
            for(int j=i+1;j<listEmployPartTime.size();j++){
                if(listEmployPartTime.get(i).getName().compareTo(listEmployPartTime.get(j).getName())>0){
                    EmployPartTime tmp=listEmployPartTime.get(i);
                    listEmployPartTime.set(i,listEmployPartTime.get(j));
                    listEmployPartTime.set(j,tmp);
                }
            }
        }
    }
    
    public void runPartTime(){
        int choose;
        do{
            System.out.println(".............Employe PartTime.........");
            System.out.println("1.Nhập thông tin nhân viên PartTime");
            System.out.println("2.Hiển thị danh sách nhân viên PartTime");
            System.out.println("3.Tính tổng lương nhân viên Part Time");
            System.out.println("4.Tìm kiếm nhân viên theo tên");
            System.out.println("5.Sắp xếp nhân viên Part Time theo tên");
            System.out.println("0.Thoát");
            System.out.println("Mời bạn chọn chương trình: ");
            choose=sc.nextInt();
            switch (choose) {
                case 1:
                    System.out.println("Nhập số lượng nhân viên PartTime");
                    int n=sc.nextInt();
                    for(int i=0;i<n;i++){
                        System.out.println("Nhập thông tin nhân viên PartTime thứ "+(i+1));
                        System.out.println("Nhập id: ");
                         int id=sc.nextInt();sc.nextLine();
                        System.out.println("Nhập tên nhân viên: ");
                        String name=sc.nextLine();
                        System.out.println("Nhập số điện thoại");
                        String numberPhone=sc.nextLine();
                        System.out.println("Nhập địa chỉ: ");
                        String address=sc.nextLine();
                        System.out.println("Nhập time hours: ");
                        int timeHours=sc.nextInt();
                        EmployPartTime ep=new EmployPartTime(id, name, numberPhone, address, timeHours);
                        listEmployPartTime.add(ep);
                    }
                    break;
                case 2:
                    displayListEmployPartTime();
                    break;
                case 3:
                    sumSalaryPartTime();
                    break;
                case 4:
                    SearchPartTime();
                    break;
                case 5:
                    SortEmployName();
                    break;
                case 0:
                    System.out.println("Thoát chương trình");
                    break;
                default:
//                    throw new AssertionError();
                    break;
            }
        }while(choose!=0);
    }

}
