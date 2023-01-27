/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nhanvien;

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
        System.out.println("----------------Danh sach nhan vien FullTime---------------");
        for(int i=0;i<listEmployFullTime.size();i++){
            listEmployFullTime.get(i).disPlay();
        }
    }
     public void salaryFullTime(){
        double sumSalary=0;
        for(int i=0;i<listEmployFullTime.size();i++){
            sumSalary+=listEmployFullTime.get(i).getSalary();
        }
        System.out.println("Tong tien luong nhan vien FullTime la: "+sumSalary);
    }
     
    public void searchFullTime(){
        boolean isFound=false;
        System.out.println("Nhap ten nhan vien can tim kiem: ");
        String name=sc.nextLine();
        for(int i=0;i<listEmployFullTime.size();i++){
            if(listEmployFullTime.get(i).getName().equals(name)){
                listEmployFullTime.get(i).disPlay();
                isFound=true;
            }
        }
        if(!isFound){
            System.out.println("Khong tim thay nhan vien nao!");
        }
    }
    
    public void sapxepten(){
        for(int i=0;i<listEmployFullTime.size();i++){
            for(int j=i+1;j<listEmployFullTime.size();j++){
                if(listEmployFullTime.get(i).getName().compareTo(listEmployFullTime.get(j).getName())>0){
                    EmployFullTime tmp=listEmployFullTime.get(i);
                    listEmployFullTime.set(i,listEmployFullTime.get(j));
                    listEmployFullTime.set(j, tmp);
                }
            }
        }
    }
    
    
     public void runPartTime(){
        int choose;
        do{
            System.out.println("------Employe FullTime-----");
            System.out.println("1.Nhap thong tin nhan vien FullTime");
            System.out.println("2.Hien thi danh sach nhan vien FullTime");
            System.out.println("3.Tinh tong luong nhan vien FullTime");
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
                        System.out.println("Nhan vien FullTime thu "+(i+1));
                        System.out.println("Nhap id: ");
                        int id=Integer.parseInt(sc.nextLine());
                        System.out.println("Nhap name: ");
                        String name=sc.nextLine();
                        System.out.println("Nhap number phone: ");
                        String numberPhone=sc.nextLine();
                        System.out.println("Nhap dia chi: ");
                        String address=sc.nextLine();
                        System.out.println("Nhap numberworday: ");
                        int numberworday=sc.nextInt();
                        EmployFullTime employFullTime=new EmployFullTime(id, name, numberPhone, address, numberworday);
                        listEmployFullTime.add(employFullTime);
                    }
                    break;
                    
                case 2:
                    displayListEmployFullTime();
                    break;
                case 3:
                    salaryFullTime();
                    break;
                case 4:
                    searchFullTime();
                    break;
                case 5:
                    sapxepten();
                    break;
                case 0:
                    System.out.println("Thoat chuong trinh");
                    break;
                default:
                    System.out.println("Lua chon khong hop le");
                    throw new AssertionError();
            }
        }while(choose==0);
    }
}
