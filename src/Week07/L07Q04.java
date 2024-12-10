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
import java.io.IOException;
public class L07Q04 {
    public static void main(String[] args) {
        int lineCount=0;
        int wordCount=0;
        int charCount=0;
        try{
            BufferedReader in = new BufferedReader(new FileReader("src/Week07/course.txt"));
            String line;
            while ((line=in.readLine())!=null){
                lineCount++;
                String[] words = line.split(" ");
                wordCount += words.length;
                for (String word: words){
                    charCount += word.length();
                }
            }
            in.close();
        } catch(FileNotFoundException e){
            System.out.println("File not found");
        } catch(IOException e){
            System.out.println("Problem with file input");
        }
        System.out.println("Number of characters: " + charCount);
        System.out.println("Number of words: " + wordCount);
        System.out.println("Number of lines: " + lineCount);
    }
}
