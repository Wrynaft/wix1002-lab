/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week09;

/**
 *
 * @author Ryan Chin
 */
public class PersonProfile {
    private String name;
    private char gender;
    private String dateOfBirth;
    
    public PersonProfile(String n, char g, String dob){
        this.name = n;
        this.gender = g;
        this.dateOfBirth = dob;
    }
    
    public void displayProfile(){
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Date of birth: " + dateOfBirth);
    }
}
