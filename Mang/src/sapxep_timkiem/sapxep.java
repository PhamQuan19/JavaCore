/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sapxep_timkiem;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class sapxep {
    public static void selectsionSort(int[] a,int n){
        for (int i = 0; i < n; i++) {
            //di tim phan tu nho nhat chua dc sap xep va hoan vi vs a[i]
            int min_index=i;
            for (int j = i+1; j < n; j++) {
                if(a[j]<a[min_index]){
                    min_index=j;
                }
            }
            int tmp=a[i];
            a[i]=a[min_index];
            a[min_index]=tmp;
        }
    }
    
    public static void bubbleSort(int[]a,int n){
        for (int i = 0; i < n; i++) {
            //duyet cac phan tu chua dc sap xep va dua pt lon nhat ve cuoi
            for (int j = 0; j < n-i-1; j++) {
                if(a[j]>a[j+1]){
                    int tmp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=tmp;
                }
            }
        }
    }
    public static void insertionSort(int[]a,int n){
        for (int i = 0; i < n; i++) {
            //chen a[i] vao trong doan 0->i-1
            //tim dc vi tri chen
            int pos=i-1;
            int giaTriChen=a[i];
            while(pos>=0 && a[pos] > giaTriChen){
                a[pos+1]=a[pos];
                --pos;
            }
            a[pos+1]=giaTriChen;
            
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        
        //selectsionSort(arr, n);
//        bubbleSort(arr, n);
        insertionSort(arr, n);
        for(int x:arr){
            System.out.print(x+" ");
        }
    }
}
//5
//5 3 1 4 2