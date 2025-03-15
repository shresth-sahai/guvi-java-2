package org.example;

public class RunnableWithLambda {
    Runnable task =()->System.out.print("running");
    Thread thread=new Thread(task);
//    thread.start();
    Thread current= Thread.currentThread(); // whatever thread is getting exected



//    Thread.sleep();  pauses the current execution
//     interrupt
    // daemon -> low priprity -> runs in bg
    // join-> lets u wait fr execution of 1 then 2 starts
//Thread thread1=new Thread(()->System.out.print("running1") );
//    Thread thread2=new Thread(()->System.out.print("running2") );
//    thread1.start(); thread2.start();


    public class Main {
        public static void main(String[] args) throws InterruptedException {
            Thread thread1 = new Thread(() -> {

                try {
                    Thread.sleep(1000);
                    System.out.println("Thread 1 completed");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });

            thread1.start();
            thread1.join();
            System.out.println("Main thread resumes after thread 1 completes");
        }
    }

}
