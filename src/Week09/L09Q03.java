/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week09;

/**
 *
 * @author Ryan Chin
 */
public class L09Q03 {
    public static void main(String[] args) {
        Lecturer a = new Lecturer("Dr. John", 'M', "12/02/1990", 1);
        Lecturer b = new Lecturer("Ms. Cindy", 'F', "31/12/1995", 2);
        Lecturer c = new Lecturer("Mr. Adam", 'M', "6/03/1980", 3);
        Lecturer d = new Lecturer("Dr. Cecilia", 'F', "18/05/1970", 4);
        
        a.displayDetails();
        b.displayDetails();
        c.displayDetails();
        d.displayDetails();
    }
}
