/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mang;

/**
 *
 * @author Admin
 */
public class Mang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int table[][]=new int[3][4];
        for (int t = 0; t <3 ; ++t) {
            for(int i=0;i<4;++i){
                table[t][i]=(t*4)+i+1;
                System.out.print(table[t][i]+"\t");
            }
            System.out.println("");
        }
    }
    
}
