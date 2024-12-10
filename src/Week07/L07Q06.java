/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week07;

/**
 *
 * @author Ryan Chin
 */
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class L07Q06 {
    public static void main(String[] args) {
        try {
        System.out.println("ProductID\tProductName\tQuantity\tPricePerUnit\tTotal");
        Scanner input1 = new Scanner(new FileInputStream("src/Week07/order.txt"));
        String[] order, product;
        String temp, productName="";
        int quantity=0;
        double price=0;
        while (input1.hasNextLine()) {
            temp = input1.nextLine();
            order = temp.split(",");
            quantity = Integer.parseInt(order[2]);

            Scanner input2 = new Scanner(new FileInputStream("src/Week07/product.txt"));
            while (input2.hasNextLine()) {
                temp = input2.nextLine();
                product = temp.split(",");
                if (order[1].equals(product[0])) {
                    productName = product[1];
                    price = Double.parseDouble(product[2]);
                    break;
                }
            }
            input2.close();
            System.out.printf("%-10s%-20s", order[1], productName);
            System.out.printf("\t%-10d\t%6.2f\t%7.2f\n", quantity, price , quantity*price);
        }
        input1.close();
    } catch (FileNotFoundException e) {
        System.out.println("File was not found");
    }
}
}
