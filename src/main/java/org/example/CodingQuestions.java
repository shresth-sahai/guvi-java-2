package org.example;

import java.util.Scanner;

public class CodingQuestions {
    /*
    Create a traffic light system where:

The user inputs the current color of the traffic light (Red, Yellow, or Green).
Based on the input, print:
Red: Stop.
Yellow: Slow down and prepare to stop.
Green: Go.
If the input is invalid, print “Invalid traffic light color”.

1  Scanner scanner=new Scanner(System.in);
        String lightColor=scanner.nextLine();
        switch(lightColor)
        {
            case "red":
                System.out.println("Stop");break;
            case "yellow":
                System.out.println("SLow Down");break;
            case "green":
                System.out.println("Go");break;
            default:

                System.out.println("Invalid");break;


        }
        scanner.close();




Write a program to calculate the discount on a purchase based on membership levels:

Platinum Members: 30% discount.
Gold Members: 20% discount.
Silver Members: 10% discount.
Non-Members: No discount.
The program should:

Take the total bill amount and membership type as input.
Calculate the final amount after the discount.

Scanner scanner=new Scanner(System.in);
      double billAmount=scanner.nextDouble();
      String memberShip=scanner.next();
      double discountRate=0;

      switch (memberShip){
          case "platinum":
              discountRate=0.30;
              break;
          case "gold":
              discountRate=0.20;
              break;
          case "silver":
              discountRate=0.10;
              break;
          case "none":
              discountRate=0.0;
              break;
          default:
              System.out.println("invalid membership");  scanner.close();
              break;

      }
      double discount=billAmount*discountRate;
      double finalAmount=billAmount-discount;

        System.out.println("Discount"+ discount);
        System.out.println("Final Amt"+ finalAmount);
    }





Write a program to determine a student’s performance based on their grade:

Grade A: Excellent (If score > 95, print "Outstanding").
Grade B: Good (If score > 85, print "Very Good").
Grade C: Average (If score < 60, print "Needs Improvement").
Grades D or F: Poor.
The program should also check for invalid grades.

Scanner scanner =new Scanner(System.in);
char grade=scanner.next().charAt(0);
int score=0;
if(grade== 'A' || grade== 'B' || grade == 'C'){
    System.out.println("Enter Score");
    score=scanner.nextInt();
}
switch (grade){
    case 'A':
        if(score> 95){
            System.out.println("Exceelent");System.out.println("OutStanding");
        }
        else {
            System.out.println("Exceelent");
        }
        break;

    case 'B':
        if(score> 85){
            System.out.println("Good");System.out.println("Very Good");
        }
        else {
            System.out.println("Good");
        }
        break;
    case 'D':
    case 'F':
        System.out.println("Poor"); break;
    default:System.out.println("Invalid Grade");


}
scanner.close();


    }


Create a program for an ATM withdrawal system where:

The user enters the withdrawal amount.
The program checks if the withdrawal amount is divisible by 100 (the ATM dispenses only ₹100 notes).
If the withdrawal amount is greater than the balance, print “Insufficient Balance”.
Otherwise, print the denomination (number of ₹100 notes) and deduct the amount from the balance.
double balance=500;
Scanner scanner=new Scanner(System.in);
int withdraw=scanner.nextInt();
if(withdraw %100 !=0){
    System.out.println("Invalid Amt");
}
else if(withdraw>balance){
    System.out.println("Insufficient amt");
}
else{
    int notes= withdraw/100;
    balance-=withdraw;

    System.out.println(balance);System.out.println(notes);




Write a Java program to check voting eligibility based on the following criteria:

The user must be 18 years or older.
The user must be a citizen of the country.
If the user is between 16 and 18 years, allow them to register for pre-voting.

Scanner scanner=new Scanner(System.in);
int age=scanner.nextInt();
String cz=scanner.next();
if(cz=="yes"){
    if(age>=18) System.out.println("Can Vote");
    else if (age >=16 ) System.out.println("Pre Vote");
    else System.out.println("Cannot Vote");
}
else System.out.println("cz is required");
scanner.close();
    }
     */
// loops -> get rid of repeatition
    // for(initialization;condition check;move frwd){}

    // while(condition) { }

    // do {
//} while()



    }
