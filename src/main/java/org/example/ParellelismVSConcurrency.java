package org.example;

import java.util.concurrent.ForkJoinPool;

public class ParellelismVSConcurrency {
    /*
    concurrency -> involves multiple tasks by managing the execution of threads
    where tasks may not run at same time

    parellelism -> same time execution


     */
    // concurrency eg
//    public static  void main(String [] args) throws InterruptedException{
//        Runnable task1=()->{
//            try{
//                Thread.sleep(1000);
//                System.out.print("Task1 completed");
//            }
//            catch(InterruptedException e){
//                e.printStackTrace();
//            }
//        };
//
//        Runnable task2=()->{
//            try{
//                Thread.sleep(500);
//                System.out.print("Task2 completed");
//            }
//            catch(InterruptedException e){
//                e.printStackTrace();
//            }
//        };

        // parellel execution

//                Runnable task1=()->{
//            try{
//                Thread.sleep(1000);
//                System.out.print("Task1 completed");
//            }
//            catch(InterruptedException e){
//                e.printStackTrace();
//            }
//        };
//
//        Runnable task2=()->{
//            try{
//                Thread.sleep(1000);
//                System.out.print("Task2 completed");
//            }
//            catch(InterruptedException e){
//                e.printStackTrace();
//            }
//        };
//        they run at same time but on diff cpu cores

//                Runnable task1=()->{
//                    System.out.print("Task1 started");
//                    for(int i=0;i<10;i++){
//                        System.out.print("Task1 completed");
//                    }
//        };
//
//        Runnable task2=()->{
//            System.out.print("Task2 started");
//            for(int i=0;i<10;i++){
//                System.out.print("Task2 completed");
//            }
//        };
//
//        Runnable task3=()->{
//            System.out.print("Task3 started");
//            for(int i=0;i<10;i++){
//                System.out.print("Task3 completed");
//            }
//        };
//        Thread thread1=new Thread(task1);
//        Thread thread2=new Thread(task2);
//        Thread thread3=new Thread(task3);


        // simulteneous execution -> work -> divided into multiple cores

   // ForkJoinPool -> java framewok used fr parellel processing
   // to execute tasks on multiple threads


//    }
        public static void main(String[] args){
            ForkJoinPool pool=new ForkJoinPool();
            pool.submit(()->{
                for(int i=0;i<10;i++)
                System.out.print("Task3 completed");
            });
            pool.shutdown();
        }
}
