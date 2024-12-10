/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week03;

/**
 *
 * @author Ryan Chin
 */
import java.util.Scanner;
public class L03Q05 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = keyboard.nextInt();
        System.out.print("Enter b: ");
        int b = keyboard.nextInt();
        System.out.print("Enter c: ");
        int c = keyboard.nextInt();
        System.out.print("Enter d: ");
        int d = keyboard.nextInt();
        System.out.print("Enter e: ");
        int e = keyboard.nextInt();
        System.out.print("Enter f: ");
        int f = keyboard.nextInt();
        if ((a*d)-(b*c)==0)
            System.out.println("The equation has no solution");
        else{         
            System.out.println("x is " + (((e*d)-(b*f))/(a*d)-(b*c)));
            System.out.println("y is " + (((a*f)-(e*c))/(a*d)-(b*c)));
        }    
        
    }
}
