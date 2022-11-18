/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitap;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class B1PhanSo {
    private long tuSo,mauSo;

    public B1PhanSo() {
    }

    public B1PhanSo(long tuSo, long mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }
    public long gcd(long a,long b){
        if(b==0) return a;
        else return gcd(b,a%b);
    }
    public void toiGian(){
        long tmp=gcd(this.tuSo,this.mauSo);
        tuSo/=tmp;
        mauSo/=tmp;
    }
    

    @Override
    public String toString() {
        return this.tuSo+"/"+this.mauSo;
    }
    
    
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long tu=sc.nextLong();
        long mau=sc.nextLong();
        B1PhanSo ps=new B1PhanSo(tu,mau);
        ps.toiGian();
        System.out.println(ps);
    }
    
}
