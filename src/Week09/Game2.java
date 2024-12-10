/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week09;

/**
 *
 * @author Ryan Chin
 */
public class Game2 extends Dice{
    
    public Game2(){
        super();
    }
    
    public void play(){
        while (super.getPlayer1()!=100 || super.getPlayer2()!=100){
            int roll1 = super.roll();
            if (roll1==6){
                System.out.println("Player 1 rolled a 6! Roll again.");
                int roll2 = super.roll();
                if (roll2 == 6)
                    System.out.println("Whoops! Player 1 rolled a 6 again. No points awarded.");
                else{
                    System.out.println("Player 1 rolled a " + roll2);
                    if (super.getPlayer1() + roll2 + 6 > 100)
                        System.out.println("Player 1 rolled more than 100. Try again next round.");
                    else{
                        super.setPlayer1(super.getPlayer1() + roll2 + 6);
                        System.out.println("Current points: " + super.getPlayer1());
                    }
                }
            } else{
                if (super.getPlayer1() + roll1 > 100)
                    System.out.println("Player 1 rolled more than 100. Try again next round.");
                else{
                    super.setPlayer1(super.getPlayer1() + roll1);
                    System.out.println("Player 1 rolled a " + roll1 + ". Current points: " + super.getPlayer1());
                }
            }
            if (super.getPlayer1() == 100)
                break;
            
            roll1 = super.roll();
            if (roll1==6){
                System.out.println("Player 2 rolled a 6! Roll again.");
                int roll2 = super.roll();
                if (roll2 == 6)
                    System.out.println("Whoops! Player 2 rolled a 6 again. No points awarded.");
                else{
                    System.out.println("Player 2 rolled a " + roll2);
                    if (super.getPlayer2() + roll2 + 6 > 100)
                        System.out.println("Player 2 rolled more than 100. Try again next round.");
                    else{
                        super.setPlayer2(super.getPlayer2() + roll2 + 6);
                        System.out.println("Current points: " + super.getPlayer2());
                    }
                }
            } else{
                if (super.getPlayer2() + roll1 > 100)
                    System.out.println("Player 2 rolled more than 100. Try again next round.");
                else{
                    super.setPlayer2(super.getPlayer2() + roll1);
                    System.out.println("Player 2 rolled a " + roll1 + ". Current points: " + super.getPlayer2());
                }
            }
        }
        
        if (super.getPlayer1() == 100){
            super.setWinner("Player 1");
            System.out.println("The winner is Player 1!");
        } else{
            super.setWinner("Player 2");
            System.out.println("The winner is Player 2!");
        }
    }
    
}
