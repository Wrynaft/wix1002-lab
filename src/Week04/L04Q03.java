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
public class L04Q03 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        int total = 0;
        int n = 0;
        int total2 = 0;
        int score = 0;
        int minimum = Integer.MAX_VALUE;
        int maximum = 0;
       
        while (score >=0){
            System.out.print("Enter a score [negative score to quit]:");
            score = keyboard.nextInt();
            if (score < 0)
                continue;
            if (score<minimum)
                minimum = score;
            if (score > maximum)
                maximum = score;
            total += score;
            total2 += score*score;
            n++;
        
        }
        System.out.println("Minimum Score: " +  minimum);
        System.out.println("Maximum score: " + maximum);
        
        double average = (double)total/n;
        System.out.printf("Average score: %.2f\n", average);
        
        double sd = (double) Math.sqrt((total2-(total*total)/n)/(n-1));
        System.out.printf("Standard Deviation: %.2f\n", sd);
    }
}
