/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week02;

/**
 *
 * @author Ryan Chin
 */
import java.util.Random;
public class L02Q03 {
    public static void main(String[] args) {
//        Random g = new Random();
//        int num1 = g.nextInt(41) + 10;
//        int num2 = g.nextInt(41) + 10;
//        int num3 = g.nextInt(41) + 10;
//        System.out.println(num1+" "+num2+" "+num3);
//        double sum = num1 + num2 + num3;
//        System.out.println("The sum of the three numbers is " + sum);
//        double avg = sum/3;
//        System.out.printf("%s%.2f","The average of the three numbers is ",avg);
        
        int num1, num2, num3;
        final int MAX = 41;
        Random r = new Random();
        num1 = 10+r.nextInt(MAX);
        num2 = 10+r.nextInt(MAX);
        num3 = 10+r.nextInt(MAX);
        System.out.printf("The number is %3d%3d%3d\n", num1, num2, num3);
        System.out.println("Sum :" + (num1+num2+num3));
        System.out.printf("Average : %.2f\n", (num1+num2+num3)/3.0 );

    }
}
