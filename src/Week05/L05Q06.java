/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week05;

/**
 *
 * @author Ryan Chin
 */
import java.util.Scanner;
public class L05Q06 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the number of Pascal Triangle to generate: ");
        int row = keyboard.nextInt();
        
        int[][] pascal = new int[row][row];
        for (int i=0; i<pascal.length; i++){
            for (int j=0; j<pascal[i].length; j++){
                if (j==0||j==i)
                    pascal[i][j]=1;
                else if (j<i)
                    pascal[i][j] = pascal[i-1][j] + pascal[i-1][j-1];
                else
                    pascal[i][j] = 0;
            }
        }
        System.out.println("The Pascal Triangle with " + row + " row(s)");
        for (int i=0; i<pascal.length; i++){
            for (int j = 0; j<pascal[i].length; j++){
                System.out.print(pascal[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}
