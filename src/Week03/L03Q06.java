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
public class L03Q06 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter radius of circle: ");
        double radius = keyboard.nextDouble();
        System.out.print("Enter coordinate point(x,y): ");
        int x = keyboard.nextInt();
        int y = keyboard.nextInt();
        double distance = Math.sqrt((x*x)+(y*y));
        if (distance > radius)
            System.out.println("The point is outside the circle.");
        else if (distance == radius)
            System.out.println("The point is on the circumference.");
        else
            System.out.println("The point is inside the circle.");
    }
}
