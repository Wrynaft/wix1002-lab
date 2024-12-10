/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week08;

/**
 *
 * @author Ryan Chin
 */
public class L08Q06 {
    public static void main(String[] args) {
        BurgerStall a = new BurgerStall(1, 10);
        BurgerStall b = new BurgerStall(2, 5);
        BurgerStall c = new BurgerStall(3, 15);
        
        a.sold(50);
        b.sold(25);
        c.sold(100);
        
        System.out.println("Burger stall " + a.getID() + " sold " + a.getNoBurgers() + " burgers.");
        System.out.println("Burger stall " + b.getID() + " sold " + b.getNoBurgers() + " burgers.");
        System.out.println("Burger stall " + c.getID() + " sold " + c.getNoBurgers() + " burgers.");
        
        System.out.println("Total number of burgers sold is " + BurgerStall.getTotalBurgers());
    }
}
