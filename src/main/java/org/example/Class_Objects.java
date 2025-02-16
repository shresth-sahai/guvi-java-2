package org.example;

public class Class_Objects {
  // class -> blueprint / template -> object -> variables ,methods
    // object -> instance of class
    //when class is defined -> no memory is allocated until object is defined


//    class Car {
//        String brand;
//        int speed;
//        void acc(){
//            System.out.print("speed"+brand+speed);
//        }
//        void brake(){
//            System.out.print("speed"+brand+speed);
//        }
//        public  static void main(){
//            Car c=new Car();
//            c.brand="TATA";
//            c.speed=100;
//
//            c.acc();
//            c.brake();
//        }
//    }


//    class Calc{
//        void add(int a,int b){
//            System.out.print("sum"+a+b);
//        }
//        int diff(int a ,int b){
//            return a-b;
//        }
//    }
    // constructors -> special func /method used to initialze objects
    // default constructor -> has no params initializes default values
    // parameterized -> has args and initializes with them
    class Book{
        String title; int pages;
        Book(){ // default construtor
            title="Unknown";
            pages=0;
        }
        Book(String title,int pages){ // parameterized
            this.title=title;
            this.pages=pages;
        }

        void displayInfo(){
            System.out.print(pages+title);
        }
        main(){
            Book b1=new Book();
            b1.displayInfo(); // 0 Unknown

            Book b2=new Book("java",120);
            b2.displayInfo(); // 120 java
        }

}
}
