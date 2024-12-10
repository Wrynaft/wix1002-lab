/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week06;

/**
 *
 * @author Ryan Chin
 */
public class L06Q02 {
    public static void main(String[] args) {
        int n=7;
        char c = '*';
        System.out.println("Triangle:");
        for (int i=1; i<=n; i+=2){
            for(int j=0;j<(n-i)/2;j++){
                System.out.print(" ");
            }
            multiPrint(i,c);
            System.out.println("");
        }
        
        System.out.println("\nDiamond:");
        for (int i=1; i<=n; i+=2){
            for(int j=0;j<(n-i)/2;j++){
                System.out.print(" ");
            }
            multiPrint(i,c);
            System.out.println("");
        }
        for (int i=n-2; i>0; i-=2){
            for(int j=0;j<(n-i)/2;j++){
                System.out.print(" ");
            }
            multiPrint(i,c);
            System.out.println("");
        }
        
    }
    
    public static void multiPrint(int n, char c){
        for (int i=0; i<n; i++){
            System.out.print(c);
        }
    }
}
