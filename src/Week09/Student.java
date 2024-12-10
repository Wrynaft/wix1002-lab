/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week09;

/**
 *
 * @author Ryan Chin
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
public class Student extends PersonProfile{
    private String courseName;
    private String courseCode;
    private int semester;
    private String session;
    private int mark;
    private int fileName;
    
    public Student(String name, char gender, String date, int file){
        super(name, gender, date);
        this.fileName = file;
        getDetails();
    }
    
    private void getDetails(){
        try{
            BufferedReader in = new BufferedReader(new FileReader("src/Week09/course.txt"));
            for(int i=0; i<(5*(fileName-1));i++){
                in.readLine();
            }
            courseCode = in.readLine();
            courseName = in.readLine();
            session = in.readLine();
            semester = Integer.parseInt(in.readLine());
            mark = Integer.parseInt(in.readLine());
            in.close();
        } catch(FileNotFoundException e){
            System.out.println("File not found");
        } catch(IOException e){
            System.out.println("Problem with file input");
        }
    }
    
    public String getGrade(){
        if (mark >= 85)
            return "A";
        else if (mark >=75)
            return "A-";
        else if (mark >=70)
            return "B+";
        else if (mark >=65)
            return "B";
        else if (mark >=60)
            return "B-";
        else if (mark >=55)
            return "C+";
        else if (mark >=50)
            return "C";
        else if (mark >=45)
            return "D";
        else if (mark >=35)
            return "E";
        else
            return "F";
    }
    
    public void displayDetails(){
        displayProfile();
        System.out.println("Course name: " + courseName);
        System.out.println("Course code: " + courseCode);
        System.out.println("Semester: " + semester);
        System.out.println("Session: " + session);
        System.out.println("Marks: " + mark);
        System.out.println("Grade: " + getGrade());
        System.out.println();
        
    }
    
    
}
