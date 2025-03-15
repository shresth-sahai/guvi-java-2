package org.example;

public class SharedData2 {
    int data=0;
    public synchronized void writer(){
        data=20;
    }
    public synchronized void reader(){
        System.out.print(data);
    }
}
