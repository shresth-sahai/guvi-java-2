//package org.example;
//
//public class brekacontinue {
//
//    for (int i = 1; i <= 10; i++) {
//        if (i == 5) {
//            System.out.println("Stopping at " + i);
//            break;
//        }
//        System.out.print(i + " ");
//    } 1 2 3 4 stopping at 5
//
//
//        for (int i = 1; i <= 10; i++) {
//        if (i == 5) {
//            System.out.println("Skipping " + i);
//            continue;
//        }
//        System.out.print(i + " ");
//    } 1 2 3 4 skipping 5 6  7 8 9 10
//
//
//    int[] numbers = {3, 7, 9, 10, 15, 18};
//
//        for (int num : numbers) {
//        if (num % 2 == 0) {
//            System.out.println("First even number found: " + num);
//            break;
//        }
//    } //
//        i =1
//         for (int i = 1; i <= 10; i++) {
//        if (i % 2 == 0) {
//            continue;  // Skips even numbers
//        }
//        System.out.print(i + " ");
//    } 1 3 5 7 9
//
//    int[] numbers = {4, 7, 12, -5, 9, -8};
//
//        for (int num : numbers) {
//        if (num < 0) {
//            System.out.println("First negative number: " + num);
//            break;  // Stops at the first negative number
//        }
//    }
//} -5
