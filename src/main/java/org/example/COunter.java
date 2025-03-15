package org.example;

public class COunter {
    int count=0;
    public void increment(){
        count++;
    }
    public int getCOunt(){
        return count;

    }
    public static void main(){
        COunter cOunter=new COunter();

        Thread thread1=new Thread(()->{
            for(int i=0;i<1000;i++){
                cOunter.increment();
            }
        });
        Thread thread2=new Thread(()->{
            for(int i=0;i<1000;i++){
                cOunter.increment();
            }
        });
        thread2.start();thread1.start();

        thread1.join();thread2.join();
        System.out.print(cOunter.getCOunt());
    }
}// val can be less than 2000 becuase of the race condition
