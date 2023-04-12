/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Admin
 */
public class Validate {
    //dem  so luong chu trong chuoi
    public void f1(String txt) {
       String[] list=txt.split("");
        System.out.println(list.length);
    }

    //dao nguoc chu cua chuoi
    public void f2(String txt) {
        String[] list=txt.split("\\s+");
        for (int i = list.length-1; i >=0 ; i--) {
            System.out.println(list[i]+"");
        }
    }

    //sap xep va in ra cac phan tu trong chuoi theo thu tu tang dan
    public void f3(String txt) {
        String[] rs = txt.split("\\s+");
        List<String> listS = new ArrayList<>();
        for (String s : rs) {
            listS.add(s);
        }
        Collections.sort(listS);
        Collections.reverse(listS);
        for (String s : listS) {
            System.out.println(s);
        }

    }

    //tinh tong cac so le xuat hien trong chuoi
    public void f4(String txt) {
        int sum=0;
        for(int i=0;i<txt.length();i++){
            if(Character.isDigit(txt.charAt(i))){
                int number=Integer.parseInt(txt.charAt(i)+"");
                if(number % 2 !=0 ){
                    sum+=number;
                }
            }
        }
        System.out.println(sum);
    }

    //thay the cac ki tu so bang ki tu 'a'
    public void f5(String txt) {
       for (int i = 0; i < txt.length(); i++) {
            if(Character.isDigit(txt.charAt(i))){
                txt = txt.replace(txt.charAt(i), 'a');
            }
        }
        System.out.println(txt);
    }

    //dem xem co bao nhieu chu "anh" xuat hien trong chuoi
    public int f6(String txt) {
        //anhemanhanh
        //0123456789
        int count = 0;
        for (int i = 0; i <= txt.length()-3; i++) {
            String cut = txt.substring(i, i+3);
            if(cut.equals("anh")){
                count++;
            }
        }

        return count;
    }

}
