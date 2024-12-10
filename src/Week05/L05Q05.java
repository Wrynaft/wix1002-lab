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
public class L05Q05 {
    public static void main(String[] args) {
        Random g = new Random();
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("A list of 20 random integer within 0 to 100");
        int[] num = new int[20];
        for (int i=0; i<num.length;i++){
            num[i] = g.nextInt(101);
            if (i==num.length-1)
                System.out.print(num[i]);
            else
                System.out.print(num[i] + ", ");
        }
        
        //Bubble sort
        for (int pass=1; pass<num.length; pass++){
            for (int i=0; i<num.length-1; i++){
                if (num[i]<num[i+1]){
                    int hold = num[i];
                    num[i] = num[i+1];
                    num[i+1] = hold;
                }
            }
        }
        
        System.out.println("\nArray in descending order");
        for (int i=0; i<num.length;i++){
            if (i==num.length-1)
                System.out.print(num[i]);
            else
                System.out.print(num[i] + ", ");
        }
        
        System.out.print("\nEnter a number to search: ");
        int key = keyboard.nextInt();
        boolean search = false;
        for (int i=0; i<num.length; i++){
            if (key==num[i]){
                System.out.println(num[i] + " found");
                System.out.println("Linear Search - " + (i+1) + " loop(s)");
                search = true;
                break;
            }
        }
        if (!search)
            System.out.println("Not found");
        
        search = false;
        int low = 0;
        int high = num.length-1;
        int middle;
        int loops=1;
        while (low <= high){
            middle = (low + high)/2;
            if (key == num[middle]){
                System.out.println(num[middle] + " found");
                System.out.println("Binary Search - " + loops + " loop(s)");
                search = true;
                break;
            }
            else if (key < num[middle])
                low = middle + 1;
            else
                high = middle - 1;
            loops++;
        }
        if (!search)
            System.out.println("Not found");
    }
}
