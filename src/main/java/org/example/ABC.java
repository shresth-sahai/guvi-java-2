package org.example;

public class ABC {
    Thread thread=new Thread(new Runnable() {


        @Override
        public void run() {
            System.out.print("Any class can run runnable");
        }

    } );

//         thread.start();

}
