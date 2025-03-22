// Write a Java program that prints even and odd numbers alternately using two threads. 
// One thread should print even numbers, and the other should print odd numbers. 
// The output should be in a sequence, e.g., 1, 2, 3, 4, 5, 6,....

class evenOddPrint{

    private int number=1;
    private final int MAX=100;

    // method fr even numbers 

    public synchronised void printEven() throws InterruptedException{

        while(number<=MAX){
            // wait if no is odd 
            while(number % 2 !=0 ){
                wait();
            }
            System.out.println(number);
            number++;
            notify();
        }

    }
    public synchronised void printOdd() throws InterruptedException}{

        while(number<=MAX){
            // wait if no is odd 
            while(number % 2 ==0 ){
                wait();
            }
            System.out.println(number);
            number++;
            notify();
        }
    }

    public static void main(){

        evenOddPrint p=new evenOddPrint();
        Thread e=new Thread(()->{
            try{
                print.printEven();

            }
            catch(e){

            }
        });

        Thread o=new Thread(()->{
            try{
                print.printOdd();

            }
            catch(e){

            }
        });
    }
    }


    }


    // You have a shared resource (e.g., a list of records) 
    // that can be read by multiple threads but can only be written by one thread at a time. 
    // Implement a system with multiple reader threads and a single writer thread

