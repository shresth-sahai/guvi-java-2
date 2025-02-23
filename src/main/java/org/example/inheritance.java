package org.example;

public class inheritance {
    /*
    OOPs- >inheritance -> code reusability
    1 Single inheritance
    class Parent {}
    class Child extends parent{}
    2 mutilevel
    class grandParent{}
    class Parent extends Grandparent{}
    class Child extends Parent {}
    3 Hierarchical
    class Parent{}
    class ChildOne extends Parent{}
     class ChildTwo  extends Parent{}
     4 Hybrid -> is not directly suppotrted in java interface

     5 Multiple inheritance

     class Animal {
     String color="Brown";
     Animal(){
     System.out.println("Animal constructor ");
     }
     void eat(){   System.out.println("Animal is eating ");
     }
     class DOg extends Animal{
     String color="Black"
     Dog(){
     super();  System.out.println("DOg constructor ");}
     @override
     void eat(){
     System.out.println("Dog is eating ");
     }
     void colors(){
     System.out.println(this.color+ super.color)
     }
     main(){
     Dog dog =new Dog();
     dog.eat();
     dog.colors()
     }


class Parent {
    String lastName = "Smith";
}

class Child extends Parent {
    String firstName = "John";

    void displayFullName() {
        System.out.println("Full Name: " + firstName + " " + super.lastName);
    }
}

Questions :

class Parent {
    void show() {
        System.out.println("Parent");
    }
}

class Child extends Parent {
    void show() {
        System.out.println("Child");
    }
}

public class Test {
    public static void main(String[] args) {
        Parent obj = new Child();
        obj.show();
    }
}
Child

class Animal {
    String color = "Brown";
}

class Dog extends Animal {
    String color = "Black";

    void printColors() {
        System.out.println(color + " " + super.color);
    }
}

public class Test {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.printColors();
    }
}Black Brown




class Test {
    int a;

    Test() {
        this(10);
    }

    Test(int a) {
        this.a = a;
    }

    void display() {
        System.out.println(a);
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.display();
    }
}10



class Parent {
    void show() {
        System.out.print("Parent ");
    }
}

class Child extends Parent {
    void show() {
        super.show();
        System.out.print("Child");
    }
}

public class Test {
    public static void main(String[] args) {
        Child c = new Child();
        c.show();
    }
}
Parent Child



class Parent {
    Parent() {
        System.out.print("A ");
    }
}

class Child extends Parent {
    Child() {
        System.out.print("B ");
    }
}

public class Test {
    public static void main(String[] args) {
        new Child();
    }
}
// parent constructor will run first -> A B


class Grandparent {
    void greet() { System.out.print("Hi "); }
}

class Parent extends Grandparent {
    void greet() { System.out.print("Hello "); }
}

class Child extends Parent {

    void greet() { System.out.print("Hey "); }
}

public class Test {
    public static void main(String[] args) {
        Grandparent g = new Child();
        g.greet();
    }
}/Hi


class MyClass {
    int x;

    MyClass() {
        this(5);
        System.out.print(x + " ");
    }

    MyClass(int x) {
        this.x = x;
        System.out.print(x * 2 + " ");
    }

    public static void main(String[] args) {
        new MyClass();
    }
} 10 5


class A {
    int x = 100;
}

class B extends A {
    int x = 200;

    void printX() {
        System.out.println(x);
        System.out.println(super.x);
    }
}

public class Test {
    public static void main(String[] args) {
        B b = new B();
        b.printX();
    }
}200 100


class Parent {
    int val = 5;
    Parent() {
        printVal();
    }
    void printVal() {
        System.out.println(val);
    }
}
class Child extends Parent {
    int val = 10; // This initializer hasn't run when Parent's constructor calls printVal()
    Child() { }
    void printVal() {
        System.out.println(val);
    }
}
public class Test {
    public static void main(String[] args) {
        new Child();
    }
}
// 0


class A {
    A() {
        System.out.print("A ");
    }
}

class B extends A {
    B() {
        this(10);
        System.out.print("B ");
    }

    B(int x) {
        super();
        System.out.print(x + " ");
    }
}

public class Test {
    public static void main(String[] args) {
        new B();
    }
} A 10 B

coding problems
1. Basic Inheritance
Write a Java program where a class Animal has a method makeSound(). Create a subclass Dog that overrides this method to print "Bark!". Demonstrate calling the method from both parent and child class instances.

//1 // parent class
class Animal {
void makeSound(){
System.out.println("animal sound");
}
}
//child class
class Dog extends Animal{
@override
void makeSound(){
System.out.println("Bark");
}
}
class Main{
public static void main(String[] args){
Animal a=new Animal();
Dog d=new Dog();
a.makeSound();
d.makeSound();
}}

2. Using Static Variables
Create a class BankAccount with a static variable bankName, an instance variable accountHolder, and a method to display account details. Create multiple objects of BankAccount and show how the static variable is shared.
class BankAccount{
static String bankName="SBI";
String accountHolder;
BankAccount(String accountHolder){
this.accountHolder=accountHolder;
}
void displayAccountDetails(){
System.out.println();
}
}
public class Main{
public static void main(){
BankAccount a1=new BankAccount("a");BankAccount a2=new BankAccount("b");
a1.dispalyAccountDetails(); a2.dispalyAccountDetails();
BankAccount.bankName="BOB";
}
}
3. Constructor Inheritance
Write a Java program where a class Vehicle has a constructor that initializes brand and year. Create a subclass Car that extends Vehicle and adds an additional attribute model. Use constructors properly and display all details.

class Vehicle {

String brand; int year;
Vehicle(String brand,int year){
this.year=year;
this.brand=brand;}
void showDetails(){
}
}
class Car extends Vehicle}
String model;
Car(String brand,int year , String model ) {
super(brand,year);
this.model=model;
}

void showDetails(){

}



}
4. Static Methods in a Class
Create a class MathOperations that has a static method add(int a, int b), and a non-static method multiply(int a, int b). Demonstrate calling both methods from the main function.


class Math{

static int add(int a ,int b){
return a+b;
}

 int mul(int a ,int b){
return a*b;
}
psvm(){
Math.add(1,2);
Math m=new Math();
m.mul(1,2);
}
}
5. Method Overriding in Inheritance
Define a base class Employee with a method calculateSalary(). Extend it with a class Manager that overrides calculateSalary() to add a bonus. Demonstrate polymorphism in action.


6. Using super Keyword
Create a class Person with instance variables name and age, and a constructor to initialize them. Then, create a subclass Student that adds grade and calls the parent constructor using super().

class Perosn{

String name;int age;
Person(String name,int age){
this.name=name;
this.age=age;
void display(){

}
}
class Student extends Person{
String grade;
Student(String name,int age,String grade){
super(name,age);
thisgrade=grade;}
void displayStudent(){
display();
System.out.println(grade);
}
psvm(){
Student s=new Student();
s.display();
}
}


7. Static Block Execution
Write a Java program where a class Logger has a static block that prints "Logger initialized". Create an object of Logger in the main method and observe when the static block executes.
2 1 3 3

class Logger{

static{
print(2);
}

Logger(){
print(3);
}

psvm(){
print(1);
Logger l1=new Logger();
Logger l2=new Logger();
}

8. Static vs Instance Methods
Create a class Utility with a static method convertToUpperCase(String str), and an instance method reverseString(String str). Show how each method is called differently.





     */
}
