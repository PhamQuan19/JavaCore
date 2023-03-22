/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai6;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class ATM {
    int accID;
    int balance;
    int amount;

    // Nhập thông tin tài khoản
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập accID: ");
        accID = sc.nextInt();
        System.out.print("Nhập balance: ");
        balance = sc.nextInt();
    }

    // Rút tiền khỏi tài khoản
    public void withdraw() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số tiền cần rút: ");
        amount = sc.nextInt();
        if (amount > balance) {
            System.out.println("Số tiền rút vượt quá số dư tài khoản.");
        } else {
            balance = balance - amount;
            System.out.println("Rút tiền thành công.");
        }
    }

    // Hiển thị số dư tài khoản
    public void displayBalance() {
        System.out.println("Số dư hiện tại của tài khoản " + accID + " là: " + balance);
    }

    public static void main(String[] args) {
        ATM atm = new ATM();
        atm.input();
        atm.withdraw();
        atm.displayBalance();
    }
}
