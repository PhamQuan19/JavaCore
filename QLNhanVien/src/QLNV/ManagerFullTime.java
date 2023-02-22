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
public class ManagerFullTime {
    Scanner sc=new Scanner(System.in);
    ArrayList<EmployFullTime> listEmployFullTime=new ArrayList<>();

    public ArrayList<EmployFullTime> getListEmployFullTime() {
        return listEmployFullTime;
    }

    public void setListEmployFullTime(ArrayList<EmployFullTime> listEmployFullTime) {
        this.listEmployFullTime = listEmployFullTime;
    }
    public void displayListEmployFullTime(){
        System.out.println("............Danh sách nhân viên fulltime...........");
        for(int i=0;i<listEmployFullTime.size();i++){
            listEmployFullTime.get(i).display();
        }
    }
    
     //tinh tong luong
    public void sumSalaryPartTime(){
        double sumSalary=0;
        for (int i = 0; i < listEmployFullTime.size(); i++) {
            sumSalary+=listEmployFullTime.get(i).getSalary();
        }
        System.out.println("Tổng tiền lương của nhân viên FullTime: "+sumSalary);
    }
    //tim kiem ten
    public void SearchPartTime(){
        boolean isFound=false;
        sc.nextLine();
        System.out.println("Nhập tên nhân viên cần tìm: ");
        String name=sc.nextLine();
        for (int i = 0; i < listEmployFullTime.size(); i++) {
            if(listEmployFullTime.get(i).getName().equals(name)){
                listEmployFullTime.get(i).display();
                isFound=true;
            }
        }
        if(isFound!=true) System.out.println("Không tìm nhân viên nào!");
    }
    
    public void SortEmployName(){
        for(int i=0;i<listEmployFullTime.size();i++){
            for(int j=i+1;j<listEmployFullTime.size();j++){
                if(listEmployFullTime.get(i).getName().compareTo(listEmployFullTime.get(j).getName())>0){
                   EmployFullTime  tmp=listEmployFullTime.get(i);
                    listEmployFullTime.set(i,listEmployFullTime.get(j));
                    listEmployFullTime.set(j,tmp);
                }
            }
        }
    }
    
    public void runFullTime(){
        int choose;
        do{
            System.out.println(".............Employe FullTime.........");
            System.out.println("1.Nhập thông tin nhân viên FullTime");
            System.out.println("2.Hiển thị danh sách nhân viên FullTime");
            System.out.println("3.Tính tổng lương nhân viên FullTime");
            System.out.println("4.Tìm kiếm nhân viên theo tên");
            System.out.println("5.Sắp xếp nhân viên FullTime theo tên");
            System.out.println("0.Thoát");
            System.out.println("Mời bạn chọn chương trình: ");
            choose=sc.nextInt();
            switch (choose) {
                case 1:
                    System.out.println("Nhập số lượng nhân viên FullTime");
                    int n=sc.nextInt();
                    for(int i=0;i<n;i++){
                        System.out.println("Nhập thông tin nhân viên FullTime thứ "+(i+1));
                        System.out.println("Nhập id: ");
                        int id=sc.nextInt();sc.nextLine();
                        System.out.println("Nhập tên nhân viên: ");
                        String name=sc.nextLine();
                        System.out.println("Nhập số điện thoại");
                        String numberPhone=sc.nextLine();
                        System.out.println("Nhập địa chỉ: ");
                        String address=sc.nextLine();
                        System.out.println("Nhập time numberWorday: ");
                        int numberWorday=sc.nextInt();
                        EmployFullTime ef=new EmployFullTime(id, name, numberPhone, address, numberWorday);
                        listEmployFullTime.add(ef);
                    }
                    break;
                case 2:
                    displayListEmployFullTime();
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
