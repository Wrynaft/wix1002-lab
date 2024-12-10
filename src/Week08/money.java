/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week08;

/**
 *
 * @author Ryan Chin
 */
public class money {
    private double amount;
    private double[] notesCoins = {100, 50, 10, 5, 1, 0.5, 0.2, 0.1, 0.05};
    
    public money(double num){
        this.amount = num;
    }
    
    public void round(){
        amount = Math.round(amount * 20) / 20.0;
    }
    
    public void calcNotesAndCoins(){
        System.out.println("This amount of money comprises of: ");
        for(int i=0; i<notesCoins.length;i++){
            int noNotesCoins = (int) Math.floor(amount/ notesCoins[i]);
            amount %= notesCoins[i];
            if (i<5)
                System.out.println(noNotesCoins + " x RM" + notesCoins[i]);
            else
                System.out.println(noNotesCoins + " x " + (int)(notesCoins[i]*100) + " cents");
        }
    }
    
    public double getAmount(){
        return amount;
    }
    
    public static money addition(money a, money b){
        double amount = a.getAmount() + b.getAmount();
        return new money(amount);
    }
    
    public static money substraction(money a, money b){
        double amount = a.getAmount() - b.getAmount();
        return new money(amount);
    }
}
