/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week04;

/**
 *
 * @author Ryan Chin
 */
import java.util.Scanner;
public class L04Q01 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = keyboard.nextInt();
        System.out.print("The factors are: ");
        for (int i =1; i<num; i++){
            if (num%i==0){
                System.out.print(i + ", ");
            }
        }
        System.out.print(num + "\n");
    }
}
