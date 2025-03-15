package org.example;

public class MyThread extends Thread{
    @Override
    public void run(){
        System.out.print("Thread is running!");
    }
    /*
    what code a java thread should execute ->
    oveeride run -> start()
    implement the runnable interface
    Lambda function
     */
    public static void main(String[] args){
        MyThread thread=new MyThread();
        thread.start();
    }
}
