/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week06;

/**
 *
 * @author Ryan Chin
 */
public class L06Q01 {
    public static void main(String[] args) {
        System.out.println("First 20 triangular numbers: ");
        for (int i=1; i<=20; i++){
            System.out.print(triangular(i) + " ");
        }
    }
    
    public static int triangular(int num){
        int triangle = 0;
        for (int i=1; i<=num; i++){
            triangle += i;
        }
        return triangle;
    }
}
