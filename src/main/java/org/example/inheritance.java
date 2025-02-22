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



     */
}
