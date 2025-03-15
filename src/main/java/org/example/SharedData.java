package org.example;

public class SharedData {
    private volatile boolean flag=false;
    private volatile int data=0;
    public void writer(){
        data=42;
        flag=true;

    }
    public void reader(){
        if(flag){
            System.out.print(data);
        }
    }
    // volatile keyword-> immediately visible to all thread
    // synchronised keyword ->
}
