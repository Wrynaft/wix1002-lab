/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week04;

/**
 *
 * @author Ryan Chin
 */
import java.util.Scanner;
public class L04Q02 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        int n = keyboard.nextInt();
        
        int total=0;
        for (int i = 1; i<=n; i++){
            for (int j = 1; j<=i; j++){
                total += j;
            }
        }
        System.out.println("The sum of the series is " + total);
    }
}
