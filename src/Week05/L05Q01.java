/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week05;

/**
 *
 * @author Ryan Chin
 */
import java.util.Scanner;
import java.util.Random;
public class L05Q01 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Random g = new Random();
        
        System.out.print("Enter amount of students (N): ");
        int N = keyboard.nextInt();
        
        int scores[] = new int[N];
        int highest=0;
        int lowest=100;
        int total=0;
        
        System.out.print("List of score: ");
        for (int i=0; i<scores.length;i++){
            scores[i] = g.nextInt(101);
            System.out.print(scores[i] + " ");
            if (scores[i]>highest)
                highest = scores[i];
            if (scores[i]<lowest)
                lowest = scores[i];
            total += scores[i];
        }
        System.out.println("\nHighest score: " + highest);
        System.out.println("Lowest score: " + lowest);
        
        double avg = (double)total/N;
        System.out.println("Average score: " + avg);
    }
}
