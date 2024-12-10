/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week10;

/**
 *
 * @author Ryan Chin
 */
public class L10Q01 {
    public static void main(String[] args) {
        PermanentEmployee a = new PermanentEmployee("John", 'B');
        ContractEmployee b = new ContractEmployee("Cindy", 5000);
        TemporaryEmployee c = new TemporaryEmployee("Cecilia", 40);
        
        a.display();
        b.display();
        c.display();
    }
}

abstract class Employee{
    private String name;
    private String type;
    private double totalSalary;
    
    public Employee(String name, String type){
        this.name = name;
        this.type = type;
    }
    
    public abstract double calcSalary();
    public void display(){
        System.out.println("Employee name: " + this.name);
        System.out.println("Employee type: ");
        System.out.printf("Total salary per month: RM%.2f\n", calcSalary());
        System.out.println();
    }
}

class PermanentEmployee extends Employee{
    private char category;
    
    public PermanentEmployee(String name, char category){
        super(name, "Permanent");
        this.category = category;
        
    }
    
    public double calcSalary(){
        switch(this.category){
            case 'A':
                return 4000;
            case 'B':
                return 3000;
            case 'C':
                return 2000;
            default:
                return 0;
        }
    }
}

class ContractEmployee extends Employee{
    private double totalSales;
    
    public ContractEmployee(String name, double totalSales){
        super(name, "Contract");
        this.totalSales = totalSales;
    }
    
    public double calcSalary(){
        return (500 + 0.5*totalSales);
    }
}

class TemporaryEmployee extends Employee{
    private int hours;
    
    public TemporaryEmployee(String name, int hours){
        super(name, "Temporary");
        this.hours = hours;
    }
    
    public double calcSalary(){
        return (hours * 15);
    }
}
