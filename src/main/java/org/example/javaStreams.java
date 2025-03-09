package org.example;

import javax.sound.sampled.EnumControl;
import java.util.*;
import java.util.List;
import java.util.stream.*;

public class javaStreams {
    /*
    Stream api -> which allows to process sequence of elements like arrays ,collection
    etc in a declarative manner, it makes use of fucntional programing
    features like lambda exp , functional interfaces

can be inifinte -> like readinh date from a file / network

    filtering , mapping, collecting data etc
    Stream -> no storage
    functional in nature

    basic comps ->
    Stream Creation <Stream<T>
    opr ->
    termination
     */
//     creation of stream
//    List<String> names= Arrays.asList("A","B");
//    names.stream()
//            .forEach(System.out::println);


//    List<Integer> n=Arrays.asList(1,2,3,45,5);
    // filter even number
//    List<Integer> even= n.stream().filter(n->n%2==0)
//            .collect(Collectors.toList());
//
    // map -> transform
//    List<Integer> n1=Arrays.asList(1,2,3,45,5);
//    List<Integer> doubled=n1.stream().map(n->n*2)
//            .collect(Collectors.toList());
//List<Integer> sortedNumber=n1.stream().sorted()
//        .collect(Collectors.toList());
//
//    List<String> names= Arrays.asList("ALice","John","Jane","Tom");
//    List<String> sortedString=names.stream().sorted()
//            .collect(Collectors.toList());
// reduce is used to perfrom reduction of stream elems

//    List<Integer> n2=Arrays.asList(1,2,3,45,5);
//    int sum=n2.stream().reduce(0,(a,b)-> a+b);
    // flat Map -> convert each element into a new stream then then flatten res

//    List<List<String>> nameList=Arrays.asList(
//            Arrays.asList("John","Jane"),
//            Arrays.asList("Tom","Alice")
//    );
//    List<String> flattenedList=nameList.stream().flatMap(Collection::stream)
//            .collect(Collectors.toList());


    /*
    class P{
    int age,salary;
    }
    List<Person> p=Arrays.asList(new P(1,2));
    Group g=p.stream().collect(.....);


    Question 1: Given the following list of integers, which of the following Stream operations will return a list of doubled even numbers from the original list?


    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    List<Integer> result = numbers.stream()
            .filter(n -> n % 2 == 0)
            .map(n -> n * 2)
            .collect(Collectors.toList());
System.out.println(result);
    A) [2, 4, 6, 8, 10]
    B) [4, 8, 12, 16, 20]
    C) [2, 4, 6, 8, 10, 12, 14, 16, 18, 20]
    D) [2, 4, 6, 8]

    Question 2: What will be the output of the following code?


    List<String> names = Arrays.asList("John", "Alice", "Bob", "Charlie");
    String result = names.stream()
            .filter(s -> s.length() > 3)
            .collect(Collectors.joining(", "));
System.out.println(result);
    A) Alice, Bob, Charlie
    B) John, Alice, Bob, Charlie
    C) Alice, Charlie
    D) Bob, Charlie

    Question 3: What does the following code do?

    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
    long count = numbers.stream()
            .filter(n -> n % 2 == 0)
            .count();
System.out.println(count);
    A) Counts the total number of elements in the list.
            B) Counts the total number of even numbers in the list.
    C) Finds the first even number in the list.
    D) Filters the even numbers but doesn't count them.

    Question 4: What is the output of the following code?


    List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
    Optional<Integer> sum = numbers.stream()
            .reduce((a, b) -> a + b);
sum.ifPresent(System.out::println);
    A) 10
    B) 150
    C) 50
    D) 0

    Question 5: Given the following code, which of the following will return a list of strings where each string is converted to uppercase and then sorted alphabetically?


    List<String> words = Arrays.asList("banana", "apple", "orange", "grape");
    List<String> result = words.stream()
            .map(String::toUpperCase)
            .sorted()
            .collect(Collectors.toList());
System.out.println(result);
    A) [APPLE, BANANA, GRAPE, ORANGE]
    B) [APPLE, BANANA, GRAPE, ORANGE]
    C) [banana, apple, orange, grape]
    D) [APPLE, ORANGE, GRAPE, BANANA]

    Multiple-Choice Questions (MCQs)
    Question 6: Which of the following operations is not a terminal operation in Java Streams?

    A) forEach()
    B) collect()
    C) map()
    D) reduce()

    Question 7: Which of the following is true about the Java Streams API?

    A) Streams can only be processed sequentially.
    B) Streams support parallel processing.
    C) Streams modify the source collection in place.
            D) Streams are not lazily evaluated.

            Question 8: What is the purpose of the distinct() method in Java Streams?

    A) It sorts the stream in ascending order.
            B) It removes duplicates from the stream.
    C) It counts the number of elements in the stream.
            D) It maps each element in the stream to a new value.

            Question 9: Which of the following methods is used to combine two streams into a single stream?

    A) flatMap()
    B) map()
    C) concat()
    D) merge()

    Question 10: What will the following code output?


    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
    Optional<Integer> first = numbers.stream()
            .filter(n -> n > 3)
            .findFirst();
System.out.println(first.orElse(0));
    A) 3
    B) 5
    C) 0
    D) No value


    Filter and Sort a List of Employees
Problem Statement: You are given a list of Employee objects. Each Employee has the following properties:

id (Integer)
name (String)
age (Integer)
salary (Double)
Write a Java program that:

Filters the list to include only employees who have an age greater than 30.
Sorts the remaining employees by their salary in descending order.
Collect the results into a new list and print the sorted list of employees.

  */





}
