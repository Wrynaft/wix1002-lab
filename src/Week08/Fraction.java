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
public class Fraction {
    private int numerator;
    private int denominator;
    
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numerator: ");
        setNum(sc.nextInt());
        System.out.print("Enter denominator: ");
        setDenom(sc.nextInt());
        sc.close();
    }
    
    public void setNum(int num){
        numerator = num;
    }
    
    public void setDenom(int denom){
        denominator = denom;
    }
    
    public int getNum(){
        return numerator;
    }
    
    public int getDenom(){
        return denominator;
    }
    
    public void displayLowest(){
        int gcd = gcd(numerator, denominator);
        System.out.println("The fraction reduced to lowest terms is " + numerator/gcd + "/" + denominator/gcd);
    }
    
    private static int gcd(int a, int b){
        if (b==0)
            return a;
        return gcd(b, a%b);
    }
}
