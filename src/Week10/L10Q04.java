/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week10;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Ryan Chin
 */
public class L10Q04 {
    public static void main(String[] args) {
        Appointment a = new Appointment(1,1,2024,12,13);
        a.saveAppointment();
        System.out.println(a.search("1/1/2024 11", "1/1/2024 14"));
    }
}

interface Searchable{
    public abstract boolean search(String dateStartTime, String dateEndTime);
}

class Appointment implements Searchable{
    private int day;
    private int month;
    private int year;
    private int startTime;
    private int endTime;
    
    public Appointment(int day, int month, int year, int startTime, int endTime){
        this.day = day;
        this.month = month;
        this.year = year;
        this.startTime = startTime;
        this.endTime = endTime;
    }
    
    public void saveAppointment(){
        try{
            PrintWriter out = new PrintWriter(new FileOutputStream("src/Week10/appointment.txt", true));
            out.println(("\n" + day + "/" + month + "/" + year + " " +startTime+ " to " + endTime));
            out.close();
        } catch(IOException e){
            System.out.println("Problem with file output.");
        }
    }
    
    public boolean search(String dateStartTime, String dateEndTime){
        String[] searched = dateStartTime.split(" ");
        String date = searched[0];
        int StartTime = Integer.parseInt(searched[1]);
        String[] searched2 = dateEndTime.split(" ");
        int EndTime = Integer.parseInt(searched2[1]);
        try{
            BufferedReader in = new BufferedReader(new FileReader("src/Week10/appointment.txt"));
            String line;
            while ((line=in.readLine())!=null){
                String[] info = line.split(" ");
                if(info[0].equals(date)){
                    int searchStart = Integer.parseInt(info[1]);
                    int searchEnd = Integer.parseInt(info[3]);
                    if((StartTime >= searchStart && StartTime < searchEnd)|| (EndTime > searchStart && EndTime<= searchEnd) || (StartTime < searchStart && EndTime > searchEnd)){
                        return false;
                    }
                }
            }
        } catch(FileNotFoundException e){
            System.out.println("File was not found.");
        } catch (IOException e){
            System.out.println("Problem with file input");
        }
        return true;
    }
}
