/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week09;

import java.util.Scanner;

/**
 *
 * @author Ryan Chin
 */
public class Circle extends Shape{
    private double diameter;
    
    public Circle(){
        super("Circle");
    }
    
    public void inputDiameter(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter circle's diameter: ");
        diameter = sc.nextDouble();
        sc.close();
    }
    
    public void calculatePeriAndArea(){
        super.setPerimeter(Math.PI*diameter);
        super.setArea(Math.PI*(diameter/2)*(diameter/2));
    }
}
