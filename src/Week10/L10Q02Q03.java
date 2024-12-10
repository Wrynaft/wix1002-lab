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
import java.util.Arrays;

/**
 *
 * @author Ryan Chin
 */
public class L10Q02Q03 {
    public static void main(String[] args) {
        //L10Q02
        SubstitutionCipher a = new SubstitutionCipher("src/Week10/inputText.txt", "src/Week10/outputText.txt", 3);
        a.encoder();
        SubstitutionCipher b = new SubstitutionCipher("src/Week10/outputText.txt", "src/Week10/inputText.txt", 3);
        b.decoder();
        
        //L10Q03
        ShuffleCipher c = new ShuffleCipher("src/Week10/inputText2.txt", "src/Week10/outputText2.txt", 3);
        c.encoder();
        ShuffleCipher d = new ShuffleCipher("src/Week10/outputText2.txt", "src/Week10/inputText2.txt", 3);
        b.decoder();
    }
}

interface MessageEncoder{
    public String encode(String plainText);
    public String decode(String cipherText);
}

class SubstitutionCipher implements MessageEncoder{
    private String inputFileName;
    private String outputFileName;
    private int shift;
    
    public SubstitutionCipher(String input, String output, int shift){
        this.inputFileName = input;
        this.outputFileName = output;
        this.shift = shift;
    }
    
    public String encode(String plainText){
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < plainText.length(); i++){
            int asciiValue = (int) plainText.charAt(i);
            if (Character.isLowerCase(plainText.charAt(i))){
                asciiValue = (asciiValue + shift - 97) % 26 + 97;
            } else if (Character.isUpperCase(plainText.charAt(i))){
                asciiValue = (asciiValue + shift - 65) % 26 + 65;
            } 
            str.append((char) asciiValue);
        }
        return str.toString();
    }
    
    public String decode(String cipherText){
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < cipherText.length(); i++){
            int asciiValue = (int) cipherText.charAt(i);
            if (Character.isLowerCase(cipherText.charAt(i))){
                asciiValue = (asciiValue + (26-shift) - 97) % 26 + 97;
            } else if (Character.isUpperCase(cipherText.charAt(i))){
                asciiValue = (asciiValue + (26-shift) - 65) % 26 + 65;
            }
            str.append((char) asciiValue);
        }
        return str.toString();
    }
    
    public String readInputFile(){
        String text = null;
        try{
            BufferedReader in = new BufferedReader(new FileReader(this.inputFileName));
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line=in.readLine())!=null){
                sb.append(line);
            }
            text = sb.toString();
            in.close();
        } catch(FileNotFoundException e){
            System.out.println("File not found");
        } catch(IOException e){
            System.out.println("Problem with file input");
        }
        return text;
    }
    
    public void writeOutputFile(String text){
        try{
            PrintWriter out = new PrintWriter(new FileOutputStream(this.outputFileName));
            out.println(text);
            out.close();
        } catch(IOException e){
            System.out.println("Problem with file output");
       }
    }
    
    public void encoder(){
        writeOutputFile(encode(readInputFile()));
    }
    
    public void decoder(){
        writeOutputFile(decode(readInputFile()));
    }
}

class ShuffleCipher implements MessageEncoder{
    private String inputFileName;
    private String outputFileName;
    int N;
    public ShuffleCipher(String input, String output, int N){
        this.inputFileName = input;
        this.outputFileName = output;
        this.N = N;
    }
    
    public String encode(String plainText){
        StringBuilder sb = new StringBuilder();
        sb.append(plainText);
        for (int i = 0; i<N; i++){
            char[] text = sb.toString().toCharArray();
            char[] firstHalf = Arrays.copyOfRange(text, 0, text.length/2);
            char[] secondHalf = Arrays.copyOfRange(text, text.length/2, text.length);
            sb = new StringBuilder();
            for (int j=0; j<secondHalf.length;j++){
                if(j<firstHalf.length)
                    sb.append(firstHalf[j]);
                sb.append(secondHalf[j]);
            }
        }
        return sb.toString();
    }
    
    public String decode(String cipherText){
        StringBuilder sb = new StringBuilder();
        sb.append(cipherText);
        for (int i = 0; i<N; i++){
            char[] firstHalf = new char[sb.toString().length()/2];
            char[] secondHalf = sb.toString().length()%2==0 ? new char[sb.toString().length()/2] : new char[(sb.toString().length()/2)+1];
            int j=0, k=0;
            for(char letter: sb.toString().toCharArray()){
                if (j==secondHalf.length-1)
                    secondHalf[j] = letter;
                else{
                    if(k%2==0){
                        firstHalf[j]=letter;
                        k++;
                    }
                    else{
                        secondHalf[j] = letter;
                        k++; j++;
                    }
                }
            }
            sb = new StringBuilder();
            for(char letter: firstHalf)
                sb.append(letter);
            for(char letter: secondHalf)
                sb.append(letter);
        }
        return sb.toString();
    }
    
    public String readInputFile(){
        String text = null;
        try{
            BufferedReader in = new BufferedReader(new FileReader(this.inputFileName));
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line=in.readLine())!=null){
                sb.append(line);
            }
            text = sb.toString();
            in.close();
        } catch(FileNotFoundException e){
            System.out.println("File not found");
        } catch(IOException e){
            System.out.println("Problem with file input");
        }
        return text;
    }
    
    public void writeOutputFile(String text){
        try{
            PrintWriter out = new PrintWriter(new FileOutputStream(this.outputFileName));
            out.println(text);
            out.close();
        } catch(IOException e){
            System.out.println("Problem with file output");
       }
    }
    
    public void encoder(){
        writeOutputFile(encode(readInputFile()));
    }
    
    public void decoder(){
        writeOutputFile(decode(readInputFile()));
    }
}
