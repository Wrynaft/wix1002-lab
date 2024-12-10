/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week08;

/**
 *
 * @author Ryan Chin
 */
public class L08Q01 {
    public static void main(String[] args) {
        Number a = new Number(); // generate 10 random integers within 0 to 100.
        Number b = new Number(5); // generate 5 random integers within 0 to 100.
        Number c = new Number(4, 50); // generate 4 random integers within 0 to 50.

        a.displayItems();
        a.displayEven();
        a.displayPrime();
        a.displayMax();
        a.displayMin(); 
        a.displayAverage();
        a.displaySquare();
        
        b.displayItems();
        b.displayEven();
        b.displayPrime();
        b.displayMax();
        b.displayMin(); 
        b.displayAverage();
        b.displaySquare();
        
        c.displayItems();
        c.displayEven();
        c.displayPrime();
        c.displayMax();
        c.displayMin(); 
        c.displayAverage();
        c.displaySquare();
    }

}
