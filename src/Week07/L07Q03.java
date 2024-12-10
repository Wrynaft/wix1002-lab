/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week07;

/**
 *
 * @author Ryan Chin
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.IOException;
public class L07Q03 {
    public static void main(String[] args) {
        try{
            BufferedReader in = new BufferedReader(new FileReader("src/Week07/course.txt"));
            String line;
            boolean append=false;
            while ((line=in.readLine())!=null){
                StringBuilder str = new StringBuilder();
                for(int i=line.length()-1; i>=0;i--){
                    str.append(line.charAt(i));
                }
                try{
                    PrintWriter out = new PrintWriter(new FileOutputStream("src/Week07/reverse.txt", append));
                    out.println(str.toString());
                    if (append==false)
                        append=true;
                    out.close();
                } catch(IOException e){
                    System.out.println("Problem with file output");
                }
            }
            in.close();
        } catch(FileNotFoundException e){
            System.out.println("File not found");
        } catch (IOException e){
            System.out.println("Error reading from file");
        }
    }
}
