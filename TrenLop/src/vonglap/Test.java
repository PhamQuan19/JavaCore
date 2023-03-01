/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vonglap;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        String[] str={"Quan","Trang","Anh"}; 
//        for(String s: str){
//            System.out.println(s+" ");
//        }
//        int count;
//        for ( count = 1; count <=10 ; count++) {
//            if(count==5){
//                break;
//            }
//            System.out.printf("%5d",count);
//            
//        }
//        System.out.printf("%5d\n",count);
//        
//        float x=1.2345f,y=2345.237f;
//        int n=2;
//        System.out.printf("x=%7.2f n=%3d va y=%2.2f\n",x,n,y);
//        int a=82,b=20;
//        System.out.println((a+b)/(10*5));
        int i=0,sum=0;
        do{
            sum+=i;
            i++;
        }while(i<=10);
        System.out.println(sum);
    }
}
