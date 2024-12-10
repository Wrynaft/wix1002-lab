/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week08;

/**
 *
 * @author Ryan Chin
 */
import java.util.Scanner;
public class WeightCalculator {
    private int age;
    private double height;
    private double weight;
    
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        this.age = sc.nextInt();
        System.out.print("Enter your height: ");
        this.height = sc.nextDouble();  
        sc.close();
    }
    
    public void calculateWeight(){
        weight = (height - 100 + age / 10) * 0.9;
    }
    
    public void display(){
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Recommended weight: " + weight);
    }
}
