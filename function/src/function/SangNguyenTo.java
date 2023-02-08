/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package function;

/**
 *
 * @author Admin
 */
public class SangNguyenTo {
    public static boolean[] prime=new boolean[100001];
    public static void Sang() {
        for (int i = 0; i <= 100000; i++) {
            prime[i] = true;
        }
        prime[0] = prime[1] = false;
        for (int i = 1; i <= Math.sqrt(1000000); i++) {
            if (prime[i]) {
                for (int j = i * i; j <= 100000; j += i) {
                    prime[j] = false;
                }
            }

        }
    }
    public static long luyThua2(int a, int b){
        long res=1;
        while(b!=0){
            //xet cai bit cuối cùng của b
            if(b%2==1){
                res*=a;
            }
            b/=2;
            a*=a;
        }
        return res;
    }
    public static void main(String[] args) {
//        Sang();
//        for(int i=1;i<=100;i++){
//            if(prime[i]) System.out.print(i+" ");
//        }

        System.out.println(luyThua2(2, 10));
    }
}
