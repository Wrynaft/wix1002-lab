/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week05;

/**
 *
 * @author Ryan Chin
 */
public class L05Q04 {
    public static void main(String[] args) {
        int matrix [][] = {{1, 5, 7},{3, 6, 9},{5, 3, 8}};
        System.out.println("3 by 3 Matrix");
        for (int i = 0; i<matrix.length; i++){
            for (int j = 0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.print("\n");
        }
        System.out.println("After rotates 90 degrees clockwise");
        for (int i = 0; i<matrix.length/2; i++){
            for (int j = 0; j<matrix[i].length; j++){
                if (i!=j){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
                }
            }
        }
        for (int i=0; i<matrix.length;i++){
            for (int j = 0; j<((matrix[i].length)/2);j++){
                int temp = matrix[i][j];  
                matrix[i][j]=matrix[i][matrix[i].length-j-1];  
                matrix[i][matrix[i].length-j-1]=temp;  
            }
        }
        for (int i = 0; i<matrix.length; i++){
            for (int j = 0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.print("\n");
        }

    }
}
