//package org.example;
//
//public class Loops {
//// entry controlled loop ->for -> know  the no of iterations
//    // int i=0 , i<=5 i++
////    int i;
////    for(i=0;i<=5;i++){
////        System.out.print(i);
////    }
////
////      for(i=0;i<=5;i++;){
////        System.out.print(i);
////    }
//    // entry while
//
////    int i=1;
////    while(i<=5){
////        System.out.print(i);
////    }
////
////    // do while -> exit controlled -> at least one guranteed execution happens
////    int j=1;
////    do{
////        System.out.print(j);
////        j++;
////    }while(j<=5);
////    // j=6
////
////    // for each
////    int[] numbers={10,20,30,40,50};
////
////    // 10,20,30,40,50
////    for(int num:numbers){
////        System.out.print(num);// 10 20 30 40 50  for(int i=0;i<5;i++) print(numbers[i])
////    }
//
//// i =1, 2 , 3
//    // 1 2 Breaking out
//for(int i=1;i<=5;i++){
//    if(i==3){
//        System.out.print("Breaking out");
//        break;
//    }
//        System.out.print(i);
//    }
//}
//// break is used to terminate execution prematurely while continue skips the current one moves to next
//
//for(int j=1;j<=5;i++){
//        if(j==3){
//        System.out.print("Skippping out");
//        continue;
//        }
//        System.out.print(j);
//        }
//        }
//// 1 2 skipping out 4 5
//
//

/*

Check if a Number is Prime
Problem:
Write a program that checks whether a given number n is prime or not.

✅ Test Cases:

10 -> 2,5 ,10,1

7 -> no
3
8
1 ->1
2 -> 1,2
3 ->1,3
4 ->1,2,4
5-> 1,5
6 -> 1,2 ,3,6
7->1,7
8-> 1,2,4,8
12 -> 1,2,3,4,6,12 not prime
13->1,13 prime number


range (1, number itself)


Input: 7
Expected Output: Prime

Input: 10
Expected Output: Not Prime






8️⃣ Fibonacci Series up to n Terms
Problem:
Write a program that prints the Fibonacci series up to n terms.

✅ Test Cases:

Input: 5         a b
Expected Output: 0 1 1 2 3 5 8 13 ......
int a=0 , b=1
print(a)
print (b);
for(int i=2;i<n;i++) {

int next =a+b;
print(next)
a=b
b=next;
}







Input: 8
Expected Output: 0 1 1 2 3 5 8 13
9️⃣ Count the Number of Digits in a Number
Problem:
Write a program that counts the number of digits in a given number.

✅ Test Cases:


Input: 12345
Expected Output: 5

Input: 987654321
Expected Output: 9
int count=0;

    while(n!=0){
    int digit =n%10;
   count++;
   n=n/10;
    }

    Math.pow(2,3) -> 2^3 -> 8
 A positive integer is called an Armstrong number of order n if

abcd... = an + bn + cn + dn + ...
In case of an Armstrong number of 3 digits, the sum of cubes of each digits is equal to the number itself. For example:

153 = 1*1*1 + 5*5*5 + 3*3*3  // 153 is an Armstrong number.
 */
//
//