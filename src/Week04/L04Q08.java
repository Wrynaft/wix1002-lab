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
public class L04Q08 {
    public static void main(String[] args) {
        Random g = new Random();
        int count = g.nextInt(101);
        System.out.print("The first "+count+" prime numbers are: ");
        int j = 1;
        boolean prime = true;
        for (int i=0; i<count;){
            j++;
            for (int k = 2; k < j; k++){
                if (j%k==0){
                    prime = false;
                    break;
                }
            }
            if (prime == true){
                System.out.print(j + " ");
                i++;
            } else
                prime = true;
        }
    }
}
