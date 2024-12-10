/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week03;

/**
 *
 * @author Ryan Chin
 */
import java.util.Scanner;
public class L03Q01 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter two integer number: ");
        int num1 = keyboard.nextInt();
        int num2 = keyboard.nextInt();
        System.out.print("Enter the operand: ");
        char operand = (keyboard.next()).charAt(0);
        int result=0;
        switch (operand) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            case '%':
                result = num1 % num2;
                break;
        }
        System.out.println(num1 + " " + operand + " " + num2 + " = " + result);
   
    }
}
