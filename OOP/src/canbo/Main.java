/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package canbo;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {
    public static Scanner sc=new Scanner(System.in);
    public static QuanLiCanBo qlcb=new QuanLiCanBo();
    
    public static void kiSu(){
        System.out.println("Nhap ho ten: ");
        String hoTen=sc.nextLine();
        System.out.println("Nhap tuoi: ");
        int tuoi=Integer.parseInt(sc.nextLine());
        System.out.println("Nhap gioi tinh");
        String gioiTinh=sc.nextLine();
        System.out.println("Nhap dia chi: ");
        String diaChi=sc.nextLine();
        System.out.println("Nhap chuyen nganh: ");
        String Nganh=sc.nextLine();
        CanBo kisu=new KiSu(Nganh, hoTen, tuoi, gioiTinh, diaChi);
        qlcb.themCB(kisu);
//        System.out.println(kisu.toString());
    }
    
    public static void congNhan(){
        System.out.println("Nhap ho ten: ");
        String hoTen=sc.nextLine();
        System.out.println("Nhap tuoi: ");
        int tuoi=Integer.parseInt(sc.nextLine());
        System.out.println("Nhap gioi tinh");
        String gioiTinh=sc.nextLine();
        System.out.println("Nhap dia chi: ");
        String diaChi=sc.nextLine();
        System.out.println("Nhap cap bac ");
        int cap=Integer.parseInt(sc.nextLine());
        CanBo congNhan=new CongNhan(cap, hoTen, tuoi, gioiTinh, diaChi);
        qlcb.themCB(congNhan);
//        System.out.println(kisu.toString());
    }
    
     public static void nhanVien(){
        System.out.println("Nhap ho ten: ");
        String hoTen=sc.nextLine();
        System.out.println("Nhap tuoi: ");
        int tuoi=Integer.parseInt(sc.nextLine());
        System.out.println("Nhap gioi tinh");
        String gioiTinh=sc.nextLine();
        System.out.println("Nhap dia chi: ");
        String diaChi=sc.nextLine();
        System.out.println("Nhap viec lam");
        String viecLam=sc.nextLine();
        CanBo nv=new NhanVien(viecLam, hoTen, tuoi, gioiTinh, diaChi);
        qlcb.themCB(nv);
//        System.out.println(kisu.toString());
    }
    
    public static void timKiem(){
        System.out.println("Nhap ten can tim kiếm");
        String name=sc.nextLine();
         qlcb.search(name).forEach(officer -> {
              System.out.println(officer.toString());
         });
        
    }
    
    
    public static void main(String[] args) {
//        QuanLiCanBo qlcb=new QuanLiCanBo();
        while(true){
            System.out.println("1.Thêm mới cán bộ");
            System.out.println("2.Tìm kiếm theo họ tên");
            System.out.println("3.Hiển thị thông tin");
            System.out.println("0.Thoát");
            System.out.println("Chọn chương trình");
            int choose=Integer.parseInt(sc.nextLine());
            switch(choose){
                case 1:
                    System.out.println("a:Them ki su");
                    System.out.println("b:Them công nhân");
                    System.out.println("c:Them nhân viên");
                    String type=sc.nextLine();
                    switch (type) {
                        case "a":
                            kiSu();
                            break;
                        case "b":
                            congNhan();
                            break;
                        case "c":
                            nhanVien();
                            break;
                        default:
                            System.out.println("Invalid");
                            break;
                    }
                    break;
                case 2:
                    timKiem();
                    break;
                case 3:
                    qlcb.Show(); 
                    
                case 0:
                    return;
            }
            
            
        }
            
    }
}
