package org.example;

public class NumberTask extends Thread{
    @Override
    public void run(){
        for(int i=0;i<5;i++){
            try{
                Thread.sleep(1000);
                System.out.print(i);
            }
            catch (InterruptedException e){

            }
        }
    }
}
public class AlphabetTask extends Thread{
    @Override
    public void run(){
        for(char i='A';i<'H';i++){
            try{
                Thread.sleep(1000);
                System.out.print(i);
            }
            catch (InterruptedException e){

            }
        }
    }
}
public  class MultiThreading{
    public static void main(String[] args){
        // create thread
        Thread number=new NumberTask();
        Thread alphabet=new AlphabetTask();

        number.start();alphabet.start();
        try{
            number.join();
            alphabet.join();
        }
        catch (InterruptedException e){

        }
    }
}
