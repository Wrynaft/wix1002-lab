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
public class L03Q04 {
    public static void main(String[] args) {
        Random g = new Random();
        int p1first = g.nextInt(6) + 1;
        int p1second = g.nextInt(6) + 1;
        int p2first = g.nextInt(6) + 1;
        int p2second = g.nextInt(6) + 1;
        System.out.println("Player 1's rolls are: " + p1first + " " + p1second);
        System.out.println("Player 2's rolls are: " + p2first + " " + p2second);
        if ((p1first + p1second) > (p2first + p2second))
            System.out.println("Player 1 wins");
        else
            System.out.println("Player 2 wins");
    }
}
