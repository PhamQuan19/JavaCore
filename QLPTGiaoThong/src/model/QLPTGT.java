/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import entity.OTO;
import entity.PTGT;
import entity.XeMay;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class QLPTGT implements IChucNang{

    private List<PTGT> list=new ArrayList<>();
    Scanner sc=new Scanner(System.in);

    public QLPTGT() {
        list.add(new OTO("BD12456533",2020,2000,"Do",4));
        list.add(new OTO("CD13242233",2022,3000,"Vang",7));
        list.add(new XeMay("BH14353433",2021,5000,"Den",25));
        list.add(new OTO("AH12456533",2020,6000,"Do",4));
        list.add(new OTO("GK12456533",2023,7000,"Nau",7));
        list.add(new OTO("DH12456533",2019,2000,"Do",25));
        list.add(new XeMay("BH14490033",2021,5000,"Den",25));
        list.add(new OTO("DH12456533",2017,9000,"Den",4));
        list.add(new XeMay("BH67353433",2019,5000,"Den",30));
        list.add(new OTO("DH12456533",2016,8000,"Do",15));
        list.add(new OTO("DH12456533",2018,6000,"Xanh",4));
        list.add(new XeMay("BH14353433",2021,5000,"Den",25));
    }
    
    private int getViTriByMa(String ma){
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getSoKhungXe().equalsIgnoreCase(ma)){
                return i;
            }
        }
        return -1;
    }
    
    public PTGT nhap(){
        String soKhung="";
        int namSanXuat=0;
        double giaBan=0;
        String mau="";
        while(true){
            System.out.println("Nhap so khung(10 ki tu chu hoac so): ");
            soKhung=sc.nextLine();
            if(soKhung.matches("\\w{10}") && getViTriByMa(soKhung)==-1) break;
            else System.out.println("Nhap lai!!");
        }
        
        System.out.println("Nhap nam san xuat: ");
        namSanXuat=Integer.parseInt(sc.nextLine());
        System.out.println("Nhap gia ban: ");
        giaBan=Double.parseDouble(sc.nextLine());
        System.out.println("Nhap mau: ");
        mau=sc.nextLine();
      //  PTGT ptgt=new PTGT(soKhung, namSanXuat, giaBan, mau);
        return new PTGT(soKhung, namSanXuat, giaBan, mau);
    }
    @Override
    public void nhapOto() {
        PTGT pt=nhap();
        System.out.println("Nhap so cho ngoi: ");
        int soChoNgoi=Integer.parseInt(sc.nextLine());
        OTO o=new OTO(pt.getSoKhungXe(),pt.getNamSanXuat(),pt.getGiaBan(),pt.getMau(),soChoNgoi);
        list.add(pt);
    }

    @Override
    public void nhapXeMay() {
        PTGT pt=nhap();
        System.out.println("Nhap cong suat");
        double congSuat= Double.parseDouble(sc.nextLine());
        XeMay xm =new XeMay(pt.getSoKhungXe(),pt.getNamSanXuat(),pt.getGiaBan(),pt.getMau(),congSuat);
        list.add(pt);
    }

    @Override
    public void vietRaDanhSachPTGT() {
        System.out.println("So khung\t Nam san xuat\t Mau\t Gia ban\t Cong suat");
        int dem=0;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) instanceof XeMay){
                System.out.println(list.get(i).toString());
                dem++;
            }
        }
        System.out.println("Tong so xe may la: "+dem);
        dem=0;
        System.out.println("So khung\t Nam san xuat\t Mau\t Gia ban\t So ghe");
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) instanceof OTO){
                System.out.println(list.get(i).toString());
                dem++;
            }
        }
        
         System.out.println("Tong so oto la: "+dem);
    }

    @Override
    public void suaThongTinPTGT() {
        System.out.println("Nhap ma xe can sua: ");
        String ma=sc.nextLine();
        int vt=getViTriByMa(ma);
        if(vt==-1){
            System.out.println("Khong tim thay ma!");
          
        }
        else{
            if(list.get(vt) instanceof XeMay){
                XeMay x= (XeMay)list.get(vt);
                x.setCongSuat(vt);
            }
            
            PTGT pt=list.get(vt);
            System.out.println("Nam san xuat: ");
            int nam=Integer.parseInt(sc.nextLine());
            pt.setNamSanXuat(nam);
            System.out.println("Gia: ");
            double gia=Double.parseDouble(sc.nextLine());
            pt.setGiaBan(gia);
            System.out.println("Mau: ");
            String mau=sc.nextLine();
            pt.setMau(mau);
            System.out.println("Sua thanh cong!");
        }
    }

    @Override
    public void sapXepPTGTtheoNam() {
        Collections.sort(list,new Comparator<PTGT>(){
            @Override
            public int compare(PTGT o1, PTGT o2) {
                return o1.getNamSanXuat()-o2.getNamSanXuat();
            }
            
        });
    }

    @Override
    public void datNhatTheoMau() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    //java 2PTIT
}
