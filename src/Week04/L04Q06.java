/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week04;

/**
 *
 * @author Ryan Chin
 */
import java.util.Random;
public class L04Q06 {
    public static void main(String[] args) {
        int num, count=0;
        Random g = new Random();
        num = g.nextInt(Integer.MAX_VALUE);
        System.out.println("The random in integer is " + num);
        while (num!=0){
            num/=10;
            count++;
        } 
        System.out.println("It consists of " + count + " digit(s)");

//        Random g = new Random();
//        int num = g.nextInt();
//        while (num<0)
//            num = g.nextInt();
//        System.out.println("The random integer is " + num);
//        int count = 0;
//        while (num!=0){
//            num = num/10;
//            count++;
//        }
//        System.out.println("The number of digits in the integer is " + count);
    }
}
