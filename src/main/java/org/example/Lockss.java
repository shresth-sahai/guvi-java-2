package org.example;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Lockss {
    /*
    Lock interface -> java.concurrent.locks
    used fr more advanced synchronisation

    Renentrant lock
     */

//    public  class Counter{
//        private int count=0;
//        public void increment(){
//            count++;
//        }
//        public int getCount(){
//            return count;
//        }
//    }
//    public static void main(String[] args){
//        Counter counter=new Counter();
//        Runnable task=()->{
//            for(int i=0;i<10;i++){
//                counter.increment();
//            }
//        };
//        Thread thread1=new Thread(task);Thread thread2=new Thread(task);
//        thread1.start();thread2.start();thread1.join();thread2.join();
//    } execution might nit give 2000

//    private int count=0;
//    private Lock lock =new ReentrantLock();
//    public void increment(){
//        lock.lock(); // acquiring the lock
//        try{
//            count++;
//        }
//        finally {
//            lock.unlock();
//        }
//    }
//    public int getCount(){ return count;}
    // use case of reentrant ->same lock multiple times
//private Lock lock =new ReentrantLock();
//    public void methodA(){
//        lock.lock();
//        try{
//            methodB();
//        }
//       finally {
//            lock.unlock();
//        }
//    }
//    public void methodB(){
//        lock.lock();// it will work
//        try{
//            System.out.print("in b method");
//        }
//        finally {
//            lock.unlock();
//        }
//    }

    // fair lock ->acquire locks in  a fair manner
//    Lock lock =new ReentrantLock(true);
//    lock.lock();
//    try{
//        // critical section code
//    }
//    finally{
//        lock.unlock();
//    }
   // lock.lockInterruptbly();-> interrupt the execution in between
    // lock.tryLock()
    /*


    java lock vs synchorzised
    -> lock ->flexibility , fairness
     */




}
