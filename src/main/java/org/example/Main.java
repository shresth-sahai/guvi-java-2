package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;


public class Main {
    public static void main(String[] args) {
        //--- heap
// int [] a= new int[5] -> heap -> refernece stack
// by deafult 0 are stored
        // if(condition){ }
//        int age=10;
//        if(age == 10 )
//        {
//            System.out.println("Age!" + age);
//        }
        // if else
//        int age =18;
//        if(age==18){
//            System.out.println("Age!" + age);
//        }
//        else {
//            System.out.println("Not eligible fr voting!");
//        }
//        int number = 10;
//        if(number %2 != 0){
//            System.out.println("The number is odd");
//        }else{
//            System.out.println("The number is even");
//        }
//// if else ladder
//        int marks=91 ;
//        if(marks <40 ) System.out.println("Fail");
//        else if (marks>40 && marks <80) System.out.println("Pass");
//        else if (marks>80 && marks <90) System.out.println("Pass++");
//        else if (marks>90 && marks <95) System.out.println("Pass+++");
//        else if (marks>95 && marks <100) System.out.println("Pass-Super");
//        else System.out.println("Awesome");
//
//        // multiple if
//        if(marks <40 ) System.out.println("Fail");
//        if (marks>40 && marks <80) System.out.println("Pass");
//        // nested if
//       int a=1,b=2;
//        if(a==1) {
//            System.out.println("a"+a);
//            if(b==2)
//                System.out.println("b"+b);
//
//        }
// switch  -> control flow statement
//        switch (expression):
//        int day =2;
//        switch (day){
//            case 1:
//                System.out.println("Monday");
//                break;
//            case 2:
//                System.out.println("Tuesday");
//                break;
//            case 3:
//                System.out.println("Wednesday");
//                break;
//            default:
//                System.out.println("Invalid Day");
//        }
//    char grade='A';
//        switch (grade){
//            case 'A':
//            case 'B':
//                System.out.println("Good");
//                break;
//            case 'C':
//            case 'D':
//                System.out.println("Poor");break;
//
//        }
//
//        // short hand
//        int aa=1;
//        String result = (aa==1)?"True":"False";


//        Scanner scanner=new Scanner(System.in);
//        int age=scanner.nextInt();
//        String cz=scanner.next();
//        if(cz=="yes"){
//            if(age>=18) System.out.println("Can Vote");
//            else if (age >=16 ) System.out.println("Pre Vote");
//            else System.out.println("Cannot Vote");
//        }
//        else System.out.println("cz is required");
//        scanner.close();
//        for(int i=0;i<5;i++){
//
//        }
//        int a=5;
//        while(a<5){
//
//        }
//
//        int j=8;
//        do {
//            j++;
//        }
//        while(j<=7);
//
//
//
//
//    }

        // Print Numbers from 10 to 50 using For Loop and While Loop
        //Check if a Number is Positive or Negative
        //Reverse a Given Number using Loops
        //Find the Smallest Number Among Three Numbers
        //Write a Java program that takes the purchase amount as input and calculates the final payable amount after applying the discount.
        //
        //If the purchase amount is less than 500, no discount is applied.
        //If the purchase amount is between 500 and 1000, a 10% discount is applied.
        //If the purchase amount is greater than 1000, a 20% discount is applied.

        // reverse  123 ->  321   123%10-> 3   12%10=2    1 --> 0
        // 123 -> 12 - > 1 123 / 10 = 12
//        int n=123;int rev=0;
//        while(n!=0){
//            int digit = n%10; // extracting the last digit
//            rev=rev*10+digit; //a appending digit to rev
//            n=n/10; // removing the last
//        }
//        System.out.println(rev);
        /*
        dry run ->
        123    digit -> 3     rev = 0*10+3 = 3     n=123/10 =12
        12      2             rev = 3*10+2 = 32    n =1
        1       1            rev=32*10+1           n=0
        321

        *
        **
        ***
        ****
        *****

        *****
        ****
        ***
        **
        *

            * 4 space + *
           ** 3 space + 2 stars
          ***
         ****
        *****


         */
//        int n = 5;
//        for (int i = 1; i <= 5; i++) {
//            for (int j = 1; j <= i; i++) {
//                System.out.println("*");
//            }
//            System.out.println();
//        }
//        int n = 5;
//        for (int i = 5; i >=1; i--) {
//            for (int j = 1; j <=i; j++) {
//                System.out.println("*");
//            }
//            System.out.println();
//        }
// *****    **** *** ** *
//    int n=5;
//    for(int i=1;i<=n;i++){
//        for(int j=1; ; j++){
//            System.out.print(" ");
//        }
//        for(int j=1;j<= ;j++){
//            System.out.print("*");
//        }
//        System.out.println();
//    }

   /*
        nested
        loop -> loop
        inner loop rund completely each time
        for( value){
        for(will run fully )

        ***
        ***
        ***

        for(int i=1;i<=3;i++)
        for(j=1;j<=3;j++)
        print("*")
        println()
    */
        //String -> in most of the lang string is considered as an data structure
// in java -> string object -> string class -> immutable
// length()-> , charAt(index) -> return char at the index
//substring(s,e) -> ,
// indexOf(char)->first occ
// equals() ->campare  toLowerCase(), toUpperCase(), replace(oldChar,newChar)
// contains(charSequence) ->
// vairiaty ->
// string buffer, string builder ->  variety to create new Strings
// String Buffer -> it allows modification of the string without creating
// new string objects
//        StringBuffer buffer =new StringBuffer("hello");
//        buffer.append(" world");
//        System.out.println(buffer);
//
//        // string builder -> fast -> non thread safe in thread everything happens
//        StringBuilder builder =new StringBuilder("hello");
//        builder.append("JAva");
//        System.out.println(buffer);

//        String s1="Hi";// string literal -> create -> it is sstored in string pool
        // it stores unique values
        // if same string literal is used multiple times java reuse reference to same object

//        String str1="Hello";
//        String str2="Hello";// str1,str2 refers to same string object in string pool thus saves memory

        // new string objects-> create new string object -> outside the pool
//        String str3=new String("Hello");// ->refernce to new string object

        // unlike String
        // string mutable
        //-> when we string builder -> default capacity -> 16 characters
        // 17 char -> 32 chars -> keeps on doubling its size
        // internally -> stringbuildr -> character array -> it does not create any new object

        // immutable
//        String str1="Hello";
//        str1=str1+"World";
//        System.out.println(str1);
//// mutable
//        StringBuilder sb=new StringBuilder("hello");
//        sb.append("world");
//        System.out.println(sb);
//
//        String s1="Java";
//        String s2="Java";
//        if(s1.equals(s2)){
//            System.out.println("String are equal");
//        }
//        else{
//            System.out.println("String are not equal");
//        }
//
//String ss="Hi";
//        String ff=new String("Hi").intern();// adds to string pool
//        System.out.println(ss==ff); //true
//
////        String str1 = "hello";
//        String str2 = "hello";
//        String str3 = new String("hello");
//        String str4 = str3.intern();

        // Memory representation
////        System.out.println(str1 == str2); // true
//        System.out.println(str1 == str3); //false
////        System.out.println(str1 == str4);//true
//        System.out.println(str2 == str4); //true
//
//
//        String b111="abc123";
//        char [] c=b111.toCharArray();
//        Arrays.sort(c);
//
//        for(char ch:c){
//            System.out.println(ch);
//        }


//        // try / catch  2 march 25 lecture
//        /*
//        Exception Handling -> allows a program to deal with runtime errors
//        1 try -> Definea a block of code that might throw an exception
//        2 catch-> catches the exception
//        3 finally -> always executes wheather exception occurs or not
//
//        4 throw -> explicitly throw an err
//        5 throws -> declares the exception mentioned in throw
//
//
//
//
//         */
//    // try /catch
////        try {
////            int divideByZero=5/0;
////
////        }catch(ArithmeticException e){
////            System.out.print( "AE exception"+ e.getMessage());
////        }
////        finally{
////            System.out.print( "This will always execute");
////        }
////        try{
////            checkAge(15);
////        }catch(IllegalArgumentException e){
////            System.out.print( "II exception"+ e.getMessage());
////        }
////
////    }
//    static void checkAge(int age) throws IllegalArgumentException {
//        if(age<18){
//            throw new IllegalArgumentException("must be greater than 18");
//        }
//        else {
//            System.out.print( "Valid age");
//        }
//    }
    /*
    Multiple Choice Questions (MCQs) on Exception Handling
MCQ 1:
What happens when an exception is thrown inside a try block but there is no corresponding catch block?
A) The program continues execution normally.
B) The program terminates abnormally.
C) The program automatically recovers from the exception.
D) The program enters an infinite loop.

MCQ 2:
Which of the following is the correct way to declare a method that might throw an exception?
A) public void method() throw IOException {}
B) public throws void method() IOException {}
C) public void method() throws IOException {}
D) public void throws method(IOException) {}

MCQ 3:
What is the purpose of the finally block in Java?
A) It is executed only if an exception occurs.
B) It is executed only if no exception occurs.
C) It always executes, regardless of whether an exception occurs or not.
D) It is executed only when explicitly called.

MCQ 4:
Which keyword is used to explicitly throw an exception in Java?
A) throws
B) throw
C) catch
D) exception

MCQ 5:
Which of the following exceptions is an unchecked exception?
A) IOException
B) ArithmeticException
C) SQLException
D) FileNotFoundException

Coding Exercises on Exception Handling
Exercise 1:
Write a Java program that takes two numbers as input and performs division. Handle the case where the denominator is zero using a try-catch block.

Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int d=sc.nextInt();
try {
int r=n/d;
}
catch(AE e){

}
finally {
sc.close();
print();
}

Exercise 2:
Create a method checkEligibility(int age) that throws an IllegalArgumentException if the age is less than 18. Call this method from main() and handle the exception properly.



Exercise 3:
Write a Java program that tries to access an invalid array index and
 catches ArrayIndexOutOfBoundsException.
try {
int[] n={1,2,3};
print(n[5]);
}
catch(ArrayIndexOutOfBoundException e){
print("");
}



Exercise 4:
Create a method readFile(String filename) that declares throws IOException.
Call this method from main() and handle the exception.

static void readFile(String filename) throws IOException {
FileReader file=new FileReader(filename);
BufferedReader br=new BuffereReader(file);
print();
br.close();
}
psvm()
{
try {
readFile("");
}catch(IOException e){
print();
}

Exercise 5:
Write a program with two methods: methodA()
calls methodB(), and methodB() throws an exception using throw.
 Catch the exception in main() and display an appropriate message.

 static void methodB(){
 throw new RuntimeException("Exception thrown in MethodB")
 }
 static void methodA(){
        methodB();
 }
 psvm(){
 try{
 methodA();
 }
 catch(RuntimeException e){
 print()
 }
 }


     */

//    ArrayList<String> list =new ArrayList<>();
//    list.add("apple");list.add("orange");
//     list.remove("apple");
//     for(String a:list ){
//
//    } for(int i=0;i<2;i++){
////
////    }
//
        // List interface - ordered element
        // dupliactes, index based access , dynamic resizing
        // 2 -> 2 -> 2
        //  1 2 3    o(1)->

        // linkedlist -> double linkedlist

        //  1 <-> 2 <-> 3 <->  random access is n elements o(n)
        // pointers -> c++
        // java reference ->
        LinkedList<Integer> numbers=new LinkedList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(40);
        numbers.addLast(30);
        numbers.addFirst(1);

        numbers.removeFirst();
        for(int n:numbers){

        }
     // frequent updations we req it

    Vector<String> v=new Vector<>();
        v.add("dog"); v.add("cat");
      String s=  v.firstElement();

// thread safe while arraylist is not thread safe , vector slow

        // set interfaces

        HashSet<Integer> set=new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(2);
        System.out.print(set);// 1 2

        TreeSet<Integer> set1=new TreeSet<>();
        set1.add(5);
        set1.add(1);set1.add(3);

        System.out.print(set1);// 1 3 5

        PriorityQueue<Integer> pq=new PriorityQueue<>(); // min heap // max heap
        pq.add(10);
        pq.add(5); pq.add(20);

        System.out.print(pq);// 5 10 20
        System.out.print(pq.poll());// 5
        System.out.print(pq);//  10 20

        // max heap -> 20 10 5
        HashMap<Integer,String> map=new HashMap<>();
        map.put(1, "A"); // {1=A,2=B}
        map.put(2,"B");
        map.remove(2);

        TreeMap<Integer,String> treeMap=new TreeMap<>();
        treeMap.put(3,"A");
        treeMap.put(1,"e");
        treeMap.put(4,"j");

        System.out.print(treeMap); // {1:e, 3:A,4:j} sorted based on keys



    }
}
// type of conditional statements ->
// if ->

