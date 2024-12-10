/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week09;

/**
 *
 * @author Ryan Chin
 */
public class L09Q02 {
    public static void main(String[] args) {
        Student a = new Student("John", 'M', "12/02/2004", 1);
        Student b = new Student("Cindy", 'F', "31/12/2004", 2);
        Student c = new Student("Adam", 'M', "6/03/2004", 3);
        Student d = new Student("Cecilia", 'F', "18/05/2004", 4);
        Student e = new Student("Ben", 'M', "3/02/2004", 5);
        
        a.displayDetails();
        b.displayDetails();
        c.displayDetails();
        d.displayDetails();
        e.displayDetails();
    }
}
