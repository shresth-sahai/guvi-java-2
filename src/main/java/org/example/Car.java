package org.example;

public class Car implements Vehicle{
    public void start(){
        System.out.println("hey from start car");
    }
    /*

    Basic Polymorphism Exercises
Create a Shape hierarchy

Define a base class Shape with a method area().
Create subclasses Circle and Rectangle that override area().
Implement a main method to demonstrate polymorphism.

interface Shape{
double area();
}
class Circle implements Shape{
double radius;
Circle(double radius){

}
@Override
public double area(){
return MATH.PI*radius*radius;
}
class Rectangle .......





Animal Sound System

Create a base class Animal with a method makeSound().
Implement subclasses Dog and Cat that override makeSound().
Write a method that takes an Animal and calls makeSound().

interface Animal{ void makeSound();  }

class Dog implements Animal {
@Override
public void makeSound(){
}
class Cat implements Animal {
@Override
public void makeSound(){
}
public class AnimalTest{
static void animalSound(Animal animal){
animal.makeSound();
}
public static void main(){
Animal dog =new Dog();
Animal cat =new Cat();
animalSound(dog);
animalSound(cat);
}}

Bank Account System

Define a base class BankAccount with a method getInterestRate().
Create subclasses SavingsAccount and CurrentAccount that override getInterestRate().
Test polymorphism by calling getInterestRate() on different account types.
Intermediate Polymorphism Exercises


Vehicle System

Define a Vehicle class with a method move().
Create Car, Bike, and Truck classes that override move().
Implement a method to print movement details of different Vehicle objects.
E-commerce Discount System

Define a base class Product with a method getDiscount().
Create Electronics and Clothing subclasses that override getDiscount().
Use an array of Product objects to demonstrate polymorphism.
interface Product {
double getDiscount();
}
class Electronics

Product[] products ={new Electronics(), new Clothing()};
for(Product p:products){

}


Define an Employee class with a method calculateSalary().
Create subclasses FullTimeEmployee and PartTimeEmployee with different salary calculations.
Write a method that accepts an Employee object and prints the salary.





     */
}
