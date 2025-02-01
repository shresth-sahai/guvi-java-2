package org.example;

import java.util.Scanner;

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


    }
}
// type of conditional statements ->
// if ->