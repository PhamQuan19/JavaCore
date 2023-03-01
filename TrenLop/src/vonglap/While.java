/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vonglap;

/**
 *
 * @author Admin
 */
public class While {
    public static void main(String[] args) {
//        long  a=150, fact=1;
//        while(a>=1){
//            fact*=a;
//            
//            a--;
//            System.out.println(fact);
//            fact%=1e9-7; 
//        }
//        System.out.println(""+fact);

//    int tong=0,i=1;
//    do{
//        tong+=i;
//        i+=2;
//        System.out.println(tong+" i= "+i);
//    }while(i<=100);
//        System.out.println(tong);
//    }

        int tong=0;

        for (int i = 1; i <=100 ; i+=2) {
            tong+=i;
            System.out.println(tong+ " i= "+i);
        }
        
        System.out.println(tong);
        
        
    }

}
