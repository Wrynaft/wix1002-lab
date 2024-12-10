/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week05;

/**
 *
 * @author Ryan Chin
 */
import java.util.Random;
import java.util.Scanner;
public class L05Q03 {
    public static void main(String[] args) {
        Random g = new Random();
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter number of employees: ");
        int N = keyboard.nextInt();
        
        int [][] workhours = new int[N][7];
        
        for (int i=0; i<N; i++){
            System.out.println("Employee "+(i+1)+": ");
            System.out.print("Work hours in seven days: ");
            int totalhours=0;
            for (int j=0; j<7; j++){
                workhours[i][j] = g.nextInt(8) + 1;
                System.out.print(workhours[i][j]+" ");
                totalhours+=workhours[i][j];
            }
            System.out.println("\nTotal hours: "+totalhours);
        }
                
    }
}
