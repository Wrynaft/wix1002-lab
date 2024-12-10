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
public class L05Q02 {
    public static void main(String[] args) {
        Random g = new Random();
        
        int [] list = new int[10];
        
        for (int i=0; i<list.length; i++){
            list[i] = g.nextInt(21);
            for (int j=0; j<i; j++){
                if (list[j]==list[i]){
                    list[i] = g.nextInt(21);
                    j=0;
                }
            }
            System.out.print(list[i]+ " ");
        }
    }
}
