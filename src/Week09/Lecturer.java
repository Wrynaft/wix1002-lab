/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week09;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Ryan Chin
 */
public class Lecturer extends PersonProfile{
    private String courseName;
    private String courseCode;
    private int semester;
    private String session;
    private double creditHour;
    private int noStudents;
    private int fileName;
    
    public Lecturer(String name, char gender, String date, int file){
        super(name,gender, date);
        this.fileName = file;
        getDetails();
    }
    
    private void getDetails(){
        try{
            BufferedReader in = new BufferedReader(new FileReader("src/Week09/lecturer.txt"));
            for(int i=0; i<(6*(fileName-1));i++){
                in.readLine();
            }
            courseCode = in.readLine();
            courseName = in.readLine();
            session = in.readLine();
            semester = Integer.parseInt(in.readLine());
            creditHour = Integer.parseInt(in.readLine());
            noStudents = Integer.parseInt(in.readLine());
            in.close();
        } catch(FileNotFoundException e){
            System.out.println("File not found");
        } catch(IOException e){
            System.out.println("Problem with file input");
        }
    }
    
    public void computeCredit(){
        if (noStudents>=150)
            creditHour = creditHour * 3;
        else if(noStudents>=100)
            creditHour = creditHour * 2;
        else if(noStudents>=50)
            creditHour = creditHour * 1.5;
        else
            creditHour = creditHour * 1;
    }
    
    public void displayDetails(){
        computeCredit();
        displayProfile();
        System.out.println("Course name: " + courseName);
        System.out.println("Course code: " + courseCode);
        System.out.println("Semester: " + semester);
        System.out.println("Session: " + session);
        System.out.println("Credit hours: " + creditHour);
        System.out.println("Number of students: " + noStudents);
        System.out.println();
        
    }
}
