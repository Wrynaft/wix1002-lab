/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week08;

/**
 *
 * @author Ryan Chin
 */
import java.util.Random;
public class Game {
    private String name;
    
    public Game(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
    
    public int roll(){
        Random g = new Random();
        return g.nextInt(6)+1;
    }
}
