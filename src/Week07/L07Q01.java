/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week07;

/**
 *
 * @author Ryan Chin
 */
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream; //binary file output
import java.io.ObjectInputStream;
import java.util.Scanner;
public class L07Q01 {
    public static void main(String[] args) {
        writeTable();
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter course code: ");
        String inputCode = sc.next();
        System.out.println("The course name is " + readTable(inputCode));
        sc.close();
    }
    
    public static void writeTable(){
        try{
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("src/Week07/coursename.dat"));
            out.writeUTF("WXES1116: Programming I");
            out.writeUTF("WXES1115: Data Structure");
            out.writeUTF("WXES1110: Operating System");
            out.writeUTF("WXES1112: Computing Mathematics I");
            out.close();
        } catch (IOException e){
            System.out.println("Problem with output file");
        }
    }
    
    public static String readTable(String courseCode){
        String readString;
        String courseName = "not found";
        try{
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("src/Week07/coursename.dat"));
            try{
                while (true){
                    readString = in.readUTF();
                    if (readString.contains(courseCode.toUpperCase())){
                        courseName = readString.substring(10);
                        break;
                    }
                }
            } catch (EOFException e){}
        } catch (FileNotFoundException e){
            System.out.println("File was not found");
        } catch (IOException e){
            System.out.println("Problem with file input");
        }
        return courseName;
    }
}
