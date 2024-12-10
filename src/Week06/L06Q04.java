/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week06;

/**
 *
 * @author Ryan Chin
 */
public class L06Q04 {
    public static void main(String[] args) {
        System.out.println(gcd(24,8));
        System.out.println(gcd(200,625));
    }
    
    public static int gcd(int num1, int num2){
        if (num1 == 0)
            return num2;
        return gcd(num2 % num1, num1);
    }
}
