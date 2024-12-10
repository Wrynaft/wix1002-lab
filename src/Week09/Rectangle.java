/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week09;

/**
 *
 * @author Ryan Chin
 */
import java.util.Scanner;
public class Rectangle extends Shape{
    private double length;
    private double width;
    
    public Rectangle(){
        super("Rectangle");
    }
    
    public void inputSides(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rectangle's length: ");
        length = sc.nextDouble();
        System.out.print("Enter rectangle's width: ");
        width = sc.nextDouble();
        sc.close();
    }
    
    public void calculatePeriAndArea(){
        super.setPerimeter(2*length+2*width);
        super.setArea(length*width);
    }
    
}
