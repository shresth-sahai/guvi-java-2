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








     */
}
