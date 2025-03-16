package org.example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {
    // THread pool -> is a collection of worker threads -> efficient
    //help in getting rid of the overhead
    // Executor service

    //main function
//    ExecutorService threadPool= Executors.newFixedThreadPool(4);
//    Runnable t1=()->System.out.print("Task 1 "+Thread.currentThread().getName());
//    Runnable t2=()->System.out.print("Task 1 "+Thread.currentThread().getName());
//    Runnable t3=()->System.out.print("Task 1 "+Thread.currentThread().getName());
//    threadPool.submit(t1);
//    threadPool.submit(t2);
//    threadPool.submit(t3);
//    threadPool.shutdown();

// in case of more control customised thread pool

//    ThreadPool myPool=new ThreadPool(3);
//    Runnable t1=()-> System.out.println("Task1");
//    Runnable t2=()-> System.out.println("Task2");
//    Runnable t3=()-> System.out.println("Task3");
//    myPool.execute(t1);
//    myPool.execute(t3);




}
