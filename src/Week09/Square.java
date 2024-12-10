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
public class Square extends Shape{
    private double length;
    
    public Square(){
        super("Square");
    }
    
    public void inputSide(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter square's length: ");
        length = sc.nextDouble();
        sc.close();
    }
    
    public void calculatePeriAndArea(){
        super.setPerimeter(4*length);
        super.setArea(length*length);
    }
}
