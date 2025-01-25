package org.example;

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
        int day =2;
        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Invalid Day");
        }
    char grade='A';
        switch (grade){
            case 'A':
            case 'B':
                System.out.println("Good");
                break;
            case 'C':
            case 'D':
                System.out.println("Poor");break;

        }

        // short hand
        int aa=1;
        String result = (aa==1)?"True":"False";

    }
}
// type of conditional statements ->
// if ->