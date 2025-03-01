package org.example;

public class DAbstraction {
    /*
    its a concept in OOPs where we hide the implementation deatils and only
    expose the necessary functionality
    Abstraction
    Interface

    Abstract classes -> cannot be instantiated , no-body
    concrete class -> which have implementation

    abstract class vehicle {
    abstract void start(); -> method no implemenation

    void fuel(){
    print(1);
    }
    class Car extends Vehicle{
    @Override
    void start(){
    // implementation
    }
      class Bike extends Vehicle{
    @Override
    void start(){
    // implementation
    }
    psvm(){
    vehicle car =new Car();  vehicle bike =new Bike();
    car.start();car.fuel(); bike.fuel();
    Car c=new Car();
    c.start();
    }

    interface -> only contains thr abstract methods(before java 8)
    after java 8 -> static & default methods


    a class implements an interface aand provides implementation fr all methods
    it supports multiple inheritance unlike abstarct classes
    interface Animal{
    void makeSound();// abstract method
    }
    class Dog implements Animal{
    @Override
    public void makeSound(){

    }
    }
    // java -> ******** no multiple level inheritance
   ********** but interface support
    interface Engine(){}
    interafce MusicSystem(){}
    class Car implments Engine, MusicSystem{
    }

    abstract classes               vs                            interface

    -> cannot be instantiated                           cannot be instantiated
    -> can have both abstract& concrete                 only abstarct + static + deafult
    -> can have Constructors                            no constructor
    -> single ingeritance only                          multiple
    -> used when classses share common behaviour        used when classes implement the same
                                                        behavoious diffrently

        //
        abstract class Animal {
        abstract void makeSound();
        void sleep(){
        // concrete method common to all animals
        }
        class Dog extends Animal {
        @Override
        void makeSound(){
        }

        psvm(){

        Animal Dog =new Dog();
        dog.sleep();dog.makeSound();}

//

        // Interface -> get full abstraction

        interface ANimal{ void makeSound();}
        class Dog implements Animal{
        @Override
        public void makeSound(){
        }
        psvm(){
        Animal dog =new Dog();
        dog.makeSound();

        }


Questions

1. Vehicle Management System
Design a system where different types of vehicles (Car, Bike, Truck) have different ways of starting.
All vehicles should have a common method to indicate the type of fuel they use.
Ensure that objects of specific vehicle types can be created and used in a program.
2. Employee Management System
Implement a payroll system where different types of employees (FullTimeEmployee, PartTimeEmployee, Intern) have different salary structures.
Each employee should have a method to calculate their salary.
There should be a way to display employee details.
3. Online Payment System
Create a system that supports different payment methods like CreditCardPayment and PayPalPayment.
Each payment method should have a way to process payments.
Allow adding new payment methods in the future without modifying existing code.
4. Shape Area Calculator
Create a system that can calculate the area of different shapes like Circle and Rectangle.
Each shape should have a method to compute its area.
The program should allow easy addition of new shapes in the future.
5. Smart Device System
Develop a system where different smart devices (Smartphone, Laptop, Tablet) have functionalities like taking photos and playing music.
Some devices might support both features, while others may support only one.
Ensure that objects of smart devices can be created and tested.
6. Music and Video Player
Implement a system where different types of media players (MP3Player, VideoPlayer) can play media.
Each player should have a way to play content.
Some players may have additional functionalities, like adjusting playback speed.
7. Banking System
Create a banking system where different types of bank accounts (SavingsAccount, CurrentAccount) have different interest rates.
Each account should allow deposits and withdrawals.
Ensure a way to display account details.
8. E-commerce Discount System
Implement a discount system where different product categories (Electronics, Clothing, Groceries) offer different discount rates.
Each product should have a method to calculate the final price after applying the discount.
Ensure that the system allows adding new product categories easily.
9. Vehicle Engine System
Design a system where different vehicle types (PetrolCar, ElectricCar) have different ways of starting.
Some vehicles may also have additional functionalities, such as charging a battery.
Ensure that objects of specific vehicle types can be created and tested.
10. Security System for Authentication
Create an authentication system where different authentication methods (Fingerprint, Password, FaceRecognition) verify users differently.
The system should allow adding new authentication methods in the future.
Each method should have a way to verify users.
11. Flight Ticket Reservation System
Implement a flight booking system where different types of tickets (EconomyClass, BusinessClass) have different pricing structures.
Each ticket should have a method to calculate the final price based on additional services.
Ensure that the system allows adding more ticket types easily.
12. School Grading System
Create a system where students' grades are calculated differently based on their academic programs (Undergraduate, Postgraduate).
Each program should have a method to compute the final grade.
The system should allow adding new academic programs without modifying existing code.
13. Online Learning Platform
Implement a learning system where different types of courses (VideoCourse, LiveCourse) have different ways of delivering content.
Each course should have a method to start learning.
Ensure that the system allows adding new course types easily.
14. Traffic Light System
Develop a system where different traffic lights (PedestrianLight, VehicleLight) operate differently.
Each light should have a method to display the current signal.
Ensure that the system supports the addition of new traffic light types in the future.
15. Restaurant Ordering System
Create a restaurant system where different types of orders (DineInOrder, TakeawayOrder) have different ways of processing.
Each order should have a method to calculate the final bill.
Ensure that the system supports adding new order types easily.
16. Hotel Room Booking System
Implement a hotel booking system where different room types (DeluxeRoom, StandardRoom) have different pricing.
Each room should have a method to calculate the total cost based on the number of nights.
Ensure that the system allows adding new room types in the future.
17. Library Book Management
Design a system where different types of books (PrintedBook, Ebook) have different ways of being accessed.
Each book should have a method to display its details.
Ensure that new book types can be added without modifying existing code.
18. Home Appliance System
Implement a home automation system where different appliances (Fan, AirConditioner, Refrigerator) have different ways of operating.
Each appliance should have a method to turn on/off.
Ensure that new appliance types can be added easily.
19. Sports League System
Develop a system where different types of sports (Cricket, Football, Basketball) have different scoring mechanisms.
Each sport should have a method to calculate the final score.
Ensure that the system supports adding new sports without modifying existing code.
20. Car Rental System
Create a car rental system where different types of cars (SUV, Sedan, Convertible) have different rental pricing.
Each car type should have a method to calculate the rental cost based on days booked.
Ensure that the system allows adding new car types in the future.






     */
}
