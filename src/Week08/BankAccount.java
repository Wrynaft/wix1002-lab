/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week08;

/**
 *
 * @author Ryan Chin
 */
import java.util.Scanner;
public class BankAccount {
    private String name;
    private String IDnum;
    private double deposit; 
    
    public void openAccount(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        this.name = sc.nextLine();
        System.out.print("Enter your IC/Passport Number: ");
        this.IDnum = sc.nextLine();
        System.out.print("Enter your initial deposit: ");
        this.deposit = sc.nextDouble();
        System.out.println("Your bank account is successfully opened.");
        sc.close();
    }
    
    public void deposit(double num){
        deposit += num;
        System.out.println("RM" + num + " deposited, new balance is RM" + deposit);
    }
    
    public void withdraw(double num){
        if (deposit<num)
            System.out.println("Balance not enough to withdraw!");
        else{
            deposit -= num;
            System.out.println("RM" + num + " withdrawn, new balance is RM" + deposit);
        }
    }
    
    public void displayBalance(){
        System.out.println("Current balance: RM" + deposit);
    }
}
