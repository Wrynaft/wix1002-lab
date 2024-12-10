/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week08;

/**
 *
 * @author Ryan Chin
 */
public class BurgerStall {
    private int ID;
    private int noBurgers;
    private static int totalBurgers;
    
    public BurgerStall(int id, int noBurgers){
        this.ID = id;
        this.noBurgers = noBurgers;
        totalSold(noBurgers);
    }
    
    public void sold(int num){
        noBurgers += num;
        totalSold(num);
    }
    
    public static void totalSold(int num){
        totalBurgers += num;
    }
    
    public int getID(){
        return ID;
    }
    
    public int getNoBurgers(){
        return noBurgers;
    }

    public static int getTotalBurgers(){
        return totalBurgers;
    }
}
