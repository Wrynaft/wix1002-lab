/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week08;

/**
 *
 * @author Ryan Chin
 */
public class L08Q07 {
    public static void main(String[] args) {
        
        money a = new money(51.66);
        money b = new money(107.33);
        
        money added = money.addition(a, b);
        money substract = money.substraction(b, a);
        
        added.round();
        substract.round();
        
        System.out.println("RM" + added.getAmount());
        added.calcNotesAndCoins();
        System.out.println("RM" +substract.getAmount());
        substract.calcNotesAndCoins();
    }
}
