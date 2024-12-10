/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week08;

/**
 *
 * @author Ryan Chin
 */
public class L08Q05 {
    public static void main(String[] args) {
        Game a = new Game("Ryan");
        Game b = new Game("John");
        
        int pointA = 0;
        int pointB = 0;
        
        int currentA = 0;
        int currentB = 0;
        
        while (pointA<100 || pointB<100){
           currentA = a.roll();
           pointA += currentA;
           System.out.println(a.getName() + " rolled a " +currentA + ". They have " + pointA + " points now.");
           if (pointA>=100){
               System.out.println(a.getName() + " wins!");
               break;
           }
           currentB = b.roll();
           pointB += currentB;
           System.out.println(b.getName() + " rolled a " +currentB + ". They have " + pointB + " points now.");
           if (pointB>=100){
               System.out.println(b.getName() + " wins!");
               break;
           }
        }
    }
}
