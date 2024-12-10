/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week06;

/**
 *
 * @author Ryan Chin
 */
public class L06Q03 {
    public static void main(String[] args) {
        int[] arr = {46,378,99,123,541,7834,56,822,4,325};
        System.out.println("Original array: ");
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        
        System.out.println("\nReversed array: ");
        reverse(arr);
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    
    public static void reverse(int[] num){
        for (int i=0; i<num.length; i++){
            int reverse = 0;
            while (num[i]!=0){
                reverse = reverse*10 + num[i]%10;
                num[i]= num[i]/10;
            }
            num[i] = reverse;
        }
    }
}
