/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week09;

/**
 *
 * @author Ryan Chin
 */
public class Shape {
    private String name;
    private double perimeter;
    private double area;
    
    public Shape(String name){
        this.name = name;
    }
    
    public double getPerimeter(){
        return perimeter;
    }
    
    public double getArea(){
        return area;
    }
    
    public void setPerimeter(double peri){
        this.perimeter = peri;
    }
    
    public void setArea(double a){
        this.area = a;
    }
    
    public void displayShape(){
        System.out.println("Name of shape: " + name);
        System.out.printf("Perimeter: %.2f\n", perimeter);
        System.out.printf("Area: %.2f\n", area);
    }
}
