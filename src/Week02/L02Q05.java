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
public class L02Q05 {
    public static void main(String[] args) {
        Random g = new Random();
        int num = g.nextInt(10001);
        System.out.println("The number is " + num);
        int sum = 0;
        while (num != 0){
            sum += num % 10;
            num = num/10;
        }
        System.out.println("The sum of all digits in the number is " + sum);
        
//        int num, sum=0;
//        final int MAX = 10000;
//        Random r = new Random();
//        num = r.nextInt(MAX);
//        System.out.printf("The number is %5d\n", num);
//
//        sum+= num/10000;
//        num%=10000;
//        sum+= num/1000;
//        num%=1000;
//        sum+= num/100;
//        num%=100;
//        sum+= num/10;
//        num%=10;
//        sum+=num;
//        System.out.printf("The sum of the digit is %2d\n", sum);

    }
}
