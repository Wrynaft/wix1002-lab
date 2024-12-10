/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week04;

/**
 *
 * @author Ryan Chin
 */
import java.util.Scanner;
public class L04Q04 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = keyboard.nextInt();
        System.out.print("Enter first day of the year (0 for Sunday, 1 for Monday, ..., 6 for Saturday): ");
        int day = keyboard.nextInt();
        int feb = 28;
        if ((year%4==0&&year%100!=0)||year%400==0)
            feb = 29;
        int day_to_may = day +((31+feb+31+30)%7);
        if (day_to_may>6)
            day_to_may = day_to_may - 8;
        
        System.out.printf("%20s\n", year);
        System.out.printf("%20s\n","May");
        System.out.println("---------------------------------------");
        System.out.printf("%5s%5s%5s%5s%5s%5s%5s\n", "Sun","Mon","Tue","Wed","Thu","Fri","Sat");
        for (int i=0; i<day_to_may; i++)
            System.out.printf("%5s"," ");
        for (int i = 1; i<=31; i++){
            System.out.printf("%5s",i);
            if (i==(7-day_to_may)||(i-(7-day_to_may))%7==0)
                System.out.print("\n");
        }

        int day_to_aug = (day_to_may + 31 +30 + 31)%7;
        if (day_to_aug>6)
            day_to_aug = day_to_aug -8;
        System.out.print("\n\n\n");
        System.out.printf("%20s\n","August");
        System.out.println("---------------------------------------");
        System.out.printf("%5s%5s%5s%5s%5s%5s%5s\n", "Sun","Mon","Tue","Wed","Thu","Fri","Sat");
        for (int i=0; i<day_to_aug; i++)
            System.out.printf("%5s"," ");
        for (int i = 1; i<=31; i++){
            System.out.printf("%5s",i);
            if (i==(7-day_to_aug)||(i-(7-day_to_aug))%7==0)
                System.out.print("\n");
        }
        System.out.print("\n");
    }
}
