/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week09;

/**
 *
 * @author Ryan Chin
 */
import java.util.Random;
public class Dice {
    private int player1;
    private int player2;
    private String winner;
    
    public Dice(){
        player1 = 0;
        player2 = 0;
    }
    
    public void setWinner(String win){
        winner = win;
    }
    
    public void setPlayer1(int n){
        player1 = n;
    }
    
    public void setPlayer2(int n){
        player2 = n;
    }
    
    public int getPlayer1(){
        return player1;
    }
    
    public int getPlayer2(){
        return player2;
    }
    
    public int roll(){
        Random g = new Random();
        return g.nextInt(6) + 1;
    }
}
