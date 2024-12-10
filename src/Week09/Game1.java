/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week09;

/**
 *
 * @author Ryan Chin
 */
public class Game1 extends Dice{
    
    public Game1(){
        super();
    }
    
    public void play(){
        while (super.getPlayer1()<100 || super.getPlayer2()<100){
            int roll1 = super.roll();
            int roll2 = super.roll();
            super.setPlayer1(super.getPlayer1() + roll1 + roll2);
            System.out.println("Player 1 rolled a " + roll1 + " and a " + roll2 + ". Current points: " + super.getPlayer1());
            while (roll1 == roll2){
                System.out.println("Player 1 gets to roll again!");
                roll1 = super.roll();
                roll2 = super.roll();
                super.setPlayer1(super.getPlayer1() + roll1 + roll2);
                System.out.println("Player 1 rolled a " + roll1 + " and a " + roll2 + ". Current points: " + super.getPlayer1());
            }
            if (super.getPlayer1()>=100)
                break;
            
            roll1 = super.roll();
            roll2 = super.roll();
            super.setPlayer2(super.getPlayer2() + roll1 + roll2);
            System.out.println("Player 2 rolled a " + roll1 + " and a " + roll2 + ". Current points: " + super.getPlayer2());
            while (roll1 + roll2 == 12){
                System.out.println("Player 1 gets to roll again!");
                roll1 = super.roll();
                roll2 = super.roll();
                super.setPlayer1(super.getPlayer2() + roll1 + roll2);
                System.out.println("Player 2 rolled a " + roll1 + " and a " + roll2 + ". Current points: " + super.getPlayer2());
            }
        }
        
        if (super.getPlayer1()>=100){
            super.setWinner("Player 1");
            System.out.println("The winner is Player 1!");
        } else{
            super.setWinner("Player 2");
            System.out.println("The winner is Player 2!");
        }
    }
}
