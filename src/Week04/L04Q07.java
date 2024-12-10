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
public class L04Q07 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter principal amount: ");
        double P = keyboard.nextDouble();
        System.out.print("Enter interest in %: ");
        double i = keyboard.nextDouble();
        System.out.print("Enter total number of month(s): ");
        int N = keyboard.nextInt();
        
        double M = (P*(i/(12*100)))/(1-Math.pow((1+(i/(12*100))),-N));
        
        System.out.printf("Month%25s%20s%20s%25s%25s\n","Monthly Payment","Principal","Interest","Unpaid Balance","Total Interest");
        double total_interest=0;
        for (int n = 1; n<=N; n++){
            double C = M * Math.pow((1+(i/(12*100))), -(1+N-n));
            double L = M - C;
            double R = L/(i/(12*100)) - C;
            total_interest += L;
            System.out.printf("%-3d%25.2f%20.2f%20.2f%25.2f%25.2f\n", n, M, C, L, R, total_interest);
        }
        
        
    }
}
