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
public class L03Q03 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter sales volume: ");
        int sales = keyboard.nextInt();
        double commission;
        if (sales <= 100)
            commission = sales * 0.05;
        else if (sales>100 && sales <= 500)
            commission = sales * 0.075;
        else if (sales > 500 && sales <= 1000)
            commission = sales * 0.1;
        else
            commission = sales * 0.125;
        System.out.printf("The commission is %.2f\n", commission);
    }
}
