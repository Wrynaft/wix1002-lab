/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week08;

/**
 *
 * @author Ryan Chin
 */
import java.util.Random;
public class Number {
    private int[] arr;
    Random g = new Random();
    
    public Number(int size, int range){
        arr = new int[size];
        for(int i=0; i<arr.length; i++){
            arr[i] = g.nextInt(range+1);
        }
    }
    public Number(){
        this(10, 100);
    }
    
    public Number(int n){
        this(n, 100);
    }
    
    public void displayItems(){
        System.out.print("All items in the array: ");
        for (int num: arr){
            System.out.print(num + " ");
        }
        System.out.println("");
    }
    
    public void displayEven(){
        System.out.print("Even numbers: ");
        for (int num: arr){
            if (num%2==0)
                System.out.print(num + " ");
        }
        System.out.println("");
    }
    
    public void displayPrime(){
        System.out.print("Prime numbers: ");
        for (int num: arr){
            if (isPrime(num))
                System.out.print(num + " ");
        }
        System.out.println("");
    }
    
    public void displayMax(){
        int max=0;
        System.out.print("Maximum number: ");
        for (int num: arr){
            if (num>max)
                max = num;
        }
        System.out.println(max);
    }
    
    public void displayMin(){
        int min=arr[0];
        System.out.print("Minimum number: ");
        for (int num: arr){
            if (num<min)
                min = num;
        }
        System.out.println(min);
    }
    
    public void displayAverage(){
        double total=0;
        System.out.print("The average: ");
        for (int num: arr){
            total += num;
        }
        System.out.println(total/arr.length);
    }
    
    public void displaySquare(){
        System.out.print("Square numbers: ");
        for (int num: arr){
            if ((int) Math.sqrt(num) * (int) Math.sqrt(num) == num)
                System.out.print(num + " ");
        }
        System.out.println("\n");
    }
    
    private boolean isPrime(int num){
       for(int i=2;i<=num/2;i++){
           if((num%i)==0)
               return  false;
       }
       return true;
    }

}
