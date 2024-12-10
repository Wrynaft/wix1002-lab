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
public class L02Q01 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter temperature in degree Fahrenheit: ");
        double fahrenheit = keyboard.nextDouble();
        double celsius = (fahrenheit - 32)/1.8;
        System.out.printf("%s%.2f\n", "The temperature in degree celsius is ",celsius);
    }
}
