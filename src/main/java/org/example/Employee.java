package org.example;

public class Employee implements Taxable{
    private int empId;
    private String name;
    private double salary;
    public Employee(int empId,String name
    ,double salary){
        this.empId=empId;
        this.name=name;
        this.salary=salary;
    }
    @Override
    public double calcTax(){
        return salary*incomeTax;
    }
    public void displayName(){

    }
}
