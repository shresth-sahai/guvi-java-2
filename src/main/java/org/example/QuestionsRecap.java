

/*
 
1. What is the output of the following code?

public class Test {
    public static void main(String[] args) {
        int x = 5;
        System.out.println(x++);
        System.out.println(++x);
    }
}

Options:
A) 5, 6
B) 6, 7
C) 5, 7
D) 6, 6

Answer:
C) 5, 7


2. Which of the following is a valid way to declare a class?
Options:
A) class MyClass extends Object {}
B) class MyClass implements Runnable {}
C) class MyClass extends Object implements Runnable {}
D) All of the above

Answer:
D) All of the above


3. What is the default access modifier for a class in Java?
Options:
A) private
B) protected
C) public
D) default (package-private)

Answer:
D) default (package-private)

4. Which of the following is a correct way to initialize an array?
Options:
A) int[] arr = new int[5];
B) int arr = new int[5];
C) int[] arr = {1, 2, 3};
D) Both A and C

Answer:
D) Both A and C



5. What will happen when you compile and run the following code?

public class Test {
    public static void main(String[] args) {
        System.out.println(10 / 0);
    }
}

Options:
A) Compilation error
B) Runtime exception (ArithmeticException)
C) Prints Infinity
D) Prints NaN

Answer:
B) Runtime exception (ArithmeticException)

Which of the following is a valid constructor?
Options:
A) void Test() {}
B) Test() {}
C) public Test() {}
D) Both B and C

Answer:
D) Both B and C


7. What is the output of the following code?

public class Test {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        System.out.println(a++ + ++b);
    }
}

Options:
A) 15, 11
B) 16, 11
C) 15, 12
D) 16, 12

Answer:
B) 16, 11

8. What is the difference between == and .equals() in Java?
Options:
A) == checks reference equality, .equals() checks value equality
B) == checks value equality, .equals() checks reference equality
C) Both check value equality
D) Both check reference equality

Answer:
A) == checks reference equality, .equals() checks value equality


9. Which of the following is a valid method signature?
Options:
A) void myMethod(int x)
B) static void myMethod(int x)
C) public static void myMethod(int x)
D) All of the above

Answer:
D) All of the above


10. What is the output of the following code?

public class Test {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "Java";
        System.out.println(s1 == s2);
    }
}
    Options:
A) true
B) false
C) Compilation error
D) Runtime exception

Answer:
A) true


11. Which of the following is a correct way to create a thread in Java?
Options:
A) Extend Thread class and override run() method
B) Implement Runnable interface and pass it to a Thread constructor
C) Both A and B
D) None of the above

Answer:
C) Both A and B

12. What is the output of the following code?
public class Test {
    public static void main(String[] args) {
        try {
            System.out.println(10 / 0);
        } catch (Exception e) {
            System.out.println("Caught Exception");
        } finally {
            System.out.println("Finally block executed");
        }
    }
}

Options:
A) Caught Exception, Finally block executed
B) Finally block executed
C) ArithmeticException, Finally block executed
D) Compilation error

Answer:
C) ArithmeticException, Finally block executed


13. Which of the following is a correct way to handle checked exceptions?
Options:
A) Declare the exception using throws keyword
B) Surround the code with a try-catch block
C) Both A and B
D) None of the above

Answer:
C) Both A and B


What is the output of the following code?

public class Test {
    public static void main(String[] args) {
        int x = 10;
        switch (x) {
            case 10:
                System.out.println("Ten");
            case 20:
                System.out.println("Twenty");
            default:
                System.out.println("Default");
        }
    }
}


Options:
A) Ten
B) Ten, Twenty
C) Ten, Twenty, Default
D) Compilation error

Answer:
C) Ten, Twenty, Default



15. Which of the following is a correct way to import a package?
Options:
A) import java.util.*;
B) import java.util.List;
C) Both A and B
D) None of the above

Answer:
C) Both A and B



What is the output of the following code?


public class Test {
    public static void main(String[] args) {
        String s1 = new String("Java");
        String s2 = "Java";
        System.out.println(s1 == s2);
    }
}

Options:
A) true
B) false
C) Compilation error
D) Runtime exception

Answer:
B) false



17. Which of the following is a correct way to declare an abstract class?
Options:
A) abstract class MyClass {}
B) final abstract class MyClass {}
C) public abstract class MyClass {}
D) Both A and C

Answer:
D) Both A and C


What is the output of the following code?
public class Test {
    public static void main(String[] args) {
        int x = 10;
        switch (x) {
            case 10:
                System.out.println("Ten");
                break;
            case 20:
                System.out.println("Twenty");
            default:
                System.out.println("Default");
        }
    }
}
    Options:
A) Ten
B) Ten, Default
C) Ten, Twenty, Default
D) Compilation error

Answer:
A) Ten



Which of the following is a correct way to create a thread pool in Java?
Options:
A) ExecutorService executor = Executors.newFixedThreadPool(5);
B) ExecutorService executor = Executors.newCachedThreadPool();
C) Both A and B
D) None of the above

Answer:
C) Both A and B



What is the output of the following code?


public class Test {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        System.out.println((x > y) ? "X is greater" : "Y is greater");
    }
}


Options:
A) X is greater
B) Y is greater
C) Compilation error
D) Runtime exception

Answer:
B) Y is greater




 */
