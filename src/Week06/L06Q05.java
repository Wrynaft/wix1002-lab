/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week06;

/**
 *
 * @author Ryan Chin
 */
import java.util.Scanner;
import java.util.Random;
public class L06Q05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random g = new Random();
        int score = 0;
        
        int ans=0;
        do {
            System.out.println("Enter negative number to quit.");
            int a = g.nextInt(13), b= g.nextInt(13);
            System.out.print(a + " x " + b + " = ");
            ans = sc.nextInt();
            if (checkMultiply(a,b,ans))
                score++;
        }while(ans>=0);
        
        System.out.println("Your score is " + score);
    }
    
    public static boolean checkMultiply(int a, int b, int ans){
        return (a * b == ans);
    }
}
