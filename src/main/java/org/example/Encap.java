package org.example;

public class Encap {
    /*

    Data hiding ->restricitng access to varibles and providing controlled access via setters and getterrs
     */
    class Bank{
        private double b;
        // construtor
        Bank(double ib) {
            this.b=ib;
        }
        public double getBalance(){
            return b;
        }
        public void deposit(double amt){
            b++;
        }

        /*
        1. What is the main advantage of encapsulation in Java?
A) It allows global access to all variables
B) It improves code performance
C) It helps in data hiding and security
D) It makes a class inherit another class


2. Which of the following is an example of method overloading?
A) Two methods with the same name but different parameters in the same class
B) A method in a child class having the same name as a method in the parent class
C) A static method overriding an instance method
D) Declaring multiple classes with the same method

What is method overriding?
A) Declaring multiple methods with the same name but different parameters in a class
B) Defining multiple constructors in a class
C) A child class redefining a method from the parent class
D) Using the static keyword to override a method


What will happen if a method in a subclass has the same signature as a method in its superclass?
A) Compilation error
B) The subclass method will override the superclass method
C) Both methods will be accessible in the subclass
D) The superclass method will be hidden


 What is the output of the following Java code?
java
Copy
Edit
class Parent {
    void display() {
        System.out.println("Parent class");
    }
}

class Child extends Parent {
    void display() {
        System.out.println("Child class");
    }
}

public class Main {
    public static void main(String[] args) {
        Parent obj = new Child();
        obj.display();
    }
}
A) Parent class
B) Child class
C) Compilation error
D) Runtime error


Which keyword is used to access a parent class method when it is overridden in a subclass?
A) parent
B) this
C) super
D) base

Which of the following statements about polymorphism is correct?
A) Method overloading happens at runtime
B) Method overriding happens at compile-time
C) Method overloading and method overriding are both examples of polymorphism
D) Method overriding requires final keyword


Which of the following statements about encapsulation is true?
A) Encapsulation allows a class to be inherited
B) Encapsulation allows data members to be accessed directly from outside the class
C) Encapsulation ensures data hiding and controlled access
D) Encapsulation prevents method overriding


What will be the output of this Java program?
java
Copy
Edit
class Test {
    private int num = 10;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}

public class Main {
    public static void main(String[] args) {
        Test obj = new Test();
        obj.setNum(20);
        System.out.println(obj.getNum());
    }
}
A) 10
B) 20
C) Compilation error
D) Runtime error



Which of the following statements is false about method overriding?
A) The method name and parameters must be the same in both superclass and subclass
B) The return type must be the same or a subclass of the superclass method
C) The overridden method in the subclass can have a weaker access modifier
D) It allows runtime polymorphism



         */




    }
}
