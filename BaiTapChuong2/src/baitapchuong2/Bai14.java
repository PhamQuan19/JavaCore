/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapchuong2;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author Admin
 */
public class Bai14 {
    public static String chuanHoa(String str) {
        str = str.trim();
        str = str.replaceAll("\\s+", " ");
        return str;
    }
 
    public static String chuanHoaTen(String str) {
        str = chuanHoa(str);
        String[] words=str.toLowerCase().split("\\s+");
        StringBuilder buider=new StringBuilder();
        for(String item:words){
            char[] character=item.toCharArray();
            character[0]=Character.toUpperCase(character[0]);
            buider.append(new String(character));
            buider.append(" ");
        }
        return buider.toString().trim();
    }
 
    public static void main(String[] sgr) {
        String str = "    ngYen     vAn     quAn  ";
        String result=chuanHoaTen(str);
        System.out.println(result);
    }

}

 

//public static String chuyenInHoa(String str) {
//        String s, strOutput;
//        s = str.substring(0, 1);
//        strOutput = str.replaceFirst(s, s.toUpperCase());
//        return (strOutput);
//    }
//
//    public static String chuanHoa(String strInput) {
//        String strOutput = "";
//        StringTokenizer strToken = new StringTokenizer(strInput, " ,\t,\r");
//        strOutput += "" + chuyenInHoa(strToken.nextToken());
//        while (strToken.hasMoreTokens()) {
//            strOutput += " " + chuyenInHoa(strToken.nextToken());
//        }
//        return (strOutput);
//    }
//
//    public static void main(String[] args) {           
//         Scanner input = new Scanner(System.in);
//        System.out.println("Nhap vao 1 xau: ");
//        String strInput = input.nextLine();
//        System.out.println("Xau duoc chuan hoa la: " + chuanHoa(strInput));
//    }