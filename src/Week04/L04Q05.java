/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week04;

/**
 *
 * @author Ryan Chin
 */
import java.util.Random;
public class L04Q05 {
    public static void main(String[] args) {
        int player1=0, player2=0, dice;
        Random g = new Random();
        game:{
        for(int i=0; ;i++) {
            if (i%2==0) {
                do {
                    dice = g.nextInt(6)+1;
                    player1+=dice;
                    System.out.println("Player 1 - Roll Dice: " + dice + " Total: " + player1);
                    if (player1 >100) {
                        System.out.println("Player 1 WIN!");
                        break game;
                    }
                }while(dice==6);
            }
            else {
                do {
                    dice = g.nextInt(6)+1;
                    player2+=dice;
                    System.out.println("Player 2 - Roll Dice: " + dice + " Total: " + player2);
                    if (player2 >100) {
                        System.out.println("Player 2 WIN!");
                        break game;
                    }
                }while(dice==6);
            }
        }}

        
    }
//        Random g = new Random();
//        int player1score=0;
//        int player2score=0;
//        
//        int player1round=0;
//        int player2round=0;
//        
//        while (player1score<=100 || player2score<=100){
//            do {
//                player1round = g.nextInt(6) + 1;
//                System.out.println("Player 1 rolls a " + player1round);
//                player1score += player1round;
//                if (player1score > 100)
//                    break;
//                if (player1round == 6){
//                    System.out.println("Player 1 gets to roll again!");
//                    continue;
//                }
//                System.out.println("Player 1's current score is " + player1score);
//            } while (player1round==6);
//            
//            if (player1score > 100)
//                break;
//            
//            do {
//                player2round = g.nextInt(6) + 1;
//                System.out.println("Player 2 rolls a " + player2round);
//                player2score += player2round;
//                if (player2score > 100)
//                    break;
//                if (player2round == 6){
//                    System.out.println("Player 2 gets to roll again!");
//                    continue;
//                }
//                System.out.println("Player 2's current score is " + player2score);
//            } while (player2round==6);
//            System.out.print("\n");
//        }
//        if (player1score > 100)
//            System.out.println("The winner is Player 1 with a score of " + player1score);
//        else
//            System.out.println("The winner is Player 2 with a score of " + player2score);
//    }
}
