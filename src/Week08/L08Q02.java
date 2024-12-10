/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week08;

/**
 *
 * @author Ryan Chin
 */
public class L08Q02 {
    public static void main(String[] args) {
        BankAccount a = new BankAccount();
        
        a.openAccount();
        a.deposit(200);
        a.withdraw(1000);
        a.withdraw(500);
        a.displayBalance();
        
    }
}
