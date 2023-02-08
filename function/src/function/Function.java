/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package function;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Function {

    public static boolean nguyenTo(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0) return false;
        }
        return n>1;
    }
    
    public static boolean chinhPhuong(long n){
        int can=(int)Math.sqrt(n);
        if(1l*can*can==n) return true;
        else return false;
    }
    
    public static int demUoc(int n){
        int dem=0;
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                dem++;
                if(i!=n/i) ++dem;
            }
        }
        return dem;
    }
    
    public static int tongUoc(int n){
        int sum=0;
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                sum+=i;
                if(i!=n/i) sum+=n/i;
            }
        }
        return sum;
    }
    //uoc chung lon nha
    public static int gcd(int a, int b){
        if(b==0) return a;
        else
        return gcd(b,a%b);
    }
    
    public static int gcd1(int a,int b){
        while(b!=0){
            int du=a%b;
            a=b;
            b=du;
        }
        return a;
    }
    
    //boi chung nho nhat
    public static int lcm(int a,int b){
        return a/gcd(a,b)*b;
    }
    
    public static boolean csNguyento(int n){
        int r=0;
        while(n!=0){
            r=n%10;
            if(r!=2 && r!= 3 && r!=5 && r!=7) return false;
            n/=10;
        }
        return true;
        
    }
    
    public static boolean tongNguyento(int n){
        int sum=0;
        while(n!=0){
            sum+=n%10;
            n/=10;
        }
        return nguyenTo(sum);
    }
    
    //phan tich thua so nguyen to
    public static void phanTich(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                while(n%i==0){
                    System.out.print(i+" ");
                    n/=i;
                }
            }
        }
        if(n>1) System.out.println(n);//thua so nguyen to cuoi cung
    }
    //check So fibonacci
    public static boolean checkFibo(long n){
        if(n==0 || n==1) return true;
        long f1=1, f2=0;
        for(int i=2;i<=92;i++){
            long fn=f1+f2;//so fibo ma sinh ra
            if(fn==n) return true;
            f2=f1;
            f1=fn;
        }
        return false;
    }
    
    //in ra so fibo thu n
    public static void printFibo(long n){
        System.out.println("0 1");
        long f1=1, f2=0;
        for(int i=2;i<n;i++){
            long fn=f1+f2;//so fibo ma sinh ra
            System.out.println(fn+" ");
            f2=f1;
            f1=fn;
        }
    }
    
    //lat so
    public static long reverse(long n){
        long rev=0;
        while(n!=0){
            rev=rev*10 +n%10;
            n/=10;
        }
        return rev;
    }
    //so thuan nghich
    public static boolean doiXung(long n){
        long rev=0, tmp=n;
        while(n!=0){
            rev=rev*10 + n%10;
            n/=10;
        }
        if(rev==tmp) return true;
        else return false;
    }
    
    //tổ hợp chập k của n
    public static long toHop(int n,int k){
        k=Math.min(k, n-k);
        long res=1;
        for(int i=1;i<=k;i++){
            res*=(n-i+1);
            res/=i;
        }
        return res;
    }
    //tính n! chia dư cho 10^9+7
    public static long slove1(int n){
        long res=1;
        for(int i=1;i<=n;i++){
            res*=i;
            res%=1000000007;
            
        }
        return res%1000000007;
    }
    //a^b chia dư c
    public static long powmod(int a,int b,int c){
        long res=1;
        while(b!=0){
            //xet cai bit cuối cùng của b
            if(b%2==1){
                res*=a;
                res%=c;
            }
            b/=2;
            a*=a;
            a%=c;
        }
        return res;
        
    }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
//       int a=sc.nextInt();
//       int b=sc.nextInt();
//       int cnt=0;
//       for(int i=a;i<=b;i++){
//          if(csNguyento(i) && nguyenTo(i) && tongNguyento(i)){
//              cnt++;
//          } 
//       }
//        System.out.println(cnt);
          //bai so ngto
//        int n=sc.nextInt();
//        phanTich(n);

            //bai fibo
//          long n=sc.nextLong();
//          System.out.println(checkFibo(n));
        
//        printFibo(93);

        //lat so
//        System.out.println(reverse(123456));
//        System.out.println(doiXung(12344321));

        //To hop
//        System.out.println(toHop(10, 2));

//        System.out.println(slove1(100));
//          System.out.println(powmod(2, 1000000, 10));
          
    }
    
}
