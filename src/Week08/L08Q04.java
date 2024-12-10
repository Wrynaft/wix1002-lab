/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week08;

/**
 *
 * @author Ryan Chin
 */
public class L08Q04 {
    public static void main(String[] args) {
        Fraction a = new Fraction();
        a.input();
        System.out.println("The fraction is " + a.getNum() + "/" + a.getDenom());
        a.displayLowest();
    }
}
