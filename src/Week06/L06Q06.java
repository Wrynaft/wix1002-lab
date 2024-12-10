/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week06;

/**
 *
 * @author Ryan Chin
 */
public class L06Q06 {
    public static void main(String[] args) {
        System.out.println("The first 20 palindromic prime: ");
        int palprimecnt = 0, i=2;
        while (palprimecnt<20){
            if (palinPrime(i)){
                System.out.print(i + " ");
                palprimecnt++;
            }
            i++;
        }
        System.out.println("\nThe first 20 emirps: ");
        int emirpcnt=0;
        i=0;
        while (emirpcnt<20){
            if (emirp(i)){
                System.out.print(i + " ");
                emirpcnt++;
            }
            i++;
        }
    }
    
    public static boolean palinPrime(int num){
        return (isPrime(num) && num==reverse(num));
    }
  
    public static boolean emirp(int num){
        return (isPrime(num) && isPrime(reverse(num)) && !palinPrime(num));
    }
    
    public static boolean isPrime(int num){
        for (int i = 2; i<=num/2;i++){
            if((num%i==0))
                return false;
        }
        return true;
    }
    public static int reverse(int num){
        int reverse = 0;
        while (num!=0){
            reverse = reverse*10 + num%10;
            num= num/10;
        }
        return reverse;
    }
}
