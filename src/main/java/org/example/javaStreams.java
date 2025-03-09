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
    List<Integer> n1=Arrays.asList(1,2,3,45,5);
    List<Integer> doubled=n1.stream().map(n->n*2)
            .collect(Collectors.toList());
List<Integer> sortedNumber=n1.stream().sorted()
        .collect(Collectors.toList());

    List<String> names= Arrays.asList("ALice","John","Jane","Tom");
    List<String> sortedString=names.stream().sorted()
            .collect(Collectors.toList());
// reduce is used to perfrom reduction of stream elems

    List<Integer> n2=Arrays.asList(1,2,3,45,5);
    int sum=n2.stream().reduce(0,(a,b)-> a+b);
    // flat Map -> convert each element into a new stream then then flatten res

    List<List<String>> nameList=Arrays.asList(
            Arrays.asList("John","Jane"),
            Arrays.asList("Tom","Alice")
    );
    List<String> flattenedList=nameList.stream().flatMap(Collection::stream)
            .collect(Collectors.toList());

}
