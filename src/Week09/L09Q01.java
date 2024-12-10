/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week09;

/**
 *
 * @author Ryan Chin
 */
public class L09Q01 {
    public static void main(String[] args) {
        Rectangle a = new Rectangle();
        Square b = new Square();
        Circle c = new Circle();

        a.inputSides();
        a.calculatePeriAndArea();
        a.displayShape();
        
        b.inputSide();
        b.calculatePeriAndArea();
        b.displayShape();
        
        c.inputDiameter();
        c.calculatePeriAndArea();
        c.displayShape();
    }
    
}
