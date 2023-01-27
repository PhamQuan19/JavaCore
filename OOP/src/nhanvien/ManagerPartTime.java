/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nhanvien;

import java.util.ArrayList;
import java.util.List;
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
        System.out.println("----------------Danh sach nhan vien PartTime---------------");
        for(int i=0;i<listEmployPartTime.size();i++){
            listEmployPartTime.get(i).disPlay();
        }
    }
    
    //Tinh tong so tien luong
    public void salaryPartTime(){
        double sumSalary=0;
        for(int i=0;i<listEmployPartTime.size();i++){
            sumSalary+=listEmployPartTime.get(i).getSalary();
        }
        System.out.println("Tổng tiền lương nhân viên PartTime là: "+sumSalary);
    }
    
    public void searchPartTime(){
        boolean isFound=false;
        System.out.println("Nhap ten nhan vien can tim kiem: ");
        String name=sc.nextLine();
        for(int i=0;i<listEmployPartTime.size();i++){
            if(listEmployPartTime.get(i).getName().equals(name)){
                listEmployPartTime.get(i).disPlay();
                isFound=true;
            }
        }
        if(!isFound){
            System.out.println("Khong tim thay nhan vien nao!");
        }
    }
    
    public void sapxepten(){
        for(int i=0;i<listEmployPartTime.size();i++){
            for(int j=i+1;j<listEmployPartTime.size();j++){
                if(listEmployPartTime.get(i).getName().compareTo(listEmployPartTime.get(j).getName())>0){
                    EmployPartTime tmp=listEmployPartTime.get(i);
                    listEmployPartTime.set(i,listEmployPartTime.get(j));
                    listEmployPartTime.set(j, tmp);
                }
            }
        }
    }
    
    public void runPartTime(){
        int choose;
        do{
            System.out.println("------Employe PartTime-----");
            System.out.println("1.Nhap thong tin nhan vien PartTime");
            System.out.println("2.Hien thi danh sach nhan vien PartTime");
            System.out.println("3.Tinh tong luong nhan vien PartTime");
            System.out.println("4.Tim kiem nhan vien theo ten");
            System.out.println("5.Sap xep nhan vien theo ten");
            System.out.println("0.Thoat chuong trinh");
            
            System.out.println("Nhap su lua chon cua ban: ");
            choose=sc.nextInt();
            
            switch (choose) {
                case 1:
                    System.out.println("Nhap so nhan vien can them: ");
                    int n=sc.nextInt();
                    for(int i=0;i<n;i++){
                        System.out.println("Nhan vien PartTime thu "+(i+1));
                        System.out.println("Nhap id: ");
                        int id=Integer.parseInt(sc.nextLine());
                        System.out.println("Nhap name: ");
                        String name=sc.nextLine();
                        System.out.println("Nhap number phone: ");
                        String numberPhone=sc.nextLine();
                        System.out.println("Nhap dia chi: ");
                        String address=sc.nextLine();
                        System.out.println("Nhap timeHours: ");
                        int timeHours=sc.nextInt();
                        EmployPartTime employPartTime=new EmployPartTime(id, name, numberPhone, address, timeHours);
                        listEmployPartTime.add(employPartTime);
                    }
                    break;
                    
                case 2:
                    displayListEmployPartTime();
                    break;
                case 3:
                    salaryPartTime();
                    break;
                case 4:
                    searchPartTime();
                    break;
                case 5:
                    sapxepten();
                    break;
                case 0:
                    System.out.println("Thoat chuong trinh");
                    break;
                default:
                    throw new AssertionError();
            }
        }while(choose==0);
    }
    
}
