package org.example;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class Multithreading {
/*
multithreading -> dividing a program into multiple threeads
each thread -> runs independently but shares resources

concurrency -> refers to ability of a computer -> to mamage
mutiple task processes

Multitasking- > system can execute multiple tasks at same time
preemptive -> os handilng by allocating slots fr each task
cooperativve-> task decide the slots


cores in CPU -> handling tasks (multithreading)

models in concurrency ->

1 thread based -> uses threads in a single process to do multiple tasks
2 process -> each task runds sep
3 event driven -> events loops -> queue like thing listens to event and acts accor

thread -> java thread aloows multithreading -> mutilple parts of a program
runs simulteneously
thread -> smalles unit of execution

create a thread -> thread class/ runnable interface


 */

//    private static int counter=0;
//    public static void main(String[] args) throws InterruptedException {
//        Runnable incrementTask =()->{
//            for(int i=0;i<1000;i++){
//                counter++;
//            }
//        };
//
//        Thread thread1=new Thread(incrementTask);
//        Thread thread2=new Thread(incrementTask);
//        thread1.start();thread2.start();
//        thread2.join();thread1.join();

    /*
    to avoid race conditions we use atomic operations as well
     */
//    private static AtomicInteger counter=new AtomicInteger(0);
//
//        public static void main(String[] args) throws InterruptedException {
//        Runnable incrementTask =()->{
//            for(int i=0;i<1000;i++){
//                counter.incrementAndGet();
//            }
//        };
//
//        Thread thread1=new Thread(incrementTask);
//        Thread thread2=new Thread(incrementTask);
//        thread1.start();thread2.start();
//        thread2.join();thread1.join();
//    }
// will give 2000 fr sure

//    private static int counter=0;
//    public static void main(String[] args) throws InterruptedException {
//        Runnable incrementTask =()->{
//            for(int i=0;i<1000;i++){
//               synchronized (Multithreading.class){
//                   counter++;
//               }
//            }
//        };
//
//        Thread thread1=new Thread(incrementTask);
//        Thread thread2=new Thread(incrementTask);
//        thread1.start();thread2.start();
//        thread2.join();thread1.join();

    // one thread reads another writes
//    private static int sharedData=0;
//    public static  void main(String[] args) throws InterruptedException{
//        Thread writer=new Thread(()->{
//            sharedData=42;
//            System.out.print(sharedData);
//        });
//
//        Thread reader = new Thread(()->{
//            try{
//                Thread.sleep(1000);
//                System.out.print(sharedData);
//            }
//            catch (InterruptedException e){
//                System.out.print(e);
//            }
//        });
//        writer.start(); reader.start();
//        writer.join();reader.join();
//    }
    // two threads -> same object only only should modify value
//    private static class Data{
//        int value;
//
//    }
//
//    public static void main(String[] args) throws InterruptedException{
//        Data data=new Data();
//        data.value=5;
//
//        Runnable task1=()->{
//            System.out.print(data.value);
//        };
//        Runnable task2=()->{
//            System.out.print(data.value);
//        };
//                Thread thread1=new Thread(task1);
//        Thread thread2=new Thread(task2);
//        thread1.start();thread2.start();
//        thread2.join();thread1.join();

//    }

    // thread 1 -> check condition and acting acc to it
    // in between another comes and change the condition

    // atomic and synchonized
    // problem
//    private static boolean flag=false;
//
//    public  static void main(String[] args) throws InterruptedException{
//                Runnable task1=()->{
//                    if(!flag) flag=true;
//                    System.out.print("Task1");
//
//        };
//        Runnable task2=()->{
//            if(!flag) flag=true;
//            System.out.print("Task2");
//        };
//                Thread thread1=new Thread(task1);
//        Thread thread2=new Thread(task2);
//        thread1.start();thread2.start();
//        thread2.join();thread1.join();

//    }

    private static AtomicBoolean flag=new AtomicBoolean(false);

//    public  static void main(String[] args) throws InterruptedException{
//        Runnable task1=()->{
//            if(flag.compareAndSet(false,true))
//            System.out.print("Task1");
//
//        };
//        Runnable task2=()->{
//            if(flag.compareAndSet(false,true))
//                System.out.print("Task2");
//        };
//        Thread thread1=new Thread(task1);
//        Thread thread2=new Thread(task2);
//        thread1.start();thread2.start();
//        thread2.join();thread1.join();

    }