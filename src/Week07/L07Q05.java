/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week07;

/**
 *
 * @author Ryan Chin
 */
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
public class L07Q05 {
    public static void main(String[] args) {
        int recordNum;
        String[] names;
        int[] age;
        char[] gender;
        int[] order;
        try{
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("src/Week07/person.dat"));
            recordNum = in.readInt();
            names = new String[recordNum];
            age = new int[recordNum];
            gender = new char[recordNum];
            order = new int[recordNum];
            for(int i=0; i<recordNum; i++){
                names[i] = in.readUTF();
                age[i] = in.readInt();
                gender[i] = in.readChar();
            }
            for (int i=0; i<order.length; i++){
                order[i] = i;
            }
            // All records stored in the array.
            
            for(int pass=1; pass<order.length; pass++){
                for (int i=0; i<order.length-1; i++){
                    if(names[order[i]].compareToIgnoreCase(names[order[i+1]])>0){
                        int hold = order[i];
                        order[i] = order[i+1];
                        order[i+1] = hold;
                    }
                }
            }
            
            for (int orders: order){
                System.out.print(names[orders] + " ");
                System.out.print(age[orders] + " ");
                System.out.println(gender[orders]);
            }
            in.close();
        } catch(FileNotFoundException e){
            System.out.println("File not found");
        } catch(IOException e){
            System.out.println("Problem with file input");
        }
        
    } 
    
}
