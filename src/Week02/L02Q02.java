/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week02;

/**
 *
 * @author Ryan Chin
 */
import java.util.Scanner;
public class L02Q02 {
    public static void main(String[] args) {
        //Input
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the price of the car: RM");
        double P = keyboard.nextDouble();
        System.out.print("Enter the down payment: RM");
        double D = keyboard.nextDouble();
        System.out.print("Enter the interest rate (in %): ");
        double R = keyboard.nextDouble();
        System.out.print("Enter the loan duration (in years): ");
        int Y = keyboard.nextInt();
        //Process
        double M = (P-D)*(1 + R*Y/100)/(Y*12);
        //Output
        System.out.printf("%s%.2f\n","The monthly payment is RM",M);
        
//        Scanner k = new Scanner(System.in);
//        double P, D, R, M;
//        int Y;
//        System.out.print("Enter the price of the car:");
//        P = k.nextDouble();
//        System.out.print("Enter the downpayment:");
//        D = k.nextDouble();
//        System.out.print("Enter the interest rate in %:");
//        R = k.nextDouble();
//        System.out.print("Enter the loan duration in year:");
//        Y = k.nextInt();   
//        M = (P - D) * (1 + R*Y/100) / (Y*12);
//        System.out.printf("The monthly payment is : %.2f\n", M);

    }
}
