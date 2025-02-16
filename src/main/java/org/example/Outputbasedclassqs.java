package org.example;

public class Outputbasedclassqs {
    /*

    class Car {
    String brand;
    int speed;

    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.brand = "Toyota";
        myCar.speed = 120;
        System.out.println("Brand: " + myCar.brand + ", Speed: " + myCar.speed);
    }
}
// Brand :Toyota, Speed:120

class Book {
    String title;
    int pages;

    Book(String t, int p) {
        title = t;
        pages = p;
    }

    public static void main(String[] args) {
        Book myBook = new Book("Java Programming", 300);
        System.out.println("Title: " + myBook.title + ", Pages: " + myBook.pages);
    }
}
Title: Java Programming,Pages :300

class Animal {
    String name;

    Animal() {
        name = "Unknown";
    }

    public static void main(String[] args) {
        Animal a = new Animal();
        System.out.println("Animal name: " + a.name);
    }
}
Animal name: Unknown

class Counter {
    static int count = 0;

    Counter() {
        count++;
    }

    public static void main(String[] args) {
        new Counter();
        new Counter();
        System.out.println("Count: " + count);
    }
}
Count: 2

class Demo {
    void printValue() {
        int value = 10;
        System.out.println("Value: " + value);
    }

    public static void main(String[] args) {
        Demo obj = new Demo();
        obj.printValue();
    }
}
value:10


class Person {
    String name;
    int age;

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "John";
        p1.age = 30;
        System.out.println(p1.name + " is " + p1.age + " years old.");
    }
}
John is 30 years old

class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int result = calc.add(10, 20);
        System.out.println("Sum: " + result);
    }
} Sum:30


class MathOperations {
    static int multiply(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        int result = MathOperations.multiply(5, 4);
        System.out.println("Product: " + result);
    }
}
Product :20


class Employee {
    String name;
    int salary;

    Employee() {
        name = "Default Name";
        salary = 5000;
    }

    public static void main(String[] args) {
        Employee e = new Employee();
        System.out.println("Employee Name: " + e.name + ", Salary: " + e.salary);
    }
}Employee Name: Default Name, Salary:5000

class Printer {

    static void printMessage() {
        System.out.println("This is a static method.");
    }

    public static void main(String[] args) {
        Printer p = new Printer();
        p.printMessage();
    }
} This is a static method


class Book {
    void read() {
        System.out.println("Reading a book.");
    }

    public static void main(String[] args) {
        Book b = new Book();
        b.read();
    }
}Reading a book.


class Student {
    String name;
    static int count = 0;

    Student(String name) {
        this.name = name;
        count++;
    }

    public static void main(String[] args) {
        Student s1 = new Student("Alice");
        Student s2 = new Student("Bob");
        System.out.println("Total Students: " + Student.count);
    }
}
Total Students: 2

class Calculator {
    int subtract(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int result = calc.subtract(15, 7);
        System.out.println("Difference: " + result);
    }
}Difference:8


class Circle {
    double radius;

    Circle() {
        radius = 1.0;
    }

    public static void main(String[] args) {
        Circle c = new Circle();
        System.out.println("Radius: " + c.radius);
    }
}Raduis:1.0



class Car {
    static int totalCars = 0;

    Car() {
        totalCars++;
    }

    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car();
        System.out.println("Total Cars: " + totalCars);
    }
}Total Cars:2


class Person {
    void sayHello() {
        System.out.println("Hello, welcome!");
    }

    public static void main(String[] args) {
        Person p = new Person();
        p.sayHello();
    }
} Hello, welcome!



class Demo {
    void printValue() {
        int value = 10;
        if (value > 5) {
            int result = value * 2;
            System.out.println("Result: " + result);
        }
    }

    public static void main(String[] args) {
        Demo obj = new Demo();
        obj.printValue();
    }
}Result:20



class Laptop {
    String brand;
    int price;

    Laptop(String b, int p) {
        brand = b;
        price = p;
    }

    public static void main(String[] args) {
        Laptop myLaptop = new Laptop("Dell", 50000);
        System.out.println("Brand: " + myLaptop.brand + ", Price: " + myLaptop.price);
    }
}



class Utility {
    static String convertToUpper(String str) {
        return str.toUpperCase();
    }

    public static void main(String[] args) {
        String result = Utility.convertToUpper("hello");
        System.out.println("Uppercase: " + result);
    }
}
Uppercase: HELLO


class Account {
    String holderName;
    static double interestRate = 5.5;

    Account(String name) {
        holderName = name;
    }

    public static void main(String[] args) {
        Account a1 = new Account("Alice");
        Account a2 = new Account("Bob");

        System.out.println("Interest Rate: " + Account.interestRate);
        System.out.println("Account Holder: " + a1.holderName);
    }
}


1. Create a BankAccount Class
Create a BankAccount class that simulates a bank account system. The class should have:

An instance variable for the account balance (double balance).
A static variable for the number of bank accounts created (int accountCount).
A constructor that takes an initial deposit amount to set the balance.
A method deposit(double amount) that adds the deposit to the balance.
A method withdraw(double amount) that subtracts the withdrawal amount from the balance.
A method displayBalance() that prints the current balance.
A static method displayAccountCount() that prints the total number of accounts created.
Requirements:

Create at least 3 instances of BankAccount with different deposit amounts.
Display the balance of each account after deposit and withdrawal.
Display the total number of accounts created.


2. Create a Student Class with Different Constructors
Create a class named Student that stores the following information:

Name (String)
Roll Number (int)
Marks (double)
Include the following constructors:

A default constructor that sets the name to "Unknown", roll number to 0, and marks to 0.0.
A constructor that takes the name and roll number but sets the marks to 0.0.
A parameterized constructor that accepts name, roll number, and marks.
Write methods to:

Print the student's information.
Calculate and print the grade based on the marks.
Requirements:

Create an instance using each constructor and print the student details.
Grade logic:
80-100 marks: "A"
60-79 marks: "B"
40-59 marks: "C"
Below 40: "F"

3. Implement a Library Class
Create a class Library with the following:

A list of books in the library (use an array or an ArrayList).
A method addBook(String bookName) that adds a book to the library.
A method removeBook(String bookName) that removes a book from the library.
A method displayBooks() that displays all the books in the library.
A method searchBook(String bookName) that checks if a specific book is in the library.
Requirements:

Implement methods to add, remove, display, and search books.
Demonstrate the usage of the Library class by adding, removing, and displaying books.



Implement a Rectangle Class with Area and Perimeter Calculation
Create a Rectangle class that has:

Instance variables length and width.
A constructor to initialize length and width.
Methods to:
Calculate and return the area of the rectangle (area()).
Calculate and return the perimeter of the rectangle (perimeter()).
A method display() to display the dimensions, area, and perimeter of the rectangle.
Requirements:

Create an instance of Rectangle and initialize the length and width.
Display the area and perimeter.





     */
}
