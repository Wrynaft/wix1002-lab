/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week03;

/**
 *
 * @author Ryan Chin
 */
import java.util.Random;
public class L03Q02 {
    public static void main(String[] args) {
        Random g = new Random();
        int num = g.nextInt(6);
        String word = "";
        switch(num){
            case 0:
                word = "zero";
                break;
            case 1:
                word = "one";
                break;
            case 2:
                word = "two";
                break;
            case 3:
                word = "three";
                break;
            case 4:
                word = "four";
                break;
            case 5:
                word = "five";
                break;
        }
        System.out.println(num + " is " + word);
    }
}
