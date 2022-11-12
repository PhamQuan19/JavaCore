/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trycatch;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class TryCatch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try{
            int n=sc.nextInt();
        }catch(Exception ex){
            System.out.println("Du lieu nhap khong hop le");
        }
        
        System.out.println("Luong ben duoi cua chuong trinh");
    }
    
}
