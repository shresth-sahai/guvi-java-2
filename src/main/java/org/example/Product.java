package org.example;

public class Product implements Taxable {
    private int pid;
    private double price;
    private int q;

    public Product(int pid,double price,int q){
        this.pid=pid;
        this.price=price;
        this.q=q;
    }
    @Override
    public double salesTax(){
        return salesTax*price;
    }
}
