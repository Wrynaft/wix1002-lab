/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week02;

/**
 *
 * @author Ryan Chin
 */
import java.util.Scanner;
public class L02Q04 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the number of seconds: ");
        int seconds = keyboard.nextInt();
        System.out.println(seconds + " seconds is " + seconds/3600 + " hours, " + (seconds%3600)/60 + " minutes and " + seconds%60 + " seconds");
        
//        Scanner k = new Scanner(System.in);
//        int input, h, m, s;
//        System.out.print("Enter the number of seconds: ");
//        input = k.nextInt();
//        h = input / 3600;
//        s=input%3600;
//        m = s/60;
//        s%=60;
//        System.out.printf("%d seconds is %d hours, %d minutes and %d seconds\n", input, h, m, s);

    }
}
