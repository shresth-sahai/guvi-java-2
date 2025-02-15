package org.example;

import java.util.Scanner;
//--- heap
// int [] a= new int[5] -> heap -> refernece stack
// by deafult 0 are stored
public class Main {
    public static void main(String[] args) {
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
        StringBuffer buffer =new StringBuffer("hello");
        buffer.append(" world");
        System.out.println(buffer);

        // string builder -> fast -> non thread safe in thread everything happens
        StringBuilder builder =new StringBuilder("hello");
        builder.append("JAva");
        System.out.println(buffer);

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
        String str1="Hello";
        str1=str1+"World";
        System.out.println(str1);
// mutable
        StringBuilder sb=new StringBuilder("hello");
        sb.append("world");
        System.out.println(sb);

        String s1="Java";
        String s2="Java";
        if(s1.equals(s2)){
            System.out.println("String are equal");
        }
        else{
            System.out.println("String are not equal");
        }

String ss="Hi";
        String ff=new String("Hi").intern();// adds to string pool
        System.out.println(ss==ff); //true

        String str1 = "hello";
        String str2 = "hello";
        String str3 = new String("hello");
        String str4 = str3.intern();

        // Memory representation
        System.out.println(str1 == str2); // true
        System.out.println(str1 == str3); //false
        System.out.println(str1 == str4);//true
        System.out.println(str2 == str4); //true

    }
}
// type of conditional statements ->
// if ->

