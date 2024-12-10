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
public class L02Q06 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the amount of water in gram: ");
        double M = (keyboard.nextDouble()/1000);
        System.out.print("Enter the initial temperature in Fahrenheit: ");
        double init_temp = (keyboard.nextDouble() - 32)/1.8;
        System.out.print("Enter the final temperature in Fahrenheit: ");
        double final_temp = (keyboard.nextDouble() - 32)/1.8;
        double Q = M * (final_temp - init_temp) * 4184;
        System.out.println("The energy needed is " + Q);
        
//        Scanner k = new Scanner(System.in);
//        double M, ini, fin, Q;
//        System.out.print("Enter the amount of water in gram: ");
//        M = k.nextDouble();
//        System.out.print("Enter the initial temperature in Fahrenheit: ");
//        ini = k.nextDouble();
//        System.out.print("Enter the final temperature in Fahrenheit: ");
//        fin = k.nextDouble();
//        Q = (M /1000)* ((fin-32) - (ini-32))/1.8*4184;
//        System.out.printf("The energy needed is %e\n", Q);

    }
}
