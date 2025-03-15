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

    /*

    java -> JVM -> JMM thread interact through memory and ensures all thread
    see a consistent view of memory ->
    Thread stack -> each thread has own stack-> local var, method call
    local data

    heap -> shared memeory -> objects -

    public void method() {
    int localVar = 10;  // Stored in the stack
    SomeObject obj = new SomeObject();  // Reference stored in stack, object in heap
}

     */
}
//public class AlphabetTask extends Thread{
//    @Override
//    public void run(){
//        for(char i='A';i<'H';i++){
//            try{
//                Thread.sleep(1000);
//                System.out.print(i);
//            }
//            catch (InterruptedException e){
//
//            }
//        }
//    }
//}
//public  class MultiThreading{
//    public static void main(String[] args){
//        // create thread
//        Thread number=new NumberTask();
//        Thread alphabet=new AlphabetTask();
//
//        number.start();alphabet.start();
//        try{
//            number.join();
//            alphabet.join();
//        }
//        catch (InterruptedException e){
//
//        }
//    }
//}
